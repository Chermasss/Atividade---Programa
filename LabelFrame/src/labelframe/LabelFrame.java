package labelframe;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

 class LabelFrame extends JFrame
{
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    public LabelFrame()
    {
        super("Testing JLabel");
        setLayout( new FlowLayout() );
        
        label1 = new JLabel( "INSTITUTO FEDERAL DE EDUCAÇÃO");
        label1.setToolTipText("JLabel");
        add(label1);
        
        Icon bug = new ImageIcon( getClass().getResource("bug.png"));
        label2 = new JLabel ("CIÊNCIA E TECNOLOGIA", bug, SwingConstants.LEFT);
        add (label2);
        
        label3 = new JLabel();
        label3.setText("DE MATO GROSSO");
        //label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add (label3);
        
                }
 }
