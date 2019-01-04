package com.spring;

import java.sql.*;

public class test {
    public static void main(String[] args){
//      mysql连接
//       try( Connection c=DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/testdatabase?serverTimezone=GMT%2B8","root","root");
//        Statement s=c.createStatement();) {
//
//           Class.forName("com.mysql.cj.jdbc.Driver");
//           s.execute("insert into user(id,email,password,username,role,status,regTime,regIp) values (5," +
//                   "'ooYY@sina.cam','123456','test5','admin',5,'2018-12-16 08:55:55','192.168.255.34');");
//           System.out.println("connection is closed:"+c.isClosed());
//           System.out.println("statement is closed:"+s.isClosed());
//       }catch (Exception e){
//           e.printStackTrace();
//       }


//        Oracle连接
        String driverName="oracle.jdbc.driver.OracleDriver";
//        String dbUrl="jdbc:oracle:thin:@10.20.1.238:11521:onlineqc";
        String dbUrl="jdbc:oracle:thin:@10.20.1.238:11521:XE";
        String userName="onlineqc";
        String password="onlineqc";

        try {
            Class.forName(driverName);
            System.out.println("加载数据库驱动成功!");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("加载数据库驱动失败!");
        }

        try {
            Connection connection=DriverManager.getConnection(dbUrl,userName,password);
            System.out.println("连接数据库成功!");

//            Statement statement=connection.createStatement();
//            ResultSet set=statement.executeQuery("select * from test");
//
//            while (set.next()){
//                System.out.println(set.getString("id"));
//            }

            DatabaseMetaData dbmd=connection.getMetaData();
            System.out.println(connection.getCatalog());
            ResultSet set=dbmd.getTables(connection.getCatalog(),userName.toUpperCase(),null,new String[]{"TABLE"});
            //set.last();
//            System.out.println(set.getRow());
            int count=0;
            while (set.next()){
                count++;
                System.out.println(set.getString("TABLE_NAME"));
            }
            System.out.println(count);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("连接数据库失败!");
        }
    }

//    public static void main(String[] args)throws Exception{
//
//        Connection c=DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/testdatabase?serverTimezone=GMT%2B8","root","root");
//        Statement s=c.createStatement();
//
//           Class.forName("com.mysql.cj.jdbc.Driver");
//           s.execute("insert into user(id,email,password,username,role,status,regTime,regIp) values (4," +
//                   "'oo3@sina.cam','12345','test3','admin',4,'2018-12-16 08:55:55','192.168.255.34');");
//           System.out.println("connection is closed:"+c.isClosed());
//           System.out.println("statement is closed:"+s.isClosed());
//
//    }
}
