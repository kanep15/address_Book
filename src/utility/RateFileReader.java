package utility;


import java.util.List;


public class RateFileReader {
    private String fileName;

    public RateFileReader(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<String> readFile(){
        List<String> csvStrings =  TextFileReader.getStrings(this.fileName);
        return csvStrings.stream().toList();
    }
}
