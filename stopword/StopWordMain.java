package stopword;

import java.io.*;

class stopword {

    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr = new InputStreamReader(new FileInputStream("stopword.txt"), "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("Outputstopword.txt"), "UTF-8");
        BufferedWriter bw = new BufferedWriter(osr);

        String word;
        while((word = br.readLine()) != null) {
            bw.append("\"" + word + "\"\n");
        }

        br.close();
        bw.close();
    }
}