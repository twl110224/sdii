package cn.bdqn.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.bdqn.Dao.Basedao;
import cn.bdqn.Dao.MenuDao;
import cn.bdqn.entity.Btn;
import cn.bdqn.entity.Menu;

public class MenuDaoImpl extends Basedao implements MenuDao {
	Connection conn = null;
	PreparedStatement pre = null;
	ResultSet rs = null;

	@Override
	public List<Menu> SelectAllManu(int id) {
		List<Menu> list = new ArrayList<Menu>();
		conn = getConnection();
		String sql = "SELECT id,mname,mfatherid,mfunction,`type`,mbtn FROM `ls_menu` WHERE id IN(SELECT menuid FROM `role_menu` WHERE roleid =?)";
		try {
			pre = conn.prepareStatement(sql);
			pre.setInt(1, id);
			rs = pre.executeQuery();
			while (rs.next()) {
				Menu gon = new Menu();
				gon.setId(rs.getInt(1));
				gon.setMname(rs.getString(2));
				gon.setMfatherid(rs.getInt(3));
				gon.setMfunction(rs.getString(4));
				gon.setType(rs.getInt(5));
				gon.setMbtn(rs.getString(6));
				list.add(gon);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Menu> fuid(int id) {
		List<Menu> list = new ArrayList<Menu>();
		conn = getConnection();
		String sql = "SELECT id,mname,mfatherid,mfunction,`type`,mbtn FROM `ls_menu` WHERE mfatherid=?";
		try {
			pre = conn.prepareStatement(sql);
			pre.setInt(1, id);
			rs = pre.executeQuery();
			while (rs.next()) {
				Menu gon = new Menu();
				gon.setId(rs.getInt(1));
				gon.setMname(rs.getString(2));
				gon.setMfatherid(rs.getInt(3));
				gon.setMfunction(rs.getString(4));

				gon.setType(rs.getInt(5));
				gon.setMbtn(rs.getString(6));
				list.add(gon);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Menu> menuseleall() {
		List<Menu> list = new ArrayList<Menu>();
		List<Object> param = new ArrayList<Object>();
		// 获得Connection数据库连接
		conn = getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT id,mname,mfatherid,mfunction,`type`,mbtn FROM `ls_menu`");

		try {
			pre = conn.prepareStatement(sb.toString());
			if (param.size() > 0) {
				for (int i = 0; i < param.size(); i++) {
					pre.setObject(i + 1, param.get(i));
				}
			}
			rs = pre.executeQuery();
			while (rs.next()) {
				Menu gon = new Menu();

				gon.setId(rs.getInt(1));
				gon.setMname(rs.getString(2));
				gon.setMfatherid(rs.getInt(3));
				gon.setMfunction(rs.getString(4));

				gon.setType(rs.getInt(5));
				gon.setMbtn(rs.getString(6));

				list.add(gon);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll(conn, pre, rs);
		}

		return list;
	}

	@Override
	public int menucount() {
		int count = 0;
		List<Object> param = new ArrayList<Object>();
		conn = this.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT COUNT(1) FROM ls_menu");
		try {
			pre = conn.prepareStatement(sb.toString());
			if (param.size() > 0) {
				for (int i = 0; i < param.size(); i++) {
					pre.setObject(i + 1, param.get(i));
				}
			}

			rs = pre.executeQuery();

			while (rs.next()) {

				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.closeAll(conn, pre, rs);
		}
		return count;
	}

	@Override
	public List<Btn> selectBtn() {
		return null;
	}

	@Override
	public int insertQx(Menu ys) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Menu> seqxList(int type) {
		// TODO Auto-generated method stub
		return null;
	}

}
