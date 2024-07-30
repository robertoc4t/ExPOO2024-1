
public class MensagemParaAlguem extends Mensagem {
    private String emailDestinatario;

    public MensagemParaAlguem(String texto, String emailRememtente, boolean anonima, String emailDestinatario) {
        super(texto, emailRememtente, anonima);
        this.emailDestinatario = emailDestinatario;
    }

    public String getEmailDestinatario() {
        return this.emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    public String getTextoCompletoAExibir() {
        String var10000 = this.emailDestinatario;
        return "Mensagem  para " + var10000 + " Texto: " + super.getTexto() + " para " + super.getEmailRememtente();
    }
}