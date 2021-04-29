package cn.bdqn.entity;

public class Stu {
	private int id;// 学生id
	private String name;// 学生姓名
	private String loginname;// 登录名
	private String pass;// 密码
	private int classid;// 班级编号
	private int roleid;// 角色编号
	private String classString;//班级名称
	private String roleString;//角色名称

	public String getClassString() {
		return classString;
	}

	public void setClassString(String classString) {
		this.classString = classString;
	}

	public String getRoleString() {
		return roleString;
	}

	public void setRoleString(String roleString) {
		this.roleString = roleString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getClassid() {
		return classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

}
