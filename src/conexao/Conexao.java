package conexao;


public class Conexao extends ConexaoAbstract{
    
    public Conexao(){
        
        
    }

    @Override
    public void configurar(){
        this.port = PORT_MYSQL;
        this.className = CLASSNAME_MYSQL;
        this.setConexao(MYSQL, "BDteste", "10.10.209.32");
        this.setLogin("root","aluno123");
    }

}
