package cn.bdqn.serviceimpl;

import java.util.List;

import cn.bdqn.Dao.MenuDao;
import cn.bdqn.daoimpl.MenuDaoImpl;
import cn.bdqn.entity.Menu;
import cn.bdqn.entity.layui;
import cn.bdqn.service.MenuService;

public class MenuServiceImpl implements MenuService {
	private MenuDao md = new MenuDaoImpl();

	@Override
	public List<Menu> SelectAllMenu(int id) {
		// TODO Auto-generated method stub
		return md.SelectAllManu(id);
	}

	@Override
	public List<Menu> fuid(int id) {
		// TODO Auto-generated method stub
		return md.fuid(id);
	}

	@Override
	public layui<Menu> menuseleall() {
		List<Menu> list = md.menuseleall();
		int count = md.menucount();
		layui<Menu> page = new layui<Menu>();
		page.setCode(0);
		page.setMsg("");
		page.setCount(count);
		page.setData(list);
		return page;
	}

	@Override
	public int menucount() {
		// TODO Auto-generated method stub
		return md.menucount();
	}

}
