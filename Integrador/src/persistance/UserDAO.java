package persistance;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.User;

public class UserDAO {

	private ConnectionMySQL connection;
	
	
	
	//construtor da classe
	public UserDAO() {
		
		this.connection = new ConnectionMySQL(DBConfigs.IP, DBConfigs.PORT, DBConfigs.LOGIN, DBConfigs.PASSWORD, DBConfigs.NAME_DB);
		
	}
	
	
	
	//metodo adicionar
	public User add(User user) {
				
		//abrindo conexao
		this.connection.openConnection();
		
		//registrando no bd
		String sql = "INSERT INTO user(name, picture, username, password) VALUES(?, ?, ?, ?);";
		
		User u = null;
		
		try {
			
			//preparedStatement prepara o comando do sql antes de executar
			PreparedStatement st = this.connection.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			//substituindo interrogacoes
			st.setString(1, user.getName());
			
			st.setString(2, user.getPicture());
			
			st.setString(3, user.getUsername());
			
			st.setString(4, user.getPassword());

			//executando a sql
			st.executeUpdate();
			
			
			ResultSet rs = st.getGeneratedKeys();
			
			if (rs.next()) {
				
				u = this.searchById(rs.getLong(1));
				
				System.out.println(u.toString());
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		} finally {
		
			//fechando conexao
			this.connection.closeConnection();
		}
		
		return u;
		
	}
	
	
	
	
	//metodo editar
	public void edit(User user) {
		
		//abrindo conexao
		this.connection.openConnection();
		
		//editar no bd
		String sql = "UPDATE user SET name = ?, username = ?, password = ?, picture = ?, points = ?, nclicks = ? WHERE id_user = ?;"; 
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setString(1, user.getName());
			
			st.setString(2, user.getUsername());
			
			st.setString(3, user.getPassword());
			
			st.setString(4, user.getPicture());
			
			st.setLong(5, user.getPoints());
			
			st.setLong(6, user.getNclicks());
			
			st.setLong(7, user.getIdUser());
			
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
	public void delete(User user) {
		
		//abrindo conexao
		this.connection.openConnection();
		
		//deletando do bd
		String sql = "DELETE FROM user WHERE id_user = ?";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setLong(1, user.getIdUser());
			
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
	public User searchById(long idUser) {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando user que sera retornado
		User user = null;

		//buscando no bd
		String sql = "SELECT * FROM user WHERE id_user = ?;";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setLong(1, idUser);
			
			ResultSet rs = st.executeQuery();
			
			//converter o resultSet em um ubjeto User
			//next pula de linha em linha para ver se ela existe
			if (rs.next() == true) {
				
				user = new User();
				
				//atribuindo colunas do rs a atributos do user
				user.setIdUser(rs.getLong("id_user"));
				
				user.setName(rs.getString("name"));
				
				user.setUsername(rs.getString("username"));
				
				user.setPassword(rs.getString("password"));
				
				user.setPicture(rs.getString("picture"));
				
				user.setPoints(rs.getLong("points"));
				
				user.setNclicks(rs.getLong("nclicks"));
				
				user.setId15(rs.getLong("id_15"));
				
				user.setId30(rs.getLong("id_30"));
				
				user.setId60(rs.getLong("id_60"));
				
				
			}
						
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			//fechar conexao
			this.connection.closeConnection();
		}
		
		return user;
	}
	
	
	
	
	//metodo buscar todos
	public List<User> searchAll() {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando lista de users que sera retornada
		List<User> listUser = new ArrayList<User>();
		
		//buscando no bd
		String sql = "SELECT * FROM user;";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			//converter o resultSet em um objeto User
			//next pula de linha em linha para ver se ela existe
			while (rs.next()) {
				
				User user = new User();
				
				//atribuindo colunas do rs a atributos do user
				user.setIdUser(rs.getLong("id_user"));
				
				user.setName(rs.getString("name"));
				
				user.setUsername(rs.getString("username"));
				
				user.setPassword(rs.getString("password"));
				
				user.setPicture(rs.getString("picture"));
				
				user.setPoints(rs.getLong("points"));
				
				user.setNclicks(rs.getLong("nclicks"));
				
				user.setId15(rs.getLong("id_15"));
				
				user.setId30(rs.getLong("id_30"));
				
				user.setId60(rs.getLong("id_60"));
				
								
				//adicionando user na lista
				listUser.add(user);
				
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		} finally {
			
			//fechar conexao
			this.connection.closeConnection();
			
		}
		
		return listUser;
	}
	
	
	public long searchIdByUsername(String username) {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando id que sera retornado
		long id = 0;

		//buscando no bd
		String sql = "SELECT * FROM user WHERE username = ?;";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setString(1, username);
			
			ResultSet rs = st.executeQuery();
			
			//next pula de linha em linha para ver se ela existe
			if (rs.next() == true) {
				
				id = rs.getLong("id_user");
				
			}
						
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			//fechar conexao
			this.connection.closeConnection();
		}
		
		return id;
	}
	
	
	
}
