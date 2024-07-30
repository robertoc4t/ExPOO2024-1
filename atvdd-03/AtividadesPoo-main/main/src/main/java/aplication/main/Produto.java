package aplication.main;

import java.util.Objects;

public class  Produto implements Comparable<Produto> {

    private String nome;
    private double preco;
    private double peso;
    private String validade;

    public Produto(){
        this.nome = "";
        this.preco = 0.0;
        this.peso = 0.0;
        this.validade = "";
    }
    public Produto(String nome, double preco, double peso, String validade){
        this.nome = "";
        this.preco = 0.0;
        this.peso = 0.0;
        this.validade = "";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getValidade() {
        return validade;
    }
    public void setValidade(String validade) {
        this.validade = validade;
    }

    @Override
    public int compareTo(Produto o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Produto produto = (Produto) object;
        return java.lang.Double.compare(preco, produto.preco) == 0 && java.lang.Double.compare(peso, produto.peso) == 0 && java.util.Objects.equals(nome, produto.nome) && java.util.Objects.equals(validade, produto.validade);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), nome, preco, peso, validade);
    }
}
