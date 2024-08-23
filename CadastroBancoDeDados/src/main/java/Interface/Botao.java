package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import CadastroDados.AdicionarUsuario;

public class Botao {

    private CreateTextField createTextField;
    private AdicionarUsuario adicionarUsuario;

    public Botao(CreateTextField createTextField) {
        this.createTextField = createTextField;
        this.adicionarUsuario = new AdicionarUsuario(createTextField);
    }

    protected JButton botaoFeito;

    public void botao(JPanel jpanel, String nomebotao, JFrame painelPrincipal, JFrame painelFeito) {
        botaoFeito = new JButton(nomebotao);
        jpanel.add(botaoFeito);

        botaoFeito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarUsuario.addUsuario();
                createTextField.resetFields();
                painelFeito.setVisible(true);

            }
        });
    }
}
