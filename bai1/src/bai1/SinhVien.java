package bai1;

public class SinhVien {
	public String name;
	private int id;
	
	public SinhVien(String name, int id) {
		this.name=name;
		this.id=id;
	}
	public SinhVien() {
		this.name="Default";
		this.id=-1;
	}
	public String toString() {
		return "Ho ten: " + this.name + " va MSSV: " + this.id;
	}
}
