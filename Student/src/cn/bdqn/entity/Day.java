package cn.bdqn.entity;

import java.sql.Date;

public class Day {
	private int id;//签到编号
	private int classid;//教室编号
	private int roleid;//角色编号
	private int stuid;//学生编号
	private Date daytime;//签到时间
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public Date getDaytime() {
		return daytime;
	}
	public void setDaytime(Date daytime) {
		this.daytime = daytime;
	}

}
