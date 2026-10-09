public class menufinal {
    public static void main(String[] args) {
        String opcion = "0";
        while (!opcion.equals("6")) {
            System.out.println("\033[H\033[2J");
            System.out.flush();
            System.out.println(
                    "Proyecto Final de la materia Fundamentos de Computación 1.\nDesarrolladem ,o por Joaquín Davila.\nVersion 1.0");
            System.out.println("Menu Principal");
            System.out.println(
                    "1. if - Triangulos\n2. for - Padovan\n3. while - Sumatoria de 1/1 + 1/2 + ... + 1/n\n4. do - Conjetura de Collatz");
            System.out.println("5. Arreglos - Rotar un arreglo a la derecha");
            System.out.println("6. bye bye");
            opcion = System.console().readLine("¿Qué quieres hacer? ");
            switch (opcion) {
                case "1":
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Triangulos");
                    triangulos();
                    break;

                case "2":
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    padovan();
                    break;

                case "3":
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    sumatoria();
                    break;

                case "4":
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    collatz();
                    break;

                case "5":
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    rotar();
                    break;

                case "6":
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Gracias por usar el sistema");
                    break;

                default:
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Opcion " + opcion + " no disponible (Opciones del 1 al 6)");
                    System.console().readLine("Presiones Enter para continuar");
                    break;
            }
        }
    }

    static void padovan() {
        String opc = "s";
        while (opc.equals("s")) {
            System.out.println(
                    "Sistema para encontrar la secuencia de Padovan.\nDesarrollado por Joaquín Dávila.\nVersion 1.0.");

            int limite = 0;

            while (true) {
                try {
                    limite = Integer
                            .parseInt(System.console().readLine("Ingrese el limite de la secuencia de Padovan: "));
                    if (limite > 0) {
                        break;
                    } else {
                        System.out.println("\nEl limite debe ser un número entero positivo.\n");
                    }
                } catch (Exception e) {
                    System.out.println("\nEl limite debe ser un número entero positivo.\n");
                }
            }
            int p1 = 1, p2 = 1, p3 = 1, pn = 0;
            System.out.print("\nSecuencia de Padovan = ");
            for (; p1 <= limite;) {
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

    static void triangulos() {
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
            opc = System.console().readLine("Otra vez s/n? ");
        }
    }

    static void sumatoria() {
        String opc = "s";
        while (opc.equals("s")) {
            double sumatoria = 0.0;
            System.out.println(
                    "Sistema para encontrar el resultado de la sumatoria 1/1 + 1/2 + 1/3 +...+ 1/n.\nDesarrollado por Joaquín Dávila.\nVersion 1.0.");

            int limite = 0;
            while (true) {
                try {
                    limite = Integer.parseInt(System.console().readLine("Ingrese el limite de la sumatoria: "));
                    if (limite > 0) {
                        break;
                    } else {
                        System.out.println("\nEl limite debe ser un número entero positivo.\n");
                    }
                } catch (Exception e) {
                    System.out.println("\nEl limite debe ser un número entero positivo.\n");
                }
            }
            int i = 0;
            System.out.print("\nΣ= ");
            while (i < limite) {
                i++;
                sumatoria += 1.0 / i;
                if (i != limite) {
                    System.out.print("1/" + i + " + ");
                } else {
                    System.out.print("1/" + i + ".");
                }
            }
            System.out.printf("\n\nResultado: %.2f", sumatoria);
            opc = System.console().readLine("\n\nOtra vez s/n? ");
        }
    }

    static void collatz() {
        String opc = "s";
        while (opc.equals("s")) {
            System.out.println(
                    "Sistema para calcular la conjetura de Collartz\nDesarrollado por Joaquín Dávila.\nVersion 1.0.");

            int x = 0;

            while (true) {
                try {
                    x = Integer.parseInt(System.console().readLine("Ingrese un número positivo entero: "));
                    if (x < 0) {
                        System.out.println("\nFavor de introducir un número entero positivo.\n");
                        continue;
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\nFavor de introducir un número entero positivo.\n");
                }
            }

            System.out.print("\nConjetura de Collartz para " + x + " = ");
            int i = x;
            do {
                if (i % 2 == 0) {
                    i = (i / 2);
                } else {
                    i = i * 3 + 1;
                }
                if (i == 1) {
                    System.out.print(i + ".");
                } else {
                    System.out.print(i + ", ");
                }
            } while (i > 1);
            opc = System.console().readLine("\nOtra vez s/n? ");
        }
    }

    static void rotar() {
        String opc = "s";
        while (opc.equals("s")) {
            System.out.println("""
                    Implementa un programa que capture un arreglo de diez
                    elementos de tipo de entero y un número k, y que rote
                    los elementos del arreglo k posiciones hacia la derecha.

                    Desarrolado por Joaquin Davila.
                    Version 0.1
                    """);

            int[] arreglo = new int[10];
            int k = 0;
            for (int i = 0; i < 10; i++) {
                try {
                    arreglo[i] = Integer.parseInt(System.console().readLine("Arreglo[" + i + "] = "));
                } catch (NumberFormatException e) {
                    System.out.println("\nSolo numeros enteros.\n");
                    i--;
                }
            }

            System.out.println("\nArreglo antes de desplazamientos: \n");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("Arreglo[" + i + "] = " + arreglo[i]);
            }

            while (true) {
                try {
                    k = Integer.parseInt(System.console().readLine("Desplazamiento: "));
                    if (k < 0) {
                        System.out.println("\nSolo numeros iguales o mayores a 0.\n");
                        continue;
                    } else
                        break;
                } catch (Exception e) {
                    System.out.println("\nSolo numeros iguales o mayores a 0.\n");
                }
            }

            System.out.println("\nVamos a desplazar " + k + " posiciones a la derecha.\n");

            k %= 10;

            System.out.println(k);

            System.out.println("\nArreglo desplazado: \n");

            for (int i = 0; i < k; i++) {
                int ultimo = arreglo[arreglo.length - 1];
                System.arraycopy(arreglo, 0, arreglo, 1, arreglo.length - 1);
                arreglo[0] = ultimo;
            }

            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("Arreglo[" + i + "] = " + arreglo[i]);
            }
            opc = System.console().readLine("\n\nOtra vez s/n? ");
        }
    }
}
