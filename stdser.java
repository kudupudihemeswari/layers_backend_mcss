package services;

import java.sql.Connection;
import java.sql.PreparedStatement;

import models.student;

public class stdser {
	private Connection conn;

	public stdser(Connection conn) {
		super();
		this.conn = conn;
	}
	public boolean addstudent(student stu) {
		boolean f = false;
		try {
			String sql = "insert into student (stu_id,stu_name,stu_email,stu_phn,stu_branch) values (?,?,?,?,?)";
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setInt(1, stu.getSt_id());
			pmst.setString(2, stu.getSt_name());
			pmst.setString(3, stu.getSt_email());
			pmst.setLong(4, stu.getSt_mobile());
			pmst.setString(5, stu.getSt_branch());
			int i = pmst.executeUpdate();
			if(i>0) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}