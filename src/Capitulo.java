import java.util.Scanner;
import java.util.ArrayList;

public class Capitulo {
    
    String nome;
    String texto;
    ArrayList<String> escolhas;
    Personagem personagem;
    Personagem personagem2;
    int alteracaoEnergia;
    Scanner escaneador;


Capitulo(

    String nome,
    String texto,
    ArrayList<String> escolhas,
    Personagem personagem1,
    Personagem personagem2,
    int alteracaoEnergia
    ) 

    { 
    this.nome = nome;
    this.texto = texto;
    this.escolhas = escolhas;
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
                
                System.out.println("\n" + escolhas.get(i));
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
}