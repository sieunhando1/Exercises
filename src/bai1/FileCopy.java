package bai1;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "C://Users//User//IdeaProjects//BTT5//src//bai1//in.txt/"; // Đường dẫn file nguồn
        String destinationFile = "C://Users//User//IdeaProjects//BTT5//src//bai1//out.txt/"; // Đường dẫn file đích

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("Sao chép file thành công!");
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
