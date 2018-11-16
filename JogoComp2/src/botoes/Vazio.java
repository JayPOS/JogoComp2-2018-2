package botoes;

import java.awt.*;
import javax.swing.*;

import janela.JanelaJogo;

public class Vazio extends JButton {

    private static int TAM = JanelaJogo.getTAM_BOTAO();

    public Vazio() {
    }

    public Vazio(String text) {
        super(text);
    }

    public Vazio(String text, Icon icon) {
        super(text, icon);
    }
}
