package com.example.web.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.example.web.model.Stock;
import com.example.web.model.StockDetail;
import com.example.web.persistence.HibernateUtil;

public class StockDAOImpl implements StockDAO {

	public void saveStock(Stock stock) {
		try{
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();	
			session.save(stock);
			System.out.println("stock saved with stockId:: "+stock.getStockId());
			session.getTransaction().commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	
	public Stock loadStock(String stockCode) {
		Stock stock=null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
				
		String hql = "from stock where stockCode=:stockCode";
		Query query=session.createQuery(hql);
		query.setString("stockCode", stockCode);
		List results = query.list();
		System.out.println("Stock :: "+(results==null?0:results.size()));
		if(results !=null && results.size()>0){
			stock=(Stock) results.get(0);
		}
		session.getTransaction().commit();
		session.close();		
		return stock;

	}

	
	public Stock loadStockById(int stockId) {
		Stock stock=null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();	
		stock=(Stock) session.get(Stock.class, stockId);
		session.getTransaction().commit();
		session.close();
		
		return stock;

	}


	
	public void saveStockDetails(StockDetail stockDetail) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();	
		session.save(stockDetail);
		System.out.println("stockDetail saved :: ");
		session.getTransaction().commit();
		session.close();		
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Stock> loadAllStock() {
		List<Stock> stockList=new ArrayList<Stock>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();	
		String hql = "from Stock";
		Query query=session.createQuery(hql);		
		stockList = query.list();		
		session.getTransaction().commit();
		session.close();		
		return stockList;
	}

}
