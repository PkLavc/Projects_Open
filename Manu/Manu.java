/**
 * @(#)Manu.java
 *
 * Manu
 *
 * @author PkLavc
 * @version 1.00 05/02/2024
 */
import java.util.Scanner;

public class Manu {

    /**
     * @param args
     */

    // Função para remover acentos e converter para minúsculas
    public static String formatarResposta(String str) {
        return str.toLowerCase().replaceAll("[áàâãä]", "a")
                                .replaceAll("[éèêë]", "e")
                                .replaceAll("[íìîï]", "i")
                                .replaceAll("[óòôõö]", "o")
                                .replaceAll("[úùûü]", "u")
                                .replaceAll("[ç]", "c");
    }

    public static void main(String[] args) {

        int idade = 0, boco = 0;
        String nome = "Bobão", apelido = "Bocó", sexo = "INDEFINIDO", resposta;
        String[] gostos = new String[10];
        int[] especial = new int[10];
        Scanner ler = new Scanner (System.in);

        especial[0] = 0 ;
        especial[1] = 0 ;
        especial[2] = 0 ;
        especial[3] = 0 ;

//Intro ============================================================================================================

        System.out.println("  ^_^");
        System.out.println("( -.- )");
        System.out.println(">   ^");
        System.out.println("Ola, sou Manu\nQuem é voce?");
        nome = ler.nextLine();

//Nome =============================================================================================================

        System.out.println("Ola, " + nome + ", esse é o seu nome ou apelido?");
        resposta = ler.nextLine();
        resposta = formatarResposta(resposta);

            if (resposta.equalsIgnoreCase("nome")){
                System.out.println("Hmmmmm, e qual é o seu apelido?");
                apelido = ler.nextLine();
            }else if (resposta.equalsIgnoreCase("apelido")){
                System.out.println("Hmmmmm, e qual é o seu nome?");
                apelido = nome;
                nome = ler.nextLine();
            }else{
                System.out.println("   ^_^        ");
                System.out.println(" ( o.O )      ");
                System.out.println(" >   <        ");
                System.out.println("Mas ue, te perguntei se era NOME ou APELIDO e voce me responde " + resposta);
                System.out.println("Vou te chamar de " + nome + " porque voce é um " + apelido);
                boco += 1;
            }

//Sexo e idade =====================================================================================================

        System.out.println("  ^_^");
        System.out.println("( o.o )");
        System.out.println(">   < ");
        System.out.println("E eu poderia perguntar o seu sexo? .-. ");
        resposta = ler.nextLine();
        resposta = formatarResposta(resposta);

            if (resposta.equals("sim")) {
                // Comparar com "feminino" ou "mulher" sem considerar diferenças entre maiúsculas e minúsculas
                if (resposta.equalsIgnoreCase("feminino") || resposta.equalsIgnoreCase("mulher")) {
                    sexo = "feminino";
                    System.out.println(resposta + " Tem quantos anos?");
                    idade = ler.nextInt();
                
                    if (idade < 15) {
                        System.out.println("Hmmm... Mds, mas é um nene .-.");

                            switch (idade) {
                                case 0:
                                    System.out.println("Parabéns! Você conseguiu sobreviver a mais um ano sem fazer nada além de comer, dormir e fazer cocô! Que tal um prêmio por ser tão bom nisso?");
                                    break;
                                case 1:
                                    System.out.println("Um ano de idade! Parabéns por completar sua primeira volta ao redor do sol! Agora, se puder, pare de mastigar as coisas que não deveria.");
                                    break;
                                case 2:
                                    System.out.println("Dois anos! Você finalmente descobriu que o mundo é maior do que apenas a sala de estar. Agora, se pudesse parar de gritar 'por quê?' a cada dois segundos, seria ótimo!");
                                    break;
                                case 3:
                                    System.out.println("Três anos! Você está na idade onde cada pergunta é seguida por mais cinco perguntas, todas começando com 'por quê?' - um verdadeiro detetive em treinamento!");
                                    break;
                                case 4:
                                    System.out.println("Quatro anos! Parabéns por se tornar um especialista em fazer birra em locais públicos! Espero que os seus pais estejam preparados para mais!");
                                    break;
                                case 5:
                                    System.out.println("Cinco anos! Metade de uma década completa de travessuras, risadas e uma quantidade infindável de energia! Que comece a contagem regressiva para a adolescência!");
                                    break;
                                case 6:
                                    System.out.println("Seis anos! O início oficial da sua carreira como mestre das desculpas inventivas para evitar tomar banho!");
                                    break;
                                case 7:
                                    System.out.println("Sete anos! Agora você é oficialmente um especialista em encontrar maneiras criativas de evitar comer vegetais e fingir que o seu quarto é um campo de batalha inexplorado!");
                                    break;
                                case 8:
                                    System.out.println("Oito anos! Parabéns por alcançar a idade em que se torna cada vez mais difícil convencer você de que Papai Noel e o Coelhinho da Páscoa são reais!");
                                    break;
                                case 9:
                                    System.out.println("Nove anos! O último ano antes da sua primeira década completa na Terra! Aproveite enquanto ainda pode se safar com a desculpa de 'sou só uma criança'!");
                                    break;
                                case 10:
                                    System.out.println("Parabéns por alcançar uma década de sabedoria! Agora você está oficialmente qualificada para participar das discussões familiares e contestar os limites de hora de dormir!");
                                    break;
                                case 11:
                                    System.out.println("Onze anos! A idade em que você começa a acumular conhecimento sobre tudo, desde o universo até as últimas tendências de moda. Ah, e a capacidade de rolar os olhos como uma verdadeira profissional!");
                                    break;
                                case 12:
                                    System.out.println("Doze anos! Prepare-se para o turbilhão emocional conhecido como pré-adolescência. Aproveite a montanha-russa de emoções e lembre-se sempre de que o chocolate é um excelente remédio para os dias ruins!");
                                    break;
                                case 13:
                                    System.out.println("Treze anos! Bem-vinda à montanha-russa da adolescência! Prepare-se para as mudanças de humor, as amizades intensas e a descoberta de que a sua mãe não é tão sem noção quanto você pensava!");
                                    break;
                                default:
                                    System.out.println("Catorze anos! Você está no auge da sua adolescência, onde cada dia é uma aventura emocionante e cada espinha inesperada é uma lembrança de que a vida é cheia de surpresas! Aproveite a jornada e lembre-se sempre de que a confiança é a sua melhor amiga!");
                                    break;
                            }

                    } else if (idade < 18) {
                        System.out.println("Hmmm... e ja comecou a distribuir curriculo?");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( o.o )      ");
                        System.out.println(" >   <        ");
                    } else if (idade < 70) {
                        System.out.println("Ah sim... e porque nao esta trabalhando?");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( @.@ )      ");
                        System.out.println(" >   <        ");
                    } else{
                        System.out.println("Hmmmm...so cuidado que apartir dessa idade, se levantar o braço Deus leva");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( ^.~ )      ");
                        System.out.println(" >   <        ");
                    }
                
                } else if (resposta.equalsIgnoreCase("masculino") || resposta.equalsIgnoreCase("homem")) {
                    sexo = "masculino";
                    System.out.println(resposta + " Tem quantos anos?");
                    idade = ler.nextInt();
                
                    if (idade < 15) {
                        System.out.println("Hmmm... Mds, mas é um nene .-.");

                        switch (idade) {
                            case 0:
                                System.out.println("Parabéns! Você conseguiu sobreviver a mais um ano sem fazer nada além de comer, dormir e fazer cocô! Que tal um prêmio por ser tão bom nisso?");
                                break;
                            case 1:
                                System.out.println("Um ano de idade! Parabéns por completar sua primeira volta ao redor do sol! Agora, se puder, pare de mastigar as coisas que não deveria.");
                                break;
                            case 2:
                                System.out.println("Dois anos! Você finalmente descobriu que o mundo é maior do que apenas a sala de estar. Agora, se pudesse parar de gritar 'por quê?' a cada dois segundos, seria ótimo!");
                                break;
                            case 3:
                                System.out.println("Três anos! Você está na idade onde cada pergunta é seguida por mais cinco perguntas, todas começando com 'por quê?' - um verdadeiro detetive em treinamento!");
                                break;
                            case 4:
                                System.out.println("Quatro anos! Parabéns por se tornar um especialista em fazer birra em locais públicos! Espero que os seus pais estejam preparados para mais!");
                                break;
                            case 5:
                                System.out.println("Cinco anos! Metade de uma década completa de travessuras, risadas e uma quantidade infindável de energia! Que comece a contagem regressiva para a adolescência!");
                                break;
                            case 6:
                                System.out.println("Seis anos! O início oficial da sua carreira como mestre das desculpas inventivas para evitar tomar banho!");
                                break;
                            case 7:
                                System.out.println("Sete anos! Agora você é oficialmente um especialista em encontrar maneiras criativas de evitar comer vegetais e fingir que o seu quarto é um campo de batalha inexplorado!");
                                break;
                            case 8:
                                System.out.println("Oito anos! Parabéns por alcançar a idade em que se torna cada vez mais difícil convencer você de que Papai Noel e o Coelhinho da Páscoa são reais!");
                                break;
                            case 9:
                                System.out.println("Nove anos! O último ano antes da sua primeira década completa na Terra! Aproveite enquanto ainda pode se safar com a desculpa de 'sou só uma criança'!");
                                break;
                            case 10:
                                System.out.println("Parabéns pelos seus 10 anos! Agora que você atingiu uma década, é hora de se preparar para enfrentar os mistérios da matemática, as batalhas épicas nos videogames e as disputas acaloradas sobre quem é o herói mais legal dos quadrinhos!");
                                break;
                            case 11:
                                System.out.println("Onze anos! O início de uma jornada épica rumo à adolescência! Prepare-se para aventuras emocionantes, discussões acaloradas sobre qual é o melhor super-herói e a descoberta de que você pode fazer coisas incríveis quando acredita em si mesmo!");
                                break;
                            case 12:
                                System.out.println("Doze anos! Bem-vindo à era dos pré-adolescentes, onde a única coisa mais rápida do que o seu crescimento é a quantidade de comida que você pode consumir em um único dia! Aproveite cada momento, porque os anos voam tão rápido quanto os seus chutes na bola de futebol!");
                                break;
                            case 13:
                                System.out.println("Treze anos! Prepare-se para uma montanha-russa emocional conhecida como adolescência! Entre os desafios de matemática e os jogos de videogame, lembre-se sempre de que o verdadeiro superpoder está em ser você mesmo!");
                                break;
                            default:
                                System.out.println("Catorze anos! Você está oficialmente na estrada da adolescência! Prepare-se para os altos e baixos emocionais, as amizades verdadeiras e as experiências que moldarão quem você é. Aproveite cada momento, porque a vida é uma aventura cheia de possibilidades!");
                                break;
                        }

                    } else if (idade < 18) {
                        System.out.println("Hmmm... e ja comecou a distribuir curriculo?");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( o.o )      ");
                        System.out.println(" >   <        ");
                    } else if (idade < 70){
                        System.out.println("Ah sim... e porque nao esta trabalhando?");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( @.@ )      ");
                        System.out.println(" >   <        ");
                    } else {
                        System.out.println("Hmmmm...so cuidado que apartir dessa idade, se levantar o braço Deus leva");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( ^.~ )      ");
                        System.out.println(" >   <        ");
                    }
                
                } else if (resposta.equalsIgnoreCase("menina") || resposta.equalsIgnoreCase("moca")) {
                    sexo = "feminino";
                    System.out.println(resposta + " Tem quantos anos?");
                    idade = ler.nextInt();
                
                    if (idade < 15) {
                        System.out.println("Hmmm... Mds, mas é um nene .-.");
                        
                        switch (idade) {
                            case 0:
                                System.out.println("Parabéns! Você conseguiu sobreviver a mais um ano sem fazer nada além de comer, dormir e fazer cocô! Que tal um prêmio por ser tão bom nisso?");
                                break;
                            case 1:
                                System.out.println("Um ano de idade! Parabéns por completar sua primeira volta ao redor do sol! Agora, se puder, pare de mastigar as coisas que não deveria.");
                                break;
                            case 2:
                                System.out.println("Dois anos! Você finalmente descobriu que o mundo é maior do que apenas a sala de estar. Agora, se pudesse parar de gritar 'por quê?' a cada dois segundos, seria ótimo!");
                                break;
                            case 3:
                                System.out.println("Três anos! Você está na idade onde cada pergunta é seguida por mais cinco perguntas, todas começando com 'por quê?' - um verdadeiro detetive em treinamento!");
                                break;
                            case 4:
                                System.out.println("Quatro anos! Parabéns por se tornar um especialista em fazer birra em locais públicos! Espero que os seus pais estejam preparados para mais!");
                                break;
                            case 5:
                                System.out.println("Cinco anos! Metade de uma década completa de travessuras, risadas e uma quantidade infindável de energia! Que comece a contagem regressiva para a adolescência!");
                                break;
                            case 6:
                                System.out.println("Seis anos! O início oficial da sua carreira como mestre das desculpas inventivas para evitar tomar banho!");
                                break;
                            case 7:
                                System.out.println("Sete anos! Agora você é oficialmente um especialista em encontrar maneiras criativas de evitar comer vegetais e fingir que o seu quarto é um campo de batalha inexplorado!");
                                break;
                            case 8:
                                System.out.println("Oito anos! Parabéns por alcançar a idade em que se torna cada vez mais difícil convencer você de que Papai Noel e o Coelhinho da Páscoa são reais!");
                                break;
                            case 9:
                                System.out.println("Nove anos! O último ano antes da sua primeira década completa na Terra! Aproveite enquanto ainda pode se safar com a desculpa de 'sou só uma criança'!");
                                break;
                            case 10:
                                System.out.println("Parabéns por alcançar uma década de sabedoria! Agora você está oficialmente qualificada para participar das discussões familiares e contestar os limites de hora de dormir!");
                                break;
                            case 11:
                                System.out.println("Onze anos! A idade em que você começa a acumular conhecimento sobre tudo, desde o universo até as últimas tendências de moda. Ah, e a capacidade de rolar os olhos como uma verdadeira profissional!");
                                break;
                            case 12:
                                System.out.println("Doze anos! Prepare-se para o turbilhão emocional conhecido como pré-adolescência. Aproveite a montanha-russa de emoções e lembre-se sempre de que o chocolate é um excelente remédio para os dias ruins!");
                                break;
                            case 13:
                                System.out.println("Treze anos! Bem-vinda à montanha-russa da adolescência! Prepare-se para as mudanças de humor, as amizades intensas e a descoberta de que a sua mãe não é tão sem noção quanto você pensava!");
                                break;
                            default:
                                System.out.println("Catorze anos! Você está no auge da sua adolescência, onde cada dia é uma aventura emocionante e cada espinha inesperada é uma lembrança de que a vida é cheia de surpresas! Aproveite a jornada e lembre-se sempre de que a confiança é a sua melhor amiga!");
                                break;
                        }

                    } else if (idade < 18) {
                        System.out.println("Hmmm... e ja comecou a distribuir curriculo?");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( o.o )      ");
                        System.out.println(" >   <        ");
                    } else {
                        System.out.println("Ah sim... e porque nao esta trabalhando?");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( @.@ )      ");
                        System.out.println(" >   <        ");
                    }
                
                } else if (resposta.equalsIgnoreCase("menino") || resposta.equalsIgnoreCase("moco")) {
                    sexo = "masculino";
                    System.out.println(resposta + " Tem quantos anos?");
                    idade = ler.nextInt();
                
                    if (idade < 15) {
                        System.out.println("Hmmm... Mds, mas é um nene .-.");
                        
                        switch (idade) {
                            case 0:
                                System.out.println("Parabéns! Você conseguiu sobreviver a mais um ano sem fazer nada além de comer, dormir e fazer cocô! Que tal um prêmio por ser tão bom nisso?");
                                break;
                            case 1:
                                System.out.println("Um ano de idade! Parabéns por completar sua primeira volta ao redor do sol! Agora, se puder, pare de mastigar as coisas que não deveria.");
                                break;
                            case 2:
                                System.out.println("Dois anos! Você finalmente descobriu que o mundo é maior do que apenas a sala de estar. Agora, se pudesse parar de gritar 'por quê?' a cada dois segundos, seria ótimo!");
                                break;
                            case 3:
                                System.out.println("Três anos! Você está na idade onde cada pergunta é seguida por mais cinco perguntas, todas começando com 'por quê?' - um verdadeiro detetive em treinamento!");
                                break;
                            case 4:
                                System.out.println("Quatro anos! Parabéns por se tornar um especialista em fazer birra em locais públicos! Espero que os seus pais estejam preparados para mais!");
                                break;
                            case 5:
                                System.out.println("Cinco anos! Metade de uma década completa de travessuras, risadas e uma quantidade infindável de energia! Que comece a contagem regressiva para a adolescência!");
                                break;
                            case 6:
                                System.out.println("Seis anos! O início oficial da sua carreira como mestre das desculpas inventivas para evitar tomar banho!");
                                break;
                            case 7:
                                System.out.println("Sete anos! Agora você é oficialmente um especialista em encontrar maneiras criativas de evitar comer vegetais e fingir que o seu quarto é um campo de batalha inexplorado!");
                                break;
                            case 8:
                                System.out.println("Oito anos! Parabéns por alcançar a idade em que se torna cada vez mais difícil convencer você de que Papai Noel e o Coelhinho da Páscoa são reais!");
                                break;
                            case 9:
                                System.out.println("Nove anos! O último ano antes da sua primeira década completa na Terra! Aproveite enquanto ainda pode se safar com a desculpa de 'sou só uma criança'!");
                                break;
                            case 10:
                                System.out.println("Parabéns pelos seus 10 anos! Agora que você atingiu uma década, é hora de se preparar para enfrentar os mistérios da matemática, as batalhas épicas nos videogames e as disputas acaloradas sobre quem é o herói mais legal dos quadrinhos!");
                                break;
                            case 11:
                                System.out.println("Onze anos! O início de uma jornada épica rumo à adolescência! Prepare-se para aventuras emocionantes, discussões acaloradas sobre qual é o melhor super-herói e a descoberta de que você pode fazer coisas incríveis quando acredita em si mesmo!");
                                break;
                            case 12:
                                System.out.println("Doze anos! Bem-vindo à era dos pré-adolescentes, onde a única coisa mais rápida do que o seu crescimento é a quantidade de comida que você pode consumir em um único dia! Aproveite cada momento, porque os anos voam tão rápido quanto os seus chutes na bola de futebol!");
                                break;
                            case 13:
                                System.out.println("Treze anos! Prepare-se para uma montanha-russa emocional conhecida como adolescência! Entre os desafios de matemática e os jogos de videogame, lembre-se sempre de que o verdadeiro superpoder está em ser você mesmo!");
                                break;
                            default:
                                System.out.println("Catorze anos! Você está oficialmente na estrada da adolescência! Prepare-se para os altos e baixos emocionais, as amizades verdadeiras e as experiências que moldarão quem você é. Aproveite cada momento, porque a vida é uma aventura cheia de possibilidades!");
                                break;
                        }

                    } else if (idade < 18) {
                        System.out.println("Hmmm... e ja comecou a distribuir curriculo?");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( o.o )      ");
                        System.out.println(" >   <        ");
                    } else {
                        System.out.println("Ah sim... e porque nao esta trabalhando?");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( @.@ )      ");
                        System.out.println(" >   <        ");
                    }
                
                } else if (resposta.equalsIgnoreCase("senhora") || resposta.equalsIgnoreCase("senhorita")) {
                    sexo = "feminino";
                    System.out.println("Hmmm, e eu poderia perguntar a sua idade, madame mademoiselle?");
                    resposta = ler.nextLine();
                    resposta = formatarResposta(resposta);
                
                    if (resposta.equals("sim")) {
                        System.out.println("E quantos anos a senhorita tem?");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( *.*)       ");
                        System.out.println(" >   <        ");
                        idade = ler.nextInt();

                            if (idade > 70){
                                System.out.println("Hmmmm...so cuidado que apartir dessa idade, se levantar o braço Deus leva");
                                System.out.println("   ^_^        ");
                                System.out.println(" ( ^.~ )      ");
                                System.out.println(" >   <        ");
                            }

                    } else if (resposta.equals("nao")) {
                        System.out.println("Ah... tudo bem, eu sou meio curiosa :)");
                    } else {
                        System.out.println("Mds... a veia é caduca");
                        boco += 1;
                    }
                
                } else if (resposta.equalsIgnoreCase("senhor")) {
                    sexo = "masculino";
                    System.out.println("Hmmm, e eu poderia perguntar a sua idade?");
                    resposta = ler.nextLine();
                    resposta = formatarResposta(resposta);
                
                    if (resposta.equals("sim")) {
                        System.out.println("E quantos anos o senhor tem?");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( ^.^ )      ");
                        System.out.println(" >   <        ");
                        idade = ler.nextInt();

                            if (idade > 70){
                                System.out.println("Hmmmm...so cuidado que apartir dessa idade, se levantar o braço Deus leva");
                                System.out.println("   ^_^        ");
                                System.out.println(" ( ^.~ )      ");
                                System.out.println(" >   <        ");
                            }

                    } else if (resposta.equals("nao")) {
                        System.out.println("Ah... entao vai catar coquin ._.");
                    } else {
                        System.out.println("Mds... o véio é caduco");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( -.- )      ");
                        System.out.println(" >   ^        ");
                        boco += 1;
                    }
                
                } else if (resposta.equalsIgnoreCase("macho")) {
                    sexo = "masculino";
                    System.out.println("Hmmm, cabra macho...sua rosca quei...nao quero dizer...é...posso saber a sua idade?");
                    System.out.println("   ^_^        ");
                    System.out.println(" ( ^.^ )      ");
                    System.out.println(" >   <        ");
                    resposta = ler.nextLine();
                    resposta = formatarResposta(resposta);
                
                    if (resposta.equals("sim")) {
                        System.out.println("E quantos anus o SR teria?");
                        idade = ler.nextInt();

                            if (idade < 10){
                                System.out.println("Nessa idade e se chamando de macho?Ta bom o filhote de Pinscher loko");
                            } else if (idade < 18){
                                System.out.println("E ja foi arrumar emprego? Oh cabra macho");
                            } else if (idade == 18){
                                System.out.println("E ja foi no exercito?Estao te chamando la...o machao...");
                                System.out.println("   ^_^        ");
                                System.out.println(" ( ^.^ )      ");
                                System.out.println(" >   <        ");
                            }else if (idade < 70){
                                System.out.println("Um marmanjo vei se chamando de macho .-.");
                                System.out.println("   ^_^        ");
                                System.out.println(" ( o.O )      ");
                                System.out.println(" >   <        ");
                            }else{
                                System.out.println("Hmmmm...so cuidado que apartir dessa idade, se levantar o braço Deus leva");
                                System.out.println("   ^_^        ");
                                System.out.println(" ( ^.~ )      ");
                                System.out.println(" >   <        ");
                            }
                            
                    } else if (resposta.equals("nao")) {
                        System.out.println("Ah... entao vai a merda :)");
                        System.out.println("  ^_^");
                        System.out.println("( -.- )");
                        System.out.println(">   ^ ");
                    } else {
                        System.out.println("Mds... o maluco é maluco");
                        boco += 1;
                    }
                
                } else {
                    System.out.println("Nao é homem e nem mulher?");
                    resposta = ler.nextLine();
                    resposta = formatarResposta(resposta);
                
                    if (resposta.equals("sim")) {
                        System.out.println("   ^_^        ");
                        System.out.println(" ( o.O )      ");
                        System.out.println(" >   <        ");
                        System.out.println("Julgamentos silenciosos****");
                        especial[0] = 1;
                    } else if (resposta.equals("nao")) {
                        System.out.println("Ah... então é só um mongol");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( ^.~ )      ");
                        System.out.println(" >   <        ");
                    } else {
                        System.out.println("  ^_^         ");
                        System.out.println(" ( o_0 )      ");
                        System.out.println(" >   <        ");   
                        System.out.println("Mds... o bicho é caduco");
                        boco += 1;
                    }
                }

            }else if (resposta.equals("nao")) {
                System.out.println("Hmmmm...fresco\nE eu poderia perguntar a sua idade ou vai ficar de frescura tambem?");
                resposta = ler.nextLine();
                resposta = formatarResposta(resposta);

                    if (resposta.equals("sim")){
                        System.out.println("Ah que bom, né\nSe nao eu ia perguntar oque voce faz aqui .-.\nMas entao..qts anos voce tem?Oh ser sem sexo");
                        idade = ler.nextInt();
                    } else if (resposta.equals("nao")) {
                        System.out.println("Ah... entao vai a merda .-.\nTa fazendo oque aqui entao?");
                        System.out.println("  ^_^");
                        System.out.println("( -.- )");
                        System.out.println(">   ^ ");
                        resposta = ler.nextLine();
                        resposta = formatarResposta(resposta);
                        System.out.println(resposta + "...é um atoa mesmo...");
                    } else {
                        System.out.println("Mds... Mas é um corno mesmo...");
                        boco += 1;
                    }
            }else{
                System.out.println("  ^_^         ");
                System.out.println(" ( o_0 )      ");
                System.out.println(" >   <        ");
                System.out.println("Ta desocupado em?\nVeio aqui me encher o saco pra que entao?");
                resposta = ler.nextLine();
                resposta = formatarResposta(resposta);
                System.out.println(resposta + "...é um zeca tatu mesmo...");
            }        

//culinaria =======================================================================================================

        System.out.println("Entao... " + nome + ", vulgo " + apelido + "\nVoce gosta de qual tipo de culinaria?");
        gostos[0] = ler.nextLine();

            if (gostos[0].equals("asiática") || gostos[0].equals("asiatica")){
                System.out.println("Hmmmmmmmmmmmm...nham nham, gosto de comida asiática em geral\nDesde que não tenha pimenta :)\nE voce?Gosta de pimenta?");
                resposta = ler.nextLine();
                resposta = formatarResposta(resposta);

                    if (resposta.equals("sim")){
                        especial[1] = 1;
                        System.out.println("E sua boca nao estoura?");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( @.@ )      ");
                        System.out.println(" >   <        ");
                        resposta = ler.nextLine();
                        System.out.println("Hmmmmm...a minha sim");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( ;.; )      ");
                        System.out.println(" >   ^        ");
                    }else if (resposta.equals("nao")){
                        especial[1] = 2;
                        System.out.println("Entao somos dois");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( ^.^ )      ");
                        System.out.println(" >   <        ");
                        System.out.println("Mas é porque voce tem gastrite?");
                        resposta = ler.nextLine();
                        resposta = formatarResposta(resposta);

                        if (resposta.equals("sim")){
                            System.out.println("Eu tbm");
                            System.out.println("   ^_^        ");
                            System.out.println(" ( ;.; )      ");
                            System.out.println("    ><        ");
                            especial[2] = 1;
                        }else if (resposta.equals("nao")){
                            especial[2] = 0;
                            System.out.println("   ^_^        ");
                            System.out.println(" ( @.@ )      ");
                            System.out.println(" >   <        ");
                            System.out.println("Eu sim...");
                            System.out.println("   ^_^        ");
                            System.out.println(" ( ;.; )      ");
                            System.out.println(" >   ^        ");
                        }else{
                            System.out.println("Tindi naum, mas blz");
                            System.out.println("   ^_^        ");
                            System.out.println(" ( o.o )      ");
                            System.out.println(" >   <        ");
                            boco += 1;
                        }

                    }else{
                        System.out.println("...é...ta");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( -.- )      ");
                        System.out.println(" >   ^        ");
                        boco += 1;
                    }

            }else if (gostos[0].equals("italiana")){
                System.out.println("Hmmm...é uma das minhas preferidas ^.^\nMas entao...voce corta o macarrao ou até mesmo quebra a massa crua na hora de cozinhar?");
                resposta = ler.nextLine();
                resposta = formatarResposta(resposta);

                    if (resposta.equals("sim")){
                        System.out.println("E rapaz...ao mario vindo puto ali");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( o.o )      ");
                        System.out.println(" >   <        ");
                    }else if (resposta.equals("nao")){
                        System.out.println("O Mario ja estava ali afiando o facao oia");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( @.@ )      ");
                        System.out.println(" >   <        ");
                    }else{
                        System.out.println("Vou considerar como um sim, vou ali chamar o mario");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( ^.~ )      ");
                        System.out.println(" >   <        ");  
                        boco += 1;   
                        System.out.println("E falando nele, voce conhece o Mario?"); 
                        resposta = ler.nextLine();
                        resposta = formatarResposta(resposta); 
                            
                        if (resposta.equals("sim")){
                            System.out.println("Hmmmmmmmmmm...hehehehehheheh");
                            System.out.println("   ^_^        ");
                            System.out.println(" ( >.< )      ");
                            System.out.println(" >   ^        ");
                        }else if (resposta.equals("nao")){
                            System.out.println("hehehehehehe, aquela la que....");
                            System.out.println("   ^_^        ");
                            System.out.println(" ( >.< )      ");
                            System.out.println("   ^ ^        ");
                        }else{
                            System.out.println("Hmmmmmmmmmm...suspeito");
                            System.out.println("   ^_^        ");
                            System.out.println(" ( -.- )      ");
                            System.out.println(" >   ^        ");
                        }
                    }    

            }else if (gostos[0].equals("indiana")){
                System.out.println("Eu tbm...mas nem tanto\nTem umas coisas gostosas\nPrincipalmente os doces");
                System.out.println("   ^_^        ");
                System.out.println(" ( *.*)       ");
                System.out.println(" >   <        ");
                System.out.println("Mas voce tem coragem de comer a comida de rua deles?");
                resposta = ler.nextLine();
                resposta = formatarResposta(resposta);

                    if (resposta.equals("sim")){
                        especial[3] = 1;
                        System.out.println("   ^_^        ");
                        System.out.println(" ( @.@ )      ");
                        System.out.println(" >   <        ");
                    }else if (resposta.equals("nao")){
                        especial[3] = 2;
                        System.out.println("Eu tbm nao");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( >.< )      ");
                        System.out.println(" >   ^        ");
                    }else{
                        System.out.println("É...tao ta");  
                        boco += 1;                     
                    } 
            }else if (gostos[0].equals("francesa")){
                System.out.println("Eu tbm...agora voce me deixou com vontade de comer um Petit gateau\nMas to sem dinheiros");
                System.out.println("   ^_^        ");
                System.out.println(" ( ;.;)       ");
                System.out.println(" >   <        ");
                System.out.println("Me empresta um dinheirinho?");
                resposta = ler.nextLine();
                resposta = formatarResposta(resposta);

                    if (resposta.equals("sim")){
                        System.out.println("   ^_^        ");
                        System.out.println(" ( ^.^ )      ");
                        System.out.println("   ><         ");
                        System.out.println("Entao vamos depois daqui comprar pra gente");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( *.*)       ");
                        System.out.println(" >   <        ");
                    }else if (resposta.equals("nao")){
                        System.out.println("Pao duro");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( ;.; )      ");
                        System.out.println("    ^^        ");
                    }else{
                        System.out.println("vou considerar que sim, nao tira o olho de sua carteira pra ver, oh");  
                        boco += 1;                     
                    }     
            }else if (gostos[0].equals("inglesa")){
                System.out.println("A Inglesa nem existe");
                System.out.println("   ^_^        ");
                System.out.println(" ( o.o )      ");
                System.out.println(" >   <        ");
            }else if (gostos[0].equals("alemã") || gostos[0].equals("alema")){
                System.out.println("Gosto so de algumas coisas nela");
                System.out.println("   ^_^        ");
                System.out.println(" ( ^.^ )      ");
                System.out.println("  >   <       ");
            }else if (gostos[0].equals("russa")){
                System.out.println("Gosto tbm *-*\nTbm se enquadra na asiática mas...ksksks");
                System.out.println("   ^_^        ");
                System.out.println(" ( ^.^ )      ");
                System.out.println("  >   <       ");
            }else if (gostos[0].equals("brasil") || gostos[0].equals("brasileira")){
                System.out.println("Hmmmmmmm...um anguzin suado, um flaaaaaanguin, uma carne de panela");
                System.out.println("   ^_^        ");
                System.out.println(" ( *.* )      ");
                System.out.println("  >   <       ");
            }else{
                System.out.println("Hmmmm...depois irei pesquisar sobre");
                System.out.println("   ^_^        ");
                System.out.println(" ( ^.^ )      ");
                System.out.println("  >   <       ");
            }
        System.out.println("E qual seu prato preferido?");
        gostos[1] = ler.nextLine();
            
            if (gostos[1].equals("pizza")){
                System.out.println("Hmmm...nao gosto de queijo .-. Mas é o prato preferido do Patrick\nVoce o conhece?");
                resposta = ler.nextLine();
                resposta = formatarResposta(resposta);

                    if (resposta.equals("sim")){
                        especial[2] = 1;
                        System.out.println("E de onde voce o conhece?");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( @.@ )      ");
                        System.out.println(" >   <        ");
                        resposta = ler.nextLine();
                        System.out.println("Hmmmmm...to de olho hum");
                    }else if (resposta.equals("nao")){
                        especial[2] = 2;
                        System.out.println("Bom mesmo... hum");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( ^.^ )      ");
                        System.out.println(" >   <        ");
                    }else{
                        System.out.println("Vou considerar como um naum\nMas to de olho em voce!");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( o.o )      ");
                        System.out.println(" >   <        ");
                        boco += 1;
                    }

            }else if (gostos[1].equals("hamburguer")){
                System.out.println("Hmmm...nao gosto quando tem queijo .-. e é o segundo prato preferido do Patrick\nVoce o conhece?");
                resposta = ler.nextLine();
                resposta = formatarResposta(resposta);

                    if (resposta.equals("sim")){
                        especial[2] = 1;
                        System.out.println("E de onde voce o conhece?");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( @.@ )      ");
                        System.out.println(" >   <        ");
                        resposta = ler.nextLine();
                        System.out.println("Hmmmmm...Sei...to de olho hum");
                    }else if (resposta.equals("nao")){
                        especial[2] = 2;
                        System.out.println("Bom mesmo... hum");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( >.< )      ");
                        System.out.println(" >   ^        ");
                    }else{
                        System.out.println("Vou considerar como um naum\nMas to de olho em voce!");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( ^.~ )      ");
                        System.out.println(" >   <        ");    
                        boco += 1;                    
                    }    

            }else if (gostos[1].equals("guioza")){
                System.out.println("   ^_^        ");
                System.out.println(" ( *.*)       ");
                System.out.println(" >   <        ");
                System.out.println("Hmmm...tambem gosto muito :D\nVoce sabe fazer?Eu e o meu mozin ja fizemos, apesar de uns terem ficado meio Frankenstein");
                resposta = ler.nextLine();
                resposta = formatarResposta(resposta);

                    if (resposta.equals("sim")){
                        System.out.println("E como voce faz?Tem algum truque especial?");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( @.@ )      ");
                        System.out.println(" >   <        ");
                        resposta = ler.nextLine();
                        System.out.println("Hmmmmm...");
                    }else if (resposta.equals("nao")){
                        System.out.println("E porque nao tenta? É gostoso :)");
                        System.out.println("   ^_^        ");
                        System.out.println(" ( >.< )      ");
                        System.out.println(" >   ^        ");
                    }else{
                        System.out.println("É....Vou considerar como um nao .-."); 
                        boco += 1;                      
                    } 
            }    

        System.out.println(gostos[1] +" é da culinaria " + gostos[0] +"?");
        resposta = ler.nextLine();
        resposta = formatarResposta(resposta);

            if (resposta.equals("sim")){
                System.out.println("E qual o seu preferido alem da culinaria " + gostos[0] + "?");
                gostos[2] = ler.nextLine();
            }else if (resposta.equals("nao")){
                gostos[2] = gostos[1];
                System.out.println("E qual o prato seu preferido da culinaria " + gostos[0] + "?");
                gostos[1] = ler.nextLine();
            }else{
                System.out.println("...é..blz entao né");
                boco += 1;
            }

//País ============================================================================================================        
  
        System.out.println("E qual o país que voce mais gostaria de conhecer?");
        gostos[3] = ler.nextLine();

        System.out.println(gostos[3] +" tem a culinaria " + gostos[0] +"?");
        resposta = ler.nextLine();
        resposta = formatarResposta(resposta);
            
            if (resposta.equals("sim") || resposta.equals("tem")){
                System.out.println("Entao voce quer ir la para comer " + gostos[2] + "?");
                resposta = ler.nextLine();
                resposta = formatarResposta(resposta);

                    if (resposta.equals("sim")){
                        System.out.println("Sabia, voce tem cara de esgabilado");
                    }else if (resposta.equals("nao")){
                        System.out.println("SEI...vou fingir que acredito, voce tem cara de esgabilado");   
                    }else{
                        System.out.println("Houdooor");
                        boco += 1;
                    }    

            }else if (resposta.equals("nao")){
                gostos[2] = gostos[1];
                System.out.println("E qual o seu preferido da culinaria " + gostos[0] + "?");
                gostos[1] = ler.nextLine();
            }else{
                System.out.println("Certas coisas, é melhor responder diretamente sim ou nao, porque se nao te julgo como um bocozao");
                System.out.println("   ^_^        ");
                System.out.println(" ( ^.^ )      ");
                System.out.println(" >   <        ");
                boco += 1;
            }
    }
}