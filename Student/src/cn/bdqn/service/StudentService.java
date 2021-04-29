package cn.bdqn.service;

import cn.bdqn.entity.Stu;
import cn.bdqn.entity.layui;

public interface StudentService {
	public layui<Stu> selectLimt(String uname, int currPageNo, int pageSize);

	public int countLimt(String uname);
	
	// É¾³ý
	public int deleted(int id);

	// Ôö¼Ó
	public boolean insertd(Stu ys);
	// ÐÞ¸Ä
	public boolean updated(Stu ys);
	public Stu updateid(int id);

}
