package IU;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Logic.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class Ventana1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCantidad;
	private JTextField textElegido;
	private JTextField textCantidad;
	private JTextField textEncontrados;
	private JTextField textResultado;
	
	/**
	 * Create the frame.
	 */
	
	Controller control = new Controller();
	String emoji;
	String[][] matriz = new String [4][4];
	int countEncontrados;
	private JTextArea textArea;
	
	public Ventana1() {
		setTitle("Juego Navideño");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Adivinanza Navideña");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblNewLabel.setBounds(131, 11, 362, 60);
		contentPane.add(lblNewLabel);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(234, 115, 140, 22);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese la cantidad de veces que cree, aparecera el emoji");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(141, 82, 428, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Elija el personaje");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(244, 148, 107, 22);
		contentPane.add(lblNewLabel_2);
		
		JButton Noelbtn = new JButton("");
		Noelbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emoji = "🎅🏽";
				completarDatos(emoji);
			}
		});
		Noelbtn.setIcon(new ImageIcon(Ventana1.class.getResource("/Image/3856408-character-christmas-claus-father-santa-xmas_112780.png")));
		Noelbtn.setSize(new Dimension(24, 24));
		Noelbtn.setBounds(186, 172, 60, 60);
		contentPane.add(Noelbtn);
		
		
		JButton Starbtn = new JButton("");
		Starbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emoji = "⭐";
				completarDatos(emoji);
			}
		});
		Starbtn.setIcon(new ImageIcon(Ventana1.class.getResource("/Image/star_favourite_21830.png")));
		Starbtn.setSize(new Dimension(24, 24));
		Starbtn.setBounds(256, 172, 60, 60);
		contentPane.add(Starbtn);
		
		JButton Treebtn = new JButton("");
		Treebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emoji = "🎄";
				completarDatos(emoji);
			}
		});
		Treebtn.setIcon(new ImageIcon(Ventana1.class.getResource("/Image/Christmas_tree_icon-icons.com_75188.png")));
		Treebtn.setBounds(326, 172, 60, 60);
		contentPane.add(Treebtn);
		
		JButton Giftbtn = new JButton("");
		Giftbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emoji = "🎁";
				completarDatos(emoji);
			}
		});
		Giftbtn.setIcon(new ImageIcon(Ventana1.class.getResource("/Image/666wrappedgift2_100993.png")));
		Giftbtn.setBounds(396, 172, 60, 60);
		contentPane.add(Giftbtn);
		
		JButton Restartbtn = new JButton("");
		Restartbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCantidad.setText("");
		        textElegido.setText("");
		        textCantidad.setText("");
		        textEncontrados.setText("");
		        textResultado.setText("");
		        textArea.setText("");
		        countEncontrados = 0;
		        matriz = new String[4][4];
			}
		});
		Restartbtn.setBackground(new Color(0, 255, 0));
		Restartbtn.setIcon(new ImageIcon(Ventana1.class.getResource("/Image/restart_icon_227406.png")));
		Restartbtn.setBounds(285, 413, 89, 35);
		contentPane.add(Restartbtn);
		
		JLabel elegido = new JLabel("Elegido:");
		elegido.setFont(new Font("Tahoma", Font.PLAIN, 15));
		elegido.setBounds(490, 238, 50, 14);
		contentPane.add(elegido);
		
		JLabel cantidad = new JLabel("Cantidad:");
		cantidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cantidad.setBounds(490, 263, 70, 14);
		contentPane.add(cantidad);
		
		JLabel encontrado = new JLabel("Encontrados:");
		encontrado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		encontrado.setBounds(490, 288, 90, 14);
		contentPane.add(encontrado);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResultado.setBounds(490, 313, 70, 14);
		contentPane.add(lblResultado);
		
		textElegido = new JTextField();
		textElegido.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 11));
		textElegido.setEditable(false);
		textElegido.setBounds(582, 238, 86, 20);
		contentPane.add(textElegido);
		textElegido.setColumns(10);
		
		textCantidad = new JTextField();
		textCantidad.setEditable(false);
		textCantidad.setBounds(582, 262, 86, 20);
		contentPane.add(textCantidad);
		textCantidad.setColumns(10);
		
		textEncontrados = new JTextField();
		textEncontrados.setEditable(false);
		textEncontrados.setBounds(582, 287, 86, 20);
		contentPane.add(textEncontrados);
		textEncontrados.setColumns(10);
		
		textResultado = new JTextField();
		textResultado.setEditable(false);
		textResultado.setBounds(582, 313, 86, 20);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30));
		textArea.setBounds(220, 247, 200, 145);
		contentPane.add(textArea);
		
	}
	
	private void completarDatos(String emoji) {
		
		int cantidad = Integer.parseInt(txtCantidad.getText());
		
		if (cantidad >= 0 && cantidad <= 16) {
			matriz = control.generarMatriz();
			countEncontrados = control.cantidadEmoji(emoji,cantidad, matriz);
			
			textEncontrados.setText(String.valueOf(countEncontrados));
			textElegido.setText(emoji);
			textCantidad.setText(String.valueOf(cantidad));
			if (countEncontrados == cantidad) {
				textResultado.setText("ACERTO");
			}else {
				textResultado.setText("FALLO");
			}
			dibujarMatriz(matriz, textArea);
		}
		else {
			//mensaje de error
			
		}
	}
	
	private void dibujarMatriz(String[][] matriz, JTextArea textArea) {
		for (int f = 0; f < 4; f++) {
			for (int c = 0; c < 4; c++) {
				textArea.setText(textArea.getText() + matriz[f][c] + " ");
			}
			textArea.setText(textArea.getText() + "\n");
		}
	}
}
