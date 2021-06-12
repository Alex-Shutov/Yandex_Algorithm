import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Number_1_3 {
    private  final ArrayList<String> SetNumbers = new ArrayList<String>();
    public  String[] testArrayStrings = new String[3];
    public static void main(String[] args) throws IOException {
        new Number_1_3().run();
    }

    public void run() {
        Scanner scan = new Scanner(System.in);
        String numberAdd = scanWriter(scan);
        PrintWriter out = new PrintWriter(System.out);
        print(out,numberAdd);
        out.flush();
    }
    public void print(PrintWriter out,String numberAdd) {
        for (String setNumber : SetNumbers) {
            if (numberAdd.equals(setNumber)) {
                //testArrayStrings[i] = "YES";
                out.println("YES");
                continue;
            }
            //testArrayStrings[i] = "NO";
            out.println("NO");
        }
    }

    public String scanWriter(Scanner scanner){
        String input = "";
        for (int i = 0; i < 4;i++){
            StringBuilder builder = new StringBuilder();
            String numberToAdd = scanner.nextLine();
            if (!numberToAdd.equals("")) {
                char[] charArrayString = numberToAdd.toCharArray();
                if (!numberToAdd.startsWith("8") && !numberToAdd.startsWith("+7"))
                    builder.append("495");
                if (numberToAdd.startsWith("+7")) {
                    numberToAdd = numberToAdd.substring(1);
                    charArrayString = numberToAdd.toCharArray();
                }
                for (int j = 0; j < charArrayString.length; j++) {
                    if (builder.length()==0 && j!=0 || !builder.isEmpty())
                        if (Character.isDigit(charArrayString[j]))
                            builder.append(charArrayString[j]);
                }
                if (i != 0)
                    SetNumbers.add(builder.toString());
                else
                    input = builder.toString();
            }
        }
        return input;
    }
}
