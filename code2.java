/*2. Write a program to print the numbers divisible by 5 in the range 50 - 10.*/
class Code2{
	public static void main(String[] args){
		int num=50;
		while(num<=50){
			if(num%5==0){
				System.out.println(num);
				num--;
			}
		}
	}
}
