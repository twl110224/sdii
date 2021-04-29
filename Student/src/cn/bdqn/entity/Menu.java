package cn.bdqn.entity;

public class Menu {
	private int id;//权限编号
	private String mname;//权限
	private int mfatherid;//父级id
	private String mfunction;
	private int type;
	private String mbtn;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMfatherid() {
		return mfatherid;
	}
	public void setMfatherid(int mfatherid) {
		this.mfatherid = mfatherid;
	}
	public String getMfunction() {
		return mfunction;
	}
	public void setMfunction(String mfunction) {
		this.mfunction = mfunction;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getMbtn() {
		return mbtn;
	}
	public void setMbtn(String mbtn) {
		this.mbtn = mbtn;
	}

	
}
