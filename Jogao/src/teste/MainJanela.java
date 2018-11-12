package teste;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class MainJanela {
	public static void inicializa(String nome) {
		Janelinha janela = new Janelinha(nome);
//		janela.setSize();
//		janela.setExtendedState(Frame.MAXIMIZED_BOTH);
		janela.setVisible(true);
	}
	public static void main(String[] args) {
		inicializa("Super Combat");
	}
}
