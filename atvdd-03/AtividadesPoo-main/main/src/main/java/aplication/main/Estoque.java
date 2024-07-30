package aplication.main;

import java.util.ArrayList;

public  class Estoque {

    private ArrayList<Produto> list;


    public Estoque(ArrayList<Produto> list) {
        this.list = list;
    }

    public void setProduto(Produto p){
        list.add(p);
    }

    public ArrayList<Produto> consultarTodoEstoque() {
        return list;
    }

    public ArrayList<Produto> removerProduto(Produto p) throws NaoEncotradoException{
    //Removendo um produto do estoque com for each
    ArrayList<Produto> copy = new ArrayList<>(this.list);
    for(Produto pr: list){
        if(pr == p){
            list.remove(pr);
        }
    }
    //Exception se caso o objeto Produto não foi encontrado na lista do estoque
    if(copy == this.list) {
        throw new NaoEncotradoException("não foi encontrado esse objeto no estoque!");
    }
    return this.list;
    }

    

}