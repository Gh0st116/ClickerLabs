package persistance;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Hscore60;

public class Hscore60DAO {

	private ConnectionMySQL connection;
	
	
	
	//construtor da classe
	public Hscore60DAO() {
		
		this.connection = new ConnectionMySQL(DBConfigs.IP, DBConfigs.PORT, DBConfigs.LOGIN, DBConfigs.PASSWORD, DBConfigs.NAME_DB);
		
	}
	
	
	
	//metodo adicionar
	public Hscore60 add(Hscore60 hscore60) {

		//abrindo conexao
		this.connection.openConnection();
		
		//registrando no bd
		String sql = "INSERT INTO hscore60(player_username, player_score, time, average) VALUES(?, ?, ?, ?);";
		
		Hscore60 h60 = null;
		
		try {
			
			//preparedStatement prepara o comando do sql antes de executar
			PreparedStatement st = this.connection.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			//substituindo interrogacoes
			st.setString(1, hscore60.getPlayerName());
			
			st.setDouble(2, hscore60.getPlayerScore());
			
			st.setDouble(3, hscore60.getTime());
			
			st.setDouble(4, hscore60.getAverageCps());
			
			
			ResultSet rs = st.getGeneratedKeys();
			
			if (rs.next()) {
				
				h60 = this.searchById(rs.getLong(1));
				
				System.out.println(h60.toString());
			}
			
			//executando a sql
			st.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		} finally {
		
			//fechando conexao
			this.connection.closeConnection();
		}
		
		return h60;
		
	}
	
	
	
	//metodo editar
	public void edit(Hscore60 hscore60) {
		
		//abrindo conexao
		this.connection.openConnection();
		
		//editar no bd
		String sql = "UPDATE hscore60 SET player_username = ?, player_score = ?, time = ?, average = ? WHERE id_60 = ?;"; 
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setString(1, hscore60.getPlayerName());
			
			st.setDouble(2, hscore60.getPlayerScore());
			
			st.setDouble(3, hscore60.getTime());
			
			st.setDouble(4, hscore60.getAverageCps());
			
			st.setLong(5, hscore60.getId60());
			
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
	public void delete(Hscore60 hscore60) {
		
		//abrindo conexao
		this.connection.openConnection();
		
		//deletando do bd
		String sql = "DELETE FROM hscore60 WHERE id_60 = ?";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setLong(1, hscore60.getId60());
			
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
	public Hscore60 searchById(long id60) {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando user que sera retornado
		Hscore60 hscore60 = null;

		//buscando no bd
		String sql = "SELECT * FROM hscore60 WHERE id_60 = ?;";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setLong(1, id60);
			
			ResultSet rs = st.executeQuery();
			
			//converter o resultSet em um ubjeto Hscore60
			//next pula de linha em linha para ver se ela existe
			if (rs.next() == true) {
				
				hscore60 = new Hscore60();
				
				//atribuindo colunas do rs a atributos do hscore60
				hscore60.setId60(rs.getLong("id_60"));
				
				hscore60.setPlayerName(rs.getString("player_username"));
				
				hscore60.setPlayerScore(rs.getLong("player_score"));
				
				hscore60.setTime(rs.getDouble("time"));
				
				hscore60.setAverageCps(rs.getDouble("average"));
				
			}
						
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			//fechar conexao
			this.connection.closeConnection();
		}
		
		return hscore60;
	}
	
	
	//metodo buscar todos
	public List<Hscore60> searchAll() {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando lista de hscore60 que sera retornada
		List<Hscore60> list60 = new ArrayList<Hscore60>();
		
		//buscando no bd
		String sql = "SELECT * FROM hscore60;";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			//converter o resultSet em um objeto Hscore60
			//next pula de linha em linha para ver se ela existe
			while (rs.next()) {
				
				Hscore60 hscore60 = new Hscore60();
				
				//atribuindo colunas do rs a atributos do hscore60
				hscore60.setId60(rs.getLong("id_60"));
				
				hscore60.setPlayerName(rs.getString("player_username"));
				
				hscore60.setPlayerScore(rs.getLong("player_score"));
				
				hscore60.setTime(rs.getDouble("time"));
				
				hscore60.setAverageCps(rs.getDouble("average"));
				
				//adicionando user na lista
				list60.add(hscore60);
				
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		} finally {
			
			//fechar conexao
			this.connection.closeConnection();
			
		}
		
		return list60;
	}

	
	// procurando id pelo username
	public long searchIdByUsername(String username) {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando hscore15 que sera retornado
		long id = 0;

		//buscando no bd
		String sql = "SELECT id_60 FROM hscore60 WHERE player_username = ?;";
		
		try {
			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setString(1, username);
			
			ResultSet rs = st.executeQuery();
			
			//converter o resultSet em um ubjeto Hscore15
			//next pula de linha em linha para ver se ela existe
			if (rs.next() == true) {
						
				//atribuindo colunas do rs a atributos do hscore15
				id = rs.getLong("id_60");
				
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
