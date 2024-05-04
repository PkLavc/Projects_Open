/*
NO AUTO
*/

class Questoes_Funcao_Quadratica {
	
	public static void main(String[] args) {
		
		double a, b, c, r, x, xv, yv, delta, raizdelta, xlinha, xduaslinhas;

		
System.out.println("========================================================01========================================================");

		System.out.println("Gerador e um aparelho que transforma qualquer energia em energia eletrica. Se a potencia P em watts que certo gerador");
		System.out.println("lanca num circuito e dada pela funcao p(i)=20i^2-5i, em que i e a intencidade da corrente eletrica que atravessa o");
		System.out.println("gerador, determine o numero de watts que expressa a potencia P quando i = 3 amperes.\nCalculo:");
		
		a = 20;
		b = -5;
		x = 3;
		
		System.out.println("Se ele quer que i seja igual a 3, apenas iremos trocar o i por 3 na funcao, ficando p(3)=20(3)^2-5(3)");
		
		a *= (x * x);
		b *= x;
		x = a + b;
		
		System.out.println("Resultando em p(3)=" + x + ", ou seja, " + x + "w.");

System.out.println("========================================================02========================================================");

		System.out.println("Dada a funcao f(x)=x^2-8x+7, determine:\na) Se a concavidade da parabola definida pela funcao e voltada para cima ou para baixo;");
		System.out.println("B) os zeros da funcao;\nc) o ponto em que a parabola intersecta o eixo y;\nd) o vertice da parabola;\nCalculos:");
		
		a = 1;
		b = -8;
		c = 7;
		delta = (b * b) - 4 * a * c;
		raizdelta = Math.sqrt(delta);
		xlinha = (- b + raizdelta) / (2 * a); 
	    xduaslinhas  = (-b - raizdelta) / (2 * a);
	    xv = -b / (2 * a);
	    yv = (- delta) / (4 * a);
		
		System.out.println("a)A concavidade e voltada para cima, pode se observar isso com o a da funcao, que quando e positivo, a sua concavidade e sempre voltada para cima");
		System.out.println("b)Para os zeros da funcao, precisamos apenas igualar a zero e fazer bhaskara!\nVamos comecar com o Delta (b^2-4ac):");
		System.out.println("Delta deu " + delta + "\nAgora vamos calcular os x linhas, sendo x linha -b + raiz do delta / 2a\nE x duas linhas sendo -b - raiz do delta / 2a:");
		System.out.println("x linha deu " + xlinha + "\nx duas linhas deu " + xduaslinhas);
		System.out.println("c)Para o ponto que intersecta o eixo y, precisamos apenas olhar o c da funcao, que no caso e o " + c);
		System.out.println("d)Agora vamos calcular os vertices da parabola!\nSendo o x vertice = -b / 2a \nE o y vertice = -delta /4a");
		System.out.println("x vertice deu " + xv + "\ny vertice deu " + yv);
		System.out.println("Seu maximo sera nas coordenadas " + xv + "," + yv);

System.out.println("========================================================03========================================================");

		System.out.println("Considerando o grafico a seguir referente a funcao quadratica do tipo y=ax^2+bx+c, pode se afirmar que:\nA)a>0;b>0;c<0\nB)a>0;b<0;c>0\nC)a<0;b<0;c<0\nD)a<0;b>0;c>0\nE)a>0;b>0;c>0");
		System.out.println("Calculo:\nPrimeiramente podemos observar que ela tem concavidade voltada para baixo, oque indica que o a seja negativo, eliminando as alternativas A, B e C");
		System.out.println("Agora passando para a b, podemos observar que a parabola passa pelo eixo x subindo, oque indica um b positivo, e com isso eliminando a alternativa C\nResposta e a letra D");
		
System.out.println("========================================================04========================================================");

		System.out.println("O lucro de uma empresa, em funcao do numero de funcionarios que nela trabalham, e dado, em milhares de reais, pela\nformula l(n)=36n-3n^2. Com base nessas informacoes, pode-se afirmar que o lucro dessa empresa e maximo quando\nnela trabalham:");
		System.out.println("(A) 6 funcionarios\n(B) 8 funcionarios\n(C) 10 funcionarios\n(D) 12 funcionarios\n(E) 15 funcionarios");
		System.out.println("Calculo:\nQuando se e de forma indireta ao se referir ao maximo, se pede o x vertice, quando e de forma direta, estamos falando de y vertice, no caso como e lucro maximo quando nele trabalham, estamos falando de x vertice");
		
		a = -3;
		b = 36;
		xv = -b / (2 * a);
		
		System.out.println("Sendo a formula de x vertice -b sobre 2a\nTemos -" + b + "/2*" + a + "\nOque nos da " + xv + "\nContudo, a resposta certa e a A");

System.out.println("========================================================05========================================================");

		System.out.println("Uma bola lancada verticalmente para cima, a partir do solo, tem sua altura h (em metros) expressa em funcao do tempo t\n(em segundos), decorrido apos o lancamento, pela lei h(t)=40t-5t^2.Determine:");
		System.out.println("a) a altura em que a bola se encontra 1 s apos o lancamento\nb) o instante em que a bola se encontra a 75 m do chao");
		System.out.println("c) a altura maxima atingida pela bola\nd) o instante em que a bola retorna ao solo\nCalculo:");
		
		a = -5;
		b = 40;
		x = 1;
		
		System.out.println("a)Para saber a altura que a bola se encontra apos 1 segundo apos o lancamento, devemos apenas trocar o t por 1, com isso temos h(" + x + ")=40(" + x + ")-5(" + x + ")^2)");
		
		a *= (x * x );
		b *= x; 
		a = a + b;
			
		System.out.println("Oque resulta em " + a + " de altura");
		System.out.println("b)Agora para saber o instante em que a bola se encontra a 75 metros do chao, devemos colocar = 75, passar para o outro lado e fazer bhaskara, dessa forma:");
		
		a = -5;
		b = 40;
		c = -75;
		delta = (b * b) - 4 * a * c;
		raizdelta = Math.sqrt(delta);
		xlinha = (- b + raizdelta) / (2 * a); 
	    xduaslinhas  = (-b - raizdelta) / (2 * a);
	    yv = (- delta) / (4 * a);
	    
		System.out.println("h(t)=40t-5t^2=75, depois h(t)=40t-5t^2-75=0 e organizando fica h(t)=-5t^2+40t-75=0");
		System.out.println("Delta deu " + delta + "\nAgora vamos calcular os x linhas, sendo x linha -b + raiz do delta / 2a\nE x duas linhas sendo -b - raiz do delta / 2a:");
		System.out.println("x linha deu " + xlinha + "\nx duas linhas deu " + xduaslinhas);
		System.out.println("Com isso conseguimos dois resultados, oque indica que ela estara a 75 metros do chao no instante " + xlinha + " e no " + xduaslinhas + " (Subindo e descendo)");
		
		c = 0;
		delta = (b * b) - 4 * a * c;
		yv = (- delta) / (4 * a);
		
		System.out.println("c)Para descobrir a altura maxima (uma pergunta direta) devemos entao calcular o y vertice, que e -delta/4a, entao ficando -" + delta + " sobre 4 * " + a);
		System.out.println("Oque resulta em " + yv + " metros de altura.");
		
		raizdelta = Math.sqrt(delta);
		xlinha = (- b + raizdelta) / (2 * a); 
	    xduaslinhas  = (-b - raizdelta) / (2 * a);
	    
		System.out.println("d)Agora para encontrar o instante que a bola encontra ao solo, e so igualar a zero, ficando h(t)=-5t^2+40t=0 e fazer bhaskara\nOque nos da o instante " + xduaslinhas + " do retorno ao solo."); 
		
		
System.out.println("========================================================06========================================================");

		System.out.println("A igreja de Sao Franciso de Assis, obra arquitetonica modernista de Oscar Niemeyer, localizada na Lagoa da Pampulha,\nem Belo horizonte, possui abobadas parabolicas. A seta na Figura 1 ilustra uma das abobadas na entrada principal da");
		System.out.println("capela. A figura 2 fornece uma vista frontal desta abobada, com medidas hipoteticas para simplificar os calculos.\nQual a medida da altura H, em metro, indicada na Figura 2?");
		System.out.println("(A) 16/3\n(B) 31/5\n(C)25/4\n(D)25/3\n(E)75/2\nCalculo:");


System.out.println("========================================================07========================================================");

		System.out.println("O custo diario de producao de um artigo e c(x)=50+2x+0,1x^2, onde x e a quantidade diaria produzida. Cada unidade\ndo produto e vendida por RS6,50. Entre que valores deve variar x para nao haver prejuizo?");
		System.out.println("Calculo:");
		System.out.println("O lucro vem da receira menos o custo, entao podemos colocar\nl(x)=r(x)-c(x)\nr(x)=6,5*x\nc(x)=50+2x+0,1x^2");
		System.out.println("Com isso funcao do lucro fica de l(x)=6,5*x-(50+2x+0,1x^2)\nLembrando dos parenteses, e o sinal de menos ira trocar o sinal de todos dentro do mesmo!!");
		System.out.println("Ficando l(x)=6,5*x-50-2x-0,1x^2");
		
		a = 0.1;
		b = 2;
		c = 50;
		r = 6.5;
		b = r - b;
		a = - a;
		c = - c;
		
		System.out.println("l(x)=" + a + "x^2+" + b + "x" + c);
		System.out.println("Agora iremos igualar a zero, ja que com isso seria o minimo para nao se ter prejuizo\nl(x)=" + a + "x^2+" + b + "x" + c + "=0 (10) para sumir com a virgula");
		
		a = a * 10;
		b = b * 10; 
		c = c * 10;
		delta = (b * b) - 4 * a * c;
		raizdelta = Math.sqrt(delta);
		xlinha = (- b + raizdelta) / (2 * a); 
	    xduaslinhas  = (-b - raizdelta) / (2 * a);
		
		System.out.println("l(x)=" + a + "x^2+" + b + "x" + c + "=0\nAgora basta fazer Bhaskara");
	    System.out.println("Com isso temos que para o minimo sem prejuizo, sera necessario " + xlinha + " ou " + xduaslinhas + " da quantidade diaria produzida.");	

System.out.println("========================================================08========================================================");	
		
		System.out.println("Determine k de modo que f(x)=-x^2-2x+k tenha 2 como valor maximo.");
		System.out.println("Calculo:");
		
		a = -1;
		b = -2;
		
		System.out.println("Como ele deseja o 2 como valor maximo, temos que ter o y vertice = 2 (-delta/2a=2)\nEntao o delta (b^2-4ac) fica " + b + "^2-4(" + a + ")(k)");
		
		a *= -4;
		delta = (b * b);
		
 		System.out.println("delta = " + delta + "+" + a + "k\nEntao fica -(" + delta + "+" + a + "k) sobre 4(-1) = 2");
 		
 		
 		System.out.println("Menos com menos da mais, oque vira " + delta + "+" + a + "k sobre 4 = 2\n4 esta dividindo, passa para la multiplicando\n" + delta + "+" + a + "k = 2 * 4");
 		System.out.println(delta + "+" + a + "k = 8");

		System.out.println(a + "k = 8-" + delta);
		
		delta = 8 - delta;
		
		System.out.println(a + "k = " + delta + "k = " + a + "/" + delta);
		a = delta / a;
		System.out.println("k = " + a);
	
	}	
}
