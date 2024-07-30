package aplication.main;

public class ProdutoLimpesa extends Produto{


    private boolean liquido;




    public ProdutoLimpesa(String nome, double preco, double peso, String validade, boolean liquido){
        super(nome, preco, peso, validade);
        this.liquido = liquido;

    }

    public boolean getLiquido(){
        return this.liquido;
    }
    
}