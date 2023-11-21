import java.util.Scanner;
import java.util.ArrayList;

public class Capitulo {
    
    String nome;
    String texto;
    ArrayList<Escolha> escolhas = new ArrayList<Escolha>();
    Personagem personagem;
    Personagem personagem2;
    int alteracaoEnergia;
    Scanner escaneador;


Capitulo(

    String nome,
    String texto,
    Personagem personagem1,
    Personagem personagem2,
    int alteracaoEnergia
    ) 

    { 
    this.nome = nome;
    this.texto = texto;
    this.personagem = personagem1;  
    this.personagem2 = personagem2;
    this.alteracaoEnergia = alteracaoEnergia;
    this.escaneador = new Scanner(System.in);
}   

void mostrar() {

    System.out.println(

        "\n\nNome: " + nome +
        "\nTexto: " + texto);

        if (escolhas != null) {

            for (int i = 0; i < escolhas.size(); i++) {
                
                System.out.println("\n" + escolhas.get(i).texto);
            }
        }

}

int escolher() {

    if (escaneador.hasNextInt()) {

        int escolhaUsuario = escaneador.nextInt();

        return escolhaUsuario - 1;
    }
    
    else {
        
        return 0;
    }
}

void executar() {

    mostrar();
    
    if (escolhas.size() != 0) {

        int indice = escolher();
        escolhas.get(indice).proximo.executar();
    }

    }
}