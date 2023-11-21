import java.util.ArrayList;

public class Miniprojeto {

    public static void main(String[] args) throws Exception {
        
        // Crição dos personagens:

        Personagem personagem1 = new Personagem("Lucas", 100);
        Personagem personagem2 = new Personagem("Cavaleiro", 100);

        // Criação dos Capítulos:

        Capitulo raiz = new Capitulo(
         "Capitulo 1",

            "No ano de 1200, na pequena aldeia de Vilar, situada na terra de Astra, vivia um jovem chamado" + personagem1.nome + "." +
            personagem1.nome + " era um rapaz curioso e aventureiro, sempre pronto para explorar o mundo ao seu redor. " + 
            "Certo dia, " + personagem1.nome + " estava caminhando pela floresta quando viu um estranho objeto brilhante no chão. " +
            "Então, se aproximou do objeto e percebeu que era uma pedra preciosa. " +
            personagem1.nome + " ficou maravilhado com a pedra. Ele nunca tinha visto nada igual antes. " +
            "Assim, decidiu levar a pedra para casa para mostrar aos seus pais . " +
            "No caminho para casa, " + personagem1.nome + "se deparou com um grupo de bandidos. " +
            "Os bandidos atacaram e tentaram roubar a pedra preciosa. " +
            personagem1.nome + " lutou contra os bandidos, mas eles eram mais fortes que ele. " +
            personagem1.nome + " estava prestes a ser derrotado quando um " + personagem2.nome + 
            " apareceu e salvou o dia. " + "O " + personagem2.nome + " era um homem forte e poderoso. " +
            "Ele derrotou os bandidos e ajudou " + personagem1.nome + " a se levantar. " +
            "Ele agradeceu ao " + personagem2.nome + " por sua ajuda." +
            "O " + personagem1.nome + " disse que era um " + personagem2.nome + " errante e que estava viajando pelo mundo em busca de aventuras. " +
            "No momento, o " + personagem2.nome + " estava decidindo se viajaria para o Norte ou para o Sul da terra de Astra." +
            "Ele ofereceu a " + personagem1.nome + " a chance de viajar com ele.",

            personagem1,
            personagem2,

            -50
            );
        
        // Escolha 1 - (Capitulo 1)

        Capitulo capitulo2 = new Capitulo(
            "Capitulo 2",

        "\n" + personagem1.nome + " decidiu ficar em Vilar. Ele contou aos seus pais sobre a pedra preciosa e sobre o " + personagem2.nome + ". " +
        "Os pais de " + personagem1.nome + " ficaram orgulhosos de seu filho. " +
        "Eles o incentivaram a continuar explorando o mundo e a aprender sobre novas coisas. " +
        "" + personagem1.nome + " continuou a viver em Vilar, mas nunca esqueceu daquele momento com o " + personagem2.nome + ". " + 
        "Ele sempre sonhou em um dia poder viajar pelo mundo e viver novas aventuras.",

            personagem1,
            personagem2,

            20
            );
        
        // Escolha 1 - (Capitulo 2)

        Capitulo capitulo3 = new Capitulo(
            "Capitulo 3",

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
        "Ele era conhecido por sua bondade e compaixão, e ele era uma inspiração para todos que o conheciam. ",


            personagem1,
            null,

            40
            );

        // Escolha 2 - (Capitulo 1)

        Capitulo capitulo5 = new Capitulo(
            "Capitulo 5",

        "\n" + personagem1.nome + " aceitou a oferta e partiu com o " + personagem2.nome + " para uma nova aventura. " +
        "" + personagem1.nome + " e o " + personagem2.nome + " viajaram por muitos lugares. Eles conheceram pessoas de todos os tipos e viveram muitas aventuras. " +
        "Um dia, " + personagem1.nome + " e o " + personagem2.nome + " chegaram a uma cidade que estava sendo assolada por uma praga. " +
        "O " + personagem2.nome + " disse a " + personagem1.nome + " que eles precisavam ajudar as pessoas da cidade. " +
        "" + personagem1.nome + " e o " + personagem2.nome + " ajudaram as pessoas da cidade a lidar com a praga. " +
        "Eles distribuíram comida e água, e ajudaram a construir hospitais. " +
        "" + personagem1.nome + " ficou profundamente afetado pela praga. Ele viu muitas pessoas morrerem, e isso o fez questionar o sentido da vida. " +
        "" + personagem1.nome + " decidiu deixar o " + personagem2.nome + " e viajar pelo mundo sozinho. " +
        "Ele queria encontrar um propósito para sua vida e ajudar as pessoas que precisavam." +
        "Depois de dois dias, enquanto caminhava para outras terras, " + personagem1.nome + " começou a sentir dores e seu corpo " +
        " apresentou cansaço. Não havia dúvidas, ele havia sido contaminado pela praga. ",

            personagem1,
            null,

            -30
            );

        // Escolha 3 - (Capitulo 1)

        Capitulo capitulo6 = new Capitulo(
            "Capitulo 6",

        "\n" + personagem1.nome + " e o " + personagem2.nome + " viajaram por muitos lugares. Eles conheceram pessoas de todos os tipos e viveram muitas aventuras. " +
        "Um dia, " + personagem1.nome + " e o " + personagem2.nome + " chegaram a um castelo cercado por um exército inimigo. " +
        "O " + personagem2.nome + " disse a " + personagem1.nome + " que eles precisavam ajudar o rei do castelo a defender o seu reino. " +
        "" + personagem1.nome + " e o " + personagem2.nome + " lutaram contra o exército inimigo. Eles foram corajosos e derrotaram os inimigos. " +
        "O rei do castelo agradeceu a " + personagem1.nome + " e ao " + personagem2.nome + " por sua ajuda. Ele deu a " + personagem1.nome + " uma recompensa e o nomeou " + "Cavaleiro Honorário" + ". " +
        "" + personagem1.nome + " ficou feliz por ter ajudado o rei. Ele percebeu que tinha um grande potencial como " + "Cavaleiro Honorário do reino" + ".",


            personagem1,
            null,

            -20
            );

        // Escolha 2 - (Capitulo 2)

        Capitulo capitulo4 = new Capitulo(
            "Capitulo 4",

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
        "" + personagem1.nome + " salvou Vilar dos bandidos. Ele foi considerado um herói pela aldeia. ",


            personagem1,
            null,

            30
            );

        // Escolha 1 - (Capitulo 5)

        Capitulo capitulo7 = new Capitulo(
            "Capitulo 7",

            "\n" + personagem1.nome + " estava desesperado. Ele havia sido contaminado pela praga e sabia que não tinha muito tempo." +
            "Ele tinha ouvido falar de uma floresta mágica chamada Floresta Luminosa, onde se dizia que havia uma cura para " +
            "muitas doenças. " + personagem1.nome + " começou a sua jornada para a Floresta Luminosa." +
            "A viagem foi longa e difícil, mas ele estava determinado a encontrar uma cura. " +
            "Finalmente, depois de muitos dias, ele chegou à floresta. " + personagem1.nome + " entrou na floresta e logo " +
            "se viu em um mundo encantado. A floresta estava cheia de árvores e plantas com flores brilhantes. " +
            "O ar estava cheio de música e o canto dos pássaros." + personagem1.nome + " continuou a sua jornada pela " + 
            "floresta, procurando por alguém que pudesse ajudá-lo. Finalmente, ele encontrou um velho sábio que " +
            "morava em uma cabana na floresta. " + personagem1.nome + " contou ao velho sábio sobre sua doença e pediu ajuda. " +
            "O velho sábio ouviu atentamente e depois disse: \n-- Eu posso ajudá-lo, mas você terá que passar por uma prova. " + 
            "\nQual prova? , perguntou " + personagem1.nome +
            "\n-- Você terá que passar três dias e três noites na floresta sozinho, disse o velho sábio." +
            "\n--Se você sobreviver, eu lhe darei a cura." +
            "\n" + personagem1.nome + "estava hesitante, mas ele sabia que não tinha outra escolha. Ele concordou com a prova. " +
            personagem1.nome + " deixou a cabana do velho sábio e entrou na floresta novamente. " +
            "Ele passou os próximos três dias e três noites sozinho na floresta. Ele enfrentou muitos perigos, mas ele sobreviveu. " +
            "No terceiro dia, " + personagem1.nome + " voltou à cabana do velho sábio. O velho sábio cumprimentou-o e disse: " +
            "\n--Você passou na prova. Aqui está a cura." +
            "\nO velho sábio deu a " + personagem1.nome + " uma pequena garrafa cheia de um líquido verde brilhante." +
            personagem1.nome + " tomou o líquido e imediatamente sentiu-se melhor. " +
            "\n--Obrigado, disse " + personagem1.nome + ". -- Você me salvou. " +
            "\n--Você fez por merecer, disse o velho sábio. -- Agora vá e ajude as pessoas que precisam." +
            "\n" + personagem1.nome + " deixou a Floresta Luminosa e voltou à vila. " +
            "Ele usou a cura para ajudar muitas pessoas que estavam doentes. Ele encontrou seu propósito na vida. ",

            personagem1,
            null,

            100
            );
            
        // Escolha 2 - (Capitulo 5)

        Capitulo capitulo8 = new Capitulo(
            "Capitulo 8",
            
            personagem1.nome + " estava desesperado. Ele havia sido contaminado pela praga e sabia que não tinha muito tempo. " + 
            "Ele tinha ouvido falar de um líder dos ladrões que tinha uma cura para todas as doenças. " +
            personagem1.nome + "começou a sua jornada para encontrar o líder dos ladrões. A viagem foi longa e perigosa, " + 
            "mas ele estava determinado a encontrar uma cura. Finalmente, depois de muitos dias, ele chegou à cidade onde " +
            "o líder dos ladrões vivia. " + personagem1.nome + " entrou na cidade e começou a procurar pelo líder dos ladrões. " +
            "Ele perguntou a todos que encontrou, mas ninguém parecia saber onde ele morava. Finalmente, " + personagem1.nome +
            " encontrou um homem que sabia onde o líder dos ladrões morava. O homem disse a " + personagem1.nome + 
            " que ele teria que passar por um teste para provar que era digno de receber a cura. " + personagem1.nome + 
            "aceitou o desafio. Ele passou por um teste difícil, mas ele conseguiu. Finalmente, " + personagem1.nome + 
            "foi levado ao líder dos ladrões. O líder dos ladrões deu a " + personagem1.nome + "uma pequena garrafa cheia de " +
            "um líquido vermelho. " + "\n-- Esta é a cura, disse o líder dos ladrões." + " -- Tome-a e você será curado." +
            "\n" + personagem1.nome + " tomou o líquido e imediatamente sentiu-se melhor. Ele agradeceu ao líder dos ladrões " +
            "e saiu da cidade. " + personagem1.nome + "voltou ao mundo real e usou a cura para ajudar muitas pessoas " +
            "que estavam doentes. Ele encontrou seu propósito na vida e passou o resto de seus dias ajudando os outros.",

            personagem1, 
            null, 

            100
            );
       
        // Adicionando as Escolhas aos Capítulos ----------------------------------------

        // Capítulo 1 --------------------------
        raiz.escolhas.add(new Escolha("\n1) Permanecer em Vilar", capitulo2));
        
        raiz.escolhas.add(new Escolha("\n2) Agradecer " + personagem2.nome +
        " e se juntar a ele em sua jornando viajando para o Sul.", capitulo5));

        raiz.escolhas.add(new Escolha("\n3 Agradecer" + personagem2.nome + 
        " e se juntar a ele em sua jornada viajando para o Norte.", capitulo6));

        // Capítulo 2 --------------------------
        capitulo2.escolhas.add(new Escolha("\n1) Se tornar um professor da aldeia e ir à floresta.", capitulo3));
        capitulo2.escolhas.add(new Escolha("\n2) Passar os dias treinando suas habilidades", capitulo4));

        // Capítulo 5 --------------------------
        capitulo5.escolhas.add(new Escolha("\n1) Procurar cura na Floresta Luminosa.", capitulo7));
        capitulo5.escolhas.add(new Escolha("\n2) Procurar cura com o líder dos Ladrões.", capitulo8));

        // Implementação dos Capítulos ---------------------------------------------------
        
        raiz.executar();

        
    }
}

