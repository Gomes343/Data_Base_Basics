package conexao;

import com.mysql.jdbc.Connection;

public class ConexaoAbstract implements IConexao{
    protected String pwd = "";
    protected String usr = "";
    protected String ip = "";
    protected String base = "";
    protected String dbms = "";
    protected String className = "";
    protected String port = "";
    protected Connection con = null;
    protected boolean status = false; 
            
//----------------------------SET PARAMETROS -----------------------------------
    
    
    public void configurar(){
        
    }
    
    
}
