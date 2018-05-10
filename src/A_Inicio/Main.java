package A_Inicio;
import DAO.ClienteDAO;
import Model.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;

//=============================================================================
//Usar para testar os quesitos de DAO, comandos SQL e outras coisas
//diretamente no Prompt de Comando do NetBeans
//=============================================================================
public class Main {
    public static void main(String[]args) throws SQLException{
        ClienteDAO d = new ClienteDAO();
        ResultSet rs = d.Select();
        rs.next();
        rs.next();
        String x = rs.getString("cpf");
        String y = rs.getString(1);
        
        System.out.println(x);
        System.out.println(y);

        

        
    }    
}
