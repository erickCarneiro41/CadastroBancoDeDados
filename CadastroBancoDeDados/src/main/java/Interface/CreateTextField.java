package Interface;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.HashMap;
import java.util.Map;

public class CreateTextField {

    private Map<String, JTextField> textFieldMap = new HashMap<>();

    public void addTextField(JPanel jpanel, String nomeLabel) {
        JTextField textField = new JTextField(15);
        jpanel.add(textField);
        textFieldMap.put(nomeLabel, textField);
    }

    public String getText(String nomeLabel) {
        JTextField textField = textFieldMap.get(nomeLabel);
        if (textField != null) {
            return textField.getText();
        }
        return null; 
    }

    public void resetFields() {
        for (JTextField textField : textFieldMap.values()) {
            textField.setText(""); 
    }
}}
