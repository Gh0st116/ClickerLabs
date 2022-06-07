package persistance;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Hscore30;

public class Hscore30DAO {

	private ConnectionMySQL connection;	
	
	//construtor da classe
	public Hscore30DAO() {
		this.connection = new ConnectionMySQL(DBConfigs.IP, DBConfigs.PORT, DBConfigs.LOGIN, DBConfigs.PASSWORD, DBConfigs.NAME_DB);		
	}	
	
	//metodo adicionar
	public Hscore30 add(Hscore30 hscore30) {

		//abrindo conexao
		this.connection.openConnection();
		
		//registrando no bd
		String sql = "INSERT INTO hscore30(player_username, player_score, time, average) VALUES(?, ?, ?, ?);";
		
		Hscore30 h30 = null;
		
		try {
			//preparedStatement prepara o comando do sql antes de executar
			PreparedStatement st = this.connection.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			//substituindo interrogacoes
			st.setString(1, hscore30.getPlayerName());			
			st.setDouble(2, hscore30.getPlayerScore());			
			st.setDouble(3, hscore30.getTime());			
			st.setDouble(4, hscore30.getAverageCps());			
			
			ResultSet rs = st.getGeneratedKeys();
			
			if (rs.next()) {				
				h30 = this.searchById(rs.getLong(1));				
				System.out.println(h30.toString());
			}
			
			//executando a sql
			st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();		
		} finally {
			
			//fechando conexao
			this.connection.closeConnection();
		}
		
		return h30;
	}	
	
	//metodo editar
	public void edit(Hscore30 hscore30) {
		
		//abrindo conexao
		this.connection.openConnection();
		
		//editar no bd
		String sql = "UPDATE hscore30 SET player_username = ?, player_score = ?, time = ?, average = ? WHERE id_30 = ?;"; 
		
		try {			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setString(1, hscore30.getPlayerName());			
			st.setDouble(2, hscore30.getPlayerScore());			
			st.setDouble(3, hscore30.getTime());			
			st.setDouble(4, hscore30.getAverageCps());
			st.setLong(5, hscore30.getId30());
			
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
	public void delete(Hscore30 hscore30) {
		
		//abrindo conexao
		this.connection.openConnection();
		
		//deletando do bd
		String sql = "DELETE FROM hscore30 WHERE id_30 = ?";
		
		try {			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setLong(1, hscore30.getId30());
			
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
	public Hscore30 searchById(long id30) {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando user que sera retornado
		Hscore30 hscore30 = null;

		//buscando no bd
		String sql = "SELECT * FROM hscore30 WHERE id_30 = ?;";
		
		try {			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setLong(1, id30);
			
			ResultSet rs = st.executeQuery();
			
			//converter o resultSet em um ubjeto Hscore30
			//next pula de linha em linha para ver se ela existe
			if (rs.next() == true) {				
				hscore30 = new Hscore30();
				
				//atribuindo colunas do rs a atributos do hscore30
				hscore30.setId30(rs.getLong("id_30"));				
				hscore30.setPlayerName(rs.getString("player_username"));				
				hscore30.setPlayerScore(rs.getLong("player_score"));				
				hscore30.setTime(rs.getDouble("time"));				
				hscore30.setAverageCps(rs.getDouble("average"));
			}						
		} catch (SQLException e) {			
			e.printStackTrace();			
		} finally {
			
			//fechar conexao
			this.connection.closeConnection();
		}
		
		return hscore30;
	}	
	
	//metodo buscar todos
	public List<Hscore30> searchAll() {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando lista de hscore30 que sera retornada
		List<Hscore30> list30 = new ArrayList<Hscore30>();
		
		//buscando no bd
		String sql = "SELECT * FROM hscore30;";
		
		try {			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);			
			ResultSet rs = st.executeQuery();
			
			//converter o resultSet em um objeto Hscore30
			//next pula de linha em linha para ver se ela existe
			while (rs.next()) {				
				Hscore30 hscore30 = new Hscore30();
				
				//atribuindo colunas do rs a atributos do hscore30
				hscore30.setId30(rs.getLong("id_30"));				
				hscore30.setPlayerName(rs.getString("player_username"));				
				hscore30.setPlayerScore(rs.getLong("player_score"));				
				hscore30.setTime(rs.getDouble("time"));				
				hscore30.setAverageCps(rs.getDouble("average"));
				
				//adicionando user na lista
				list30.add(hscore30);				
			}			
		} catch (SQLException e) {
			e.printStackTrace();			
		} finally {
			
			//fechar conexao
			this.connection.closeConnection();			
		}
		
		return list30;
	}
	
	// procurando id pelo username
	public long searchIdByUsername(String username) {
		
		//abrir conexao
		this.connection.openConnection();
		
		//declarando hscore15 que sera retornado
		long id = 0;

		//buscando no bd
		String sql = "SELECT id_30 FROM hscore30 WHERE player_username = ?;";
		
		try {			
			PreparedStatement st = connection.getConnection().prepareStatement(sql);
			
			//substituindo interrogacoes
			st.setString(1, username);
			
			ResultSet rs = st.executeQuery();
			
			//converter o resultSet em um ubjeto Hscore15
			//next pula de linha em linha para ver se ela existe
			if (rs.next() == true) {
						
				//atribuindo colunas do rs a atributos do hscore15
				id = rs.getLong("id_30");				
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
