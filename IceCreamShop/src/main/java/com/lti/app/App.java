package com.lti.app;

import java.util.List;

import com.lti.Dao.IceCreamDao;
import com.lti.entity.IceCreamDetails;
import com.lti.entity.IceCreamShops;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceCreamDao dao = new IceCreamDao();
		/*
		 * IceCreamShops ics1 = new IceCreamShops(); ics1.setAddress("mumbai");
		 * ics1.setOwnarName("Rahul"); ics1.setShopname("Ice_cream_shop");
		 * dao.save(ics1);
		 * 
		 * 
		 * IceCreamShops ics2= dao.fetchbyid(26);
		 * 
		 * IceCreamDetails icd2= new IceCreamDetails(); icd2.setFlaver("vanilla");
		 * icd2.setName("softty"); icd2.setPrice(75.5); dao.save(icd2);
		 */

		/*
		 * IceCreamShops c=dao.fetchbyid(26);
		 * System.out.println(c.getshopid()+" "+c.getShopname()+" "+c.getOwnarName()+" "
		 * +c.getAddress());
		 * 
		 * 
		 * 
		 * 
		 * 
		 * System.out.println("*******************************************");
		 * 
		 * IceCreamDetails i1 = dao.fetchdetailsbyid(31);
		 * 
		 * 
		 * //System.out.println(i1.getIceCreamNo()+" "+i1.getName()+" "+i1.getFlaver()
		 * +" "+i1.getPrice());
		 */

		List<IceCreamShops> list = dao.fetchAll();
		for (IceCreamShops c1 : list) {
			System.out
					.println(c1.getshopid() + " " + c1.getShopname() + " " + c1.getOwnarName() + " " + c1.getAddress());
		}
		System.out.println("************************************");

		List<IceCreamDetails> list1 = dao.fetchAll2();
		for (IceCreamDetails i1 : list1) {

			System.out.println(i1.getIceCreamNo() + " " + i1.getName() + " " + i1.getFlaver() + " " + i1.getPrice());

		}

	}

}
