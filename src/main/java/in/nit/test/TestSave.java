package in.nit.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.nit.model.Email;

public class TestSave {
	public static void main(String[] args) {
		try {
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session ses = sf.openSession();
			Transaction tx = ses.beginTransaction();
			
			Email e = new Email();
			e.setMailId(111);
			e.setFrom("piu");
			e.setTo("shailu");
			e.setSubject("wish");
			e.setText("hii");
			
			Serializable s = ses.save(e);
			Integer id = (Integer)s;
			
			tx.commit();
			ses.close();
			
			System.out.println("Done!!! "+id);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	

}
