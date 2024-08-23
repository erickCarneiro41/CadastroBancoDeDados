package CadastroDados;

import Infra.DadosDAO;
import Interface.CreateTextField;

public class AdicionarUsuario {
	
	private DadosDAO dao = new DadosDAO(null);
    private CreateTextField createTextField;

    public AdicionarUsuario(CreateTextField createTextField) {
        this.createTextField = createTextField;
    }

    public void addUsuario() {
    	
        Usuario usuario = new Usuario(
            createTextField.getText("Nome"),
            createTextField.getText("Sobrenome"),
            createTextField.getText("Email")
        );
        
        try {
        	dao.abrirT().incluirDados(usuario);
        } catch (Exception e) {
        	e.printStackTrace();
        }

    }
}
