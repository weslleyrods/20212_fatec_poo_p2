import javax.swing.JOptionPane;

public abstract class Item{
    

    private String descricao;
    private double valor;


    public Item(String descricao, double valor){
        this.descricao = descricao; 
        this.valor = valor;
    }
    
    public void exibir(){
        JOptionPane.showMessageDialog(null, String.format("%s: %.2f", this.descricao, this.valor));
    }

    public String getDescricao() {
        return this.descricao;
    }
    public double getValor() {
        return this.valor;
    }
}
