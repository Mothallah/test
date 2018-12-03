import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Mothallah love this project");
        System.out.printf("Look, Mothallah enter this digits: %d\n", number);
        for(int i = 0; i < 10; i++){
            System.out.printf("Now, this is %d\n", i);
        }
    }
}
