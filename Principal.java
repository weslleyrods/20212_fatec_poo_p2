import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        List <Item> colecao = new ArrayList <>(); 
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Inserir item\n2 - Exibir colecao\n3 - Exibir valor da colecao"
            ));
            switch(op){
                case 1: { // Switch geral
                    int itemOp = Integer.parseInt(JOptionPane.showInputDialog(
                        "1 - Moeda\n2 - Selo Regular\n3 - Selo Comemorativo\n0 - Sair"
                    ));
                    switch(itemOp){ //opcao 1
                        case 1: {
                            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da moeda"));                                      
                            Item moeda = new Moeda(valor); // construtor (variavel)
                            colecao.add(moeda);
                            break;
                        }
                        case 2:{ //opcao 2
                            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do selo regular"));                    
                            String descricao = JOptionPane.showInputDialog("Digite a descricao do selo regular");
                            Item seloRegular = new SeloRegular(descricao, valor);
                            colecao.add(seloRegular); 
                            break;                           
                        }
                        case 3:{ //opcao 3
                            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do selo comemorativo"));                    
                            String descricao = JOptionPane.showInputDialog("Digite a descricao do selo comemorativo");
                            Item seloComemorativo = new SeloComemorativo (descricao, valor);
                            colecao.add(seloComemorativo);
                            break;
                        }
                        }
                    }
                    break;
                case 2: {
                    for(Item item : colecao){
                        item.exibir();
                    }
                    
                    break;
                }
                case 3: {
                    double soma= 0;
                    for(Item item : colecao){ 
                        soma += item.getValor();
                    }
                    if (soma > 0)
                        JOptionPane.showMessageDialog(null, String.format("A somatoria da colecao e %.2f", soma));
                    else
                        JOptionPane.showMessageDialog(null, "A colecao está vazia");                   
                    break;                   
                }
            }
        }while(op!=0);     
    }
}