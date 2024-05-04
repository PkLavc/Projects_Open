import java.util.Scanner;

class Equacao_Quadratica {
	
	public static void main(String[] args) {

    	double a, b, c, delta, raizdelta, xlinha, xduaslinhas, xv, yv;
    	
    	Scanner ler = new Scanner(System.in);
    	
    	System.out.println("Equacao Quadratica e formada por ax^2+bx+c=0, \nPrimeiramente, insira o A:");
    	a = ler.nextDouble();
    	ler.nextLine();
    	System.out.println("Agora, insira o B:");
    	b = ler.nextDouble();
    	ler.nextLine();
    	System.out.println("E por fim o C:");
    	c = ler.nextDouble();
    	ler.nextLine();
    	
    	delta = (b * b) - 4 * a * c;
    	raizdelta = Math.sqrt(delta);
	    xlinha = (-b + raizdelta) / (2 * a); 
	    xduaslinhas  = (-b - raizdelta) / (2 * a);	
	    xv = -b / (2 * a);
	    yv = (- delta) / (4 * a);
	    
        System.out.println("=============================Calculos===================================");
	
	    System.out.println("Primeiramente vamos calcular os zeros da funcao, usando bhaskara!\nVamos comecar com o Delta (b^2-4ac):"); 
	    System.out.println("Delta deu " + delta + "\nAgora vamos calcular os x linhas, sendo x linha -b + raiz do delta / 2a\nE x duas linhas sendo -b - raiz do delta / 2a:");
	    System.out.println("x linha deu " + xlinha + "\nx duas linhas deu " + xduaslinhas);
	    System.out.println("Agora vamos calcular os vertices da parabola!\nSendo o x vertice = -b / 2a \nE o y vertice = -delta /4a");
	    System.out.println("x vertice deu " + xv + "\ny vertice deu " + yv);
	    
		System.out.println("=============================Resultados=================================");
		
	    System.out.println("Com isso sabemos que:");
	    	if (a > 0){
        		System.out.println("Como o A e positivo, temos a concavidade da parabola voltada para cima!");
        	} else {
        		System.out.println("Como o A e negativo, temos a concavidade da parabola voltada para baixo!");
        	}
        	
        	if (b > 0 ) {
        		System.out.println("Como o B e positivo, a parabola passara pelo eixo y subindo!");
        	} else if ( b == 0){
        		System.out.println("Como o B e igual a 0, a parabola passara pelo eixo y nem subindo, nem descendo!");
        	} else {
        		System.out.println("Como o B e negativo, a parabola passara pelo eixo y descendo!");
        	}	
        		
        	if	(delta < 0){
        		System.out.println("Como o delta e negativo, nao tocara na linha x");
        	}	else if (delta == 0){
        		System.out.println("Como o delta e igual a 0, tocara apenas em um unico lugar na linha x, exatamente em " + xv);
        	} else {
        		if ( xlinha > xduaslinhas ){
        			System.out.println("Como o delta foi maior que 0, tocara nos pontos " + xduaslinhas + ", " + xlinha + " da linha x"); 
        		}else{
        			System.out.println("Como o delta foi maior que 0, tocara nos pontos " + xlinha + ", " + xduaslinhas + " da linha x"); 
        		}
        	}
        	
        	if (a > 0){
        		System.out.println("Seu maximo sera nas coordenadas " + xv + "," + yv);
        	} else{
        		System.out.println("Seu minimo sera nas coordenadas " + xv + "," + yv);
        	}
        System.out.println("Com o C sendo " + c + ", sabemos que a parabola passara pelo eixo y em " + c);		
    }
}