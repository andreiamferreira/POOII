package atividade1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClasseConexaoMySQL {
	
	//declaração variáveis
	private static Connection con;		//por meio dessa class qu se faz a conexão com o BD
	private static String status;
	//define/especifica o construtor
	public ClasseConexaoMySQL() {
		
	}
	
	public static void abrirConexao() {	//metodo estático para abrir a conexão com o BD
		String serverName="localhost";		
		String database = "meuBanco";
		String url="jdbc:mysql://"+serverName+":3306/"+database;	//"?useTimezone=true&serverTimezone=UTC"	caso de erro no horario
		String userName="andreia";
		String password="poo2";
		
		try {
			con=DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	//con recebe o retorno do metodo getConnection, com a class driver manager
		
		if(con != null) {			//TESTE DE CONEXÃO
			status="STATUS--------> Conectado com sucesso";
		}
		else {
			status="STATUS-----> Conexão não foi bem sucedida";
		}
	}
	
	public static boolean fecharConexao() {		//metodo para encerramento da conexão
		try {
			con.close();					//fecha a conexão		
			System.out.println("Conexão encerrada");		//output teste
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static void exibeStatus() {		//metodo para exibir o status da conexão
		System.out.println(status); 	//retorna o valor da conexao
	}
	
	public static void main(String[] args) {
		
		ClasseConexaoMySQL.abrirConexao();
		ClasseConexaoMySQL.exibeStatus();
		ClasseConexaoMySQL.fecharConexao();
		
	}
}
