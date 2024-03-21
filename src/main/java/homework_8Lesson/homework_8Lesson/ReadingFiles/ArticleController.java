package homework_8Lesson.homework_8Lesson.ReadingFiles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("article/")
public class ArticleController {
    LoadFile loadFile = new LoadFile();
    String fileNameHistoric = Settings.getFileNameHistoric();
    String fileNameRomantic = Settings.getFileNameRomantic();
    String fileNameScifi = Settings.getFileNameScifi();

    @GetMapping("historic")
    public String getHistoricArticle() {
        try {
            return loadFile.loadContentFromFile(fileNameHistoric);
        } catch (ArticleControllerException e) {
            System.err.println("Error occurred while loading historic article: " + fileNameHistoric + "\n" + e.getLocalizedMessage() + "\n");
            return "Error occurred while loading historic article: " + fileNameHistoric + "\n" + e.getLocalizedMessage() + "\n";
        }
    }


    @GetMapping("romantic")
    public String getRomanticArticle() {
        try {
            return loadFile.loadContentFromFile(fileNameRomantic);
        } catch (ArticleControllerException e) {
            System.err.println("Error occurred while loading romantic article: " + fileNameRomantic + "\n" + e.getLocalizedMessage() + "\n");
            return "Error occurred while loading romantic article: " + fileNameRomantic + "\n" + e.getLocalizedMessage() + "\n";
        }
    }


    @GetMapping("scifi")
    public String getScifiArticle() {
        try {
            return loadFile.loadContentFromFile(fileNameScifi);
        } catch (ArticleControllerException e) {
            System.err.println("Error occurred while loading scifi article: " + fileNameScifi + "\n" + e.getLocalizedMessage() + "\n");
            return "Error occurred while loading scifi article: " + fileNameScifi + "\n" + e.getLocalizedMessage() + "\n";
        }
    }
}



