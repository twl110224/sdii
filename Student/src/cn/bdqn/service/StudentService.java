package cn.bdqn.service;

import cn.bdqn.entity.Stu;
import cn.bdqn.entity.layui;

public interface StudentService {
	public layui<Stu> selectLimt(String uname, int currPageNo, int pageSize);

	public int countLimt(String uname);
	
	// ɾ��
	public int deleted(int id);

	// ����
	public boolean insertd(Stu ys);
	// �޸�
	public boolean updated(Stu ys);
	public Stu updateid(int id);

}
