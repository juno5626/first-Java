
public class Rep04Riddler3 {

	public static void main(String[] args) {
		int num;
		int temp;
		int a,b,c,d;
		
		for(int i = 1000 ; i<10000 ; i++) {
			num = i;
			a = num/1000;
			temp = num%1000;
			b = temp/100;
			temp = num%100;
			c = temp/10;
			temp = num%10;
			d = temp;
			
			if(a!=b&&a!=c&&a!=d&&b!=c&&b!=d&&c!=d&&(num%2==1)&&(a==3*c)&&(a+b+c+d==27)) {
				System.out.println("The adress is "+a+" "+b+" "+c+" "+d+" on the Otis Parkway.");
			}
			
		}
		
	}
}
