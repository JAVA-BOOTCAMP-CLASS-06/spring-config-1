package bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beans.MessageBean;
import bo.SampleBO;
import dao.SampleDAO;

@Service
public class SampleBOImpl implements SampleBO {

	@Autowired
	private SampleDAO dao;
	
	public MessageBean processData() {
		System.out.println("[BO] - Solicitando datos al DAO");
		MessageBean bean = dao.loadData();
		System.out.println("[BO] - Data procesada");
		return bean;
	}

	public void setDao(SampleDAO dao) {
		this.dao = dao;
	}

}
