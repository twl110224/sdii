package cn.bdqn.service;

import java.util.List;


import cn.bdqn.entity.Menu;
import cn.bdqn.entity.layui;

public interface MenuService {
	// ���ݽ�ɫid��ѯ����Ȩ��
	public List<Menu> SelectAllMenu(int id);

	// ��ť
	public List<Menu> fuid(int id);

	public layui<Menu> menuseleall();

	public int menucount();
}
