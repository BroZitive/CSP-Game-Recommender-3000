import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;

//Class for the first and main Window where most calculations take place.
public class Window1 extends JFrame {

    private JMenuBar menuBar;
    private JLabel Title1;
    private JButton button1;
    private JLabel Label;
    private JTextArea Instructions;
    private JRadioButton radiobutton1;
    private JRadioButton radiobutton2;
    private JRadioButton radiobutton3;
    private JRadioButton radiobutton4;
    private JRadioButton radiobutton5;
    private JRadioButton radiobutton6;
    private JTextField textfield1;
    private JTextField textfield2;
    private JTextField textfield3;
    private JTextField textfield4;
    private JTextField textfield5;
    
    private ArrayList<ArrayList<String>> dataCopy = new ArrayList<ArrayList<String>>();

    public static String list1;
    public static String list2;
    

    //Constructor 
    public Window1(){

        this.setTitle("GUI_project");
        this.setSize(1280,720);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(1280,720));
        contentPane.setBackground(new Color(16,124,16));


        Title1 = new JLabel();
        Title1.setBounds(333,9,600,75);
        Title1.setBackground(new Color(214,217,223));
        Title1.setForeground(new Color(25,25,25));
        Title1.setEnabled(true);
        Title1.setFont(new Font("SansSerif",0,48));
        Title1.setText("Game Recommender 3000");
        Title1.setVisible(true);
        
        button1 = new JButton();
        button1.setBounds(392,615,500,75);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("SansSerif",0,30));
        button1.setText("Sort");
        button1.setVisible(true);
        //Set action for button click
        //Call defined method
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Next(evt);
            }
        });
        
        Label = new JLabel();
        Label.setBounds(125,100,300,40);
        Label.setBackground(new Color(214,217,223));
        Label.setForeground(new Color(25,25,25));
        Label.setEnabled(true);
        Label.setFont(new Font("SansSerif",0,38));
        Label.setText("Sort By:");
        Label.setVisible(true);
        
        Instructions = new JTextArea();
        Instructions.setBounds(950,175,250,425);
        Instructions.setBackground(new Color(215,215,215));
        Instructions.setForeground(new Color(0,0,0));
        Instructions.setEnabled(true);
        Instructions.setLineWrap(true);
        Instructions.setWrapStyleWord(true);
        Instructions.setFont(new Font("sansserif",0,20));
        Instructions.setText("Instructions:\r\nSelect the options by which you want to sort the games and type in the answers if needed. Write the dates in the 'day.month.year' format like '5.9.2006'. In the 'Title' section type the entire game title or a part of it like 'Call of Duty' or 'Call of Duty: Modern Warfare 2' and not 'CoD'. Click 'Sort' button once you're done to see the results.");
        Instructions.setBorder(BorderFactory.createBevelBorder(1));
        Instructions.setVisible(true);
        Instructions.setEditable(false);

        radiobutton1 = new JRadioButton();
        radiobutton1.setBounds(125,175,300,35);
        radiobutton1.setBackground(new Color(214,217,223));
        radiobutton1.setForeground(new Color(25,25,25));
        radiobutton1.setEnabled(true);
        radiobutton1.setFont(new Font("SansSerif",0,30));
        radiobutton1.setText("Title");
        radiobutton1.setVisible(true);
        //Set action for button click
        //Call defined method
        radiobutton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                radiobutton1(evt);
            }
        });

        radiobutton2 = new JRadioButton();
        radiobutton2.setBounds(125,250,300,35);
        radiobutton2.setBackground(new Color(214,217,223));
        radiobutton2.setForeground(new Color(25,25,25));
        radiobutton2.setEnabled(true);
        radiobutton2.setFont(new Font("SansSerif",0,30));
        radiobutton2.setText("Sales");
        radiobutton2.setVisible(true);
        //Set action for button click
        //Call defined method
        radiobutton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                radiobutton2(evt);
            }
        });

        radiobutton3 = new JRadioButton();
        radiobutton3.setBounds(125,325,300,35);
        radiobutton3.setBackground(new Color(214,217,223));
        radiobutton3.setForeground(new Color(25,25,25));
        radiobutton3.setEnabled(true);
        radiobutton3.setFont(new Font("SansSerif",0,30));
        radiobutton3.setText("Platform");
        radiobutton3.setVisible(true);
        //Set action for button click
        //Call defined method
        radiobutton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                radiobutton3(evt);
            }
        });

        radiobutton4 = new JRadioButton();
        radiobutton4.setBounds(125,400,300,35);
        radiobutton4.setBackground(new Color(214,217,223));
        radiobutton4.setForeground(new Color(25,25,25));
        radiobutton4.setEnabled(true);
        radiobutton4.setFont(new Font("SansSerif",0,30));
        radiobutton4.setText("Release Date");
        radiobutton4.setVisible(true);
        //Set action for button click
        //Call defined method
        radiobutton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                radiobutton4(evt);
            }
        });

        radiobutton5 = new JRadioButton();
        radiobutton5.setBounds(125,475,300,35);
        radiobutton5.setBackground(new Color(214,217,223));
        radiobutton5.setForeground(new Color(25,25,25));
        radiobutton5.setEnabled(true);
        radiobutton5.setFont(new Font("SansSerif",0,30));
        radiobutton5.setText("Developer");
        radiobutton5.setVisible(true);
        //Set action for button click
        //Call defined method
        radiobutton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                radiobutton5(evt);
            }
        });
        
        radiobutton6 = new JRadioButton();
        radiobutton6.setBounds(125,550,300,35);
        radiobutton6.setBackground(new Color(214,217,223));
        radiobutton6.setForeground(new Color(25,25,25));
        radiobutton6.setEnabled(true);
        radiobutton6.setFont(new Font("SansSerif",0,30));
        radiobutton6.setText("Publisher");
        radiobutton6.setVisible(true);
        //Set action for button click
        //Call defined method
        radiobutton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                radiobutton6(evt);
            }
        });
        
        textfield1 = new JTextField();
        textfield1.setBounds(550,175,350,40);
        textfield1.setBackground(new Color(215,215,215));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("SansSerif",0,16));
        textfield1.setText("");
        textfield1.setVisible(false);
        
        textfield2 = new JTextField();
        textfield2.setBounds(550,250,350,40);
        textfield2.setBackground(new Color(215,215,215));
        textfield2.setForeground(new Color(0,0,0));
        textfield2.setEnabled(true);
        textfield2.setFont(new Font("SansSerif",0,16));
        textfield2.setText("");
        textfield2.setVisible(false);
        
        textfield3 = new JTextField();
        textfield3.setBounds(550,400,350,40);
        textfield3.setBackground(new Color(215,215,215));
        textfield3.setForeground(new Color(0,0,0));
        textfield3.setEnabled(true);
        textfield3.setFont(new Font("SansSerif",0,16));
        textfield3.setText("");
        textfield3.setVisible(false);
        
        textfield4 = new JTextField();
        textfield4.setBounds(550,475,350,40);
        textfield4.setBackground(new Color(215,215,215));
        textfield4.setForeground(new Color(0,0,0));
        textfield4.setEnabled(true);
        textfield4.setFont(new Font("SansSerif",0,16));
        textfield4.setText("");
        textfield4.setVisible(false);
        
        textfield5 = new JTextField();
        textfield5.setBounds(550,550,350,40);
        textfield5.setBackground(new Color(215,215,215));
        textfield5.setForeground(new Color(0,0,0));
        textfield5.setEnabled(true);
        textfield5.setFont(new Font("SansSerif",0,16));
        textfield5.setText("");
        textfield5.setVisible(false);

        //adding components to contentPane panel
        contentPane.add(Title1);
        contentPane.add(button1);
        contentPane.add(Label);
        contentPane.add(Instructions);
        contentPane.add(radiobutton1);
        contentPane.add(radiobutton2);
        contentPane.add(radiobutton3);
        contentPane.add(radiobutton4);
        contentPane.add(radiobutton5);
        contentPane.add(radiobutton6);
        contentPane.add(textfield1);
        contentPane.add(textfield2);
        contentPane.add(textfield3);
        contentPane.add(textfield4);
        contentPane.add(textfield5);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
    // Actions performed after the "Sort" button is pressed. All the data is being analysed based on all the parameters and inputs the user has done to return the final result to the Window3 in a form of 2 strings, list1 and list2.
    private void Next (ActionEvent evt) 
    {
        list1 = "";
        list2 = "";
        Data dataC1 = new Data();
        dataCopy = dataC1.getList1();
        if (radiobutton1.isSelected())
        {
            if (textfield1.getText().isEmpty() == true)
            {
                radiobutton1.setEnabled(false);
            }
            else
            {
                for (int y = 0; y < dataCopy.get(0).size(); y++)
                {
                    if (dataCopy.get(0).get(y).toLowerCase().contains(textfield1.getText().toLowerCase()) != true)
                    {
                        remover(y);
                        y--;
                    }
                }
            }
        }
        if (radiobutton2.isSelected())
        {
            if (textfield2.getText().isEmpty() == true)
            {
                radiobutton2.setEnabled(false);
            }
            else
            {
                for (int y = 0; y < dataCopy.get(1).size(); y++)
                {
                    if (Integer.parseInt(dataCopy.get(1).get(y)) < Integer.parseInt(textfield2.getText()))
                    {
                        remover(y);
                        y--;
                    }
                }
            }
        }
        if (radiobutton3.isSelected())
        {
            if (Window2.chosenString.equals("Disable"))
            {
                radiobutton3.setEnabled(false);
            }
            else
            {
                for (int y = 0; y < dataCopy.get(2).size(); y++)
                {
                    if ((!(Window2.chosenString.equals(dataCopy.get(2).get(y)))) && (!(Window2.chosenString.equals(dataCopy.get(3).get(y)))))
                    {
                        remover(y);
                        y--;
                    }
                }
            }
        }
        if (radiobutton4.isSelected())
        {
            if (textfield3.getText().isEmpty() == true)
            {
                radiobutton4.setEnabled(false);
            }
            else
            {
                int[] dateParts = new int[3];
                String date = textfield3.getText();
                for (int v = 0; v < 3; v++)
                {
                    if (date.indexOf(".") != -1)
                    {
                        dateParts[v] = Integer.parseInt(date.substring(0, date.indexOf(".")));
                        date = date.substring(date.indexOf(".")+1);
                    }
                    else
                    {
                        dateParts[v] = Integer.parseInt(date.substring(0));
                    }
                }
                int[] dateDataParts = new int[3];
                ArrayList<String> dataDateCopy = new ArrayList<String>();
                for (int x = 0; x < dataCopy.get(4).size(); x++)
                {
                    dataDateCopy.add(dataCopy.get(4).get(x));
                }
                for (int y = 0; y < dataDateCopy.size(); y++)
                {
                    for (int v = 0; v < 3; v++)
                    {
                        if (dataDateCopy.get(y).indexOf(".") != -1)
                        {
                            dateDataParts[v] = Integer.parseInt(dataDateCopy.get(y).substring(0, dataDateCopy.get(y).indexOf(".")));
                            dataDateCopy.set(y, dataDateCopy.get(y).substring(dataDateCopy.get(y).indexOf(".")+1));
                        }
                        else
                        {
                            dateDataParts[v] = Integer.parseInt(dataDateCopy.get(y).substring(0));
                        }
                    }
                    if (dateDataParts[2] < dateParts[2])
                    {
                        remover(y);
                        dataDateCopy.remove(y);
                        y--;
                    }
                    else if (dateDataParts[2] == dateParts[2])
                    {
                        if (dateDataParts[1] < dateParts[1])
                        {
                            remover(y);
                            dataDateCopy.remove(y);
                            y--;
                        }
                        else if (dateDataParts[1] == dateParts[1])
                        {
                            if (dateDataParts[0] < dateParts[0])
                            {
                                remover(y);
                                dataDateCopy.remove(y);
                                y--;
                            }
                        }
                    }
                }
            }
        }
        if (radiobutton5.isSelected())
        {
            if (textfield4.getText().isEmpty() == true)
            {
                radiobutton5.setEnabled(false);
            }
            else
            {
                for (int y = 0; y < dataCopy.get(5).size(); y++)
                {
                    if (!(dataCopy.get(5).get(y).toLowerCase().contains(textfield4.getText().toLowerCase())) && !(dataCopy.get(6).get(y).toLowerCase().contains(textfield4.getText().toLowerCase())))
                    {
                        remover(y);
                        y--;
                    }
                }
            }
        }
        if (radiobutton6.isSelected())
        {
            if (textfield5.getText().isEmpty() == true)
            {
                radiobutton6.setEnabled(false);
            }
            else
            {
                for (int y = 0; y < dataCopy.get(7).size(); y++)
                {
                    if (!(dataCopy.get(7).get(y).toLowerCase().contains(textfield5.getText().toLowerCase())) && !(dataCopy.get(8).get(y).toLowerCase().contains(textfield5.getText().toLowerCase())))
                    {
                        remover(y);
                        y--;
                    }
                }
            }
        }
        if (textfield1.getText().equals("*#bean#*"))
        {
            new SecretWindow();
            this.dispose();
        }
        else
        {
            for (int x = 0; x < dataCopy.get(0).size(); x++)
            {
                if (x % 2 == 0)
                {
                    list1 = list1 + dataCopy.get(0).get(x) + "\r\n";
                }
                else if (x % 2 == 1)
                {
                    list2 = list2 + dataCopy.get(0).get(x) + "\r\n";
                }
            }
            if (list1.equals(""))
		    {
			    list1 = ("Sorry, but there are no games that match your conditions based on our data base.");
			    list2 = ("Please change your conditions to see if we can find something else for you to play.");
		    }
            new Window3();
            this.dispose();
        }
    }

    //radiobutton1-6 check if the user has selected the radiobutton, which gives them the opportunity to answer the questions in textfields or in a multiple choice form in a new window like for the radiobutton3.
    private void radiobutton1 (ActionEvent evt)
    {
        if (radiobutton1.isSelected())
        {
            textfield1.setVisible(true);
        }
        else
        {
            textfield1.setVisible(false);
        }
    }
    
    private void radiobutton2 (ActionEvent evt)
    {
        if (radiobutton2.isSelected())
        {
            textfield2.setVisible(true);
        }
        else
        {
            textfield2.setVisible(false);
        }
    }
    
    private void radiobutton3 (ActionEvent evt)
    {
        if (radiobutton3.isSelected())
        {
            new Window2();
        }
    }
    
    private void radiobutton4 (ActionEvent evt)
    {
        if (radiobutton4.isSelected())
        {
            textfield3.setVisible(true);
        }
        else
        {
            textfield3.setVisible(false);
        }
    }
    
    private void radiobutton5 (ActionEvent evt)
    {
        if (radiobutton5.isSelected())
        {
            textfield4.setVisible(true);
        }
        else
        {
            textfield4.setVisible(false);
        }
    }
    
    private void radiobutton6 (ActionEvent evt)
    {
        if (radiobutton6.isSelected())
        {
            textfield5.setVisible(true);
        }
        else
        {
            textfield5.setVisible(false);
        }
    }
    
    //This is an algorithm for removing all the data from the dataCopy list that relates to specific game, such as title, date of release, platform, publisher, developer, and sales, to avoid mixing up and error, and to remove the unnecesary data from the list.
    public void remover(int a)
    {
        for (int z = 0; z < 9; z++)
        {
            dataCopy.get(z).remove(a);
        }
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }



     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Window1();
            }
        });
    }
}