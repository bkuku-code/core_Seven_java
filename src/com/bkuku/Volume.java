import java.util.Scanner;

	public class Volume{
	
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		double radius;
		double area;
		double lenght;
		double volume;

		System.out.print("Enter radius:");
		radius = input.nextDouble();
		System.out.print("Enter area:");
		area = input.nextDouble();
		System.out.print("Enter lenght:");
		lenght = input.nextDouble();
		
		area = radius * radius * Math.PI;
		volume = area * length;

		System.out.printf("Volume value: %2f%n" , volume);
		System.out.printf("Area value: %2f%n" , area);






















}
}