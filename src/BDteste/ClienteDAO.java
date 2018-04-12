package BDteste;

public class ClienteDAO {

    public boolean inserir(String nome, String cpf){
        //criar a SQL com variaveis
        String sql = "insert into cliente(nome,cpf)"
                   + "values('"+ nome +"','"+cpf+"')";
        
        //conectar com BD
        //enviar SQL para banco de dados
        //retornar erro ou ok
         
        return true;        
    }
    
    public boolean atualizarNome(int id, String nome){
        //criar a SQL com variaveis
        String sql = "UPDATE cliente SET nome = '"+nome+"' where id = "+id;
        //conectar com bd
        //enviar SQL para banco de dados
        //retornar erro ou ok        
        return true;
    }
    
    public boolean atualizarCPF(int id, String cpf){
        //criar a SQL com variaveis
        String sql = "UPDATE cliente SET cpf = '"+cpf+"' where id = "+id;
        //conectar com bd
        //enviar SQL para banco de dados
        //retornar erro ou ok        
        return true;
    }
    
    public boolean apagar(int id){
        //criar a SQL com variaveis
        String sql = "DELETE FROM cliente WHERE id = "+id;
        //conectar com bd
        
        //enviar SQL para banco de dados
        //retornar erro ou ok        
        return true;        
    }

}
