import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Cursor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ActionEvent;
import java.util.*;
import java.lang.Math;


@SuppressWarnings({ "unused", "serial" })
public class temp extends JFrame implements ActionListener
{
	private JFrame frame1,frame2,frame3;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	//private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTextField textField_19;
	/*private JFrame fr1;
	private JFrame f2;*/
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException, NullPointerException, ArrayIndexOutOfBoundsException{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temp frame = new temp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public temp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1060, 828);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DIGITAL BUDGET ANALYSER");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(223, 10, 186, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter No.of Months:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(76, 61, 128, 17);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(226, 62, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		//textField.addActionListener(this);
		
		JLabel lblNewLabel_2 = new JLabel("Salary of the Month:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(76, 88, 139, 17);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(226, 89, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Home Expanses");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(224, 118, 276, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rent:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(76, 156, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(352, 155, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Electricity Bill:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(257, 154, 111, 17);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(119, 155, 96, 19);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_6 = new JLabel("Gas/Oil:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(76, 191, 96, 13);
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(129, 190, 96, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Water/Trash:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(257, 192, 111, 17);
		contentPane.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(352, 190, 96, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Phone:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(76, 225, 45, 13);
		contentPane.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setBounds(129, 224, 96, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("DAILY LIVING");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setForeground(Color.RED);
		lblNewLabel_9.setBounds(223, 253, 297, 23);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Maintainence Costs:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(257, 225, 152, 18);
		contentPane.add(lblNewLabel_10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(387, 224, 96, 19);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Groceries:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(76, 289, 90, 17);
		contentPane.add(lblNewLabel_11);
		
		textField_8 = new JTextField();
		textField_8.setBounds(145, 290, 96, 19);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Clothing:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(269, 289, 68, 17);
		contentPane.add(lblNewLabel_12);
		
		textField_9 = new JTextField();
		textField_9.setBounds(334, 290, 96, 19);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Food:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(76, 326, 45, 13);
		contentPane.add(lblNewLabel_13);
		
		textField_10 = new JTextField();
		textField_10.setBounds(145, 325, 96, 19);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Cleaning:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_14.setBounds(269, 321, 68, 23);
		contentPane.add(lblNewLabel_14);
		
		textField_11 = new JTextField();
		textField_11.setBounds(334, 325, 96, 19);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Personal Expanses:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_15.setBounds(76, 358, 128, 23);
		contentPane.add(lblNewLabel_15);
		
		textField_12 = new JTextField();
		textField_12.setBounds(201, 362, 96, 19);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("CHILDREN");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_16.setForeground(Color.RED);
		lblNewLabel_16.setBounds(223, 410, 122, 17);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Medical:");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_17.setBounds(76, 442, 83, 17);
		contentPane.add(lblNewLabel_17);
		
		textField_13 = new JTextField();
		textField_13.setBounds(129, 443, 96, 19);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("School Expanses:");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_18.setBounds(263, 446, 186, 16);
		contentPane.add(lblNewLabel_18);
		
		textField_14 = new JTextField();
		textField_14.setBounds(387, 447, 96, 19);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("OBLIGATIONS");
		lblNewLabel_19.setForeground(Color.RED);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_19.setBounds(223, 484, 152, 27);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Student Loans:");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_20.setBounds(76, 520, 111, 23);
		contentPane.add(lblNewLabel_20);
		
		textField_15 = new JTextField();
		textField_15.setBounds(185, 521, 96, 19);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("Tax:");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_21.setBounds(334, 527, 45, 13);
		contentPane.add(lblNewLabel_21);
		
		textField_16 = new JTextField();
		textField_16.setBounds(389, 524, 96, 19);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("ENTERTAINMENT");
		lblNewLabel_22.setForeground(Color.RED);
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_22.setBounds(223, 558, 169, 23);
		contentPane.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Movies:");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_23.setBounds(76, 594, 76, 17);
		contentPane.add(lblNewLabel_23);
		
		textField_17 = new JTextField();
		textField_17.setBounds(129, 591, 96, 19);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblNewLabel_24 = new JLabel("Games:");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_24.setBounds(317, 594, 75, 17);
		contentPane.add(lblNewLabel_24);
		
		textField_18 = new JTextField();
		textField_18.setBounds(387, 592, 96, 19);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		 btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(181, 672, 100, 21);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(317, 672, 85, 21);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		
		/*btnNewButton_2 = new JButton("Enter");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(363, 61, 85, 21);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);*/
		
		//fr1=new JFrame("Output");
		
		btnNewButton_3= new JButton("Click here to view total budget");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(500, 500, 260, 23);
		btnNewButton_3.addActionListener(this);
		contentPane.add(btnNewButton_3);
		//fr1.add(btnNewButton_3);
		//btnNewButton_3.addActionListener(this);
		//b7.addActionListener(this);
		/*fr1.setSize(500,500);
		fr1.setVisible(true);*/
		
		//textField_19 = new JTextField();
		//textField_19.setBounds(510, 84, 508, 24);
		//contentPane.add(textField_19);
		//textField_19.setColumns(10);
		
		JLabel lblNewLabel_25 = new JLabel("OUTPUT");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_25.setBounds(740, 46, 76, 32);
		contentPane.add(lblNewLabel_25);
		
	/*	textField_20 = new JTextField();
		textField_20.setBounds(510, 107, 508, 23);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(510, 128, 508, 27);
		contentPane.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(510, 151, 508, 27);
		contentPane.add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBounds(510, 175, 508, 29);
		contentPane.add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setBounds(510, 202, 508, 27);
		contentPane.add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setBounds(510, 227, 508, 27);
		contentPane.add(textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setBounds(510, 253, 508, 27);
		contentPane.add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setBounds(510, 274, 508, 32);
		contentPane.add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setBounds(510, 304, 508, 23);
		contentPane.add(textField_28);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setBounds(510, 325, 508, 27);
		contentPane.add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setBounds(510, 351, 508, 30);
		contentPane.add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setBounds(510, 378, 508, 37);
		contentPane.add(textField_31);
		textField_31.setColumns(10);
		
		textField_32 = new JTextField();
		textField_32.setBounds(510, 411, 508, 32);
		contentPane.add(textField_32);
		textField_32.setColumns(10);
		
		textField_33 = new JTextField();
		textField_33.setBounds(510, 441, 508, 32);
		contentPane.add(textField_33);
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(510, 471, 508, 32);
		contentPane.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(510, 502, 508, 32);
		contentPane.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(510, 532, 508, 32);
		contentPane.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(510, 562, 508, 32);
		contentPane.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(510, 589, 508, 32);
		contentPane.add(textField_38);*/
	}
	
	
	int s[]=new int[100];
    int t[]=new int[10];
    int gam[]=new int[10];
    int r[]=new int[10];
    int e[]=new int[10];
    int g[]=new int[10];
    int w[]=new int[10];
    int p[]=new int[10];
    int m[]=new int[10];
    int gr[]=new int[10];
    int c[]=new int[10];
    int f[]=new int[10];
    int cl[]=new int[10];
    int ps[]=new int[10];
    int me[]=new int[10];
    int fe[]=new int[10];
    int sl[]=new int[10];
    int mo[]=new int[10];
    int total[]=new int[10];
    int n=0,i=-1,tot=0,total1=0;
    int s1=0,r1=0,e1=0,g1=0,w1=0,p1=0,m1=0,gr1=0,c1=0,f1=0,cl1=0,ps1=0,me1=0,fe1=0,sl1=0,t1=0,mo1=0,gam1=0,sal1=0,sav=0;
    int A=0,B=0,C=0,D=0,E=0,F=0,G=0,H=0,I=0,J=0,K=0,L=0,M=0,N=0,O=0,P=0,Q=0;
    private JTextField textField_20;
    private JTextField textField_21;
    private JTextField textField_22;
    private JTextField textField_23;
    private JTextField textField_24;
    private JTextField textField_25;
    private JTextField textField_26;
    private JTextField textField_27;
    private JTextField textField_28;
    private JTextField textField_29;
    private JTextField textField_30;
    private JTextField textField_31;
    private JTextField textField_32;
    private JTextField textField_33;
    private JTextField textField_34;
    private JTextField textField_35;
    private JTextField textField_36;
    private JTextField textField_37;
    private JTextField textField_38;
    
    
    
	public void actionPerformed(ActionEvent ae)
	{      
		
		String sal,rent,elec,gas,water,phone,maint,k=null;
	    String groc,clot,food,clean,pers,med,fee,sloan,tax,mov,game;
        
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of months: ");
        n=sc.nextInt();*/
        
        
        
       /* if(ae.getSource()==btnNewButton_2)
        {
        	
        }*/
        
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of Months: ");
        n=sc.nextInt();
        sc.close();*/
		if(ae.getSource()==btnNewButton_3)
		{
			frame2=new JFrame("frame 1");
			
		
			k=textField.getText();
			n=Integer.parseInt(k);
			//System.out.println("---------------------------------");
			for(i=0;i<n;i++)
			{
				//System.out.println(t[i]);
				total[i]=t[i]+gam[i]+r[i]+e[i]+g[i]+w[i]+p[i]+m[i]+gr[i]+c[i]+f[i]+cl[i]+ps[i]+me[i]+fe[i]+sl[i]+mo[i];
				tot=tot+total[i];
				//System.out.println("Total budget for "+(i+1)+" months: "+ total[i]);
				A+=r[i];B+=e[i];C+=g[i];D+=w[i];E+=p[i];F+=m[i];G+=gr[i];H+=c[i];I+=f[i];J+=cl[i];K+=ps[i];L+=me[i];M+=fe[i];N+=sl[i];O+=t[i];P+=mo[i];Q+=gam[i];
				sal1+=s[i];
			}
			
			
			
			
			textField_19 = new JTextField();
		textField_19.setBounds(510, 84, 508, 24);
		frame2.add(textField_19);
		textField_19.setColumns(10);
		
			textField_20 = new JTextField();
		textField_20.setBounds(510, 107, 508, 23);
		frame2.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(510, 128, 508, 27);
		frame2.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(510, 151, 508, 27);
		frame2.add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBounds(510, 175, 508, 29);
		frame2.add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setBounds(510, 202, 508, 27);
		frame2.add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setBounds(510, 227, 508, 27);
		frame2.add(textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setBounds(510, 253, 508, 27);
		contentPane.add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setBounds(510, 274, 508, 32);
		frame2.add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setBounds(510, 304, 508, 23);
		frame2.add(textField_28);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setBounds(510, 325, 508, 27);
		frame2.add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setBounds(510, 351, 508, 30);
		frame2.add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setBounds(510, 378, 508, 37);
		frame2.add(textField_31);
		textField_31.setColumns(10);
		
		textField_32 = new JTextField();
		textField_32.setBounds(510, 411, 508, 32);
		frame2.add(textField_32);
		textField_32.setColumns(10);
		
		textField_33 = new JTextField();
		textField_33.setBounds(510, 441, 508, 32);
		frame2.add(textField_33);
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(510, 471, 508, 32);
		frame2.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(510, 502, 508, 32);
		frame2.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(510, 532, 508, 32);
		frame2.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(510, 562, 508, 32);
		frame2.add(textField_37);
		
		/*textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(510, 589, 508, 32);
		frame2.add(textField_38);*/
				
			sav=Math.abs(sal1-tot);
			textField_19.setText("Total budget for "+String.valueOf(n)+" months: Rs."+String.valueOf(tot));
			textField_20.setText("Total savings for "+String.valueOf(n)+" months: Rs."+ String.valueOf(sav));
			textField_21.setText("Total rent for "+String.valueOf(n)+" months: Rs."+ String.valueOf(A));
			textField_22.setText("Total Electricity bill for "+String.valueOf(n)+" months: Rs."+String.valueOf(B));
			textField_23.setText("Total Gas/Oil bill for "+String.valueOf(n)+" months: Rs."+String.valueOf(C));
			textField_24.setText("Total Water/Trash bill for "+String.valueOf(n)+" months: Rs."+String.valueOf(D));
			textField_25.setText("Total Phone bill for "+String.valueOf(n)+" months: Rs."+String.valueOf(E));
			textField_26.setText("Total Maintainance costs for "+String.valueOf(n)+" months: Rs."+String.valueOf(F));
			textField_27.setText("Total Groceries bill for "+String.valueOf(n)+" months: Rs."+String.valueOf(G));
			textField_28.setText("Total Clothing bill for "+String.valueOf(n)+" months: Rs."+String.valueOf(H));
			textField_29.setText("Total Food bill for "+String.valueOf(n)+" months: Rs."+String.valueOf(I));
			textField_30.setText("Total Cleaning Expanses for "+String.valueOf(n)+" months: Rs."+String.valueOf(J));
			textField_31.setText("Total Personal Expanses for "+String.valueOf(n)+" months: Rs."+String.valueOf(K));
			textField_32.setText("Total Medical bill for "+String.valueOf(n)+" months: Rs."+String.valueOf(L));
			textField_33.setText("Total School Fee for "+String.valueOf(n)+" months: Rs."+String.valueOf(M));
			textField_34.setText("Total Student Loans for "+String.valueOf(n)+" months: Rs."+String.valueOf(N));
			textField_35.setText("Total Taxes for "+String.valueOf(n)+" months: Rs."+String.valueOf(O));
			textField_36.setText("Total Movie Expanses for "+String.valueOf(n)+" months: Rs."+String.valueOf(P));
			textField_37.setText("Total bill for Games for "+String.valueOf(n)+" months: Rs."+String.valueOf(Q));
			//System.out.println("---------------------------------");
			 /*try
	        {
	            if(tot<sal1)
	            {
	            	textField_38.setText("WOW!!! You have savings of Rs."+String.valueOf(sav) +" in this "+String.valueOf(n)+" Months duration");
	            	//System.out.println("WOW!!! You have savings of Rs."+String.valueOf(sav) +" in this "+String.valueOf(n)+" Months duration");
	            } 
	            else
	            {
	                throw new Excep1();
	            }           
	        }
	        catch(Excep1 e1)
	        {
	            e1.show();
	        }*/
				frame2.setSize(500,500);
			
			frame2.setLayout(null);
			frame2.setVisible(true);
			
		}
        
		
		if(ae.getSource()== btnNewButton)
		{
	        // System.out.println("1.Income\n2.Home Expanses\n3.Daily Living\n4.Children\n5.Obligations\n6.Entertainment\n7.Exit");
			//k=textField.getText();
			//n=Integer.parseInt(k);
			
			//System.out.println(n);
			
			
			i=i+1;
				sal=textField_1.getText();
				s1=Integer.parseInt(sal);
				s[i]=s1;
				
                rent=textField_2.getText();
                r1=Integer.parseInt(rent);
                r[i]=r1;
                
                elec=textField_3.getText();
                e1=Integer.parseInt(elec);
                e[i]=e1;
                
                gas=textField_4.getText();
                g1=Integer.parseInt(gas);
                g[i]=g1;
                
                water=textField_5.getText();
                w1=Integer.parseInt(water);
                w[i]=w1;
                
                phone=textField_6.getText();
                p1=Integer.parseInt(phone);
                p[i]=p1;
                
                maint=textField_7.getText();
                m1=Integer.parseInt(maint);
                m[i]=m1;
                
                groc=textField_8.getText();
                gr1=Integer.parseInt(groc);
                gr[i]=gr1;
                
                clot=textField_9.getText();
                c1=Integer.parseInt(clot);
                c[i]=c1;
                
                food=textField_10.getText();
                f1=Integer.parseInt(food);
                f[i]=f1;
                
                clean=textField_11.getText();
                cl1=Integer.parseInt(clean);
                cl[i]=cl1;
                
                pers=textField_12.getText();
                ps1=Integer.parseInt(pers);
                ps[i]=ps1;
                
                med=textField_13.getText();
                me1=Integer.parseInt(med);
                me[i]=me1;
                
                fee=textField_14.getText();
                fe1=Integer.parseInt(fee);
                fe[i]=fe1;
                
                sloan=textField_15.getText();
                sl1=Integer.parseInt(sloan);
                sl[i]=sl1;
                
                tax=textField_16.getText();
                t1=Integer.parseInt(tax);
                t[i]=t1;
                
                mov=textField_17.getText();
                mo1=Integer.parseInt(mov);
                mo[i]=mo1;
                
                game=textField_18.getText();
                gam1=Integer.parseInt(game);
                gam[i]=gam1;  
               
          
		}
		
		
		
		
		if(ae.getSource()== btnNewButton_1)
        {
			textField_1.setText("");textField_2.setText("");textField_3.setText("");textField_4.setText("");textField_5.setText("");
			textField_6.setText("");textField_7.setText("");textField_8.setText("");textField_9.setText("");textField_10.setText("");textField_11.setText("");
			textField_12.setText("");textField_13.setText("");textField_14.setText("");textField_15.setText("");textField_16.setText("");textField_17.setText("");
			textField_18.setText("");
        }
		

		
		/*if(ae.getSource()==btnNewButton_3)
		{
			
		}*/
	}
}
@SuppressWarnings("serial")
class Excep1 extends Exception
{
    @SuppressWarnings("null")
	void show()
    {
    	JLabel textField_38 = null;
		//textField_38.setText("Alas!!! Your budget have crossed your Salary in this selected Months of duration");
    	//System.out.println("Alas!!! Your budget have crossed your Salary in this selected Months of duration");
    }
}