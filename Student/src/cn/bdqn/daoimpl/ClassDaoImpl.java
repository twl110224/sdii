package cn.bdqn.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import cn.bdqn.Dao.Basedao;
import cn.bdqn.Dao.ClassDao;
import cn.bdqn.entity.Class;

public class ClassDaoImpl extends Basedao implements ClassDao {
	Connection conn=null;
	PreparedStatement pre=null;
	ResultSet rs=null;
	Class ur=new Class();
	@Override
	public List<Class> selectClasses() {
		List<Class> list = new ArrayList<>();//存储查询之后的记录
		
		
		Connection conn = this.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<Object> params = new ArrayList<>();
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT id,`name` FROM class");
		try {
			
			pstmt = conn.prepareStatement(sb.toString());
			
			rs = pstmt.executeQuery();
			while(rs.next()){
				Class cl = new Class();
				cl.setId(rs.getInt(1));
				cl.setName(rs.getString(2));
				list.add(cl);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.closeAll(conn, pstmt, rs);
		}
		
		return list;
	}

	@Override
	public int insertcalss(Class cl) {
		conn=this.getConnection();
		String sql = "INSERT INTO class(name) VALUES(?)";
		// 2.提供替换?的object[]
		Object[] obj = { cl.getName()
				 };
		// 执行新增操作
		return this.getSIDU(sql, obj);
	}

	@Override
	public int deleteclass(int id) {
		conn=this.getConnection();
		String sql="DELETE FROM class WHERE id=?";
		// 2.提供替换?的object[]
		Object[] obj = { id };
		// 执行新增操作
		return this.getSIDU(sql, obj);
	}

	@Override
	public int updated(Class cl) {
		String sql = "UPDATE class SET name=? WHERE id=?";
		// 2.提供替换?的object[]
		Object[] obj = {cl.getName(),cl.getId()};
		return this.getSIDU(sql, obj);
	}

	@Override
	public Class updateid(int id) {
		conn=this.getConnection();
		Class cl=new Class();
		String sql="SELECT * FROM user WHERE id=?";
		try {
			pre = conn.prepareStatement(sql);
			pre.setObject(1, id);
			rs = pre.executeQuery();// 无惨方法
			while (rs.next()) {
			cl.setId(rs.getInt(1));
			cl.setName(rs.getString(2));
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cl;
	}

	@Override
	public int count() {
		int count = 0;
	    List<Object>param =new ArrayList<Object>();
			 conn =this.getConnection();
			 StringBuilder sb=new StringBuilder();
			 sb.append("SELECT COUNT(1) FROM class ");	
			try {
				pre = conn.prepareStatement(sb.toString());
				if(param.size()>0){
					for (int i = 0; i < param.size(); i++) {
						pre.setObject(i+1, param.get(i));
					}
				}
				
				rs = pre.executeQuery();
				
				while(rs.next()){
					
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
}
