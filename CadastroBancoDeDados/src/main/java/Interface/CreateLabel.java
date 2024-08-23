package Interface;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreateLabel {
    
    CreateLabel(JPanel jpanel, String nomeLabel) {
        JLabel label = new JLabel(nomeLabel);
        jpanel.add(label);
    }
}
