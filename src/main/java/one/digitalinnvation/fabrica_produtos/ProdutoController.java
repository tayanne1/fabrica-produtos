package one.digitalinnvation.fabrica_produtos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @Autowired
    private FabricaProdutoA fabricaProdutoA;

    @Autowired
    private FabricaProdutoB fabricaProdutoB;

    @GetMapping("/produtoA")
    public void exibirProdutoA() {
        fabricaProdutoA.exibirProduto();
    }

    @GetMapping("/produtoB")
    public void exibirProdutoB() {
        fabricaProdutoB.exibirProduto();
    }
}