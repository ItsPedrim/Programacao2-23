public class Personagem {
    
    String nome;
    int energia;
    
    Personagem(String nome, int energia) {
        
        this.nome = nome;
        this.energia = energia;
                                                                                                        
    } 

    int mudancaDeEnergia(int quantidade) {

        energia += quantidade;

        if (energia < 0 ) {

            energia = 0;
        }
        else if (energia > 100) {

            energia = 100;
        }
        
        return energia;
    }
}