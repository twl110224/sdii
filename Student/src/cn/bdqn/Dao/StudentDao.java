package cn.bdqn.Dao;

import java.util.List;

import cn.bdqn.entity.Stu;

public interface StudentDao {
	public List<Stu> selectLimt(String uname, int startIndex, int maxlength);//使用分页查询

	public int countLimt(String uname);
	
	//删除学生
    public int deleted(int id);
    //修改学生
    public int updated(Stu ys);
    public Stu updateid(int id);
    //增加学生
    public int insertd(Stu ys);

}
