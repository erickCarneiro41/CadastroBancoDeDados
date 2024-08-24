package teste;

import CadastroDeProdutos.Produto;
import Infra.ConexaoDAO;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.Query;

public class tests {
    public static void main(String[] args) {
        /*List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Dom Casmurro", "Machado de Assis", "Romance", 256, 10));
        produtos.add(new Produto("O Primo Basílio", "José Maria de Eça de Queirós", "Romance", 312, 15));
        produtos.add(new Produto("Memórias Póstumas de Brás Cubas", "Machado de Assis", "Romance", 320, 8));
        produtos.add(new Produto("A Moreninha", "Joaquim Manuel de Macedo", "Romance", 200, 20));
        produtos.add(new Produto("O Guarani", "José de Alencar", "Romance", 350, 5));
        produtos.add(new Produto("Memórias Póstumas de Brás Cubas", "Machado de Assis", "Romance", 320, 12));
        produtos.add(new Produto("A Moreninha", "Joaquim Manuel de Macedo", "Romance", 200, 18));
        produtos.add(new Produto("O Guarani", "José de Alencar", "Romance", 350, 7));
        produtos.add(new Produto("Senhora", "José de Alencar", "Romance", 250, 14));
        produtos.add(new Produto("Iracema", "José de Alencar", "Romance", 200, 9));
        produtos.add(new Produto("O Primo Basílio", "José Maria de Eça de Queirós", "Romance", 312, 20));
        produtos.add(new Produto("A Moreninha", "Joaquim Manuel de Macedo", "Romance", 220, 15));
        produtos.add(new Produto("O Guarani", "José de Alencar", "Romance", 350, 6));
        produtos.add(new Produto("Senhora", "José de Alencar", "Romance", 250, 12));
        produtos.add(new Produto("Iracema", "José de Alencar", "Romance", 220, 10));*/


        ConexaoDAO<Produto> dao = new ConexaoDAO<>(Produto.class);

        dao.abrirT();

        /*for (Produto produto : produtos) {
            dao.incluirDados(produto);
        }*/


        String jpql = "SELECT COUNT(e.id) FROM Produto e";
        
        Long totalProdutos = dao.contagem(jpql);
        
        System.out.println("Número total de produtos: " + totalProdutos);
        
        dao.fecharT();
    }
}
