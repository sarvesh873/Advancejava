// package Awt_Examples;
import java.awt.*;
import java.awt.event.*;
public class MouseListener_example extends WindowAdapter implements MouseListener {
	Frame F;
	Label l1;
	Font font;
	MouseListener_example(){
		F=new Frame();
		font= new Font("Monospaced", Font.ITALIC, 30);
		F.setLayout(null);
		F.setVisible(true);
		F.setSize(350,300);
		F.setTitle("MouseListener");
		init();
		addcomp();		
	}
	
	void init() {
		l1=new Label();
		l1.setBounds(50, 80, 240, 30);
	}
	void addcomp() {
		F.add(l1);
		l1.setFont(font);
		F.addWindowListener(this);
		F.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		F.setBackground(Color.red );
		l1.setBackground(Color.red);
		l1.setText("MouseClicked");
	}

	public void mousePressed(MouseEvent e) {
		F.setBackground(Color.green );
		l1.setBackground(Color.green );
		l1.setText("MousePressed");
	}

	public void mouseReleased(MouseEvent e) {
		F.setBackground(Color.lightGray );
		l1.setBackground(Color.lightGray );
		l1.setText("MouseReleased");
	}

	public void mouseEntered(MouseEvent e) {
		F.setBackground(Color.yellow );
		l1.setBackground(Color.yellow );
		l1.setText("MouseEntered");
	}

	public void mouseExited(MouseEvent e) {
		F.setBackground(Color.ORANGE );
		l1.setBackground(Color.ORANGE );
		l1.setText("MouseExited");
	}
	
	public void windowClosing(WindowEvent e) {
		F.dispose();
	}
	
	public static void main(String[] args) {
		new MouseListener_example();
	}
		
}
