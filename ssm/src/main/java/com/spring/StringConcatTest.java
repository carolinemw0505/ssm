package com.spring;

import com.spring.util.GlobalConst;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.*;
import java.util.Iterator;

public class StringConcatTest {
    public static void main(String[] args) throws IOException, DocumentException {
        String configInput="";
        for(int i=0;i<12;i++){
//            configInput+="jdbc{\n"+
//                    "\tjdbc_connection_string=>\"jdbc:oracle:thin:@//10.20.1.238:11521/XE\"\n"+
//                    "\tjdbc_user=>\"onlineqc\"\n"+
//                    "\tjdbc_password=>\"onlineqc\"\n"+
//                    "\tjdbc_driver_library => \"d:\\project\\elasticsearch-jdbc-2.3.4.1\\lib\\ojdbc-6.jar\"\n"+
//                    "\tjdbc_driver_class => \"Java::oracle.jdbc.driver.OracleDriver\"\n"+
//                    "\trecord_last_run => \"true\"\n"+
//                    "\tuse_column_value => \"false\"\n"+
//                    "\ttracking_column=>\"id\"\n"+
//                    "\tlast_run_metadata_path => \"d:\\project\\logstash-6.5.4\\info\"\n"+
//                    "\tclean_run => \"false\"\n"+
//                    "\tjdbc_paging_enabled => \"true\"\n"+
//                    "\tjdbc_page_size => \"50000\"\n"+
//                    "\tstatement =>\"d:\\project\\logstash - 6.5 .4\\bin\\logstash_jdbc_test\\sql\\indexName\\"
//                    +GlobalConst.indexNames[i]+".sql\"\n"+
//                    "\tschedule => \"0 10/5 * * * ? *\"\n"+
//                    "\ttype => \""+GlobalConst.indexNames[i] +"\"\n"+
//                    "} \n\n";

            configInput+="if [type]==\""+GlobalConst.indexNames[i]+"\"{\n" +
                    "\telasticsearch{\n" +
                    "\t\thosts=>\"localhost:9200\"\n" +
                    "\t\tindex=>\""+GlobalConst.indexNames[i]+"\"\n" +
                    "\t\tdocument_id=>\"id\"\n" +
                    "\t}\n" +
                    "}\n";
        }

        System.out.println(configInput);

//        File f=null;
//        String p,path,dp;
//     for(int i=0;i<12;i++){
//         dp="d:\\project\\logstash - 6.5 .4";
//
//         f=new File(dp);
//         System.out.println(f.exists());
//         if(f.exists()) {
//             System.out.println(f.exists());
//             f.deleteOnExit();
//         }
//         p="d:\\project\\logstash - 6.5 .4\\bin";
//                 //+
//                 //"logstash_jdbc_test" ;
//         //path=p+GlobalConst.indexNames[i]+".sql";
//         f=new File(p);
//         System.out.println(p);
//         System.out.println(f.exists());
//         if (f.exists()){
//             System.out.println(f.delete());
////             f.mkdirs();
//         }
//
////         f=new File(path);
////         System.out.println(path);
////         System.out.println(f.exists());
////         if (!f.exists()){
////             System.out.println(false);
////            f.createNewFile();
//         }

//        File dom=new File("E:\\EGOO\\work\\ssmmvn\\src\\main\\resources\\mapper\\QcCorpustabMapper.xml");
//
//        SAXReader sr=new SAXReader();
//        Document d=sr.read(dom);
//        Element e=d.getRootElement();
//        Element foo;
//        String path="d:\\project\\logstash-6.5.4\\bin\\logstash_jdbc_test\\sql" +
//                "\\indexName\\" ;
//
////        File f=new File(path);
////
////        for(int i=0;i<12;i++){
////            path+=GlobalConst.indexNames[i]+".sql";
////        }
//
////        int j=0;
//
//        String indexN="",sqlText="";
//        OutputStream b=null;
//        for(Iterator i = e.elementIterator("select"); i.hasNext();){
//            foo=(Element) i.next();
////            System.out.println(foo.attribute("id").getValue());
//
////            if(foo.attribute("id").getValue().
////                    equalsIgnoreCase(GlobalConst.indexType[IndexName.]))
////            System.out.println();
//
//            indexN=foo.attributeValue("id");
//            sqlText=foo.getText();
//
//            //System.out.println(indexN+":"+sqlText);
//            path="d:\\project\\logstash-6.5.4\\bin\\logstash_jdbc_test\\sql" +
//                    "\\indexName\\" ;
//            for (int j=0;j<12;j++){
//                if (indexN.equalsIgnoreCase(GlobalConst.indexType[j])){
//                    path+=GlobalConst.indexNames[j]+".sql";
//                    b=new FileOutputStream(new File(path));
//                    b.write(sqlText.getBytes());
//                }
//            }
//
//        }


//        InputStream i=new FileInputStream(f);
////        i.read();
//        OutputStream o=new FileOutputStream(f);
//        byte[] b="ttt".getBytes();
//        o.write(b);
//        byte[] r=new byte[1024];
//        int len=0;
//        while ((len=i.read(r,0,r.length))!=-1){
//            System.out.println(new String(r,0,len,"GBK"));
//        }
//        System.out.println(b.toString());
    }
}
