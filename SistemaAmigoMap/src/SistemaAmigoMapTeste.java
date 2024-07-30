import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SistemaAmigoMapTeste {

    public static void main(String[] args) throws  AmigoInexistenteException {
        SistemaAmigoMap sistemaAmigo = new SistemaAmigoMap();
        sistemaAmigo.cadastrarAmigo("1", "jose", "jose@gmail.com", "maria@gmail.com");
        sistemaAmigo.cadastrarAmigo("2", "Maria", "maria@gmail.com", "jose@gmail.com");

        try {
            sistemaAmigo.configuraAmigoSecretoDe("jose@gmail.com", "maria@gmail.com");
        } catch (Exception var5) {
            throw new AmigoInexistenteException("Amigo inexistente!");
        }

        sistemaAmigo.enviarMensagemParaAlguem("1","iae", "maria@gmail.com", "jose@gmail.com", true);
        sistemaAmigo.enviarMensagemParaTodos("2","Hello!", "maria@gmail.com", true);
        Map<String, Mensagem> mensagens = new HashMap<>(sistemaAmigo.pesquisaTodasAsMensagens());
        Iterator<Map.Entry<String, Mensagem>> var3 = mensagens.entrySet().iterator();


        while(var3.hasNext()) {
            Mensagem m = (Mensagem)var3.next();
            if (m.ehAnonima()) {
                System.out.println(m.getTextoCompletoAExibir());
            }
        }

        if (sistemaAmigo.pesquisaAmigoSecretoDe("jose@gmail.com").equalsIgnoreCase("maria@gmail.com")) {
            System.out.println("OK");
        }

    }



}