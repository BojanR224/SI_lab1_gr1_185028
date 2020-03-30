import java.util.ArrayList;
import java.util.List;

class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoint;

	//TODO constructor


	public Student(String index, String firstName, String lastName, List<Integer> labPoint) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoint = new ArrayList<>();
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getLabPoint() {
		return labPoint;
	}

	public void setLabPoint(List<Integer> labPoint) {
		this.labPoint = labPoint;
	}


	//TODO seters & getters

	public double getAverage() {
		return labPoint.stream().mapToDouble(x -> x).average().getAsDouble();
	}

	public boolean hasSignature() {
		return labPoint.size() >= 8;
	}
}
