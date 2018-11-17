package botoes;

import java.awt.*;
import javax.swing.*;

import janelas.JanelaJogo;
import principal.Janela;

public class Vazio extends JButton {

    private static int TAM = Janela.getTAM_BOTAO();

    public Vazio() {
    	super("Vazio");
    }

    public Vazio(String text) {
        super(text);
    }

    public Vazio(String text, Icon icon) {
        super(text, icon);
    }
}