package cn.bdqn.Dao;

import java.util.List;

import cn.bdqn.entity.Stu;

public interface StudentDao {
	public List<Stu> selectLimt(String uname, int startIndex, int maxlength);//ʹ�÷�ҳ��ѯ

	public int countLimt(String uname);
	
	//ɾ��ѧ��
    public int deleted(int id);
    //�޸�ѧ��
    public int updated(Stu ys);
    public Stu updateid(int id);
    //����ѧ��
    public int insertd(Stu ys);

}
