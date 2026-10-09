public class while4 {
    public static void main(String[] args) {
        double sumatoria = 0.0; 
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("Sistema para encontrar el resultado de la sumatoria 1/1 + 1/2 + 1/3 +...+ 1/n.\nDesarrollado por Joaquín Dávila.\nVersion 1.0.");
        int limite = Integer.parseInt(System.console().readLine("Ingrese el limite de la sumatoria: ")); 
        int i = 0;
        System.out.print("\nΣ= ");
        while (i < limite) {
            i++;
            sumatoria += 1.0 / i; 
            if (i!=limite) {
                System.out.print("1/" + i + " + ");
            } else {
                System.out.print("1/" + i + ".");
            }
        }
        System.out.printf("\n\nResultado: %.2f", sumatoria);
    }
}
