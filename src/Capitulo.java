import java.util.Scanner;
import java.util.ArrayList;

public class Capitulo {
    
    private String nome;
    private String texto;
    private ArrayList<Escolha> escolhas = new ArrayList<Escolha>();
    private Personagem personagem1;
    private Personagem personagem2;
    private int alteracaoEnergia;
    private Scanner escaneador;


    public Capitulo(

        String nome,
        String texto,
        Personagem personagem1,
        Personagem personagem2,
        int alteracaoEnergia
        ) 

        { 
        this.nome = nome;
        this.texto = texto;
        this.personagem1 = personagem1;  
        this.personagem2 = personagem2;
        this.alteracaoEnergia = alteracaoEnergia;
        this.escaneador = new Scanner(System.in);
    }   

    // Altera a energia do personagem e imprime no console o valor atual da vida do personagem
    private void energiaPersonagem() {

        this.personagem1.setEnergia(alteracaoEnergia);
        System.out.println("\n\nA energia do personagem é: " + this.personagem1.getEnergia());
    }

    // Imprime o nome, o texto e as escolhas do Capítulo
    private void mostrar() {

        System.out.println(

            "\n\nNome: " + this.nome +
            "\nTexto: " + this.texto);

            if (escolhas != null) {

                for (int i = 0; i < this.escolhas.size(); i++) {
                    
                    System.out.println("\n" + this.escolhas.get(i).getTexto());
                }
            }

    }

    // Recebe a entrada do usuário para uma das escolhas, retornando o índice de um elemento do ArrayList<Escolha>
    private int escolher() {

        if (escaneador.hasNextInt()) {

            int escolhaUsuario = escaneador.nextInt();

            return escolhaUsuario - 1;
        }
        
        else {
            
            return 0;
        }
    }

    // Faz a chamada dos métodos, energiaPersonagem(), mostrar(), escolher() e o próprio executar()
    public void executar() {

        mostrar();
        
        if (this.escolhas.size() != 0) {

            int indice = escolher();
            energiaPersonagem();
            this.escolhas.get(indice).getProximo().executar();
        }
        else {

            energiaPersonagem();
        }

        }

    // Retorna o ArrayList<Escolha>
    public ArrayList<Escolha> getEscolhas() {

        return this.escolhas;
    }
}