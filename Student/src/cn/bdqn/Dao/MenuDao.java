package cn.bdqn.Dao;

import java.util.List;

import cn.bdqn.entity.Btn;
import cn.bdqn.entity.Menu;

public interface MenuDao {
	// 根据角色id查询所有权限
	public List<Menu> SelectAllManu(int id);

	// 按钮
	public List<Menu> fuid(int id);

	public List<Menu> menuseleall();

	public int menucount();
	
	//查询按钮
    public List<Btn>selectBtn();
    //增加权限
    public int insertQx(Menu ys);
    //查询权限type
    public List<Menu> seqxList(int type);
}
