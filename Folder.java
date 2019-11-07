import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;


public class Folder {
    
    private HashMap<String, File> files;
    private String folderName;

    public Folder(String folderName) {
        this.folderName = folderName;
        files = new HashMap<>();
    }

    public void addFile(String fileName, String date, String content) {
        files.put(fileName, new File(fileName, date, content));
    }

    public void deleteFile(String fileName) {
        for (String filename : files.keySet()) {
            if (filename.equals(fileName)) {
                files.remove(fileName, files.get(fileName));
            }
        }
    }
    public File getFile(String fileName) {
        for (String filename : files.keySet()) {
            if (filename.equals(fileName)) {
                return files.get(filename);
            }
        }
        return null;
    }
}