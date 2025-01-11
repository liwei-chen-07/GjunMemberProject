package model;

public class Order {
	private String name;
	private Integer lcd;
	private Integer ram;
	private Integer sum;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String name, Integer lcd, Integer ram) {
		super();
		this.name = name;
		this.lcd = lcd;
		this.ram = ram;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLcd() {
		return lcd;
	}
	public void setLcd(Integer lcd) {
		this.lcd = lcd;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public Integer getSum() {
		return sum;
	}
	public String show()
	{
		sum=lcd*4999+ram*1280;
		return "名:"+name+
				", lcd:"+lcd+
				", ram:"+ram+
				", sum:"+sum;
	}
}
