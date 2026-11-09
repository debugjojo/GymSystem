
package textfiles;
 import java.io.*;

public class ReadFile {
   


    private String path;

    public ReadFile(String file_path) {
        path = file_path;
    }

    // Method to Read from File
    public String[] OpenFile() throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        int numberOfLines = readLines();
        String[] textData = new String[numberOfLines];
        for (int i = 0; i < numberOfLines; i++) {
            textData[i] = textReader.readLine();
        }
        textReader.close();
        return textData;
    }

    int readLines() throws IOException {
        FileReader file_to_read = new FileReader(path);
        BufferedReader bf = new BufferedReader(file_to_read);
        int numberOfLines = 0;
        while (bf.readLine() != null) {
            numberOfLines++;
        }
        bf.close();
        return numberOfLines;
    }

    // New Method to Write/Save to File
    public void writeToFile(String text) throws IOException {
        FileWriter write = new FileWriter(path, false); // 'false' to overwrite, 'true' to append
        PrintWriter print_line = new PrintWriter(write);
        print_line.print(text);
        print_line.close();
    }
}

