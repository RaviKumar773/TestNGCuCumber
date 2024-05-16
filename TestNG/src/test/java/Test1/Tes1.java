package Test1;

import org.testng.annotations.Test;

public class Tes1 {
	
	@Test
	public void db_Connection() {
		System.out.println("db starts");
	}
	@Test
	public void close_db_Connection() {
		System.out.println("db ends");
	}
	

}
