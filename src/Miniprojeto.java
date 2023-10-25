import java.util.Scanner;

public class Miniprojeto {
    
    public static void main(String[] args) throws Exception {
        
        Scanner escaneador = new Scanner(System.in);
        
        // Criação dos Capítulos:

        String capitulo1 =
        "No ano de 1200, na pequena aldeia de Vilar, situada na terra de Astra, vivia um jovem chamado Lucas. " +
        "Lucas era um rapaz curioso e aventureiro, sempre pronto para explorar o mundo ao seu redor. " + 
        "Certo dia, Lucas estava caminhando pela floresta quando viu um estranho objeto brilhante no chão. " +
        "Lucas se aproximou do objeto e percebeu que era uma pedra preciosa. " +
        "Lucas ficou maravilhado com a pedra. Ele nunca tinha visto nada igual antes. " +
        "Lucas decidiu levar a pedra para casa para mostrar aos seus pais. ";


        String capitulo2 = 
        "\nNo caminho para casa, Lucas se deparou com um grupo de bandidos. " +
        "Os bandidos atacaram Lucas e tentaram roubar a pedra preciosa. " +
        "Lucas lutou contra os bandidos, mas eles eram mais fortes que ele. " +
        "Lucas estava prestes a ser derrotado quando um cavaleiro apareceu e salvou o dia. " +
        "O cavaleiro era um homem forte e poderoso. Ele derrotou os bandidos e ajudou Lucas a se levantar. " +
        "Lucas agradeceu ao cavaleiro por sua ajuda." +
        "O cavaleiro disse a Lucas que era um cavaleiro errante e que estava viajando pelo mundo em busca de aventuras. " +
        "No momento, o cavaleiro estava decidindo se viajaria para o Norte ou para o Sul da terra de Astra." +
        "O cavaleiro ofereceu a Lucas a chance de viajar com ele.";

        // Escolhas do Capitulo 2
        String capitulo2Escolha1 = 
        "\n 1) Permanecer em Vilar";
        String capitulo2Escolha2 = 
        "\n 2) Agradecer cavaleiro e se juntar a ele em sua jornando viajando para o Sul.";
        String capitulo2Escolha3 = 
        "\n 3) Agradecer cavaleiro e se juntar a ele em sua jornada viajando para o Norte.";


        String capitulo3 =
        "\nLucas decidiu ficar em Vilar. Ele contou aos seus pais sobre a pedra preciosa e sobre o cavaleiro. " +
        "Os pais de Lucas ficaram orgulhosos de seu filho. " +
        "Eles o incentivaram a continuar explorando o mundo e a aprender sobre novas coisas. " +
        "Lucas continuou a viver em Vilar, mas nunca esqueceu daquele momento com o cavaleiro. " + 
        "Ele sempre sonhou em um dia poder viajar pelo mundo e viver novas aventuras.";

        // Escolhas do Capitulo 3
        String capitulo3Escolha1 =
        "\n 1) Se tornar um professor da aldeia e ir à floresta.";
        String capitulo3Escolha2 =
        "\n 2) Passar os dias treinando suas habilidades";


        String capitulo4 = 
        "\nLucas continuou a viver em Vilar. Ele se tornou um professor e passou a ensinar as crianças da aldeia sobre o mundo. " +
        "Lucas era um professor dedicado. Ele sempre se esforçava para ensinar os alunos o máximo que podia. " +
        "Ele gostava de compartilhar seu conhecimento e paixão pelo aprendizado com os outros. " +
        "As crianças de Vilar adoravam Lucas. Ele era um homem sábio e gentil, e sempre estava disposto a ajudar. " +
        "Ele era uma inspiração para todos na aldeia. Um dia, Lucas estava caminhando pela floresta quando encontrou um velho mago." +
        "O mago era um homem sábio e poderoso, e ele ficou impressionado com a inteligência e a bondade de Lucas. " +
        "O mago ofereceu a Lucas a oportunidade de aprender magia. Lucas ficou encantado com a oferta. " +
        "Ele sempre foi fascinado pela magia, e ele sabia que isso poderia ajudá-lo a ajudar ainda mais as pessoas." +
        "Lucas aceitou a oferta do mago. Ele passou a estudar magia com o mago, e ele aprendeu rapidamente." +
        "Lucas usou sua magia para ajudar as pessoas de Vilar. " +
        "Ele curou os doentes, protegeu os inocentes e ajudou a resolver conflitos. " +
        "Lucas se tornou um mago poderoso e respeitado. " +
        "Ele era conhecido por sua bondade e compaixão, e ele era uma inspiração para todos que o conheciam. ";


        String capitulo5 = 
        "\nLucas continuou a viver em Vilar. " +
        "Ele decidiu ficar na aldeia para treinar suas habilidades e se tornar um guerreiro poderoso. " +
        "Lucas passava seus dias treinando com espada, arco e flecha, e combate corpo a corpo. " + 
        "Ele também treinava sua mente, estudando história, estratégia e filosofia." +
        "Lucas era um estudante dedicado. " +
        "Ele trabalhava duro para melhorar suas habilidades e se tornar o melhor guerreiro possível. " +
        "Um dia, um exército de bandidos atacou Vilar. Os bandidos eram cruéis e impiedosos, e eles saquearam e queimaram a aldeia. " +
        "Lucas sabia que tinha que fazer alguma coisa para ajudar. " + 
        "Ele reuniu um grupo de homens da aldeia e partiu para enfrentar os bandidos. " +
        "Lucas e os homens da aldeia lutaram contra os bandidos. Eles foram corajosos e derrotaram os inimigos. " +
        "Lucas salvou Vilar dos bandidos. Ele foi considerado um herói pela aldeia. ";


        String capitulo6 =
        "\nLucas aceitou a oferta e partiu com o cavaleiro para uma nova aventura. " +
        "Lucas e o cavaleiro viajaram por muitos lugares. Eles conheceram pessoas de todos os tipos e viveram muitas aventuras. " +
        "Um dia, Lucas e o cavaleiro chegaram a uma cidade que estava sendo assolada por uma praga. " +
        "O cavaleiro disse a Lucas que eles precisavam ajudar as pessoas da cidade. " +
        "Lucas e o cavaleiro ajudaram as pessoas da cidade a lidar com a praga. " +
        "Eles distribuíram comida e água, e ajudaram a construir hospitais. " +
        "Lucas ficou profundamente afetado pela praga. Ele viu muitas pessoas morrerem, e isso o fez questionar o sentido da vida. " +
        "Lucas decidiu deixar o cavaleiro e viajar pelo mundo sozinho. " +
        "Ele queria encontrar um propósito para sua vida e ajudar as pessoas que precisavam.";


        String capitulo7 = 
        "\nLucas e o cavaleiro viajaram por muitos lugares. Eles conheceram pessoas de todos os tipos e viveram muitas aventuras. " +
        "Um dia, Lucas e o cavaleiro chegaram a um castelo cercado por um exército inimigo. " +
        "O cavaleiro disse a Lucas que eles precisavam ajudar o rei do castelo a defender o seu reino. " +
        "Lucas e o cavaleiro lutaram contra o exército inimigo. Eles foram corajosos e derrotaram os inimigos. " +
        "O rei do castelo agradeceu a Lucas e ao cavaleiro por sua ajuda. Ele deu a Lucas uma recompensa e o nomeou cavaleiro. " +
        "Lucas ficou feliz por ter ajudado o rei. Ele percebeu que tinha um grande potencial como cavaleiro.";

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

            if (escolhaCapitulo3.equalsIgnoreCase("1")) {

                System.out.println(capitulo4);
            }

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

