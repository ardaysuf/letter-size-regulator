import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class LetterSizeRegulator {

    public static void main(String[] args) {
        File file = new File("file.txt");
        File new_file = new File("new_file.txt");
        Scanner s;
        PrintWriter p;
        try {
            s = new Scanner(System.in);
            System.out.print("Choose the process (1/2):\n1-Lower to Upper\n2-Upper to Lower");
            int choice = s.nextInt();
            new_file.createNewFile();
            s = new Scanner(file);
            p = new PrintWriter(new FileOutputStream(new_file));
            switch (choice) {
                case 1:
                    while (s.hasNext()) {
                        String word = s.next();
                        p.print(word.toUpperCase() + " ");
                    }
                    p.close();
                case 2:
                    while (s.hasNext()) {
                        String word = s.next();
                        p.print(word.toLowerCase() + " ");
                    }
                    p.close();
            }

        } catch (Exception e) {
        }
    }
}
