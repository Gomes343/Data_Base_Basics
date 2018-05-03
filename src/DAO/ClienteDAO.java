package DAO;

import conexao.Conexao;

public class ClienteDAO {

    private Conexao conexao;
    
    public ClienteDAO(){
        conexao = new Conexao();
        conexao.configurar();
    }
    
    
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
   
    public boolean apagarCPF(String cpf){
        //criar a SQL com variaveis
        String sql = "DELETE FROM cliente WHERE cpf = "+cpf+";";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
            
    }
 
    public boolean Select(){
        //criar a SQL com variaveis
        String sql = "select * from cliente";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);

        //retornar erro ou ok 
        
        conexao.pegarResultadoSQL(sql);
        //02.05 professor falou que na proxima aula fariamos!
        
        return b;     
            
    }

}
