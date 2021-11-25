import javax.swing.JOptionPane;

public class Moeda extends Item { 
    
    public Moeda(double valor) {   
        super("Moeda", valor);
    }


    @Override 
    public void exibir(){ 
        JOptionPane.showMessageDialog(null, String.format("%s: R$ %.2f", getDescricao(), getValor()));
    }
}


