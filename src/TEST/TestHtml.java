package TEST;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestHtml {

    public static void main(String[] args) throws IOException {
        File file = new File("E:\\MMP\\src\\TEST\\res\\test.txt");
        //E:\MMP\src\TEST\res
        BufferedReader br = new BufferedReader(new FileReader(file));
        //String s = br.readLine();
        System.out.println(br.readLine());
        br.close();
    }
}
