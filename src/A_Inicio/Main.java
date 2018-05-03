package A_Inicio;
import DAO.ClienteDAO;
import Model.Cliente;

//=============================================================================
//Usar para testar os quesitos de DAO, comandos SQL e outras coisas
//diretamente no Prompt de Comando do NetBeans
//=============================================================================
public class Main {
    public static void main(String[]args){
        ClienteDAO d = new ClienteDAO();
        d.Select();
        
    }    
}
