package homework_8Lesson.homework_8Lesson.ReadingFiles;

public class Settings {
    private static final String FILENAMEHISTORIC = "Articles/historic.txt";
    private static final String FILENAMEROMANTIC = "Articles/romantic.txt";
    private static final String FILENAMESCIFI = "Articles/scifi.txt";

    public static String getFileNameHistoric() {
        return FILENAMEHISTORIC;
    }
    public static String getFileNameRomantic(){
        return FILENAMEROMANTIC;
    }
    public static String getFileNameScifi(){
        return FILENAMESCIFI;
    }
}

