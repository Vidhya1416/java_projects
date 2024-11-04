package array.basic.com;

public class arrayprac {

	public static void main(String[] args) {
		
		//array
		String[] playlist=new String[6];//array declaration
		
		playlist[0]="nuvvele";//value declaration
		
		System.out.println(playlist);//output:[Ljava.lang.String;@24d46ca6
		//it will print the reference id of the actual value, it didn't  print the value inside the array
		
		System.out.println(playlist[0]);//output:nuvvele =>actual value 
		
		String[] songs= {"break the rules","naalo nenu","chali chaliga","mounanga unna","my world is flying","get ready to fight"};
		//directly insert an array values
		
		System.out.println(songs[0]);
		
		
	}

}
