import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class App extends JFrame {
    private static JLabel directions_label=new JLabel("Enter your name here");
    private static JLabel outputlabel=new JLabel( );
    private static JTextField nameBox=new JTextField(25);
    private static JButton nameButton= new JButton("Save");
    private static JLabel email_label=new JLabel("Enter your email here ");
    private static JTextField emailBox=new JTextField(25);
    private static JLabel questionLabel=new JLabel("Enter your question here");
    private static JTextField questionBox=new JTextField(25);
    private static JTextField chickmanAnswerBox=new JTextField(25);
    public static void main(String[] args)throws Exception{
        App window = new App();
        window.setSize(500,200);
        window.setVisible(true);
        window.setTitle("My JFrame");
        window.setLayout(new FlowLayout());
        window.getContentPane().add(directions_label);
        window.getContentPane().add(nameBox); 
        window.getContentPane().add(email_label);
        window.getContentPane().add(emailBox);
        window.getContentPane().add(questionLabel);
        window.getContentPane().add(questionBox);
        window.getContentPane().add(new JLabel("    "));
        window.getContentPane().add(nameButton);
       
        window.getContentPane().add(outputlabel);
        nameButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonClicked(e);
            }
        });
        
    
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    public static void buttonClicked(ActionEvent e){
        //JOptionPane.showMessageDialog(null,"Button Works","Hi",JOptionPane.INFORMATION_MESSAGE);
        /*
            1. Strip from the screen objects
            2. do something with the data from the screen
            3. output the something

         */
        String yourName =nameBox.getText();
        String yourEmail=emailBox.getText();
        String yourQuestion=questionBox.getText();
        String chickmenAnswer=chickmanAnswerBox.getText();
        String outputMessage="Thank you for the information";
        outputlabel.setText(outputMessage);
        JFrame frame = new JFrame();
  
        String[] columnNames = new String[]{"Question","Answer"};
       
        Object[][] data = new Object[9][2];
        for(int r=0;r<data.length;r++){
            for(int c=0;c<data[r].length;c++){
                if(c==1){
                    data[r][c]=chickmenAnswer;
                }
                else{
                    data[r][c]=yourQuestion;
                }
            }
        }
 


        
        

      JTable table = new JTable(data, columnNames);

            JScrollPane scrollPane = new JScrollPane(table);
// Force the scrollbars to always be displayed

scrollPane.setVerticalScrollBarPolicy(
    JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
frame.add(scrollPane);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(400,400);
     frame.setLocationRelativeTo(null);  
     frame.setVisible(true);
    }
}
