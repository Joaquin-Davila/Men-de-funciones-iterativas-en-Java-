public class triangulos_ej5 {
    public static void main(String[] args) {
        String opc = "s";
        while (opc.equals("s")) {
            System.out.println("Sistema para determinar si tres longitudes cumplen con ser un triangulo y su tipo");
            System.out.println("Version 1.0\nDesarrollado por Joaquín Dávila Arenas");
            float lado1 = Float.parseFloat(System.console().readLine("Ingrese el lado 1: "));
            if (lado1 > 0) {
                float lado2 = Float.parseFloat(System.console().readLine("Ingrese el lado 2: "));
                if (lado2 > 0) {
                    float lado3 = Float.parseFloat(System.console().readLine("Ingrese el lado 3: "));
                    if (lado3 > 0) {
                        System.out.println("Todas las medidas son positivas.");
                        float mayor = lado1;

                        if (mayor < lado2) {
                            mayor = lado2;
                        }

                        if (mayor < lado3) {
                            mayor = lado3;
                        }
                        System.out.println("El lado mayor es " + mayor);

                        if (mayor <= lado1 + lado2 + lado3 - mayor) {
                            System.out.println("Si soy un triángulo!");
                            System.out.println(
                                    "Porque se cumple que " + mayor + " <= " + (lado1 + lado2 + lado3 - mayor));
                            if (lado1 == lado2 && lado2 == lado3) {
                                System.out.println("Equilatero ");
                            } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
                                System.out.println("Escaleno");
                            } else {
                                System.out.println("Isoceles");
                            }
                        } else {
                            System.out.println("Con esas medidas no es posible formar un triángulo.");
                            System.out.println(
                                    "Porque no se cumple que " + mayor + " <= " + (lado1 + lado2 + lado3 - mayor));
                        }
                    } else {
                        System.out.println("Error en la longitud del lado 3.");
                    }
                } else {
                    System.out.println("Error en la longitud del lado 2.");
                }
            } else {
                System.out.println("Error en la longitud.");
            }
            System.out.println("Otra vez s/n?");
            opc = System.console().readLine();
        }

    }
}
