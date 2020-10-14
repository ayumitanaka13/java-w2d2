public class RandomNumber {

    public static int getRandom(int... numbers) {
		int num;
        boolean isNotIncluded;
        
		do { 
			isNotIncluded = false;
            num = 1 + (int)(Math.random() * 54);
            
			for (int e: numbers) {
				if (num == e)
					isNotIncluded = true;
            }
            
		} while (isNotIncluded);
		return num;
    }
    
    public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  

        System.out.println(getRandom(arr));  
    } 
}
