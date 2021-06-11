import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class Conditioner_1_1 {
    private final HashSet<String> setOfModes = new HashSet<String>(){{
            add("auto");
            add("freeze");
            add("fan");
            add("heat");
        }};
    public static void main(String[] args) throws IOException {
        new Conditioner_1_1().run();
    }

    private void run() {
        Scanner scan = new Scanner(System.in);
        int [] scanArr = scanWriter(scan);
        PrintWriter out = new PrintWriter(System.out);
        String mode = scan.next();
        out.print(calculate(scanArr[0],scanArr[1],mode));
        out.flush();
    }

    public static int[] scanWriter(Scanner scanner){
        var t = scanner.nextInt();
        var p = scanner.nextInt();
        return new int[]{t,p};
    }
    public int calculate(int tRoom,int tCond,String cMode){
        if(!setOfModes.contains(cMode))
            return -1;
        if (tRoom<tCond && cMode.equals("heat") || tRoom>tCond&&cMode.equals("freeze") || cMode.equals("auto"))
            return tCond;
        return tRoom;
    }
}