import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        listaProdutos.add(p);
    }

    public void removerProduto(Produto p) {
        if(listaProdutos.isEmpty()) {
            System.out.println("Carrinho vazio!");
        } else {
            listaProdutos.remove(p);
            System.out.println("Produto removido com sucesso!");
        }
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    @Override
    public String toString() {
        String lista = listaProdutos.stream().toString();

        return lista;
    }
}
