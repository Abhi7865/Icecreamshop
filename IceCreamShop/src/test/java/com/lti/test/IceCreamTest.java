package com.lti.test;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

import com.lti.Dao.IceCreamDao;
import com.lti.entity.IceCreamDetails;
import com.lti.entity.IceCreamShops;



public class IceCreamTest {
	//done
	@Test
	public void addIcecremshop() {
		IceCreamShops i1 = new IceCreamShops();
i1.setShopname("Ice Cream wala");
i1.setOwnarName("golu");
i1.setAddress("PUNE");

		IceCreamDao dao = new IceCreamDao();
		dao.save(i1);
	}
//done
	@Test
	public void addicecreamdetails() {
		IceCreamDao dao = new IceCreamDao();
		IceCreamShops i1 = (IceCreamShops) dao.fetchById(IceCreamDetails.class, 39);

		IceCreamDetails s = new 	IceCreamDetails();
		s.setName("family pack");
		s.setFlaver("badam pista");
		s.setPrice(200.5);
		
		s.setIcs(i1);
		dao.save(s);
	}

	
	
	
	
	@Test 
	public void fetchbyIceCreamName() {
		IceCreamDao dao = new IceCreamDao();
		List<IceCreamDetails> i2 = dao.fetchAllbyIceCreamshopName("Ice Cream wala");
		for (IceCreamDetails al : i2)
			System.out.println(al.getName() + " " + al.getFlaver() + " " + al.getPrice() );

	}
	
	
	//done
	@Test 
	public void fetchallicecreambyprice() {
		IceCreamDao dao = new IceCreamDao();
		List<IceCreamDetails> songs = dao.fetchallicecreambyprice(75.5);
		for (IceCreamDetails al : songs)
			System.out.println(al.getName() + " " + al.getFlaver() + " " + al.getPrice() );

	}
	
	
	//done
	@Test 
	public void fetchallbyShopName() {
		IceCreamDao dao = new IceCreamDao();
		List<IceCreamShops> songs = dao.fetchallbyShopName("Ice_cream_shop");
		for (IceCreamShops al : songs)
			System.out.println(al.getShopname() + " " + al.getOwnarName() + " " + al.getAddress() );

	}
	
	
	
	
	
}
