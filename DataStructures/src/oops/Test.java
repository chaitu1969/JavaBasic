package oops;

class Test 
{ 
	static class Car{
    static int year;
    String company_name;
}

    public static void main (String[] args) {
        Car c = new Car();        
        Car.year=2018;              
        c.company_name="KIA";
        Car d=new Car();
        System.out.print(Car.year);
}
}
