import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class write2CSV {
    public static void main(String[] args) throws IOException {
        File temp = new File("record.csv");
        FileWriter csvWriter = new FileWriter(temp);

        csvWriter.append("1,Shrey,250");
        csvWriter.flush();
        csvWriter.close();
    }
}