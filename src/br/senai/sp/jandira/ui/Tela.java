package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {
	
	public void criarTela() {
		//Formatação
		JFrame minhaTela = new JFrame();
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(350, 500);
		minhaTela.setTitle("Cálculo IMC");
		minhaTela.setLayout(null);
		
		//Componentes
		JLabel lblTitulo = new JLabel("Cálculo de IMC");
		lblTitulo.setBounds(20, 20, 180, 30);
		lblTitulo.setFont(new Font ("Arial", Font.BOLD, 25));
		lblTitulo.setForeground(Color.BLUE);
		
		JLabel lblPeso = new JLabel("Seu peso: ");
		lblPeso.setBounds(20, 60, 90, 30);
		lblPeso.setFont(new Font ("Arial", Font.PLAIN, 12));
		
		JTextField txtPeso = new JTextField();
		txtPeso.setBounds(110, 60, 90, 30);
		
		JLabel lblAltura = new JLabel("Sua altura: ");
		lblAltura.setBounds(20, 100, 90, 30);
		lblAltura.setFont(new Font ("Arial", Font.PLAIN, 12));
		
		JTextField txtAltura = new JTextField();
		txtAltura.setBounds(110, 100, 90, 30);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(20, 150, 200, 50);
		btnCalcular.setBackground(Color.LIGHT_GRAY);
		btnCalcular.setFont(new Font ("Arial", Font.PLAIN, 20));
		
		JLabel lblResultados = new JLabel("Resultados: ");
		lblResultados.setBounds(20, 230, 120, 30);
		lblResultados.setFont(new Font ("Arial", Font.BOLD, 18));
		
		JLabel lblValorIMC = new JLabel();
		lblValorIMC.setText("Valor IMC: ");
		lblValorIMC.setBounds(20, 260, 90, 30);
		lblValorIMC.setFont(new Font ("Arial", Font.PLAIN, 12));
		
		minhaTela.getContentPane().add(lblTitulo);
		minhaTela.getContentPane().add(lblPeso);
		minhaTela.getContentPane().add(txtPeso);
		minhaTela.getContentPane().add(lblAltura);
		minhaTela.getContentPane().add(txtAltura);
		minhaTela.getContentPane().add(btnCalcular);
		minhaTela.getContentPane().add(lblResultados);
		minhaTela.getContentPane().add(lblValorIMC);
		
		minhaTela.setVisible(true);
		
		//Listeners de evento
		//Mouse
		btnCalcular.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
	}
}
