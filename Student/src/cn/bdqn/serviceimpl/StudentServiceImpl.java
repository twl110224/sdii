package cn.bdqn.serviceimpl;

import java.util.List;

import cn.bdqn.Dao.StudentDao;
import cn.bdqn.daoimpl.StudentDaoImpl;
import cn.bdqn.entity.Stu;
import cn.bdqn.entity.layui;
import cn.bdqn.service.StudentService;

public class StudentServiceImpl implements StudentService{
	private StudentDao qu = new StudentDaoImpl();

	@Override
	public layui<Stu> selectLimt(String uname, int currPageNo, int pageSize) {
		int startIndex = (currPageNo - 1) * pageSize;
		int maxlength = pageSize;
		List<Stu> list = qu.selectLimt(uname, startIndex, maxlength);
		int count = qu.countLimt(uname);
		layui<Stu> page = new layui<Stu>();
		page.setCode(0);
		page.setMsg("");
		page.setCount(count);
		page.setData(list);
		return page;
	}

	@Override
	public int countLimt(String uname) {
		// TODO Auto-generated method stub
		return qu.countLimt(uname);
	}

	@Override
	public int deleted(int id) {
		int num = this.qu.deleted(id);
		if (num > 1) {
			return 0;
		}
		return 1;
	}

	@Override
	public boolean insertd(Stu ys) {
		int num = this.qu.insertd(ys);
		if (num > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updated(Stu ys) {
		int num = this.qu.updated(ys);
		if (num > 0) {
			return true;
		}
		return false;
	}

	@Override
	public Stu updateid(int id) {
		return qu.updateid(id);
	}

}
