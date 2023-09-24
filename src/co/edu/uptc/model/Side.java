package co.edu.uptc.model;

public class Side {
	
    private String name;
    private Campus campus;

    public Side(String name, Campus campus) {
        this.name = name;
        this.campus = campus;
    }

	@Override
	public String toString() {
		return "Side [name=" + name + ", campus=" + campus + "]";
	}
    
}
