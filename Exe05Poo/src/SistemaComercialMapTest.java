import org.junit.jupiter.api.Test;

import java.util.Collection;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaComercialMapTest {
    @Test
    public void testaCadastroProdutos() {
        SistemaComercialMap sistema = new SistemaComercialMap();
        Collection<Produto> alimentos =
                sistema.pesquisaProdutosComCategoria(CategoriaProduto.ALIMENTO);
        assertTrue(alimentos.size()==0);
        Produto banana = new Produto("bnn", "banana prata", 5.49, 1, CategoriaProduto.ALIMENTO);
        sistema.cadastrarProduto(banana);
        sistema.existeProduto(banana);
        assertTrue(alimentos.size()==0);


    }
}
