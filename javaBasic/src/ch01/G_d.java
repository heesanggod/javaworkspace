package ch01;

class Data {
	int data1;
}



public class G_d {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.data1 = 10;
		System.out.println("main() : X = " + d.data1);
		
		zd(d.data1);
		System.out.println("After zd(d.dat1)");
		System.out.println("main() : X" + d.data1);
		
		
		Data d2 = copy(d);
		System.out.println("d.data1 = " + d.data1);
		System.out.println("d2.data1 = " + d2.data1);
		
		
		Integer wrapperInt = 15987;
		int number = Integer.parseInt("9");
		System.out.println(number);
		
		

	}
	

	
	static void zd(int data1) {
		data1 = 1000;
		System.out.println("zd() : X = " + data1);
		
	}
	
	
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.data1 = d.data1;
		return tmp;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
