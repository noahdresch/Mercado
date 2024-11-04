/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noa
 */
public class Usuario {
    
    public int id;
    public String nome;
    public String login;

     public Usuario( String nome, String login )
    {
        this.nome = nome;
        this.login = login;
        
        ajustaNome();
    }

    public void ajustaNome()
    {
        this.nome = this.nome.toUpperCase();
    }
    
    @Override
    public boolean equals( Object obj )
    {
        if ( obj instanceof Usuario usuario )
        {
            return usuario.id == id;
        }
        
        return false;
    }

    @Override
    public String toString()
    {
        return nome;
    }
    
    
}
