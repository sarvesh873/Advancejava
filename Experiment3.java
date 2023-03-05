import java.awt.event.*;
import javax.swing.*;
public class Experiment3 implements ActionListener{
	JFrame f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JButton b1,b2;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6,tf7, tf8;
	JComboBox jc1,jc2;
	String div[] ={"Select One..","TE5","TE6","TE7","TE8"};
	String dept[] ={"Select One..","CS","ENTC","IT"};

	Experiment3(){
		f1=new JFrame();
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setTitle("Student Information");
		init();
		addcomp();
	}
	
	public void init() {
		//sudent info
			l1= new JLabel();
			l1.setBounds(40,20,50,20);
			l1.setText("Name: ");
			tf1 = new JTextField();
			tf1.setBounds(80, 20, 150, 20);
			l2= new JLabel();
			l2.setBounds(40,55,60,20);
			l2.setText("Roll No: ");
			tf2 = new JTextField();
			tf2.setBounds(90, 55, 150, 20);
			l3= new JLabel();
			l3.setBounds(40,90,60,20);
			l3.setText("Seat No: ");
			tf3 = new JTextField();
			tf3.setBounds(95, 90, 150, 20);

		// jcombo
			l4= new JLabel();
			l4.setBounds(40,125,75,20);
			l4.setText("Department: ");
			jc1=new JComboBox(dept);
			jc1.setBounds(120, 125, 100, 20);
			l5= new JLabel();
			l5.setBounds(40,160,75,20);
			l5.setText("Divison: ");
			jc2=new JComboBox(div);
			jc2.setBounds(100, 160, 100, 20);

		// marks label
			l11= new JLabel();
			l11.setBounds(110,195,260,20);
			l11.setText("Marks out of 100: ");
		//marks input
			l6= new JLabel();
			l6.setBounds(40,230,60,20);
			l6.setText("AJP: ");
			tf4 = new JTextField();
			tf4.setBounds(90, 230, 150, 20);
			l7= new JLabel();
			l7.setBounds(40,265,60,20);
			l7.setText("PDC: ");
			tf5 = new JTextField();
			tf5.setBounds(90, 265, 150, 20);
			l8= new JLabel();
			l8.setBounds(40,300,60,20);
			l8.setText("PM: ");
			tf6 = new JTextField();
			tf6.setBounds(90, 300, 150, 20);
			l9= new JLabel();
			l9.setBounds(40,335,60,20);
			l9.setText("CN: ");
			tf7 = new JTextField();
			tf7.setBounds(90, 335, 150, 20);
			l10= new JLabel();
			l10.setBounds(40,370,60,20);
			l10.setText("FJP: ");
			tf8 = new JTextField();
			tf8.setBounds(90, 370, 150, 20);

		//buttons
			b1=new JButton();
			b1.setText("Result");
			b1.setBounds(100, 415, 80, 20);
			b2=new JButton();
			b2.setText("CNCL");
			b2.setBounds(200, 415, 90, 20);
	}

	public void addcomp() {
		f1.setSize(400,500);
		//student info
			f1.add(l1);
			f1.add(tf1);
			f1.add(l2);
			f1.add(tf2);
			f1.add(l3);
			f1.add(tf3);

		//jcombo
			f1.add(l4);
			f1.add(jc1);
			f1.add(l5);
			f1.add(jc2);

		//marks
			f1.add(l11);
			f1.add(l6);
			f1.add(tf4);
			f1.add(l7);
			f1.add(tf5);
			f1.add(l8);
			f1.add(tf6);
			f1.add(l9);
			f1.add(tf7);
			f1.add(l10);
			f1.add(tf8);

		//buttons
			f1.add(b1);
			f1.add(b2);
			b1.addActionListener(this);
			b2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		//Getting data
			String s1 = tf4.getText();
			String s2= tf5.getText();
			String s3= tf6.getText();
			String s4= tf7.getText();
			String s5= tf8.getText();
			Double result;
		//Empty values check
			if (jc1.getSelectedIndex() == 0 || jc2.getSelectedIndex() == 0 || tf1.getText().equals("")
					|| tf2.getText().equals("") || tf3.getText().equals("") || tf4.getText().equals("")
					|| tf5.getText().equals("") || tf6.getText().equals("") || tf7.getText().equals("")
					|| tf8.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Invalid Input", "Getting Error", JOptionPane.ERROR_MESSAGE);
			}
			else{
			//data convresion
				Double num1=Double.parseDouble(s1);
				Double num2=Double.parseDouble(s2);
				Double num3=Double.parseDouble(s3);
				Double num5=Double.parseDouble(s5);
				Double num4=Double.parseDouble(s4);
			//diplay and calculations
					if(e.getSource()==b1) {
						f1.setVisible(false);
						result=((num1+num2+num3+num4+num5)/500)*100;
						JOptionPane.showMessageDialog(f1, "Name: "+tf1.getText() +"\r\n"
						+"Roll No:"+tf2.getText() +"\r\n"
						+"Seat No: "+tf3.getText() +"\r\n"
						+"Department: "+jc1.getSelectedItem() +"\r\n"
						+"Divison: "+jc2.getSelectedItem() +"\r\n"
						+"Percentage"+result.toString(),
						"Result",
						JOptionPane.INFORMATION_MESSAGE
						);
					}
					else {f1.setVisible(false);}
			}
	}

	public static void main(String[] args) {
		new Experiment3();
	}
	
}
