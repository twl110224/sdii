package cn.bdqn.Dao;

import java.util.List;
import cn.bdqn.entity.Class;

public interface ClassDao {
	public List<Class> selectClasses();//查询班级 
	public int count();
	public int insertcalss(Class cl);//增加班级
	public int deleteclass(int id);//删除班级
	public int updated(Class cl);//修改
    public Class updateid(int id);//修改
	
}
