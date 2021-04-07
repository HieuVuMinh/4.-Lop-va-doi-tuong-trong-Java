import java.util.Scanner;

public class QuadraticEquation {
    int numberA, numberB, numberC;

    public QuadraticEquation(int numberA, int numberB, int numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    public int getNumberA() {
        return numberA;
    }

    public int getNumberB() {
        return numberB;
    }

    public int getNumberC() {
        return numberC;
    }

    public int getDiscriminant() {
        int delta = (numberB * 2) - (4 * numberC * numberA);
        return delta;
    }

    double getRoot1() {
        double r1 = (-numberB + Math.sqrt(Math.pow(numberB, 2) - (4 * numberA * numberC))) / (2 * numberA);
        return r1;
    }

    double getRoot2() {
        double r2 = (-numberB - Math.sqrt(Math.pow(numberB, 2) - (4 * numberA * numberC))) / (2 * numberA);
        return r2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("ax2 + bx + c = 0");
            System.out.println("Enter Number A");
            int a = sc.nextInt();
            System.out.println("Enter Number B");
            int b = sc.nextInt();
            System.out.println("Enter Number C");
            int c = sc.nextInt();

            QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
            int delta = quadraticEquation.getDiscriminant();
            System.out.print("Delta = " + delta + "\n");
            if (delta >= 0) {
                System.out.print("X1 = " + quadraticEquation.getRoot1() + "   X2 = " + quadraticEquation.getRoot2() + "\n");
            } else if (delta == 0) {
                System.out.print("X = " + quadraticEquation.getRoot1());
            } else System.out.println("The equation has no roots");
        } while (true);
    }
}
