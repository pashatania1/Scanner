import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Sikap: (A-D)");
        String sikap = in.nextLine();
        System.out.println("Input Nilai:");
        int nilai = in.nextInt();

        System.out.println("Sikap : " + sikap);
        System.out.println("Nilai : " + nilai);
        if(nilai >= 75 && (sikap.equals("A") || sikap.equals("B"))) {
            System.out.println("Lulus");
        } else {
            System.out.println("Remidi");
        }

        if(nilai >= 90 ) {
            System.out.println("Sangat Baik");
        } else if(nilai >= 75) {
            System.out.println("Baik");
        } else if(nilai >= 50) {
            System.out.println("Cukup");
        } else {
            System.out.println("Remidi");
        }


        in.close();
    }
    
}
