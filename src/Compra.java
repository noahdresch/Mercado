
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noa
 */
public class Compra {
    
    
     public int codigo;
    public String data;
    public Usuario usuario;
    public ArrayList<Produto> produtos;

    @Override
    public String toString()
    {
        String detalhesDaCompra = "";
            
        detalhesDaCompra += "++++++++++++++++++++++++++++++++\n" +
                            "Compra: " + codigo + "\n" +
                            "Data: "   + data + "\n" +
                            "Usuario: "   + usuario + "\n";
        
        
        double valor = 0;
        
        for ( Produto produto : produtos )
        {
            valor += produto.valor;
            
            detalhesDaCompra += "\t" + produto.id + " - " + produto.nome + "\n";
        }

        detalhesDaCompra += "Valor total: R$ " + valor  + "\n";
        detalhesDaCompra += "Produtos: " + produtos.size() + "\n";
        
        detalhesDaCompra += "++++++++++++++++++++++++++++++++";

        return detalhesDaCompra;
    }
    
    
}
