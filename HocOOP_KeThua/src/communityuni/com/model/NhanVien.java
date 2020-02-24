package communityuni.com.model;

public class NhanVien {
	protected int ma;
	protected String ten;
	
	public NhanVien()
	{
		
	}
	
	public NhanVien(int Ma, String ten)
	{
		this.ma = ma;
		this.ten = ten;
	}
	
	
	public void setMa(int ma)
	{
		this.ma = ma;
	}
	public double getMa()
	{
		return this.ma;
	}
	public void setTen (String ten)
	{
		this.ten = ten;
	}
	public String getTen()
	{
		return this.ten;
	}
	
	public void tinhLuong()
	{
		System.out.println("Nhân viên" + this.ten + " gọi tính lương");
		
	}

}
