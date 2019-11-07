import java.util.HashMap;

public class FileSystem {
    private HashMap<String,Folder> folders;
    
    public FileSystem() {
        folders = new HashMap<>();
    }

    public void moveFile(String fileName, String folderName) {
        for (String folder : folders.keySet()) {
            if (folder.equals(folderName)){
                Folder newFolder = folders.get(folder);
                File file = newFolder.getFile(fileName);
                newFolder.addFile(fileName, file.getDate(), file.getContent());
            }
        }
    }
}