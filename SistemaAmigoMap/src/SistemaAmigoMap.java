
import java.util.HashMap;
import java.util.Map;

public class SistemaAmigoMap {
    private Map<String, Mensagem> mensagens;
    private Map<String, Amigo> amigos;


    public SistemaAmigoMap(){
        this.mensagens = new HashMap<>();
        this.amigos = new HashMap<>();
    }

    public void cadastrarAmigo(String value, String nomeAmigo, String emailAmigo, String emailAmigoSorteado){
        Amigo amigo = new Amigo(nomeAmigo, emailAmigo, emailAmigoSorteado);
        amigos.put(value, amigo);

    }
    public Amigo pesquisarAmigo(String emailAmigo) throws AmigoInexistenteException{
        for (Amigo a: amigos.values()){
            if(a.getEmail().equalsIgnoreCase(emailAmigo)){
                return a;
            }
        }
        throw new AmigoInexistenteException("Amigo inexistente!");
    }

    public void enviarMensagemParaTodos(String value, String texto, String emailRemetente, boolean ehAnonima){
        Mensagem msg = new Mensagem(texto, emailRemetente, ehAnonima);
        mensagens.put(value, msg);
    }
    public void enviarMensagemParaAlguem(String value, String texto, String emailRemetente, String emailDestinado, boolean ehAnonima){
        MensagemParaAlguem mensagemparaalguem = new MensagemParaAlguem(texto, emailRemetente, ehAnonima, emailDestinado);
        mensagens.put(value, mensagemparaalguem);
    }

    public Map<String, Mensagem> pesquidaMensagemAnonimas() {
        Map<String, Mensagem> msgAnonimas = new HashMap<>();
        for (Map.Entry<String, Mensagem> men: mensagens.entrySet()){
            if (men.getValue().ehAnonima()){
                msgAnonimas.put(men.getKey(), men.getValue());
            }
        }
        return msgAnonimas;
    }

    public Map<String, Mensagem> pesquisaTodasAsMensagens(){
        return mensagens;
    }



    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException {
        for (Amigo a: amigos.values()){
            if(emailDaPessoa.equalsIgnoreCase(a.getEmail())){
                a.setEmailAmigoSorteado(emailAmigoSorteado);
            }
        }
    }

    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException{
        for (Amigo a: amigos.values()){
            if(emailDaPessoa.equalsIgnoreCase(a.getEmail())){
                return a.getEmailAmigoSorteado();
            }
        }
        throw new AmigoInexistenteException(emailDaPessoa+"Não tem amigo secreto");
    }



}

