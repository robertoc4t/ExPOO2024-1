public class Mensagem {
    private String texto;
    private String emailRememtente;
    private boolean anonima;

    public Mensagem(String texto, String emailRememtente, boolean anonima) {
        this.texto = texto;
        this.emailRememtente = emailRememtente;
        this.anonima = anonima;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getEmailRememtente() {
        return this.emailRememtente;
    }

    public void setEmailRememtente(String emailRememtente) {
        this.emailRememtente = emailRememtente;
    }

    public boolean ehAnonima() {
        return this.anonima;
    }

    public String getTextoCompletoAExibir() {
        String var10000 = this.getTexto();
        return " Texto: " + var10000 + " de " + this.getEmailRememtente();
    }
}
