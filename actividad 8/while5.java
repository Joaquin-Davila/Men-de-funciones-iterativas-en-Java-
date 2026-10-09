public class while5 {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("Sistema para imprimir un triángulo.\nDesarrollado por Joaquín Dávila.\nVersion 1.0.");
        int limite = Integer.parseInt(System.console().readLine("Introduzca el limite: "));
        System.out.println("");
        int i = 1;
        if (limite > 0) {
            while (i <= limite) {
                int j = 1;
                while (j <= i) {
                    System.out.print(i);
                    j++;
                }
                i++;
                System.out.println("");
            }  
        } else {
            System.out.println("Favor de introducir números enteros positivos.");
        }
    }
}
