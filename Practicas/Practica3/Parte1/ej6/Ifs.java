public class Ifs {

    public static void main(String[] args) {
        if (6 < 9) {
            System.out.println("6 es menor que 9");
            if (9 < 13) {
                System.out.println("y 9 es menor que 13");
                if (13 < 16) {
                    System.out.println("y 13 es menor que 16");
                }
            }
        }
    }
}