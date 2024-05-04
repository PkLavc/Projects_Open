/**
 * @(#)Calculo_de_Area.java
 *
 * Calculo_de_Area
 *
 * @author PkLavc
 * @version 1.01 04/30/2024
 */

import java.util.Scanner;

public class Calculo_de_Area {

    /**
     * @param args
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int list;
        double altura, base, basemenor, lado, cateto1, cateto2, raio, area;
        String forma;

        System.out.println("\t\t\tCalculo de Área\nInsira o tipo de forma pelo seu número abaixo:");
        System.out.println("1) Paralelogramo          2) Retângulo              3) Quadrado");
        System.out.println("4) Triângulo              5) Triângulo retângulo    6) Triângulo equilátero");
        System.out.println("7) Trapézio               8) Círculo                9) Esfera");
        System.out.println("10) Cilindro              11) Cone");
        list = scanner.nextInt();
        scanner.nextLine();

            switch (list) {
                case 1:
                    forma = "Paralelogramo";
                    break;
                case 2:                 
                    forma = "Retângulo";
                    break;
                case 3:   
                    forma = "Quadrado";
                    break;
                case 4: 
                    forma = "Triângulo";
                    break;
                case 5:
                    forma = "Triângulo retângulo";
                    break;
                case 6: 
                    forma = "Triângulo equilátero";
                    break;
                case 7: 
                    forma = "Trapézio";
                    break;
                case 8: 
                    forma = "Círculo";
                    break;
                case 9: 
                    forma = "Esfera";
                    break;
                case 10: 
                    forma = "Cilindro";
                    break;
                case 11: 
                    forma = "Cone";
                    break;
                default:
                    System.out.println("Opção inválida.");
                    return;
            }

            if (list < 3 ||list == 4){
                System.out.println("Insira a altura do " + forma + ":");
                altura = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Insira a base do " + forma + ":");
                base = scanner.nextDouble();
                scanner.nextLine();

                    if (list < 4){ // Paralelogramo, Retângulo - 01, 02
                        area = base * altura;
                        System.out.println("A área do " + forma + " é de " + area);
                    }else{ // Triângulo - 04
                        area = (base * altura)/2;
                        System.out.println("A área do " + forma + " é de " + area);
                    }

            }else if (list == 5){ // Triângulo retângulo - 05
                System.out.println("Insira o cateto oposto do triângulo retângulo:");
                cateto1 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Insira o cateto adjacente do triângulo retângulo:");
                cateto2 = scanner.nextDouble();
                scanner.nextLine();
                area = (cateto1 * cateto2) / 2;
                System.out.println("A área do triângulo retângulo é de " + area);

            }else if (list < 7){
                System.out.println("Insira o lado do " + forma + ":");
                lado = scanner.nextDouble();
                scanner.nextLine();

                    if (list < 4){ // Quadrado - 03
                        area = lado * lado;
                        System.out.println("A área do quadrado é de " + area);
                    }else{ // Triângulo equilátero - 06
                        area = (lado * lado * Math.sqrt(3)) / 4;
                        System.out.println("A área do triângulo equilátero é de " + area);
                    }

            }else if (list < 8){ // Trapézio - 07
                System.out.println("Insira a base maior do trapézio:");
                base = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Insira a base menor do trapézio:");
                basemenor = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Insira a altura do trapézio:");
                altura = scanner.nextDouble();
                scanner.nextLine();
                area = ((base + basemenor)* altura) / 2;
                System.out.println("A área do trapézio é de " + area);

            }else{
                if (list == 9){ // Esfera - 09
                    System.out.println("Insira o raio da esfera:");
                    raio = scanner.nextDouble();
                    scanner.nextLine();
                } else { // Círculo, Cilindro, Cone - 08, 10, 11
                    System.out.println("Insira o raio do " + forma + ":");
                    raio = scanner.nextDouble();
                }   
                    if (list < 10){
                        switch (list){
                            case 8: // Círculo - 08
                                area = Math.PI * (raio * raio);
                                System.out.println("A área do círculo é de " + area);
                            break;
                            case 9: // Esfera - 09           
                                area = (4 * Math.PI * (raio * raio * raio)) / 3;
                                System.out.println("A área da esfera é de " + area);
                                break;
                        }        
                    }else{ // Cilindro, Cone - 10, 11
                            System.out.println("Insira a altura do " + forma + ":");
                            altura = scanner.nextDouble();
                            
                            if (list < 11){ // Cilindro - 10
                                area = Math.PI * (raio * raio) * altura;
                                System.out.println("A área do cilindro é de " + area);
                            }else{ // Cone - 11
                                area = (Math.PI * (raio * raio) * altura) / 3;
                                System.out.println("A área do cone é de " + area);
                            }    
                        }    
                }
            }
        }