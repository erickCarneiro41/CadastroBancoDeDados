package Interface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class PainelFeito {

    private JPanel painel = new JPanel();
    private JFrame frame = new JFrame();

    public JFrame PainelFeito() {
        painel.add(new JLabel("FEITO"));        
        frame.setSize(100, 100);
        frame.setLocationRelativeTo(null);
        frame.add(painel);
        return frame;
    }

}
