package javaClass2.co.kr.Class9;

public class Class9 {

    public static void main(String[] args) {

        // ======================================================
        // 1. 쓰레드를 선언하고 사용해보기
        // ======================================================
        // ThreadTest tt1 = new ThreadTest();
        // ThreadTest tt2 = new ThreadTest();
        //
        // tt1.start();
        // tt2.run();
        // 현재 목표는 새로운 쓰레드를 만드는 것이다.
        // start() 사용한 것은 새로운 쓰레드로 만들어졌다.
        // run() 사용한 것은 main을 가리킨다.
        // 새로운 쓰레드를 만들 때는 start()를 사용하면 된다.

        // ======================================================
        // 2. 쓰레드에 이름을 지어보기
        // ======================================================
        // ThreadTest tt1 = new ThreadTest("Thread-Test-1");
        // ThreadTest tt2 = new ThreadTest("Thread-Test-2");
        //
        // tt1.start();
        // tt2.start();

        // ======================================================
        // 3. join() 함수 사용해보기
        // ======================================================
        // join() : 일시중지를 하는 메서드이다.
        // ThreadTest tt1 = new ThreadTest("Thread-Test-1");
        // ThreadTest tt2 = new ThreadTest("Thread-Test-2");
        //
        // tt1.start();
        // tt2.start();
        //
        // try {
        //     tt1.join();         // tt1의 쓰레드 작업을 일시정지 하겠다.
        //     System.out.println("tt1 쓰레드 종료");
        //     tt2.join();         // tt2의 쓰레드 작업을 일시정지 하겠다.
        //     System.out.println("tt2 쓰레드 종료");
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // ======================================================
        // 4. 데드락 발생시키기
        // ======================================================
        // ThreadTest tt1 = new ThreadTest("Thread-Test-1");
        // ThreadTest tt2 = new ThreadTest("Thread-Test-2");
        //
        // 서로가 서로를 참조하게 설정 : setOtherThread()
        // tt1.setOtherThread(tt2);
        // tt2.setOtherThread(tt1);
        //
        // tt1.start();
        // tt2.start();
        //
        // try {
        //     tt1.join();
        //     System.out.println("tt1. 쓰레드 종료");
        //     tt2.join();
        //     System.out.println("tt2. 쓰레드 종료");
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // ======================================================
        // 5. Runnable 사용해보기
        // ======================================================
        // ThreadTest tt1 = new ThreadTest();
        // ThreadTest tt2 = new ThreadTest();
        //
        // Thread thread1 = new Thread(tt1, "Thread-Test-1");
        // Thread thread2 = new Thread(tt2, "Thread-Test-2");
        //
        // tt1.setOtherThread(thread1);
        // tt2.setOtherThread(thread2);
        //
        // thread1.start();
        // thread2.start();
        //
        // try {
        //     thread1.join();
        //     System.out.println("tt1 쓰레드 종료");
        //     thread2.join();
        //     System.out.println("tt2. 쓰레드 종료");
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // ======================================================
        // 6. 쓰레드 실습
        // ======================================================

        // 6-1. 두 쓰레드를 생성해서 각각 1 ~ 5 숫자를 출력하는 프로그램
        Thread t1 = new Thread(new NumberPrinterSimple(1, 5), "NumberThread-1");
        Thread t2 = new Thread(new NumberPrinterSimple(1, 5), "NumberThread-2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 6-2. 공통된 객체를 사용하여 1 ~ 200 출력하는 작업
        CounterNP counterNP = new CounterNP();
        NumberPrinter counterPrinter1 = new NumberPrinter(counterNP, 1, 100);
        NumberPrinter counterPrinter2 = new NumberPrinter(counterNP, 101, 200);

        Thread cThread1 = new Thread(counterPrinter1, "CounterThread-1");
        Thread cThread2 = new Thread(counterPrinter2, "CounterThread-2");

        cThread1.start();
        cThread2.start();

        try {
            cThread1.join();
            cThread2.join();
            System.out.println("최종 값 : " + counterNP.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("메인 쓰레드 종료");

        // ======================================================
        // ThreadTest 예제: join, 대기, 데드락 예제
        // ======================================================
        ThreadTest tt1 = new ThreadTest("Thread-Test-1");
        ThreadTest tt2 = new ThreadTest("Thread-Test-2");

        tt1.setOtherThread(tt2);
        tt2.setOtherThread(tt1);

        tt1.start();
        tt2.start();
    }
}

// ======================================================
// 간단한 숫자 출력용 Runnable 클래스
// ======================================================
class NumberPrinterSimple implements Runnable {
    private int start;
    private int end;

    NumberPrinterSimple(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 쓰레드 시작");
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// ======================================================
// 공유 카운터 클래스
// ======================================================
class CounterNP {
    private int count = 0;
    
    // 값을 동기화 시키겠다 : synchronized

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

// ======================================================
// 숫자 출력용 Runnable 클래스 (공유 카운터)
// ======================================================
class NumberPrinter implements Runnable {
    private CounterNP counterNP; // 공유 카운터
    private int start;
    private int end;

    NumberPrinter(CounterNP counterNP, int start, int end) {
        this.counterNP = counterNP;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 쓰레드 시작");
        for (int i = start; i <= end; i++) {
            counterNP.increment();
            System.out.println(Thread.currentThread().getName() + " 카운트: " + counterNP.getCount());
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// ======================================================
// ThreadTest 클래스 (join, 대기 예제)
// ======================================================
class ThreadTest extends Thread {
    private Thread otherThread;

    ThreadTest(String name) {
        super(name);
    }

    public void setOtherThread(Thread otherThread) {
        this.otherThread = otherThread;
    }

    @Override
    public void run() {
        System.out.println("현재 쓰레드 : " + Thread.currentThread().getName());
        try {
            if (otherThread != null) {
                System.out.println(Thread.currentThread().getName() + " 쓰레드가 대기중");
                System.out.println("종료를 기다리는 쓰레드 : " + otherThread.getName());
                otherThread.join();
                System.out.println("쓰레드 종료 : " + otherThread.getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}