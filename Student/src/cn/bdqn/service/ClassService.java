package cn.bdqn.service;

import java.util.List;

import cn.bdqn.entity.Class;
import cn.bdqn.entity.layui;

public interface ClassService {
	public layui<Class> selectClasses();//��ѯ�༶ 
	public int count();
	public boolean insertcalss(Class cl);//���Ӱ༶
	public int deleteclass(int id);//ɾ���༶
	public boolean updated(Class cl);//�޸�
    public Class updateid(int id);//�޸�
	
}
