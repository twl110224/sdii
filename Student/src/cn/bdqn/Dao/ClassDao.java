package cn.bdqn.Dao;

import java.util.List;
import cn.bdqn.entity.Class;

public interface ClassDao {
	public List<Class> selectClasses();//��ѯ�༶ 
	public int count();
	public int insertcalss(Class cl);//���Ӱ༶
	public int deleteclass(int id);//ɾ���༶
	public int updated(Class cl);//�޸�
    public Class updateid(int id);//�޸�
	
}
