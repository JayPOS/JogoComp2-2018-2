package botoes;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.JButton;

import janelas.JanelaJogo;

public class Bomba extends JButton {

	private static int TAM = JanelaJogo.getTAM_BOTAO();
	private int time;

	public Bomba(int time) {
		super("Bomba");
		this.time = time;
		if (this.time == 0) {
        	this.setBackground(new Color(30, 99, 238));
        }
        else if (this.time == 1) {
        	this.setText("Inimigo");
        	this.setBackground(new Color(255, 59, 48));
        }
		this.setPreferredSize(new Dimension(TAM, TAM));
		// TODO Auto-generated constructor stub
	}

	public Bomba(Icon arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public Bomba(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public int getTime() {
		return time;
	}

}
