package com.spring;

import javax.validation.constraints.Null;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
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


////        Oracle连接
//        String driverName="oracle.jdbc.driver.OracleDriver";
////        String dbUrl="jdbc:oracle:thin:@10.20.1.238:11521:onlineqc";
//        String dbUrl="jdbc:oracle:thin:@10.20.1.238:11521:XE";
//        String userName="onlineqc";
//        String password="onlineqc";
//
//        try {
//            Class.forName(driverName);
//            System.out.println("加载数据库驱动成功!");
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("加载数据库驱动失败!");
//        }
//
//        try {
//            Connection connection=DriverManager.getConnection(dbUrl,userName,password);
//            System.out.println("连接数据库成功!");
//
////            Statement statement=connection.createStatement();
////            ResultSet set=statement.executeQuery("select * from test");
////
////            while (set.next()){
////                System.out.println(set.getString("id"));
////            }
//
//            DatabaseMetaData dbmd=connection.getMetaData();
//            System.out.println(connection.getCatalog());
//            ResultSet set=dbmd.getTables(connection.getCatalog(),userName.toUpperCase(),null,new String[]{"TABLE"});
//            //set.last();
////            System.out.println(set.getRow());
//            int count=0;
//            while (set.next()){
//                count++;
//                System.out.println(set.getString("TABLE_NAME"));
//            }
//            System.out.println(count);
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("连接数据库失败!");
//        }
//    }

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

      String driver="oracle.jdbc.driver.OracleDriver";
      String url="jdbc:oracle:thin://@10.20.1.238:11521:XE";
      String username="onlineqc";
      String password="onlineqc";

      try {
          Class.forName(driver);
          System.out.println("数据库驱动连接成功!");
      }catch (Exception e){
          System.out.println("数据库驱动连接失败!");
          e.printStackTrace();
      }

      try {
          Connection connection=DriverManager.getConnection(url,username,password);
//          Statement statement=connection.createStatement();
          DatabaseMetaData databaseMetaData=connection.getMetaData();
          ResultSet set=databaseMetaData.getTables(connection.getCatalog(),"ONLINEQC",null,new String[]{"TABLE"});
          String configInput="";
          String configOutput="";
          String trackId="";
          int count=0;
          while (set.next()){
              ResultSet set2=databaseMetaData.getColumns(connection.getCatalog(),"ONLINEQC",set.getString("TABLE_NAME"),null);

              count++;
//              if (set2.next()) {
//                  System.out.println(count + "-" + set.getString("TABLE_NAME") +"-"+ set2.getString(2));
//              }
//              System.out.println(set.getString("TABLE_NAME"));

              count=0;
              trackId="";

              while(set2.next()){
                  count++;
                  trackId=set2.getString("COLUMN_NAME");
                  if (count==1)break;
              }

              configInput+="jdbc{\n"+
                  "\tjdbc_connection_string=>\"jdbc:oracle:thin:@//10.20.1.238:11521/XE\"\n"+
                  "\tjdbc_user=>\"onlineqc\"\n"+
                  "\tjdbc_password=>\"onlineqc\"\n"+
                  "\tjdbc_driver_library => \"d:\\project\\elasticsearch-jdbc-2.3.4.1\\lib\\ojdbc-6.jar\"\n"+
                  "\tjdbc_driver_class => \"Java::oracle.jdbc.driver.OracleDriver\"\n"+
                  "\trecord_last_run => \"true\"\n"+
                  "\tuse_column_value => \"false\"\n"+
                  "\ttracking_column=>\""+trackId+"\"\n"+
                  "\tlast_run_metadata_path => \"d:\\project\\logstash-6.5.4\\info\"\n"+
                  "\tclean_run => \"false\"\n"+
                  "\tjdbc_paging_enabled => \"true\"\n"+
                  "\tjdbc_page_size => \"50000\"\n"+
                  "\tstatement =>\"select * from "+set.getString("TABLE_NAME")+"\"\n"+
                  "\tschedule => \"* * * * *\"\n"+
                  "\ttype => \""+set.getString("TABLE_NAME")+"\"\n"+
                    "} \n\n";

//              ResultSet set1=databaseMetaData.getPrimaryKeys(connection.getCatalog(),"ONLINEQC",set.getString("TABLE_NAME"));
////              String keyString=set.getString("TABLE_NAME")+"----";
//              String keyString="";
////              List<String> list=new ArrayList<>();
////              list.add(set.getString("TABLE_NAME"));
//              while (set1.next()){
////                  System.out.println(set.getString("TABLE_NAME")+"-"+set1.getString("COLUMN_NAME")+"-"+
////                          set1.getString("KEY_SEQ")+"-"+set1.getString("PK_NAME"));
//                  keyString+="%{"+set1.getString("COLUMN_NAME").toLowerCase()+"}%-";
////                  list.remove(set.getString("TABLE_NAME"));
//              }
////              System.out.println("ks-"+keyString);
////              for (String s:list){
////                  System.out.println(s);
////              }
//              if(keyString.length()!=0){
//                  keyString=keyString.substring(0,keyString.length()-1);
//              }
//              configOutput+="if [type]==\""+set.getString("TABLE_NAME")+"\"{\n"+
//                  "\telasticsearch{\n"+
//                      "\thosts=>\"localhost:9200\"\n"+
//                      "\tindex=>\""+set.getString("TABLE_NAME").toLowerCase()+"\"\n"+
//                      "\tdocument_id=>\""+keyString+"\"\n"+
//                  "}\n"+
//              "}\n\n";

          }
          System.out.println(configInput);
//          System.out.println(configOutput);
      }catch (Exception e){
          System.out.println("数据表驱动连接成功!");
          e.printStackTrace();
      }

    }
}
