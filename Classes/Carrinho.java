import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        listaProdutos.add(p);
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
