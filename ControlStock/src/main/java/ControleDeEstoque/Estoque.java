package ControleDeEstoque;

import Infra.ConexaoDAO;

public class Estoque {

    private ConexaoDAO dao = new ConexaoDAO();

    public void Estoque(Long id) {
        Long quantidade = dao.contagem("SELECT COUNT(e.id) FROM EstoqueLivro e WHERE e.id = :id", id);

        if(quantidade >= 10 && quantidade <=20) {
        	System.out.println("Precisamos repor o produto ID: " + id);
        } if(quantidade < 10) {
        	System.out.println("Baixo estoque do produto ID: " + id);
        }

    }

}