package BDteste;

public class Cliente {


    private int id;
    private String nome;
    private String cpf;
    private ClienteDAO dao = new ClienteDAO();// mesmo ele ja inicializado aqui
    //ele ainda nao existe na memoria, ai construtor já cria ele!

    public Cliente(){  //inicializando os contrutores
        dao = new ClienteDAO();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void inserir(String nome, String cpf){
        dao.inserir(nome, cpf);
    }               //metodo feio mas funfa
    
    
    public static void main(String[]args){
        Cliente cliente = new Cliente();
        cliente.setNome("José");
        cliente.setCpf("12345678911");
        ClienteDAO dao = new ClienteDAO();
        
        boolean b = dao.inserir(cliente.getNome(),cliente.getCpf());
        
        if(b){
            System.out.println("Inserido com Sucesso");
        }else{
            System.out.println("Erro");
        }
        
        
        
    }
}
