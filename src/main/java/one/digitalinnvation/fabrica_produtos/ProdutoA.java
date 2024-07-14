package one.digitalinnvation.fabrica_produtos;

import org.springframework.stereotype.Component;

@Component
public class ProdutoA implements Produto {
    private String nome;
    private double preco;
    private String descricao;

    public ProdutoA() {
        this.nome = "Produto A";
        this.preco = 29.99;
        this.descricao = "Este é o Produto A, ideal para tarefas gerais.";
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Descrição: " + descricao);
    }
}