public class Personagem {
    
    private String nome;
    private int energia;
    
    public Personagem(String nome, int energia) {
        
        this.nome = nome;
        this.energia = energia;
                                                                                                        
    } 

    // Altera o atributo energia
    public void setEnergia(int quantidade) {

        this.energia += quantidade;

        if (this.energia < 0 ) {

            this.energia = 0;
        }
        else if (energia > 100) {

            this.energia = 100;
        }
    }

    // Retorna o atributo nome
    public String getNome() {

        return this.nome;
    }

    // Retorna o atributo energia
    public int getEnergia() {

        return this.energia;
    }

}