public class while2 {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println(
                "Sistema para encontrar la secuencia de Fibonacci.\nDesarrollado por Joaquín Dávila.\nVersion 1.0.");
        int limite = Integer.parseInt(System.console().readLine("Ingrese el limite de la secuencia de Fibonacci: "));
        int p1 = 0, p2 = 1, pn = 0;
        if (limite > 0) {
            System.out.print("\nSecuencia de Fibonacci = ");

            while (p1 <= limite) {
                System.out.print(p1);
                pn = p1 + p2;
                p1 = p2;
                p2 = pn;
    
                if (p1 > limite) {
                    System.out.print(".");
                } else if (p1 == limite) {
                    System.out.print(", ");
                } else {
                    System.out.print(", ");
                }
            } 
        } else {
            System.out.println("Favor de introducir números enteros positivos.");
        }    
    }
}
