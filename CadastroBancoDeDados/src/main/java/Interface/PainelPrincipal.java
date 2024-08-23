package Interface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PainelPrincipal {

    JFrame jframe = new JFrame();
    JPanel jpanel = new JPanel();
    
    private PainelFeito feito = new PainelFeito();

    boolean fechada = false;

    CreateTextField createTextField = new CreateTextField();
    Botao botao;

    public PainelPrincipal() {

        new CreateLabel(jpanel, "Nome");
        createTextField.addTextField(jpanel, "Nome");
        new CreateLabel(jpanel, "Sobrenome");
        createTextField.addTextField(jpanel, "Sobrenome");
        new CreateLabel(jpanel, "Email");
        createTextField.addTextField(jpanel, "Email");

        botao = new Botao(createTextField);
        botao.botao(jpanel, "Feito", jframe, feito.PainelFeito());
               
        jframe.setSize(200, 300);
        jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.add(jpanel);
        jframe.setVisible(true);

        jframe.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                fechada = true;
            }
        });
    }

    public boolean janelaAberta() {
        return jframe.isVisible();
    }

    public boolean janelaFechada() {
        return fechada;
    }

    public CreateTextField getCreateTextField() {
        return createTextField;
    }
}
