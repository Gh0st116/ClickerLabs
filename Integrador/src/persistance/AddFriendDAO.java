package persistance;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import entities.AddFriend;
import entities.Friend;
import entities.User;

public class AddFriendDAO {

	
	private ConnectionMySQL connection;
	
	
	
	//construtor da classe
	public AddFriendDAO() {
		
		this.connection = new ConnectionMySQL(DBConfigs.IP, DBConfigs.PORT, DBConfigs.LOGIN, DBConfigs.PASSWORD, DBConfigs.NAME_DB);
		
	}
	

	
	//metodo adicionar
	public AddFriend add(AddFriend addFriend) {

		//abrindo conexao
		this.connection.openConnection();
		
		//registrando no bd
		String sql = "INSERT INTO add_friend(id_friend, id_user, add_date) VALUES(?, ?, ?);";
		
		AddFriend af = null;
		
		try {
			
			//preparedStatement prepara o comando do sql antes de executar
			PreparedStatement st = this.connection.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			//substituindo interrogacoes			
			st.setLong(1, addFriend.getFriend().getIdFriend());
			
			st.setLong(2, addFriend.getUser().getIdUser());
			
			
			//convertendo LocalDateTime em java.sql.Date e em DateTime do bd
			Date add_date = Date.valueOf(addFriend.getAddDate().toLocalDate());
			
			st.setDate(3, add_date);
			
			
			ResultSet rs = st.getGeneratedKeys();
			
			if (rs.next()) {
				
				af = this.searchById(rs.getLong(1));
				
				System.out.println(af.toString());
			}
			
			
			//executando a sql
			st.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		} finally {
		
			//fechando conexao
			this.connection.closeConnection();
		}
		
		return af;
		
	}
	
	
	
	//metodo editar
	public void edit(AddFriend addFriend) {
		
		//abrindo conexao
		this.connection.openConnection();
		
		//editar no bd
		String sql = "UPDATE add_friend SET id_friend = ?, id_user = ?, add_date = ? WHERE id_add_friend = ?;"; 
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes		
			st.setLong(1, addFriend.getFriend().getIdFriend());
			
			st.setLong(2, addFriend.getUser().getIdUser());
			
			
			//convertendo LocalDateTime em java.sql.Date e em DateTime do bd
			Date add_date = Date.valueOf(addFriend.getAddDate().toLocalDate());
			
			st.setDate(3, add_date);
			
			
			st.setLong(4, addFriend.getIdAddFriend());
			
			
			//executando sql
			st.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			//fechando conexao
			this.connection.closeConnection();
			
		}
			
	}
	
	
	//metodo excluir
	public void delete(AddFriend addFriend) {
		
		//abrindo conexao
		this.connection.openConnection();
		
		//deletando do bd
		String sql = "DELETE FROM add_friend WHERE id_add_friend = ?";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setLong(1, addFriend.getIdAddFriend());
			
			//executando sql
			st.executeUpdate();
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		} finally {
			
			//fechando conexao
			this.connection.closeConnection();
			
		}
		
	}
	
	
	
	//metodo buscar por ID
	public AddFriend searchById(Long idAddFriend) {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando addFriend que sera retornado
		AddFriend addFriend = null;

		//buscando no bd
		String sql = "SELECT * FROM add_friend WHERE id_add_friend = ?;";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setLong(1, idAddFriend);
			
			ResultSet rs = st.executeQuery();
			
			//converter o resultSet em um ubjeto addFriend
			//next pula de linha em linha para ver se ela existe
			if (rs.next() == true) {
				
				addFriend = new AddFriend();
				
				//atribuindo colunas do rs a atributos do addFriend
				addFriend.setIdAddFriend(rs.getLong("id_add_friend"));
				
				
				//preenchendo colunas id_friend e id_user procurando seus IDs  
				FriendDAO friendDAO = new FriendDAO();
				
				Friend friend = friendDAO.searchById(rs.getLong("id_friend"));
				
				addFriend.setFriend(friend);
				
				
				UserDAO userDAO = new UserDAO();
				
				User user = userDAO.searchById(rs.getLong("id_user"));
				
				addFriend.setUser(user);
				
				
				//convertendo DateTime pra Date pra LocalDateTime 
				LocalDateTime addDateTime = rs.getDate("add_date").toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
				
				addFriend.setAddDate(addDateTime);
				
								
			}
						
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			//fechar conexao
			this.connection.closeConnection();
		}
		
		return addFriend;
	}
	
	
	//metodo buscar todos
	public List<AddFriend> searchAll() {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando lista de addFriends que sera retornada
		List<AddFriend> listAddFriend = new ArrayList<AddFriend>();
		
		//buscando no bd
		String sql = "SELECT * FROM add_friend;";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			//converter o resultSet em um objeto addFriend
			//next pula de linha em linha para ver se ela existe
			while (rs.next()) {
				
				AddFriend addFriend = new AddFriend();
				
				//atribuindo colunas do rs a atributos do add_friend
				addFriend.setIdAddFriend(rs.getLong("id_add_friend"));
				
				
				//preenchendo colunas id_friend e id_user procurando seus IDs  
				FriendDAO friendDAO = new FriendDAO();
				
				Friend friend = friendDAO.searchById(rs.getLong("id_friend"));
				
				addFriend.setFriend(friend);
				
				
				UserDAO userDAO = new UserDAO();
				
				User user = userDAO.searchById(rs.getLong("id_user"));
				
				addFriend.setUser(user);
				
				
				//convertendo DateTime pra Date pra LocalDateTime 
				LocalDateTime addDateTime = rs.getDate("add_date").toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
				
				addFriend.setAddDate(addDateTime);
				
								
				//adicionando addFriend na lista
				listAddFriend.add(addFriend);
				
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		} finally {
			
			//fechar conexao
			this.connection.closeConnection();
			
		}
		
		return listAddFriend;
	}
	
	
}
