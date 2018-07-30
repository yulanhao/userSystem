package com.lingnan.usersystem.common.util;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

public class DBUtilsTest {

	@Test
	public void testGetConnection() {
		Connection conn=DBUtils.getConnection();
		System.out.println("1111111");
		System.out.println(conn);
	}

}
