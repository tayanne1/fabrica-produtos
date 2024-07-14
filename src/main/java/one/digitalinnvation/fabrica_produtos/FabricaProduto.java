package one.digitalinnvation.fabrica_produtos;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class FabricaProduto {

    @Autowired
    private Produto produto;

    public abstract Produto criarProduto();

    public void exibirProduto() {
        Produto produto = criarProduto();
        produto.exibirDetalhes();
    }
}