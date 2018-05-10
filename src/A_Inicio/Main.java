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

        /*
        
        Comandos

Select Nome from CD

select cod as "Código" from Gravadora
(Irá puxar a coluna Cod porém com um 'ALIAS' chamando de Código)

Select * from cd, gravadora where gravadora.cod = cd.gravacod
(Irá puxar a tabela de gravadora.cod se igualando as informações de gravacod,

Select * from cd where ano = 1986 and gravacod = 2

Select * from cd where ano >= 1986

Select * from gravadora where nome is null

Select * from cd where ano between '1986' and '1990'

Select * from cd where nome like 'U2 - One'

Select * from cd where nome like '%a%'

Select * from gravadora where nome like 'S_'




Select * from cd where
(ano between '1981' and '1990') and (nome like '_ _i%') and (codigo < 3)
        
        */

        
    }    
}
