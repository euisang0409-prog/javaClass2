package javaClass2.co.kr.Class8;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.CREATE_NEW;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class Class8 {

    public static void main(String[] args) {
        // 6. 파일 열기 옵션
        Path base = Paths.get(System.getProperty("user.dir"));
        Path labDir = base.resolve("src/main/resources/data/file_mode_lab");

        try {
            Files.createDirectories(labDir);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // 6-1. 파일 읽기 모드
        line("1. 파일 읽기 모드");
        Path p_r = labDir.resolve("mode_r.txt");

        try {
            Files.writeString(p_r, "읽기 모드 테스트 \n두 번째 줄", StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = Files.newBufferedReader(p_r, StandardCharsets.UTF_8)) {
            String readFile;
            while ((readFile = reader.readLine()) != null) {
                System.out.println(readFile);
            }
        } catch (NoSuchFileException e) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 6-2. 파일 쓰기 모드
        line("2. 파일 쓰기 모드");
        Path p_w = labDir.resolve("mode_w.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(p_w, StandardCharsets.UTF_8)) {
            writer.write("첫 번째 작성\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = Files.newBufferedWriter(p_w, StandardCharsets.UTF_8, APPEND)) {
            writer.write("두 번째 작성\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 6-3. 파일 이어쓰기 모드
        line("3. 파일 이어쓰기 모드");
        Path p_a = labDir.resolve("mode_a.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(p_a, StandardCharsets.UTF_8, CREATE, APPEND)) {
            writer.write("첫 번째 작성\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = Files.newBufferedWriter(p_a, StandardCharsets.UTF_8, CREATE, APPEND)) {
            writer.write("두 번째 작성\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 6-4. 새로 만들기 모드
        line("4. 새로 만들기 모드");
        Path p_x = labDir.resolve("mode_x.txt");

        try {
            Files.writeString(p_x, "새 파일 작성 완료 \n", StandardCharsets.UTF_8, CREATE_NEW);
            System.out.println("파일 생성 성공!");
        } catch (FileAlreadyExistsException e) {
            System.out.println("이미 존재하는 파일이라 생성 불가");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 구분선 메서드 (Java 8 호환)
    private static void line(String title) {
        String sep = String.join("", Collections.nCopies(60, "="));
        System.out.println("\n" + sep);
        System.out.println("[" + title + "]");
        System.out.println(sep);
    }
}
