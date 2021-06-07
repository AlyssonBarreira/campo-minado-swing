package br.com.alysson.campominado.visao;

import javax.swing.JFrame;

import br.com.alysson.campominado.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{
	
	public TelaPrincipal() {
		
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);
		add(new PainelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado"); // titulo da janela do jogo
		setSize(690, 438); // dimensão da janela do jog
		setLocationRelativeTo(null); // centraliza a janela do jog
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // encerra a operação assim que fechado a janela do jogo
		setVisible(true); // visibilidade da janela
	}

	public static void main(String[] args) {
		
		new TelaPrincipal();
	}
}
