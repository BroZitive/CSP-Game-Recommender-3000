import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//This class is used to generate Window2 where the question about the prefered platform is answered in a multiple choice format.
public class Window2 extends JFrame {

	private JMenuBar menuBar;
	private JLabel Title2;
	private JButton button2;
	private JRadioButton radiobutton1;
	private JRadioButton radiobutton2;
	private JRadioButton radiobutton3;
	private JRadioButton radiobutton4;
	private JRadioButton radiobutton5;
	private JRadioButton radiobutton6;
	private JRadioButton radiobutton7;
	private JRadioButton radiobutton8;
	private JRadioButton radiobutton9;
	private JRadioButton radiobutton10;
	private JRadioButton radiobutton11;
	private JRadioButton radiobutton12;
	private JRadioButton radiobutton13;
	private JRadioButton radiobutton14;
	private JRadioButton radiobutton15;
	private JRadioButton radiobutton16;
	private JRadioButton radiobutton17;
	private JRadioButton radiobutton18;

	public static String chosenString;

	//Constructor 
	public Window2(){

		this.setTitle("GUI_project");
		this.setSize(1280,720);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1280,720));
		contentPane.setBackground(new Color(16,124,16));


		Title2 = new JLabel();
		Title2.setBounds(392,25,500,75);
		Title2.setBackground(new Color(214,217,223));
		Title2.setForeground(new Color(25,25,25));
		Title2.setEnabled(true);
		Title2.setFont(new Font("SansSerif",0,48));
		Title2.setText("Choose Your Platform:");
		Title2.setVisible(true);

		button2 = new JButton();
		button2.setBounds(392,615,500,75);
		button2.setBackground(new Color(214,217,223));
		button2.setForeground(new Color(0,0,0));
		button2.setEnabled(true);
		button2.setFont(new Font("SansSerif",0,30));
		button2.setText("Confirm");
		button2.setVisible(true);
		//Set action for button click
		//Call defined method
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ConfirmationPressed(evt);
			}
		});


		radiobutton1 = new JRadioButton();
		radiobutton1.setBounds(125,153,300,35);
		radiobutton1.setBackground(new Color(214,217,223));
		radiobutton1.setForeground(new Color(25,25,25));
		radiobutton1.setEnabled(true);
		radiobutton1.setFont(new Font("SansSerif",0,30));
		radiobutton1.setText("Multi-Platform");
		radiobutton1.setVisible(true);

		radiobutton2 = new JRadioButton();
		radiobutton2.setBounds(125,228,300,35);
		radiobutton2.setBackground(new Color(214,217,223));
		radiobutton2.setForeground(new Color(25,25,25));
		radiobutton2.setEnabled(true);
		radiobutton2.setFont(new Font("SansSerif",0,30));
		radiobutton2.setText("Mobile");
		radiobutton2.setVisible(true);

		radiobutton3 = new JRadioButton();
		radiobutton3.setBounds(125,303,300,35);
		radiobutton3.setBackground(new Color(214,217,223));
		radiobutton3.setForeground(new Color(25,25,25));
		radiobutton3.setEnabled(true);
		radiobutton3.setFont(new Font("SansSerif",0,30));
		radiobutton3.setText("Wii");
		radiobutton3.setVisible(true);

		radiobutton4 = new JRadioButton();
		radiobutton4.setBounds(125,378,300,35);
		radiobutton4.setBackground(new Color(214,217,223));
		radiobutton4.setForeground(new Color(25,25,25));
		radiobutton4.setEnabled(true);
		radiobutton4.setFont(new Font("SansSerif",0,30));
		radiobutton4.setText("Game Boy");
		radiobutton4.setVisible(true);

		radiobutton5 = new JRadioButton();
		radiobutton5.setBounds(125,453,300,35);
		radiobutton5.setBackground(new Color(214,217,223));
		radiobutton5.setForeground(new Color(25,25,25));
		radiobutton5.setEnabled(true);
		radiobutton5.setFont(new Font("SansSerif",0,30));
		radiobutton5.setText("NES");
		radiobutton5.setVisible(true);

		radiobutton6 = new JRadioButton();
		radiobutton6.setBounds(125,528,300,35);
		radiobutton6.setBackground(new Color(214,217,223));
		radiobutton6.setForeground(new Color(25,25,25));
		radiobutton6.setEnabled(true);
		radiobutton6.setFont(new Font("SansSerif",0,30));
		radiobutton6.setText("Wii U");
		radiobutton6.setVisible(true);
		
		radiobutton7 = new JRadioButton();
		radiobutton7.setBounds(550,153,300,35);
		radiobutton7.setBackground(new Color(214,217,223));
		radiobutton7.setForeground(new Color(25,25,25));
		radiobutton7.setEnabled(true);
		radiobutton7.setFont(new Font("SansSerif",0,30));
		radiobutton7.setText("Nintendo DS");
		radiobutton7.setVisible(true);

		radiobutton8 = new JRadioButton();
		radiobutton8.setBounds(550,228,300,35);
		radiobutton8.setBackground(new Color(214,217,223));
		radiobutton8.setForeground(new Color(25,25,25));
		radiobutton8.setEnabled(true);
		radiobutton8.setFont(new Font("SansSerif",0,30));
		radiobutton8.setText("Game Boy Color");
		radiobutton8.setVisible(true);

		radiobutton9 = new JRadioButton();
		radiobutton9.setBounds(550,303,300,35);
		radiobutton9.setBackground(new Color(214,217,223));
		radiobutton9.setForeground(new Color(25,25,25));
		radiobutton9.setEnabled(true);
		radiobutton9.setFont(new Font("SansSerif",0,30));
		radiobutton9.setText("Nintendo 3DS");
		radiobutton9.setVisible(true);

		radiobutton10 = new JRadioButton();
		radiobutton10.setBounds(550,378,300,35);
		radiobutton10.setBackground(new Color(214,217,223));
		radiobutton10.setForeground(new Color(25,25,25));
		radiobutton10.setEnabled(true);
		radiobutton10.setFont(new Font("SansSerif",0,30));
		radiobutton10.setText("Xbox 360");
		radiobutton10.setVisible(true);

		radiobutton11 = new JRadioButton();
		radiobutton11.setBounds(550,453,300,35);
		radiobutton11.setBackground(new Color(214,217,223));
		radiobutton11.setForeground(new Color(25,25,25));
		radiobutton11.setEnabled(true);
		radiobutton11.setFont(new Font("SansSerif",0,30));
		radiobutton11.setText("Game Boy Advance");
		radiobutton11.setVisible(true);

		radiobutton12 = new JRadioButton();
		radiobutton12.setBounds(550,528,300,35);
		radiobutton12.setBackground(new Color(214,217,223));
		radiobutton12.setForeground(new Color(25,25,25));
		radiobutton12.setEnabled(true);
		radiobutton12.setFont(new Font("SansSerif",0,30));
		radiobutton12.setText("PS3");
		radiobutton12.setVisible(true);
		
		radiobutton13 = new JRadioButton();
		radiobutton13.setBounds(975,153,300,35);
		radiobutton13.setBackground(new Color(214,217,223));
		radiobutton13.setForeground(new Color(25,25,25));
		radiobutton13.setEnabled(true);
		radiobutton13.setFont(new Font("SansSerif",0,30));
		radiobutton13.setText("PS4");
		radiobutton13.setVisible(true);

		radiobutton14 = new JRadioButton();
		radiobutton14.setBounds(975,228,300,35);
		radiobutton14.setBackground(new Color(214,217,223));
		radiobutton14.setForeground(new Color(25,25,25));
		radiobutton14.setEnabled(true);
		radiobutton14.setFont(new Font("SansSerif",0,30));
		radiobutton14.setText("Nintendo Switch");
		radiobutton14.setVisible(true);

		radiobutton15 = new JRadioButton();
		radiobutton15.setBounds(975,303,300,35);
		radiobutton15.setBackground(new Color(214,217,223));
		radiobutton15.setForeground(new Color(25,25,25));
		radiobutton15.setEnabled(true);
		radiobutton15.setFont(new Font("SansSerif",0,30));
		radiobutton15.setText("PS2");
		radiobutton15.setVisible(true);

		radiobutton16 = new JRadioButton();
		radiobutton16.setBounds(975,378,300,35);
		radiobutton16.setBackground(new Color(214,217,223));
		radiobutton16.setForeground(new Color(25,25,25));
		radiobutton16.setEnabled(true);
		radiobutton16.setFont(new Font("SansSerif",0,30));
		radiobutton16.setText("PSP");
		radiobutton16.setVisible(true);

		radiobutton17 = new JRadioButton();
		radiobutton17.setBounds(975,453,300,35);
		radiobutton17.setBackground(new Color(214,217,223));
		radiobutton17.setForeground(new Color(25,25,25));
		radiobutton17.setEnabled(true);
		radiobutton17.setFont(new Font("SansSerif",0,30));
		radiobutton17.setText("Other");
		radiobutton17.setVisible(true);

		radiobutton18 = new JRadioButton();
		radiobutton18.setBounds(975,528,300,35);
		radiobutton18.setBackground(new Color(214,217,223));
		radiobutton18.setForeground(new Color(25,25,25));
		radiobutton18.setEnabled(true);
		radiobutton18.setFont(new Font("SansSerif",0,30));
		radiobutton18.setText("Cancel");
		radiobutton18.setVisible(true);
		
		ButtonGroup choiceOfPlatform = new ButtonGroup();
		choiceOfPlatform.add(radiobutton1);
		choiceOfPlatform.add(radiobutton2);
		choiceOfPlatform.add(radiobutton3);
		choiceOfPlatform.add(radiobutton4);
		choiceOfPlatform.add(radiobutton5);
		choiceOfPlatform.add(radiobutton6);
		choiceOfPlatform.add(radiobutton7);
		choiceOfPlatform.add(radiobutton8);
		choiceOfPlatform.add(radiobutton9);
		choiceOfPlatform.add(radiobutton10);
		choiceOfPlatform.add(radiobutton11);
		choiceOfPlatform.add(radiobutton12);
		choiceOfPlatform.add(radiobutton13);
		choiceOfPlatform.add(radiobutton14);
		choiceOfPlatform.add(radiobutton15);
		choiceOfPlatform.add(radiobutton16);
		choiceOfPlatform.add(radiobutton17);
		choiceOfPlatform.add(radiobutton18);

		//adding components to contentPane panel
		contentPane.add(Title2);
		contentPane.add(button2);
		contentPane.add(radiobutton1);
		contentPane.add(radiobutton2);
		contentPane.add(radiobutton3);
		contentPane.add(radiobutton4);
		contentPane.add(radiobutton5);
		contentPane.add(radiobutton6);
		contentPane.add(radiobutton7);
		contentPane.add(radiobutton8);
		contentPane.add(radiobutton9);
		contentPane.add(radiobutton10);
		contentPane.add(radiobutton11);
		contentPane.add(radiobutton12);
		contentPane.add(radiobutton13);
		contentPane.add(radiobutton14);
		contentPane.add(radiobutton15);
		contentPane.add(radiobutton16);
		contentPane.add(radiobutton17);
		contentPane.add(radiobutton18);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//Method actionPerformed for button1 which is responsible for the multiple choice qustion/answers that will be sent back to the Window1 for further analysis.
	private void ConfirmationPressed (ActionEvent evt) {
		if (radiobutton1.isSelected())
		{
			chosenString = "Multi-platform";
		}
		else if (radiobutton2.isSelected())
		{
			chosenString = "Mobile";
		}
		else if (radiobutton3.isSelected())
		{
			chosenString = "Wii";
		}
		else if (radiobutton4.isSelected())
		{
			chosenString = "Game Boy";
		}
		else if (radiobutton5.isSelected())
		{
			chosenString = "NES";
		}
		else if (radiobutton6.isSelected())
		{
			chosenString = "Wii U";
		}
		else if (radiobutton7.isSelected())
		{
			chosenString = "Nintendo DS";
		}
		else if (radiobutton8.isSelected())
		{
			chosenString = "Game Boy Color";
		}
		else if (radiobutton9.isSelected())
		{
			chosenString = "Nintendo 3DS";
		}
		else if (radiobutton10.isSelected())
		{
			chosenString = "Xbox 360";
		}
		else if (radiobutton11.isSelected())
		{
			chosenString = "Game Boy Advance";
		}
		else if (radiobutton12.isSelected())
		{
			chosenString = "PS3";
		}
		else if (radiobutton13.isSelected())
		{
			chosenString = "PS4";
		}
		else if (radiobutton14.isSelected())
		{
			chosenString = "Nintendo Switch";
		}
		else if (radiobutton15.isSelected())
		{
			chosenString = "PS2";
		}
		else if (radiobutton16.isSelected())
		{
			chosenString = "PSP";
		}
		else if (radiobutton17.isSelected())
		{
			chosenString = "Other";
		}
		else
		{
			chosenString = "Disable";
		}
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
				new Window2();
			}
		});
	}
}