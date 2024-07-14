package one.digitalinnvation.fabrica_produtos;

import org.springframework.stereotype.Component;

@Component
public class FabricaProdutoA extends FabricaProduto {
    @Override
    public Produto criarProduto() {
        return new ProdutoA();
    }
}