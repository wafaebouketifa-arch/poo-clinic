package model;

public class doctor {
	public class Doctor {
	    private int id;
	    private String name;
	    private String specialty;

	    public Doctor(int id, String name, String specialty) {
	        this.id = id;
	        this.name = name;
	        this.specialty = specialty;
	    }

	    public String getName() {
	        return name;
	    }

	    public void displayInfo() {
	        System.out.println("Doctor ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Specialty: " + specialty);
	    }
	}
}
