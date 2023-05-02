/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//This class is responsible for the final result window or Window3.
public class Window3 extends JFrame {

	private JMenuBar menuBar;
	private JTextArea FinalResultsField1;
	private JTextArea FinalResultsField2;
	private JLabel Title;
	private JButton button3;

	//Constructor 
	public Window3(){

		this.setTitle("GUI_project");
		this.setSize(1280,720);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1280,720));
		contentPane.setBackground(new Color(16,124,16));


		FinalResultsField1 = new JTextArea();
		FinalResultsField1.setBounds(72,92,475,605);
		FinalResultsField1.setBackground(new Color(215,215,215));
		FinalResultsField1.setForeground(new Color(0,0,0));
		FinalResultsField1.setEnabled(true);
		FinalResultsField1.setLineWrap(true);
		FinalResultsField1.setWrapStyleWord(true);
		FinalResultsField1.setFont(new Font("SansSerif",0,17));
		FinalResultsField1.setText(Window1.list1);
		FinalResultsField1.setBorder(BorderFactory.createBevelBorder(1));
		FinalResultsField1.setVisible(true);
		FinalResultsField1.setEditable(false);

		FinalResultsField2 = new JTextArea();
		FinalResultsField2.setBounds(737,92,475,605);
		FinalResultsField2.setBackground(new Color(215,215,215));
		FinalResultsField2.setForeground(new Color(0,0,0));
		FinalResultsField2.setEnabled(true);
		FinalResultsField2.setLineWrap(true);
		FinalResultsField2.setWrapStyleWord(true);
		FinalResultsField2.setFont(new Font("SansSerif",0,17));
		FinalResultsField2.setText(Window1.list2);
		FinalResultsField2.setBorder(BorderFactory.createBevelBorder(1));
		FinalResultsField2.setVisible(true);
		FinalResultsField1.setEditable(false);

		Title = new JLabel();
		Title.setBounds(392,9,500,75);
		Title.setBackground(new Color(214,217,223));
		Title.setForeground(new Color(25,25,25));
		Title.setEnabled(true);
		Title.setFont(new Font("SansSerif",0,48));
		Title.setText("Best Games For You:");
		Title.setVisible(true);
		
		button3 = new JButton();
		button3.setBounds(567,615,150,75);
		button3.setBackground(new Color(214,217,223));
		button3.setForeground(new Color(0,0,0));
		button3.setEnabled(true);
		button3.setFont(new Font("SansSerif",0,30));
		button3.setText("Back");
		button3.setVisible(true);
		//Set action for button click
		//Call defined method
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Back(evt);
			}
		});

		//adding components to contentPane panel
		contentPane.add(FinalResultsField1);
		contentPane.add(FinalResultsField2);
		contentPane.add(Title);
		contentPane.add(button3);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}
	
	//This method returns you back to the main or the first window so you can reuse the program and get new results.
	private void Back (ActionEvent evt) {
			new Window1();
			this.dispose();
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
				new Window3();
			}
		});
	}
}