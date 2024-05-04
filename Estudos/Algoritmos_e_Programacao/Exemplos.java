import java.util.Scanner;

public class Exemplos {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        //=========================================Dados=======================================
        
        /*
        
        int numeroInteiro;
        double numeroDecimal;
        String texto, inputBooleano;
        char inputCaractere;
        boolean valorBooleano;

        // Lendo um número inteiro
        System.out.println("Digite um número inteiro:");
        numeroInteiro = ler.nextInt();
        ler.nextLine(); // Consumindo a quebra de linha após o próximo inteiro
 
        // Lendo um número decimal (double)
        System.out.println("Digite um número decimal:");
        numeroDecimal = ler.nextDouble();
        ler.nextLine(); // Consumindo a quebra de linha após o próximo double
 
        // Lendo uma string
        System.out.println("Digite uma frase:");
        texto = ler.nextLine();
 
        // Lendo um caractere
        System.out.println("Digite um caractere:");
        inputCaractere = ler.nextLine().charAt(0);
 
        // Lendo um booleano
        System.out.println("Digite true ou false:");
        inputBooleano = ler.nextLine();
        valorBooleano = Boolean.parseBoolean(inputBooleano);
 
        // Exibindo os valores lidos
        System.out.println("Número inteiro digitado: " + numeroInteiro);
        System.out.println("Número decimal digitado: " + numeroDecimal);
        System.out.println("A frase digitada: " + texto);
        System.out.println("Caractere digitado: " + inputCaractere);
        System.out.println("Booleano digitado: " + valorBooleano);

        */
        
        //======================================if & else=====================================

        //--------------------------------Verificar qual o maior------------------------------

        /*
        
        int val1, val2 ,val3, maior, menor;
        
	    System.out.println("Insira um numero:");
	    val1 = ler.nextInt();
        ler.nextLine();
	    System.out.println("Insira outro numero:");
	    val2 = ler.nextInt();
        ler.nextLine();
	    System.out.println("Insira mais um numero:");
	    val3 = ler.nextInt();
        ler.nextLine();
	        
			if (val1 > val2 && val1 > val3){
				maior = val1;
			}else if (val2 > val1 && val2 > val3){
				maior = val2;
			}else{
				maior = val3;

			}if (val1 < val2 && val1 < val3){
				menor = val1;
			}else if (val2 < val1 && val2 < val3){
				menor = val2;
			}else{
				menor = val3;
			}	
				
		System.out.println("O maior numero e: " + maior + "\nO menor numero e: " + menor);	

        */

        //------------------------------Verificar se é par ou impar---------------------------

        /*

        int verificar;

        System.out.println("Insira um numero:");
        verificar = ler.nextInt();
        ler.nextLine();

            if (verificar % 2 == 0){
                System.out.println("O numero " + verificar + " é par.");
            }else{
                System.out.println("O numero " + verificar + " é impar.");
            }

        */

        //-------------------------------------Verificar char----------------------------------
    
        /*

        char letra;

	    System.out.println("Digite uma letra: ");
	    letra = ler.next().charAt(0);
	        
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || 
		       	letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
		        System.out.print("A letra digitada é uma vogal.");
		    }else{
		        System.out.print("A letra digitada é uma consoante.");
		    }
        
        */

        //==========================================for========================================

        //---------------------------------------Repetição-------------------------------------
        
        /*

		int quantidade;
		String repeticao;
		
		System.out.println("Insira uma frase:");
		repeticao = ler.nextLine();
		
		System.out.println("Insira a quantidade de vezes a se repetir:");
		quantidade = ler.nextInt();
		
			for (int i = 1 ; i <= quantidade ; i++ ){
				System.out.println(repeticao + " " + i);
			}
			
        */

        //----------------------------------------Soma até---------------------------------------

        /*

        int soma, inicial = 0;

        System.out.println("Insira um número que será somado de 1 até o mesmo:");
        soma = ler.nextInt();

            for (int i = 1; i <= soma; i++) {
                inicial += i;
        }

        System.out.println("A soma dos números de 1 a " + soma + " é: " + inicial);
        
        */

        //----------------------------------------Soma Loop--------------------------------------

        /*
        
        int loop;

		System.out.println("Insira um numero:");
		loop = ler.nextInt();
		System.out.println("Insira mais um numero para somar:");	
		loop += ler.nextInt();	

			for (int i = 0 ; i < i + 1 ; i++){
				System.out.println("Total: "+ loop + "\nInsira mais um numero para a soma:");	
				loop += ler.nextInt();
			}

        */

        //======================================Switch case======================================

        /*    

        int escolha;
        double qnt, precoPorKg = 0, total, desconto = 0;
        String tipoCarne = "", tipoPagamento;

        System.out.println("Escolha o tipo de carne:");
        System.out.println("1. Filé Duplo");
        System.out.println("2. Alcatra");
        System.out.println("3. Picanha");
        escolha = ler.nextInt();

        System.out.println("Digite a quantidade (em Kg):");
        qnt = ler.nextDouble();

            switch (escolha) {
                case 1:
                    tipoCarne = "Filé Duplo";
                    precoPorKg = qnt <= 5 ? 4.90 : 5.80;
                    break;
                case 2:
                    tipoCarne = "Alcatra";
                    precoPorKg = qnt <= 5 ? 5.90 : 6.80;
                    break;
                case 3:
                    tipoCarne = "Picanha";
                    precoPorKg = qnt <= 5 ? 6.90 : 7.80;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    return;
            }

        total = qnt * precoPorKg;

        System.out.println("Qual será o tipo de pagamento? (Cartão Tabajara / Outros)");
        tipoPagamento = ler.next();

            if (tipoPagamento.equalsIgnoreCase("Cartao Tabajara")) {
                desconto = total * 0.05;
            }

        total -= desconto;

        System.out.println("\n**** Cupom Fiscal ****");
        System.out.printf("Tipo de carne: %s%n", tipoCarne);
        System.out.printf("Quantidade: %.2f Kg%n", qnt);
        System.out.printf("Preço total: R$ %.2f%n", qnt * precoPorKg);
        System.out.printf("Tipo de pagamento: %s%n", tipoPagamento);
        System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor a pagar: R$ %.2f%n", total);
        System.out.println("************************");

        */

        //=========================================While=======================================

        /*

        int e, w, v = 0;
        System.out.println("Digite um número:") ;
		e = ler.nextInt();
        ler.nextLine(); // Consumindo a quebra de linha após o próximo inteiro
		System.out.println("Quantas vezes vc quer repetir o " + e + "?");
        w = ler.nextInt();
        ler.nextLine(); // Consumindo a quebra de linha após o próximo inteiro

			while ( v < w ){
				System.out.println(e);
				v++;
            }
        
        */

        //=====================================================================================   
        
        ler.close(); // Fecha o Scanner para liberar recursos
    }
}

