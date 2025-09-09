import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Nilai:");
        int nilai = in.nextInt();

        System.out.println("Nilai : " + nilai);
        in.close();
    }
    
}
