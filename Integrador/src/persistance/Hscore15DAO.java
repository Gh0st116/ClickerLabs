package persistance;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Hscore15;

public class Hscore15DAO {

	private ConnectionMySQL connection;
	
	
	
	//construtor da classe
	public Hscore15DAO() {
		
		this.connection = new ConnectionMySQL(DBConfigs.IP, DBConfigs.PORT, DBConfigs.LOGIN, DBConfigs.PASSWORD, DBConfigs.NAME_DB);
		
	}
	
	
	
	//metodo adicionar
	public Hscore15 add(Hscore15 hscore15) {

		//abrindo conexao
		this.connection.openConnection();
		
		//registrando no bd
		String sql = "INSERT INTO hscore15(player_name, player_score, time, average) VALUES(?, ?, ?, ?);";
		
		Hscore15 h15 = null;
		
		try {
			
			//preparedStatement prepara o comando do sql antes de executar
			PreparedStatement st = this.connection.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			//substituindo interrogacoes
			st.setString(1, hscore15.getPlayerName());
			
			st.setDouble(2, hscore15.getPlayerScore());
			
			st.setDouble(3, hscore15.getTime());
			
			st.setDouble(4, hscore15.getAverageCps());
			
			
			ResultSet rs = st.getGeneratedKeys();
			
			if (rs.next()) {
				
				h15 = this.searchById(rs.getLong(1));
				
				System.out.println(h15.toString());
			}
			
			
			//executando a sql
			st.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		} finally {
		
			//fechando conexao
			this.connection.closeConnection();
		}
		
		return h15;
		
	}
	
	
	
	//metodo editar
	public void edit(Hscore15 hscore15) {
		
		//abrindo conexao
		this.connection.openConnection();
		
		//editar no bd
		String sql = "UPDATE hscore15 SET player_name = ?, player_score = ?, time = ?, average = ? WHERE id_15 = ?;"; 
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setString(1, hscore15.getPlayerName());
			
			st.setDouble(2, hscore15.getPlayerScore());
			
			st.setDouble(3, hscore15.getTime());
			
			st.setDouble(4, hscore15.getAverageCps());
			
			st.setLong(5, hscore15.getId15());
			
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
	public void delete(Hscore15 hscore15) {
		
		//abrindo conexao
		this.connection.openConnection();
		
		//deletando do bd
		String sql = "DELETE FROM hscore15 WHERE id_15 = ?";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setLong(1, hscore15.getId15());
			
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
	public Hscore15 searchById(long id15) {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando user que sera retornado
		Hscore15 hscore15 = null;

		//buscando no bd
		String sql = "SELECT * FROM hscore15 WHERE id_15 = ?;";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setLong(1, id15);
			
			ResultSet rs = st.executeQuery();
			
			//converter o resultSet em um ubjeto Hscore15
			//next pula de linha em linha para ver se ela existe
			if (rs.next() == true) {
				
				hscore15 = new Hscore15();
				
				//atribuindo colunas do rs a atributos do hscore15
				hscore15.setId15(rs.getLong("id_15"));
				
				hscore15.setPlayerName(rs.getString("player_name"));
				
				hscore15.setPlayerScore(rs.getLong("player_score"));
				
				hscore15.setTime(rs.getDouble("time"));
				
				hscore15.setAverageCps(rs.getDouble("average"));
				
			}
						
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			//fechar conexao
			this.connection.closeConnection();
		}
		
		return hscore15;
	}
	
	
	//metodo buscar todos
	public List<Hscore15> searchAll() {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando lista de hscore15 que sera retornada
		List<Hscore15> list15 = new ArrayList<Hscore15>();
		
		//buscando no bd
		String sql = "SELECT * FROM hscore15;";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			//converter o resultSet em um objeto Hscore15
			//next pula de linha em linha para ver se ela existe
			while (rs.next()) {
				
				Hscore15 hscore15 = new Hscore15();
				
				//atribuindo colunas do rs a atributos do hscore15
				hscore15.setId15(rs.getLong("id_15"));
				
				hscore15.setPlayerName(rs.getString("player_name"));
				
				hscore15.setPlayerScore(rs.getLong("player_score"));
				
				hscore15.setTime(rs.getDouble("time"));
				
				hscore15.setAverageCps(rs.getDouble("average"));
				
				//adicionando user na lista
				list15.add(hscore15);
				
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		} finally {
			
			//fechar conexao
			this.connection.closeConnection();
			
		}
		
		return list15;
	}
	
	
}
