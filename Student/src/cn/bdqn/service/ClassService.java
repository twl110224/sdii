package cn.bdqn.service;

import java.util.List;

import cn.bdqn.entity.Class;
import cn.bdqn.entity.layui;

public interface ClassService {
	public layui<Class> selectClasses();//查询班级 
	public int count();
	public boolean insertcalss(Class cl);//增加班级
	public int deleteclass(int id);//删除班级
	public boolean updated(Class cl);//修改
    public Class updateid(int id);//修改
	
}
