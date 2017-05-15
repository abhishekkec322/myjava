package stars;

public class star {
	
	public static void main(String args[]){
	//	for (int i=6;i>=1;i--){
			for (int j=1;j<=6;j++){
				{
					
					for(int k=1;k<=j;k++){
						//System.out.print("");
						System.out.print("*");
					}
					System.out.println("");
				}
				
			}
			
			System.out.println("Second :");
			
			
			for (int j=1;j<=6;j++){
				{
					
					for(int k=1,l=6-j;k<=j;k++){
						
							while(l>0){
							System.out.print(" ");
							l--;
							}
							System.out.print("*");
					}
					System.out.println("");
				}
				
			}
			
			System.out.println("Third :");
			
			
			for (int j=6;j>=1;j--){
				{
					
					for(int k=j;k>=1;k--){
						System.out.print("");
						System.out.print("*");
					}
					System.out.println("");
				}
				
			}
			
		}


}
