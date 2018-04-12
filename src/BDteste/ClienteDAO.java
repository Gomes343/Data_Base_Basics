package BDteste;

import conexao.Conexao;

public class ClienteDAO {

    private Conexao conexao = new Conexao();
    
    public boolean inserir(String nome, String cpf){
        
        //criar a SQL com variaveis
        String sql = "insert into cliente(nome,cpf)"
                   + "values('"+ nome +"','"+cpf+"')";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarNome(int id, String nome){
        //criar a SQL com variaveis
        String sql = "UPDATE cliente SET nome = '"+nome+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarCPF(int id, String cpf){
        //criar a SQL com variaveis
        String sql = "UPDATE cliente SET cpf = '"+cpf+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean apagar(int id){
        //criar a SQL com variaveis
        String sql = "DELETE FROM cliente WHERE id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
            
    }

}
