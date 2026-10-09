public class for2 {
    public static void main(String[] args) {
        String opc = "s";
        while (opc.equals("s")) {
            System.out.println("\033[H\033[2J");
            System.out.flush();
            System.out.println("Sistema para encontrar la secuencia de Padovan.\nDesarrollado por Joaquín Dávila.\nVersion 1.0.");
            int limite = Integer.parseInt(System.console().readLine("Ingrese el limite de la secuencia de Padovan: "));
            int p1 = 1, p2 = 1, p3 = 1, pn = 0;
            System.out.print("\nSecuencia de Padovan = ");
            for (;p1 <= limite;) {
                System.out.print(p1);
                pn = p1 + p2;
                p1 = p2;
                p2 = p3; 
                p3 = pn;
                    if (p1 > limite) {
                        System.out.print(".");
                    } else if (p1 == limite) {
                        System.out.print(", ");
                    } else {
                        System.out.print(", ");
                    }
            }
            opc = System.console().readLine("\n\nOtra vez s/n? ");
        }
    }

}
