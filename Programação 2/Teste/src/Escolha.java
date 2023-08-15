public class Escolha {
    private String texto;
    private Capitulos proximo;

    public Escolha(String texto, Capitulos proximo)   {
        this.texto = texto;
        this.proximo = proximo;
    }
    public String getTexto(){
        return this.texto;
    }
    public Capitulos getCapituloproximo(){
        return this.proximo;
    }
}
