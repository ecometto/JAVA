package week2;

public class Shapes {

    private static String c = "*", s = " ";

    // dibuja un rectangulo de puntos (4 columnas y 6 filas)
    public static void shape1() {
        System.out.println("Printing shape 1");
        for (int fila = 1; fila < 7; fila++) {
            for (int col = 1; col < 5; col++) {
                System.out.print(c);
                System.out.print(s);
            }
            System.out.print("\n");
        }
    }

    public static void shape2() {
        System.out.println("Printing shape 2");
        for (int fila = 1; fila < 7; fila++) {
            if (fila % 2 != 0) {
                for (int col = 1; col < 5; col++) {
                    System.out.print(c);
                    System.out.print(s);
                }
            } else {
                for (int col = 1; col < 5; col++) {
                    System.out.print(s);
                    System.out.print(c);
                }
            }
            System.out.print("\n");
        }
    }

    public static void shape3(){
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                System.out.print(s);
            }
            System.out.println("");

        }
    }
}

