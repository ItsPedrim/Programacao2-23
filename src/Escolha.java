public class Escolha {
    
    private String texto;
    private Capitulo proximo;
    
    public Escolha(String texto, Capitulo proximo) {
    this.texto = texto;    
    this.proximo = proximo;
    }
    
    // Retorna o próximo Capítulo referente à escolha
    public Capitulo getProximo() {

        return this.proximo;
    }

    // Retorna o atributo texto
    public String getTexto() {

        return this.texto;
    }
}