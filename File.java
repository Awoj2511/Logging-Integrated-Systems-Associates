public class File {
    
    private String name;
    private String date;
    private String content;

    public File(String name, String date, String content) {
        this.name = name;
        this.date = date;
        this.content = content;
    }

    public void renameFile(String newFileName){
        name = newFileName;
    }

    public String toString() {
        return name + ", " + date + ", " + content;
    }

    public String getFileName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }
}