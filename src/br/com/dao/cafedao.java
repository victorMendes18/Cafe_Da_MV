package br.com.dao;

import java.sql.Connection;

import com.mysql.cj.jdbc.PreparedStatementWrapper;

import br.com.cafe.cadastro;
import br.com.controle.conectar;

public class cafedao {
	
	public void save(cafedao nome) {
		String sql= "VALUES (?,?,?)";
		Connection conc = null;
		PreparedStatementWrapper pstm = null;
	 try {
		 conc= conectar.createConnectionToMySQL();
	 pstm =(PreparedStatement) conc.prepareStatement(sql);
	 pstm.setString(0, cadastro.getNome());
	 pstm.setString(0,cadastro.getNome());
	 pstm.setString(0,cadastro.geopcao());
	 
	 pstm.execute();
	 
	}

}
