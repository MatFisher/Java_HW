import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        String numb = scanner.nextLine();
        int tring = tringular(Integer.parseInt(numb));
        System.out.println("tringular number = " + tring);
        int fact_n = factorial(Integer.parseInt(numb));
        System.out.println("factorial number = " + fact_n);
        scanner.close();

    }

    private static int tringular(int n) {
        int result = ((n+1)*n/2);
        return result;
    }

    private static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
            return result;
    }

}

