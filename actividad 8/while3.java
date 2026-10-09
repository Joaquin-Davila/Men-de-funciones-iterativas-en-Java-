public class while3 {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("Sistema para encontrar la sumatoria de una serie de números.\nDesarrollado por Joaquín Dávila.\nVersion 1.0.");
        int limite = Integer.parseInt(System.console().readLine("Ingrese el limite de la serie de números: "));
        if (limite > 0) {
            System.out.print("\nΣ = ");
            int i = 1; 
            while (i <= limite) {
                if (i == limite) {
                    System.out.print(i + ".");
                } else {
                    System.out.print(i + " + ");
                }
                i++; 
            }
            System.out.println("\n\nResultado: " + (limite * (limite + 1)) / 2); 
        } else {
            System.out.println("Favor de introducir números enteros positivos.");
        }
    }
}
