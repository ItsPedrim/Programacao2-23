import java.util.Scanner;

public class Capitulo {
    
    String nome;
    String texto;
    String escolha1;
    String escolha2;
    String escolha3;
    Personagem personagem;
    Personagem personagem2;
    int alteracaoEnergia;
    Scanner escaneador;


Capitulo(

    String nome,
    String texto,
    String escolha1,
    String escolha2,
    String escolha3,
    Personagem personagem1,
    Personagem personagem2,
    int alteracaoEnergia
    ) 

    { 
    this.nome = nome;
    this.texto = texto;
    this.escolha1 = escolha1;
    this.escolha2 = escolha2;
    this.escolha3 = escolha3;
    this.personagem = personagem1;  
    this.personagem2 = personagem2;
    this.alteracaoEnergia = alteracaoEnergia;
    this.escaneador = new Scanner(System.in);
}   

void mostrar() {

    System.out.println(

        "\n\nNome: " + nome +
        "\nTexto: " + texto);

    if (escolha1 != null) {
    
    System.out.println(
        "\n\nEscolha 1: " + escolha1 +
        "\nEscolha 2: " + escolha2
        );
    }

    if (escolha3 != null) {
        
        System.out.println("\nEscolha 3: " + escolha3);

    }
}

int escolher() {

    if (escaneador.hasNextInt()) {

        int escolhaUsuario = escaneador.nextInt();

        return escolhaUsuario;
    }
    
    else {
        
        return 0;
    }
}
}