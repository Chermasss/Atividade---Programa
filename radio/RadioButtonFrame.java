package radio;
    
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.*;

    public class RadioButtonFrame extends JFrame
    {
        private JTextField textField;
        private Font plainFont;
        private Font boldFont;
        private Font italicFont;
        private Font boldItalicFont;
        private JRadioButton plainJRadioButton;
        private JRadioButton boldJRadioButton;
        private JRadioButton italicJRadioButton;
        private JRadioButton boldItalicJRadioButton;
        private ButtonGroup radioGroup;
    

        public RadioButtonFrame()

        {
        super("Radio");
        setLayout(new FlowLayout());

        textField = new JTextField("Font", 25);
        add(textField);
        
        plainJRadioButton = new JRadioButton("plain", true);
        boldJRadioButton = new JRadioButton("bold", false);
        italicJRadioButton = new JRadioButton("italic", false);
        boldItalicJRadioButton = new JRadioButton("bold/italic", false);
        add(plainJRadioButton);
        add(boldJRadioButton);
        add(italicJRadioButton);
        add(boldItalicJRadioButton);
        
       radioGroup = new ButtonGroup();
       radioGroup.add(plainJRadioButton);
       radioGroup.add(boldJRadioButton);
       radioGroup.add(italicJRadioButton);
       radioGroup.add(boldJRadioButton);
       
       plainFont = new Font("serif", Font.PLAIN, 14);
       boldFont = new Font("serif", Font.BOLD, 14);
       italicFont = new Font("serif", Font.ITALIC, 14);
       boldItalicFont = new Font("serif", Font.BOLD + Font.ITALIC, 14);
       textField.setFont (plainFont);
       
       plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
       
       boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
       
       italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
       
       boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
        }
        private class RadioButtonHandler implements ItemListener
        {
            private Font font;
            
            public RadioButtonHandler(Font f)
            {
                font = f;
            }
            
            public void itemStateChanged(ItemEvent event)
            {
                textField.setFont(font);
            }
        }
            public static void main (String[] args) {        
        RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
            radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            radioButtonFrame.setSize (300, 100);
            radioButtonFrame.setVisible (true);
    }
    }
