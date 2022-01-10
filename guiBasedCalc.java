import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
public class guiBasedCalc implements ActionListener{
	JFrame J;
	JPanel jp;
	JLabel jl1,jl2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10,jb11,jb12,jb13,jb14,jb15,jb16,jb17,jb18,jb19,jb20;
	JTextField jf;
	float var1,var2,var3,res;
	String str1,str2;
	guiBasedCalc() {
		J=new JFrame("calculator");
		J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		J.setLayout(null);
		
		jl1=new JLabel("");
		jl1.setFont(new Font("Times New Roman",Font.PLAIN,22));
		jl1.setForeground(Color.BLACK);
		jl1.setBounds(20,40,220,30);
		/*Border border=BorderFactory.createLineBorder(Color.BLACK, 1);
		jl1.setBorder(border);*/
		J.add(jl1);
		
		jf=new JTextField();
		jf.setBounds(10, 70, 300, 60);
		jf.setBorder(null);
		jf.setFont(new Font("Times New Roman",Font.PLAIN,20));
		J.add(jf);
		
		jb1=new JButton("+/-");
		jb1.setBounds(10,135,70,70);
		jb1.setBorder(null);
		jb1.setBackground(Color.decode("#808080"));
		jb1.setForeground(Color.WHITE);
		jb1.setFont(new Font("Times New Roman",Font.BOLD,20));
		jb1.addActionListener(this);
		J.add(jb1);
		
		
		jb2=new JButton("B");
		jb2.setBounds(85,135,70,70);
		jb2.setBackground(Color.decode("#808080"));
		jb2.setForeground(Color.WHITE);
		jb2.setFont(new Font("Times New Roman",Font.BOLD,20));
		jb2.addActionListener(this);
		J.add(jb2);
		
		jb3=new JButton("C");
		jb3.setBounds(160,135,70,70);
		jb3.setBackground(Color.decode("#808080"));
		jb3.setForeground(Color.WHITE);
		jb3.setFont(new Font("Times New Roman",Font.BOLD,20));
		jb3.addActionListener(this);
		J.add(jb3);
		
		jb4=new JButton("%");
		jb4.setForeground(Color.WHITE);
		jb4.setBounds(235,135,70,70);
		jb4.setBackground(Color.decode("#808080"));
		jb4.setFont(new Font("Times New Roman",Font.BOLD,20));
		jb4.addActionListener(this);
		J.add(jb4);
		
		jb5=new JButton("+");
		jb5.setBounds(235,210,70,70);
		jb5.setForeground(Color.WHITE);
		jb5.setBackground(Color.decode("#808080"));
		jb5.setFont(new Font("Times New Roman",Font.BOLD,30));
		jb5.addActionListener(this);
		J.add(jb5);
		
		jb6=new JButton("9");
		jb6.setBounds(160,210,70,70);
		jb6.setBackground(Color.decode("#a6a6a6"));
		jb6.setFont(new Font("Times New Roman",Font.PLAIN,20));
		jb6.addActionListener(this);
		J.add(jb6);
		
		jb7=new JButton("8");
		jb7.setBounds(85,210,70,70);
		jb7.setBackground(Color.decode("#a6a6a6"));
		jb7.setFont(new Font("Times New Roman",Font.PLAIN,20));
		jb7.addActionListener(this);
		J.add(jb7);
		
		jb8=new JButton("7");
		jb8.setBounds(10,210,70,70);
		jb8.setBackground(Color.decode("#a6a6a6"));
		jb8.setFont(new Font("Times New Roman",Font.PLAIN,20));
		jb8.addActionListener(this);
		J.add(jb8);
		
		jb9=new JButton("4");
		jb9.setBounds(10,285,70,70);
		jb9.setBackground(Color.decode("#a6a6a6"));
		jb9.setFont(new Font("Times New Roman",Font.PLAIN,20));
		jb9.addActionListener(this);
		J.add(jb9);
		
		jb10=new JButton("5");
		jb10.setBounds(85,285,70,70);
		jb10.setBackground(Color.decode("#a6a6a6"));
		jb10.setFont(new Font("Times New Roman",Font.PLAIN,20));
		jb10.addActionListener(this);
		J.add(jb10);
		
		jb11=new JButton("6");
		jb11.setBounds(160,285,70,70);
		jb11.setBackground(Color.decode("#a6a6a6"));
		jb11.setFont(new Font("Times New Roman",Font.PLAIN,20));
		jb11.addActionListener(this);
		J.add(jb11);
		
		jb12=new JButton("-");
		jb12.setBounds(235,285,70,70);
		jb12.setBackground(Color.decode("#808080"));
		jb12.setForeground(Color.WHITE);
		jb12.setFont(new Font("Times New Roman",Font.BOLD,30));
		jb12.addActionListener(this);
		J.add(jb12);
		
		jb13=new JButton("1");
		jb13.setBounds(10,360,70,70);
		jb13.setBackground(Color.decode("#a6a6a6"));
		jb13.setFont(new Font("Times New Roman",Font.PLAIN,20));
		jb13.addActionListener(this);
		J.add(jb13);
		
		jb14=new JButton("2");
		jb14.setBounds(85,360,70,70);
		jb14.setBackground(Color.decode("#a6a6a6"));
		jb14.setFont(new Font("Times New Roman",Font.PLAIN,20));
		jb14.addActionListener(this);
		J.add(jb14);
		
		jb15=new JButton("3");
		jb15.setBounds(160,360,70,70);
		jb15.setBackground(Color.decode("#a6a6a6"));
		jb15.setFont(new Font("Times New Roman",Font.PLAIN,20));
		jb15.addActionListener(this);
		J.add(jb15);
		
		jb16=new JButton("/");
		jb16.setBounds(235,360,70,70);
		jb16.setForeground(Color.WHITE);
		jb16.setBackground(Color.decode("#808080"));
		jb16.setFont(new Font("Times New Roman",Font.BOLD,30));
		jb16.addActionListener(this);
		J.add(jb16);
		
		jb17=new JButton(".");
		jb17.setBounds(10,435,70,70);
		jb17.setBackground(Color.decode("#a6a6a6"));
		jb17.setFont(new Font("Times New Roman",Font.PLAIN,20));
		jb17.addActionListener(this);
		J.add(jb17);
		
		jb18=new JButton("0");
		jb18.setBounds(85,435,70,70);
		jb18.setBackground(Color.decode("#a6a6a6"));
		jb18.setFont(new Font("Times New Roman",Font.PLAIN,20));
		jb18.addActionListener(this);
		J.add(jb18);
		
		jb19=new JButton("=");
		jb19.setBounds(160,435,70,70);
		jb19.setBackground(Color.decode("#808080"));
		jb19.setForeground(Color.WHITE);
		jb19.setFont(new Font("Times New Roman",Font.BOLD,30));
		jb19.addActionListener(this);
		J.add(jb19);
		
		jb20=new JButton("*");
		jb20.setBounds(235,435,70,70);
		jb20.setBackground(Color.decode("#808080"));
		jb20.setForeground(Color.WHITE);
		jb20.setFont(new Font("Times New Roman",Font.BOLD,35));
		jb20.addActionListener(this);
		J.add(jb20);
		
		
		J.getContentPane().setBackground(Color.decode("#e6e6e6"));
		J.setVisible(true);
		J.setLocation(500,60);
		J.setSize(330,550);
		
	}
	public void actionPerformed(ActionEvent ae) {
		String one="";
		if(ae.getSource()==jb8) {
			one=jf.getText();
			jf.setText(one+"7");
		}
		if(ae.getSource()==jb7) {
			one=jf.getText();
			jf.setText(one+"8");
		}
		if(ae.getSource()==jb6) {
			one=jf.getText();
			jf.setText(one+"9");
		}
		if(ae.getSource()==jb11) {
			one=jf.getText();
			jf.setText(one+"6");
		}
		if(ae.getSource()==jb10) {
			one=jf.getText();
			jf.setText(one+"5");
		}
		if(ae.getSource()==jb9) {
			one=jf.getText();
			jf.setText(one+"4");
		}
		if(ae.getSource()==jb13) {
			one=jf.getText();
			jf.setText(one+"1");
		}
		if(ae.getSource()==jb14) {
			one=jf.getText();
			jf.setText(one+"2");
		}
		if(ae.getSource()==jb15) {
			one=jf.getText();
			jf.setText(one+"3");
		}
		if(ae.getSource()==jb17) {
			one=jf.getText();
			jf.setText(one+".");
		}
		if(ae.getSource()==jb18) {
			one=jf.getText();
			jf.setText(one+"0");
		}
		if(ae.getSource()==jb5) {   //Addition
			str2=jf.getText();
			System.out.println(str2);
			if(str1==null) {
				var2=0;
			}
			var1=Float.parseFloat(str2);
			var2=var2+var1;
			System.out.println(var1+" "+var2);
			str1=var2+"+";
			jl1.setText(str1);
			jf.setText("");
		}
		if(ae.getSource()==jb12) {	//Subtraction
			str2=jf.getText();
			System.out.println(str2);
			var1=Float.parseFloat(str2);
			if(str1==null) {
				var2=0;
				var2=var1-var2;
			}
			else {
			var2=-var1+var2;
			}
			System.out.println(var1+" "+var2);
			str1=var2+"-";
			res=var2;
			jl1.setText(str1);
			jf.setText("");
		}
		if(ae.getSource()==jb20) {	//Multiplication
			str2=jf.getText();
			var1=Float.parseFloat(str2);
			if(str1==null) {
				var2=1;
			}
			var2=var2*var1;
			System.out.println(var1+" "+var2);
			str1=var2+" x ";
			res=var2;
			jl1.setText(str1);
			jf.setText("");
		}
		if(ae.getSource()==jb16) {	//Division
			str2=jf.getText();
			var1=Float.parseFloat(str2);
			if(str1==null) {
				var2=01;
				var2=var1/var2;
			}
			else {
			var2=var2/var1;
			}
			System.out.println(var1+" "+var2);
			str1=var2+"/";
			res=var2;
			jl1.setText(str1);
			jf.setText("");
		}
		if(ae.getSource()==jb4) { //Percentage
			str2=jf.getText();
			var1=Float.parseFloat(str2);
			str1=str2+"%";
			jl1.setText(str1);
			jf.setText("");
		}
		if(ae.getSource()==jb19) {	//Equals to
			var3=Float.parseFloat(jf.getText());
			if(str1.endsWith("+")) {
				str1=str1+var3+"=";
				jl1.setText(str1);
				res=var2+var3;
				jf.setText(Float.toString(res));
			}
			if(str1.endsWith("-")) {
				str1=str1+var3+"=";
				jl1.setText(str1);
				res=var2-var3;
				jf.setText(Float.toString(res));
			}
			if(str1.endsWith("x ")) {
				str1=str1+var3+"=";
				jl1.setText(str1);
				res=var2*var3;
				jf.setText(Float.toString(res));
			}
			if(str1.endsWith("/")) {
				str1=str1+var3+"=";
				jl1.setText(str1);
				res=var2/var3;
				jf.setText(Float.toString(res));
			}
			if(str1.endsWith("%")) {
				str1=str1+var3+"=";
				jl1.setText(str1);
				res=var1%var3;
				jf.setText(Float.toString(res));
			}
			var1=0;
			var2=0;
			var3=0;
			res=0;
			str1=null;
		}
		if(ae.getSource()==jb1) {  //Decimal
			String b=jf.getText();
			float h=Float.parseFloat(b);
			jf.setText(Float.toString(-h));
		}
		if(ae.getSource()==jb2) { 	//Backspace
			str2=jf.getText();
			str2=str2.substring(0, str2.length()-1);
			jf.setText(str2);
		}
		if(ae.getSource()==jb3) {	//Clear
			jf.setText("");
			jl1.setText("");
			var1=0;
			var2=0;
			str1=null;
		}
		
		
	}
	public static void main(String[] args) {
		new guiBasedCalc();
	}

}
