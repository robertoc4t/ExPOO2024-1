import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class SistemaComercialMap {
    private Map<String, Cliente> clienteMap;
    private Map<String, Produto> produtos;

    public SistemaComercialMap() {
        this.clienteMap = new HashMap<>();
        this.produtos = new HashMap<>();
    }

    public boolean existeProduto(Produto produto) {
        for (Map.Entry<String, Cliente> entry: this.clienteMap.entrySet()) {
            if (produto.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public Produto pesquisProduto(String codProduto) throws ProdutoNaoExisteException{
        for(Map.Entry<String, Produto> entry: this.produtos.entrySet()){
            if(entry.getValue().getCodigo().equals(codProduto)){
                return entry.getValue();
            }
        }
        throw new ProdutoNaoExisteException("Está vazio!");
    }

    public boolean cadastrarProduto(Produto produto){
        if(existeProduto(produto)){
            return false;
        }else{
            this.produtos.put(produto.getCodigo(), produto);
            return true;
        }
    }

    public boolean existeCliente(Cliente cliente){
        for(Map.Entry<String, Cliente> entry: this.clienteMap.entrySet()){
            if(entry.getValue().equals(cliente)){
                return true;
            }
        }
        return false;
    }

    public boolean cadastrarCliente(Cliente cliente){
        if(existeCliente(cliente)){
            return false;
        }else{
            return true;
        }
    }

    public Cliente pesquisCliente(String idCliente)throws ClienteNaoExisteException{
        for(Map.Entry<String, Cliente> entry: this.clienteMap.entrySet()){
            if(entry.getValue().getId().equals(idCliente)){
                return entry.getValue();
            }
        }
            throw new ClienteNaoExisteException("Está vazio!");
    }

    public Collection<Cliente> pesquisaClienteComNomeComecadoCom(String prefixo) {
        Collection<Cliente> clientes = new Vector<>();
        for (Map.Entry<String, Cliente> entry: this.clienteMap.entrySet()){
            if(entry.getValue().getNome().startsWith(prefixo)){
                clientes.add(entry.getValue());
            }
        }
        return clientes;
    }

    public Collection<Produto> pesquisaProdutosComCategoria(CategoriaProduto categoriaProduto){
        Collection<Produto> produtos = new Vector<>();
        for (Map.Entry<String, Produto> entry: this.produtos.entrySet()){
            if(entry.getValue().getCategoria().equals(categoriaProduto)){
                produtos.add(entry.getValue());
            }
        }
        return produtos;
    }





}
