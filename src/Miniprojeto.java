import java.util.Scanner;

public class Miniprojeto {

    public static void main(String[] args) throws Exception {
        
        Scanner escaneador = new Scanner(System.in);
        
        // Crição dos personagens:

        Personagem personagem1 = new Personagem("Lucas", 100);
        Personagem personagem2 = new Personagem("Cavaleiro", 100);

        // Criação dos Capítulos:

        String capitulo1 =
        "No ano de 1200, na pequena aldeia de Vilar, situada na terra de Astra, vivia um jovem chamado" + personagem1.nome + "." +
        personagem1.nome + " era um rapaz curioso e aventureiro, sempre pronto para explorar o mundo ao seu redor. " + 
        "Certo dia, " + personagem1.nome + " estava caminhando pela floresta quando viu um estranho objeto brilhante no chão. " +
        "Então, se aproximou do objeto e percebeu que era uma pedra preciosa. " +
        personagem1.nome + " ficou maravilhado com a pedra. Ele nunca tinha visto nada igual antes. " +
        "Assim, decidiu levar a pedra para casa para mostrar aos seus pais . ";


        String capitulo2 = 
        "\nNo caminho para casa, " + personagem1.nome + "se deparou com um grupo de bandidos. " +
        "Os bandidos atacaram e tentaram roubar a pedra preciosa. " +
        personagem1.nome + "lutou contra os bandidos, mas eles eram mais fortes que ele. " +
        personagem1.nome + " estava prestes a ser derrotado quando um " + personagem2.nome + " apareceu e salvou o dia. " +
        "O " + personagem2.nome + " era um homem forte e poderoso. Ele derrotou os bandidos e ajudou " + personagem1.nome + " a se levantar. " +
        "Ele agradeceu ao " + personagem2.nome + " por sua ajuda." +
        "O " + personagem1.nome + " disse que era um " + personagem2.nome + " errante e que estava viajando pelo mundo em busca de aventuras. " +
        "No momento, o " + personagem2.nome + " estava decidindo se viajaria para o Norte ou para o Sul da terra de Astra." +
        "Ele ofereceu a " + personagem1.nome + " a chance de viajar com ele." +
        
        "\n\nDevida a batalha, " + personagem1.nome + " agora tem " + (personagem1.energia - 50) + " pontos de vida.\n\n";

        // Escolhas do Capitulo 2
        String capitulo2Escolha1 = 
        "\n 1) Permanecer em Vilar";
        String capitulo2Escolha2 = 
        "\n 2) Agradecer " + personagem2.nome + " e se juntar a ele em sua jornando viajando para o Sul.";
        String capitulo2Escolha3 = 
        "\n 3) Agradecer " + personagem2.nome + " e se juntar a ele em sua jornada viajando para o Norte.";


        // Escolha 1 - (Capitulo 2)

        String capitulo3 =
        "\n" + personagem1.nome + " decidiu ficar em Vilar. Ele contou aos seus pais sobre a pedra preciosa e sobre o " + personagem2.nome + ". " +
        "Os pais de " + personagem1.nome + " ficaram orgulhosos de seu filho. " +
        "Eles o incentivaram a continuar explorando o mundo e a aprender sobre novas coisas. " +
        "" + personagem1.nome + " continuou a viver em Vilar, mas nunca esqueceu daquele momento com o " + personagem2.nome + ". " + 
        "Ele sempre sonhou em um dia poder viajar pelo mundo e viver novas aventuras." +
        
        "\n\n" + personagem1.nome +
        " comeu a deliciosa comida que sua mãe preparou e agora tem " + personagem1.mudancaDeEnergia(20) + " pontos de vida.\n\n";

        // Escolhas do Capitulo 3
        String capitulo3Escolha1 =
        "\n 1) Se tornar um professor da aldeia e ir à floresta.";
        String capitulo3Escolha2 =
        "\n 2) Passar os dias treinando suas habilidades";


        // Escolha 1 - (Capitulo 3)

        String capitulo4 = 
        "\n" + personagem1.nome + " continuou a viver em Vilar. Ele se tornou um professor e passou a ensinar as crianças da aldeia sobre o mundo. " +
        "" + personagem1.nome + " era um professor dedicado. Ele sempre se esforçava para ensinar os alunos o máximo que podia. " +
        "Ele gostava de compartilhar seu conhecimento e paixão pelo aprendizado com os outros. " +
        "As crianças de Vilar adoravam " + personagem1.nome + ". Ele era um homem sábio e gentil, e sempre estava disposto a ajudar. " +
        "Ele era uma inspiração para todos na aldeia. Um dia, " + personagem1.nome + " estava caminhando pela floresta quando encontrou um velho mago." +
        "O mago era um homem sábio e poderoso, e ele ficou impressionado com a inteligência e a bondade de " + personagem1.nome + ". " +
        "O mago ofereceu a " + personagem1.nome + " a oportunidade de aprender magia. " + personagem1.nome + " ficou encantado com a oferta. " +
        "Ele sempre foi fascinado pela magia, e ele sabia que isso poderia ajudá-lo a ajudar ainda mais as pessoas." +
        "" + personagem1.nome + " aceitou a oferta do mago. Ele passou a estudar magia com o mago, e ele aprendeu rapidamente." +
        "" + personagem1.nome + " usou sua magia para ajudar as pessoas de Vilar. " +
        "Ele curou os doentes, protegeu os inocentes e ajudou a resolver conflitos. " +
        "" + personagem1.nome + " se tornou um mago poderoso e respeitado. " +
        "Ele era conhecido por sua bondade e compaixão, e ele era uma inspiração para todos que o conheciam. " +
        
        "\n\n" + personagem1.nome + "aprendeu magia de cura e agora tem " + personagem1.mudancaDeEnergia(40) + " pontos de vida.\n\n";

        
        // Escolha 2 - (Capitulo 2)
        
        String capitulo6 =
        "\n" + personagem1.nome + " aceitou a oferta e partiu com o " + personagem2.nome + " para uma nova aventura. " +
        "" + personagem1.nome + " e o " + personagem2.nome + " viajaram por muitos lugares. Eles conheceram pessoas de todos os tipos e viveram muitas aventuras. " +
        "Um dia, " + personagem1.nome + " e o " + personagem2.nome + " chegaram a uma cidade que estava sendo assolada por uma praga. " +
        "O " + personagem2.nome + " disse a " + personagem1.nome + " que eles precisavam ajudar as pessoas da cidade. " +
        "" + personagem1.nome + " e o " + personagem2.nome + " ajudaram as pessoas da cidade a lidar com a praga. " +
        "Eles distribuíram comida e água, e ajudaram a construir hospitais. " +
        "" + personagem1.nome + " ficou profundamente afetado pela praga. Ele viu muitas pessoas morrerem, e isso o fez questionar o sentido da vida. " +
        "" + personagem1.nome + " decidiu deixar o " + personagem2.nome + " e viajar pelo mundo sozinho. " +
        "Ele queria encontrar um propósito para sua vida e ajudar as pessoas que precisavam." +

        "\n\nDevido os efeitos da praga, " + personagem1.nome + " agora tem " + personagem1.mudancaDeEnergia(-30) + " pontos de vida.\n\n";
        
        // Escolha 3 - (Capitulo 2)
        
        String capitulo7 = 
        "\n" + personagem1.nome + " e o " + personagem2.nome + " viajaram por muitos lugares. Eles conheceram pessoas de todos os tipos e viveram muitas aventuras. " +
        "Um dia, " + personagem1.nome + " e o " + personagem2.nome + " chegaram a um castelo cercado por um exército inimigo. " +
        "O " + personagem2.nome + " disse a " + personagem1.nome + " que eles precisavam ajudar o rei do castelo a defender o seu reino. " +
        "" + personagem1.nome + " e o " + personagem2.nome + " lutaram contra o exército inimigo. Eles foram corajosos e derrotaram os inimigos. " +
        "O rei do castelo agradeceu a " + personagem1.nome + " e ao " + personagem2.nome + " por sua ajuda. Ele deu a " + personagem1.nome + " uma recompensa e o nomeou " + personagem2.nome + ". " +
        "" + personagem1.nome + " ficou feliz por ter ajudado o rei. Ele percebeu que tinha um grande potencial como " + personagem2.nome + "." +
        
        "\n\nDevida a batalha " + personagem1.nome + " agora tem " + personagem1.mudancaDeEnergia(-20) + " pontos de vida.\n\n";
        

        // Escolha 2 - (Capitulo 3)
        String capitulo5 = 
        "\n" + personagem1.nome + " continuou a viver em Vilar. " +
        "Ele decidiu ficar na aldeia para treinar suas habilidades e se tornar um guerreiro poderoso. " +
        "" + personagem1.nome + " passava seus dias treinando com espada, arco e flecha, e combate corpo a corpo. " + 
        "Ele também treinava sua mente, estudando história, estratégia e filosofia." +
        "" + personagem1.nome + " era um estudante dedicado. " +
        "Ele trabalhava duro para melhorar suas habilidades e se tornar o melhor guerreiro possível. " +
        "Um dia, um exército de bandidos atacou Vilar. Os bandidos eram cruéis e impiedosos, e eles saquearam e queimaram a aldeia. " +
        "" + personagem1.nome + " sabia que tinha que fazer alguma coisa para ajudar. " + 
        "Ele reuniu um grupo de homens da aldeia e partiu para enfrentar os bandidos. " +
        "" + personagem1.nome + " e os homens da aldeia lutaram contra os bandidos. Eles foram corajosos e derrotaram os inimigos. " +
        "" + personagem1.nome + " salvou Vilar dos bandidos. Ele foi considerado um herói pela aldeia. " +
        
        "\n\nApós vencer os bandidos  e encontrar poções de cura com eles, " +
        personagem1.nome + " agora tem " + personagem1.mudancaDeEnergia(30) + " pontos de vida.\n\n";


        // Implementação dos Capítulos
        
        System.out.println(capitulo1);
        
        System.out.println("\n" + capitulo2 + capitulo2Escolha1 + capitulo2Escolha2 + capitulo2Escolha3);
        
        // Entrada da escolha do Capítulo 2

        String escolhaCapitulo2 = escaneador.nextLine();

        // Capítulo 2 - Escolha 1
        if (escolhaCapitulo2.equalsIgnoreCase("1")) {

            System.out.println(capitulo3);
            
            System.out.println(capitulo3Escolha1 + capitulo3Escolha2);

            String escolhaCapitulo3 = escaneador.nextLine();

            // Capitulo 3 - Escolha 1
            if (escolhaCapitulo3.equalsIgnoreCase("1")) {

                System.out.println(capitulo4);
            }

            // Capitulo 3 - Escolha 2
            else if (escolhaCapitulo3.equalsIgnoreCase("2")) {

                System.out.println(capitulo5);
            }
        }

        // Capítulo 2 - Escolha 2
        else if (escolhaCapitulo2.equalsIgnoreCase("2")) {

            System.out.println(capitulo6);
        }

        // Capítulo 2 - Escolha 3
        else if (escolhaCapitulo2.equalsIgnoreCase("3")) {

            System.out.println(capitulo7);
        }

        escaneador.close();
    }
}

