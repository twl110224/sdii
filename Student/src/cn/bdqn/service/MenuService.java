package cn.bdqn.service;

import java.util.List;


import cn.bdqn.entity.Menu;
import cn.bdqn.entity.layui;

public interface MenuService {
	// 根据角色id查询所有权限
	public List<Menu> SelectAllMenu(int id);

	// 按钮
	public List<Menu> fuid(int id);

	public layui<Menu> menuseleall();

	public int menucount();
}
