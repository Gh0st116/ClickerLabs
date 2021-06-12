package persistance;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Badge;
import entities.User;

public class BadgeDAO {

	private ConnectionMySQL connection;
	
	
	
	//construtor da classe
	public BadgeDAO() {
		
		this.connection = new ConnectionMySQL(DBConfigs.IP, DBConfigs.PORT, DBConfigs.LOGIN, DBConfigs.PASSWORD, DBConfigs.NAME_DB);
		
	}
	
	
	
	//metodo adicionar
	public Badge add(Badge badge) {

		//abrindo conexao
		this.connection.openConnection();
		
		//registrando no bd
		String sql = "INSERT INTO badge(points_value, name, description, id_user) VALUES(?, ?, ?, ?);";
		
		Badge b = null;
		
		try {
			
			//preparedStatement prepara o comando do sql antes de executar
			PreparedStatement st = this.connection.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			//substituindo interrogacoes
			st.setLong(1, badge.getPointsValue());
			
			st.setString(2, badge.getName());
			
			st.setString(3, badge.getDescription());
			
			st.setLong(4, badge.getUser().getIdUser());
			
			
			ResultSet rs = st.getGeneratedKeys();
			
			if (rs.next()) {
				
				b = this.searchById(rs.getLong(1));
				
				System.out.println(b.toString());
			}
			
			
			//executando a sql
			st.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		} finally {
		
			//fechando conexao
			this.connection.closeConnection();
		}
		
		return b;
		
	}
	
	
	
	//metodo editar
	public void edit(Badge badge) {
		
		//abrindo conexao
		this.connection.openConnection();
		
		//editar no bd
		String sql = "UPDATE badge SET points_value = ?, name = ?, description = ?, id_user = ? WHERE id_badge = ?;"; 
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setLong(1, badge.getPointsValue());
			
			st.setString(2, badge.getName());
			
			st.setString(3, badge.getDescription());
			
			st.setLong(4, badge.getUser().getIdUser());
			
			st.setLong(5, badge.getIdBadge());
						
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
	public void delete(Badge badge) {
		
		//abrindo conexao
		this.connection.openConnection();
		
		//deletando do bd
		String sql = "DELETE FROM badge WHERE id_badge = ?";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setLong(1, badge.getIdBadge());
			
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
	public Badge searchById(long idBadge) {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando badge que sera retornado
		Badge badge = null;

		//buscando no bd
		String sql = "SELECT * FROM badge WHERE id_badge = ?;";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setLong(1, idBadge);
			
			ResultSet rs = st.executeQuery();
			
			//converter o resultSet em um ubjeto Badge
			//next pula de linha em linha para ver se ela existe
			if (rs.next() == true) {
				
				badge = new Badge();
				
				//atribuindo colunas do rs a atributos do badge
				badge.setIdBadge(rs.getLong("id_badge"));
				
				badge.setName(rs.getString("name"));
				
				badge.setPointsValue(rs.getLong("points_value"));
				
				badge.setDescription(rs.getString("description"));
				
				
				//preenchendo objeto user pela procura pelo seu id
				UserDAO userDAO = new UserDAO();
				
				User user = userDAO.searchById(rs.getLong("id_user"));
				
				badge.setUser(user);
				
			}
						
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			//fechar conexao
			this.connection.closeConnection();
		}
		
		return badge;
	}
	
	
	//metodo buscar todos
	public List<Badge> searchAll() {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando lista de badges que sera retornada
		List<Badge> listBadge = new ArrayList<Badge>();
		
		//buscando no bd
		String sql = "SELECT * FROM badge;";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			//converter o resultSet em um objeto Badge
			//next pula de linha em linha para ver se ela existe
			while (rs.next()) {
				
				Badge badge = new Badge();
				
				//atribuindo colunas do rs a atributos do user
				badge.setIdBadge(rs.getLong("id_badge"));
				
				badge.setName(rs.getString("name"));
				
				badge.setPointsValue(rs.getLong("points_value"));
				
				badge.setDescription(rs.getString("description"));
				
				
				//preenchendo objeto user pela procura pelo seu id
				UserDAO userDAO = new UserDAO();
				
				User user = userDAO.searchById(rs.getLong("id_user"));
				
				badge.setUser(user);
				
				
				//adicionando badge na lista
				listBadge.add(badge);
				
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		} finally {
			
			//fechar conexao
			this.connection.closeConnection();
			
		}
		
		return listBadge;
	}
	
	
}
