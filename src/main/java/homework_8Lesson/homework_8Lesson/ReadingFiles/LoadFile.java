package homework_8Lesson.homework_8Lesson.ReadingFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LoadFile {


    public String loadContentFromFile(String fileName) throws ArticleControllerException {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileName)))) {
            StringBuilder content = new StringBuilder();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                content.append(line).append("\n");
            }
            return content.toString();
        } catch (IOException e) {
            throw new ArticleControllerException("Error loading content from file: " + fileName + e.getLocalizedMessage());
        }
    }

}
