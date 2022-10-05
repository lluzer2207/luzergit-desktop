public class TestEmployee {
	public static void main(String[] args) {
		IEmployee employee1 = new PartTimeEmployee("Anh van", 1000000, 8);
		System.out.println("Name: " + employee1.getName());
		System.out.println("Salary per day: " + employee1.calculateSalary());

		IEmployee employee2 = new FullTimeEmployee("Anh duy", 5000000);
		System.out.println("Name: " + employee2.getName());
		System.out.println("Salary per day: " + employee2.calculateSalary());
	}
}