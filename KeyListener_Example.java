// package KeyboardEvent;
//Experiment 1
import java.awt.*;
import java.awt.event.*;
public class KeyListener_Example extends WindowAdapter implements KeyListener {
	Frame F;
	Label l1;
	TextArea a;
	KeyListener_Example(){
		F=new Frame();
		F.setLayout(null);
		F.setVisible(true);
		F.setSize(400,400);
		F.setTitle("Application 3");
		init();
		addcomp();

	}
	void init() {
	    l1=new Label();
		l1.setBounds(150, 60, 120, 30);
		a=new TextArea();
		a.setBounds(100,100,200,200);
		a.addKeyListener(this);
	}
    void addcomp() {
  		F.add(l1);
  		F.add(a);
  		F.addWindowListener(this);
    }
    public void keyPressed(KeyEvent e) {
    	l1.setText("KeyPressed");
    }
	public void keyReleased(KeyEvent e) {
    	l1.setText("KeyReleased");
    }
    public void keyTyped(KeyEvent e) {
    	l1.setText("KeyTyped"); 	
    }
    public void windowClosing(WindowEvent e) {
    	F.dispose();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyListener_Example();
	}

}
