package one.digitalinnvation.fabrica_produtos;

import org.springframework.stereotype.Component;

@Component
public class ProdutoB implements Produto {
    private String nome;
    private double preco;
    private String descricao;

    public ProdutoB() {
        this.nome = "Produto B";
        this.preco = 49.99;
        this.descricao = "Este é o Produto B, ideal para tarefas avançadas.";
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Descrição: " + descricao);
    }
}