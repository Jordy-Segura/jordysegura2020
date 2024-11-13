/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.jordysegura2020;

import java.util.Scanner;

/**
 *
 * @author jordy
 */
public class JordySegura2020 {

    public static void main(String[] args) {
        float[] ventasDiarias = new float[7];

        float totalVentas = 0;
        int ventaAlta = 0;
        int ventaBaja = 0;

        Scanner entrada = new Scanner(System.in);

        int i = 0;
        float ventas = 0;

        do {
            System.out.println("Ingrese el monto de la venta del día " + (i + 1));
            ventas = entrada.nextFloat();
            if (ventas > 0) {
                ventasDiarias[i] = ventas;
                i = i + 1;
            } else {
                System.out.println("Ingrese un valor positivo");
            }

        } while (i < 7);
        {
        }

        int menu = 0;

        while (menu!=5) {
            System.out.println("");
            System.out.println("\n-----INGRESE UNA OPCION DEL 1-5.-----");
            System.out.println("1.  CALCULAR TOTAL DE VENTAS DE LA SEMANA.");
            System.out.println("2.  CALCULAR EL DÍA CON VENTAS MÁS CERCANAS AL PRMOMEDIO.");
            System.out.println("3.  MOSTRAR  EL DÍA CON LA VENTA MÁS ALTA Y EL DÍA CON LA VENTA MÁS BAJA.");
            System.out.println("4.  CALCULAR EL MONTO ACUMULADO DE VENTAS DURANTE LOS PRIMEROS TRES DÍAS Y LOS ÚLTIMOS TRES DÍAS");
            System.out.println("5.  Salir");

            menu = entrada.nextInt();
            switch (menu) {
                case 1:
                    for (i = 0; i < 7; i++) {
                        totalVentas = totalVentas + ventasDiarias[i];
                    }
                    System.out.println("El total de ventas de la semana es: " + totalVentas);
                    break;
                case 2:
                    for (i = 0; i < 7; i++) {
                        totalVentas = totalVentas + ventasDiarias[i];
                    }
                    totalVentas = totalVentas / 7;
                    System.out.println("El promedio es: " + totalVentas);

                    float diferenciaMinima = 0;
                    for (int j = 0; j < 7; j++) {
                    }
                    System.out.println("");
                    
                    break;
                case 3:
                    ventaAlta = 0;
                    ventaBaja = 0;
                    for (i = 0; i < 5; i++) {
                        if (ventasDiarias[i] > ventaAlta) {
                            ventaAlta = i;
                        }
                        if (ventasDiarias[i] < ventaBaja) {
                            ventaBaja = i;
                        }
                    }

                    System.out.println("Día con la venta más alta es: " + ventaAlta);
                    System.out.println("Día con la venta más baja es: " + ventaBaja);
                    break;
                case 4:
                    float totalPrimerosTres = 0;
                    float totalUltimosTres = 0;
                    for (i = 0; i < 3; i++) {
                        totalPrimerosTres = totalPrimerosTres + ventasDiarias[i];

                    }
                    for (i = 4; i < 7; i++) {
                        totalUltimosTres = totalUltimosTres + ventasDiarias[i];

                    }
                    System.out.println("Monto de venta acumulado de los primeros tres dias: " + totalPrimerosTres);
                    System.out.println("Monto de venta acumulado de los primeros tres dias: " + totalUltimosTres);
                    break;
                case 5:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }

    }

}
