package cn.bdqn.Dao;

import java.util.List;

import cn.bdqn.entity.Btn;
import cn.bdqn.entity.Menu;

public interface MenuDao {
	// ���ݽ�ɫid��ѯ����Ȩ��
	public List<Menu> SelectAllManu(int id);

	// ��ť
	public List<Menu> fuid(int id);

	public List<Menu> menuseleall();

	public int menucount();
	
	//��ѯ��ť
    public List<Btn>selectBtn();
    //����Ȩ��
    public int insertQx(Menu ys);
    //��ѯȨ��type
    public List<Menu> seqxList(int type);
}
