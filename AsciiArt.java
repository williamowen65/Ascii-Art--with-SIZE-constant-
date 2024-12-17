
public class AsciiArt {
    // public static int SIZE = 1;
    // public static int SIZE = 3;
    // public static int SIZE = 7;
    // public static int SIZE = 10;
    // public static int SIZE = 14;
    public static final int SIZE = 20;

    public static void main(String[] args) {
        printBook();
    }

    public static void printBook() {
        printBookTop();
        printBookMiddle();
        printBookBottom();
        printBookPrice();
    }

    public static void printBookPrice(){
        System.out.println("Now only $"+ SIZE * 5 +"!");
    }

    public static void printBookMiddle() {
        printBookEdge();
        for (int i = 0; i < SIZE; i++) {
            System.out.print("/");
        }
        System.out.println("");
    }

    public static void printBookTop() {
        // Print top edge of book
        for (int i = 0; i < SIZE + 1; i++) {
            System.out.print(" ");
        }
        printBookEdge();
        System.out.println("");

        // Print SIZE layers of Ascii for the top
        for (int i = 0; i < SIZE; i++) {
            // print outer spaces
            for (int j = 0; j < SIZE - 1 * i; j++) {
                System.out.print(" ");
            }
            // print left edge of book
            System.out.print("/");
            // print inner spaces
            for (int j = 0; j < SIZE * 3 - 3 - 3 * i; j++) {
                System.out.print(" ");
            }
            // print ___/
            System.out.print("_");
            for (int j = 0; j < 1 + i; j++) {
                System.out.print("__/");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("/");
            }
            System.out.println("");
        }
    }

    public static void printBookBottom() {

        for(int i = 0; i < SIZE * 0.5; i++){

            
            // Print Edge
            System.out.print("|");
            // Print spaces
            for (int j = 0; j < SIZE * 1.5 -10; j++) {
                System.out.print(" ");
            }
            System.out.print("How to Code in Java");
            // Print spaces
            for (int j = 0; j < SIZE * 1.5 -10; j++) {
                System.out.print(" ");
            }
            System.out.print(" ");
            // Print Edge
            System.out.print("|");
            for(int j = 0; j < SIZE -2 * i; j++){
                System.out.print("/");
            }
            
            System.out.println("");
        }
        printBookEdge();
        System.out.println("");
    }

    public static void printBookEdge() {
        System.out.print("+");
        for (int i = 0; i < SIZE * 3 - 1; i++) {
            System.out.print("-");
        }
        System.out.print("-");
        System.out.print("+");
    }
}
