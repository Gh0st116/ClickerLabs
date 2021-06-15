package persistance;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Friend;

public class FriendDAO {

	private ConnectionMySQL connection;
	
	
	
	//construtor da classe
	public FriendDAO() {
		
		this.connection = new ConnectionMySQL(DBConfigs.IP, DBConfigs.PORT, DBConfigs.LOGIN, DBConfigs.PASSWORD, DBConfigs.NAME_DB);
		
	}
	
	
	
	//metodo adicionar
	public Friend add(Friend friend) {

		//abrindo conexao
		this.connection.openConnection();
		
		//registrando no bd
		String sql = "INSERT INTO friend(name, fpoints, picture) VALUES(?, ?, ?);";
		
		Friend f = null;
		
		try {
			
			//preparedStatement prepara o comando do sql antes de executar
			PreparedStatement st = this.connection.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			//substituindo interrogacoes
			st.setString(1, friend.getName());
			
			st.setLong(2, friend.getFpoints());
			
			st.setString(3, friend.getPicture());
			
//			st.setLong(4, friend.getScore15());
//
//			st.setLong(5, friend.getScore30());
//
//			st.setLong(6, friend.getScore60());
//
//			st.setLong(7, friend.getScore15());
//
//			st.setLong(8, friend.getScore30());
//
//			st.setLong(9, friend.getScore60());

			
			ResultSet rs = st.getGeneratedKeys();
			
			if (rs.next()) {
				
				f = this.searchById(rs.getLong(1));
				
				System.out.println(f.toString());
			}
			
			
			//executando a sql
			st.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		} finally {
		
			//fechando conexao
			this.connection.closeConnection();
		}
		
		return f;
		
	}
	
	
	
	//metodo editar
	public void edit(Friend friend) {
		
		//abrindo conexao
		this.connection.openConnection();
		
		//editar no bd
		String sql = "UPDATE friend SET name = ?, fpoints = ?, picture = ? WHERE id_friend = ?;"; 
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setString(1, friend.getName());
			
			st.setLong(2, friend.getFpoints());
			
			st.setString(3, friend.getPicture());
			
//			st.setLong(4, friend.getScore15());
//			
//			st.setLong(5, friend.getScore30());
//
//			st.setLong(6, friend.getScore60());
//
//			st.setLong(7, friend.getPos15());
//
//			st.setLong(8, friend.getPos30());
//
//			st.setLong(9, friend.getPos60());

			st.setLong(10, friend.getIdFriend());

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
	public void delete(Friend friend) {
		
		//abrindo conexao
		this.connection.openConnection();
		
		//deletando do bd
		String sql = "DELETE FROM friend WHERE id_friend = ?";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setLong(1, friend.getIdFriend());
			
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
	public Friend searchById(Long idFriend) {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando user que sera retornado
		Friend friend = null;

		//buscando no bd
		String sql = "SELECT * FROM friend WHERE id_friend = ?;";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setLong(1, idFriend);
			
			ResultSet rs = st.executeQuery();
			
			//converter o resultSet em um ubjeto Friend
			//next pula de linha em linha para ver se ela existe
			if (rs.next() == true) {
				
				friend = new Friend();
				
				//atribuindo colunas do rs a atributos do user
				friend.setIdFriend(rs.getLong("id_friend"));
				
				friend.setName(rs.getString("name"));
				
				friend.setFpoints(rs.getLong("fpoints"));
				
				friend.setPicture(rs.getString("picture"));
				
//				friend.setScore15(rs.getLong("score15"));
//
//				friend.setScore30(rs.getLong("score30"));
//
//				friend.setScore60(rs.getLong("score60"));
//
//				friend.setPos15(rs.getLong("pos15"));
//
//				friend.setPos30(rs.getLong("pos30"));
//
//				friend.setPos60(rs.getLong("pos60"));

			
			}
						
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			//fechar conexao
			this.connection.closeConnection();
		}
		
		return friend;
	}
	
	
	//metodo buscar todos
	public List<Friend> searchAll() {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando lista de friends que sera retornada
		List<Friend> listFriend = new ArrayList<Friend>();
		
		//buscando no bd
		String sql = "SELECT * FROM friend;";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			//converter o resultSet em um objeto Friend
			//next pula de linha em linha para ver se ela existe
			while (rs.next()) {
				
				Friend friend = new Friend();
				
				//atribuindo colunas do rs a atributos do friend
				friend.setIdFriend(rs.getLong("id_friend"));
				
				friend.setName(rs.getString("name"));
				
				friend.setFpoints(rs.getLong("fpoints"));
				
				friend.setPicture(rs.getString("picture"));
				
//				friend.setScore15(rs.getLong("score15"));
//
//				friend.setScore30(rs.getLong("score30"));
//
//				friend.setScore60(rs.getLong("score60"));
//
//				friend.setPos15(rs.getLong("pos15"));
//
//				friend.setPos30(rs.getLong("pos30"));
//
//				friend.setPos60(rs.getLong("pos60"));
								
				//adicionando friend na lista
				listFriend.add(friend);
				
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		} finally {
			
			//fechar conexao
			this.connection.closeConnection();
			
		}
		
		return listFriend;
	}
	
	
}
