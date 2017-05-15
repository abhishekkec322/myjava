package stars;

public class star1 {
	
	public static void main(String args[]){
		
	for(int i=11;i>=1;){
		
		for(int j=i;j>=1;){
			if(i==j && j>1){
				
			System.out.print((j-2) );
			System.out.print("\t" + (j-1));
			System.out.println("\t" +(j));
			}
			else{
				System.out.println((j));			
			}
			i=i-3;
			j=j-3;
			
			}
		
	}
	}

}
