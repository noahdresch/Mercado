
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noa
 */
public class ControlaProduto {
    
    
    private ArrayList<Produto> produtos = new ArrayList();
    private int serial =1;
    
    public void addProduto( Produto novoProduto )
    {
        novoProduto.id = serial++;
        
        produtos.add( novoProduto );
    }
    
    public ArrayList<Produto> getProdutos()
    {
        return produtos;
    }

    public Produto getProdutoPorCodigo( int codigo )
    {
        for ( Produto produto : produtos )
        {
            if ( produto.id == codigo )
            {
                return produto;
            }
        }
        
        return null;
    }
    
    public void imprimirProdutos()
    {
        String resultado = "";
        
        for ( Produto produto : produtos )
        {
            resultado += produto.id + " - " + 
                                produto.nome + " = R$ " +
                                produto.valor + "\n";
        }
        
        JOptionPane.showMessageDialog( null, resultado );
    }
    
    
}
