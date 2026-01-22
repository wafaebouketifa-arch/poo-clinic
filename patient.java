package model;

public class patient {
	

	public class Patient {

	    private int id;
	    private String name;
	    private int age;
	    private String phone;

	    public Patient(int id, String name, int age, String phone) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.phone = phone;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void display() {
	        System.out.println(id + " - " + name + " - Age: " + age + " - Phone: " + phone);
	    }
	}
}
