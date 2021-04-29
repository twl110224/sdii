package cn.bdqn.serviceimpl;

import java.util.List;

import cn.bdqn.Dao.ClassDao;
import cn.bdqn.daoimpl.ClassDaoImpl;
import cn.bdqn.entity.Class;
import cn.bdqn.entity.layui;
import cn.bdqn.service.ClassService;

public class ClassSerImpl implements ClassService{
	private ClassDao cd=new ClassDaoImpl();
	@Override
	public layui<Class> selectClasses() {
		List<Class> list=cd.selectClasses();	
		int count=cd.count();
		layui<Class>page=new layui<Class>();	
		page.setCode(0);
		page.setMsg("");
		page.setCount(count);
		page.setData(list);
		return page;
	}
	@Override
	public Class updateid(int id) {
		// TODO Auto-generated method stub
		return cd.updateid(id);
	}
	@Override
	public boolean insertcalss(Class cl) {
		int num=this.cd.insertcalss(cl);
		if (num>0) {
			return true;
		}
		return false;
	}
	@Override
	public int deleteclass(int id) {
		int num=this.cd.deleteclass(id);
		if (num>1) {
			return 0;
		}
		return 1;
	}
	@Override
	public boolean updated(Class cl) {
		int num=this.cd.updated(cl);
		if (num>0) {
			return true;
		}
		return false;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cd.count();
	}
	
}
