public class for11 {
    public static void main(String[] args) {
        String opc = "s";
        while (opc.equals("s")) {
            System.out.println("\033[H\033[2J");
            System.out.flush();
            System.out.println(
                    "Sistema para encontrar la sucesión de Farey.\nDesarrollado por Joaquín Dávila.\nVersion 1.0.");
            int farey = Integer.parseInt(System.console().readLine("Ingrese un valor para la secuencia de farey: "));
            if (farey < 0) {
                System.out.println("Favor de utilizar números positivos.");
            } else {
                System.out.print(farey + " = ");
                for (int i = 1; i <= farey; i++) {

                    if (i > 1) {
                        System.out.print("    ");
                    }
                    for (int j = 1; j <= farey; j++) {
                        if (i == j && i == farey) {
                            System.out.print(i + "/" + j + ".");
                        } else {
                            System.out.print(i + "/" + j + ", ");
                        }
                    }
                    System.out.println("");
                }
            }
            opc = System.console().readLine("Otra vez s/n? ");
        }
    }
}
