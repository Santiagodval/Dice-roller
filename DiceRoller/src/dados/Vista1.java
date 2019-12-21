package dados;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;


import java.awt.GridLayout;


import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class Vista1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldModificadores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista1 frame = new Vista1();
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
	int modificador;
	public Vista1() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel Resultados = new JPanel();
		contentPane.add(Resultados, BorderLayout.CENTER);
		Resultados.setLayout(new BorderLayout(0, 0));
		
		JLabel LabelResultados = new JLabel("");
		LabelResultados.setHorizontalAlignment(SwingConstants.CENTER);
		LabelResultados.setFont(new Font("Arial", Font.PLAIN, 11));
		Resultados.add(LabelResultados, BorderLayout.NORTH);
		
		JPanel panelLabelsDados = new JPanel();
		Resultados.add(panelLabelsDados, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		panelLabelsDados.add(lblNewLabel);
		
		JPanel Botonera = new JPanel();
		contentPane.add(Botonera, BorderLayout.SOUTH);
		Botonera.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panelDices = new JPanel();
		Botonera.add(panelDices);
		panelDices.setLayout(new GridLayout(0, 6, 0, 0));
		
		JPanel panelMix = new JPanel();
		Botonera.add(panelMix);
		panelMix.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel = new JPanel();
		panelMix.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton buttonErase = new JButton("Erase");
		
		panel.add(buttonErase);
		
		JPanel panel_1 = new JPanel();
		panelMix.add(panel_1);
		
		JLabel labelResultados = new JLabel("0");
		panel_1.add(labelResultados);
		
		/*
		
		In this label the results of all the dices are shown, it changes with every new dice, when the 
		textField modificadores input is changed and when the dices are erased 
		
		*/
		
		JPanel panel_2 = new JPanel();
		panelMix.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel labelModificadores = new JLabel("Modificadores");
		panel_2.add(labelModificadores, BorderLayout.NORTH);
		
		//I was trying to change the modificadores in real time but it was to hard
		/*textFieldModificadores.getDocument().addDocumentListener(new DocumentListener() {
			
			public void changedUpdate(DocumentEvent e) {
			    warn();
			  }
			  public void removeUpdate(DocumentEvent e) {
			    warn();
			  }
			  public void insertUpdate(DocumentEvent e) {
			    warn();
			  }

			  public void warn() {	
				
				
				labelResultados.setText(Integer.toString(Integer.parseInt(labelResultados.getText()) + Integer.parseInt(textFieldModificadores.getText())- modificador));
				modificador = Integer.parseInt(textFieldModificadores.getText());
			
			}
		});*/
		
		textFieldModificadores = new JTextField();
		textFieldModificadores.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(textFieldModificadores, BorderLayout.CENTER);
		textFieldModificadores.setColumns(8);
		
		////////////////// D4 ////////////////////////
		
		JPanel panelD4 = new JPanel();
		panelDices.add(panelD4);
		
		JButton buttonD4 = new JButton("D4");
		buttonD4.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonD4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int resultado = D4.roll();
				
				LabelResultados.setText(LabelResultados.getText() + " " + resultado); //results primitive output system( i did it before panelLabelResultados, where the dices are added in a more visual manner)
				
				JLabel lblNewLabel = new JLabel(""+resultado);
				lblNewLabel.setIcon(new ImageIcon(D4.getScaledImage(40, 40)));
				lblNewLabel.setIconTextGap(-25);
				
				panelLabelsDados.add(lblNewLabel);
				
				labelResultados.setText(Integer.toString(Integer.parseInt(labelResultados.getText()) + resultado));
				
			}
		});
		panelD4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelD4.add(buttonD4);
		buttonD4.setIcon(new ImageIcon(D4.getScaledImage(40, 40)));
		buttonD4.setIconTextGap(-29);
		buttonD4.setBackground(null);//I tried to make a subclass of JButton to do the same that this lines but it made the background dark and draw the border anyways(JButtonNoBack)
		buttonD4.setBorder(null);    //Also the back at the borders of the images is not completely white 
		
		
		///////////////////// D6 /////////////////////
		
		JPanel panelD6 = new JPanel();
		panelDices.add(panelD6);
		
		JButton buttonD6 = new JButton("D6");
		buttonD6.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonD6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int resultado = D6.roll();
				
				LabelResultados.setText(LabelResultados.getText() + " " + resultado);
				
				
				JLabel lblNewLabel = new JLabel(""+resultado);
				lblNewLabel.setIcon(new ImageIcon(D6.getScaledImage(40, 40)));
				lblNewLabel.setIconTextGap(-25);
				
				panelLabelsDados.add(lblNewLabel);
				
				labelResultados.setText(Integer.toString(Integer.parseInt(labelResultados.getText()) + resultado));
			}
		});
		panelD6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelD6.add(buttonD6);
		buttonD6.setIcon(new ImageIcon(D6.getScaledImage(40, 40)));
		buttonD6.setIconTextGap(-27);
		buttonD6.setBackground(null);//I tried to make a subclass of JButton to do the same that this lines but it made the background dark and draw the border anyways(JButtonNoBack)
		buttonD6.setBorder(null);    //Also the back at the borders of the images is not completely white
		
		///////////////////// D8 /////////////////////
		
		JPanel panelD8 = new JPanel();
		panelDices.add(panelD8);
		
		JButton buttonD8 = new JButton("D8");
		buttonD8.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonD8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int resultado = D8.roll();
				
				LabelResultados.setText(LabelResultados.getText() + " " + resultado);
				
				JLabel lblNewLabel = new JLabel(""+resultado);
				lblNewLabel.setIcon(new ImageIcon(D8.getScaledImage(40, 40)));
				lblNewLabel.setIconTextGap(-25);
				
				panelLabelsDados.add(lblNewLabel);
				
				labelResultados.setText(Integer.toString(Integer.parseInt(labelResultados.getText()) + resultado));
				
			}
		});
		panelD8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelD8.add(buttonD8);
		buttonD8.setIcon(new ImageIcon(D8.getScaledImage(40, 40)));
		buttonD8.setIconTextGap(-29);
		buttonD8.setBackground(null);//I tried to make a subclass of JButton to do the same that this lines but it made the background dark and draw the border anyways(JButtonNoBack)
		buttonD8.setBorder(null);    //Also the back at the borders of the images is not completely white
		
		//////////////////// D10 /////////////////////
		
		JPanel panelD10 = new JPanel();
		panelDices.add(panelD10);
		
		JButton buttonD10 = new JButton("D10");
		buttonD10.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonD10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int resultado = D10.roll();
				
				LabelResultados.setText(LabelResultados.getText() + " " + resultado);
				
				JLabel lblNewLabel = new JLabel(""+resultado);
				lblNewLabel.setIcon(new ImageIcon(D10.getScaledImage(40, 40)));
				lblNewLabel.setIconTextGap(-25);
				
				panelLabelsDados.add(lblNewLabel);
				
				labelResultados.setText(Integer.toString(Integer.parseInt(labelResultados.getText()) + resultado));
				
			}
		});
		panelD10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelD10.add(buttonD10);
		buttonD10.setIcon(new ImageIcon(D10.getScaledImage(40, 40)));
		buttonD10.setIconTextGap(-31);
		buttonD10.setBackground(null);//I tried to make a subclass of JButton to do the same that this lines but it made the background dark and draw the border anyways(JButtonNoBack)
		buttonD10.setBorder(null);    //Also the back at the borders of the images is not completely white
		
		//////////////////// D12 /////////////////////
		
		JPanel panelD12 = new JPanel();
		panelDices.add(panelD12);
		
		JButton buttonD12 = new JButton("D12");
		buttonD12.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonD12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int resultado = D12.roll();
				
				LabelResultados.setText(LabelResultados.getText() + " " + resultado);
				
				JLabel lblNewLabel = new JLabel(""+resultado);
				lblNewLabel.setIcon(new ImageIcon(D12.getScaledImage(40, 40)));
				lblNewLabel.setIconTextGap(-25);
				
				panelLabelsDados.add(lblNewLabel);
				
				labelResultados.setText(Integer.toString(Integer.parseInt(labelResultados.getText()) + resultado));
				
			}
		});
		panelD12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelD12.add(buttonD12);
		buttonD12.setIcon(new ImageIcon(D12.getScaledImage(40, 40)));
		buttonD12.setIconTextGap(-31);
		buttonD12.setBackground(null);//I tried to make a subclass of JButton to do the same that this lines but it made the background dark and draw the border anyways(JButtonNoBack)
		buttonD12.setBorder(null);    //Also the back at the borders of the images is not completely white
		
		//////////////////// D20 //////////////////////
		
		JPanel panelD20 = new JPanel();
		panelDices.add(panelD20);
		
		JButton buttonD20 = new JButton("D20");
		buttonD20.setFont(new Font("Arial Black", Font.PLAIN, 11));
		buttonD20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int resultado = D20.roll();
				
				LabelResultados.setText(LabelResultados.getText() + " " + resultado);
				
				JLabel lblNewLabel = new JLabel(""+resultado);
				lblNewLabel.setIcon(new ImageIcon(D20.getScaledImage(40, 40)));
				lblNewLabel.setIconTextGap(-25);
				panelLabelsDados.add(lblNewLabel);
				
				labelResultados.setText(Integer.toString(Integer.parseInt(labelResultados.getText()) + resultado));
				
			}
		});
		panelD20.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelD20.add(buttonD20);
		buttonD20.setIcon(new ImageIcon(D20.getScaledImage(40, 40)));
		buttonD20.setIconTextGap(-31);
		buttonD20.setBackground(null);//I tried to make a subclass of JButton to do the same that this lines but it made the background dark and draw the border anyways(JButtonNoBack)
		buttonD20.setBorder(null);    //Also the back at the borders of the images is not completely white
		
		
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				labelResultados.setText(Integer.toString(Integer.parseInt(labelResultados.getText()) + Integer.parseInt(textFieldModificadores.getText())- modificador));
				modificador = Integer.parseInt(textFieldModificadores.getText());
				}catch(Exception e1){
				labelResultados.setText(Integer.toString(Integer.parseInt(labelResultados.getText()) - modificador));
				modificador = 0;
				textFieldModificadores.setText("0");
				}
				
			}
		});
		panel_2.add(btnActualizar, BorderLayout.SOUTH);
		
		JPanel Titulo = new JPanel();
		contentPane.add(Titulo, BorderLayout.NORTH);
		Titulo.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel LabelTitulo = new JLabel("Dice Roller");
		LabelTitulo.setFont(new Font("Arial", Font.PLAIN, 25));
		LabelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.add(LabelTitulo);
		
		
		buttonErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Get the components in the panel
				Component[] componentList = panelLabelsDados.getComponents();

				//Loop through the components
				for(Component c : componentList){

				    //Find the components you want to remove
				   

				        //Remove it
					panelLabelsDados.remove(c);
				    
				}

				//IMPORTANT
				panelLabelsDados.revalidate();
				panelLabelsDados.repaint();
				//panelLabelsDados
				
				//I copipasted all of this and modify it a bit to do what I needed, understood it but didn´t made it
				
				labelResultados.setText(Integer.toString(modificador));
				
			}
		});
		
		
		
		
	}
	
	
}
