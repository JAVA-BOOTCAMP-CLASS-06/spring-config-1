package dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import beans.MessageBean;
import dao.SampleDAO;

@Repository
public class SampleDAOImpl implements SampleDAO {

	@Autowired
	private MessageBean data;
	
	public MessageBean loadData() {
		System.out.println("[DAO] - Obteniendo datos de BD");
		return data;
	}

	public void setData(MessageBean data) {
		this.data = data;
	}

}
