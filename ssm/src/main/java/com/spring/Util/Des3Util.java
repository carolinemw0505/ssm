package com.spring.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import java.io.IOException;
import java.net.InetAddress;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Des3Util {

    /**
     * des加密
     * @param src
     * @param DES_KEY
     * @return
     */
    public static String EncryptBy3DES(String src,String DES_KEY){
        String result=null;
        try{
            SecureRandom secureRandom=new SecureRandom();
            DESedeKeySpec deSedeKeySpec=new DESedeKeySpec(DES_KEY.getBytes());
            SecretKeyFactory secretKeyFactory=SecretKeyFactory.getInstance("DESede");
            SecretKey key=secretKeyFactory.generateSecret(deSedeKeySpec);

            Cipher cipher=Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE,key,secureRandom);

            byte[] byteresult=cipher.doFinal(src.getBytes());
            result=new sun.misc.BASE64Encoder().encode(byteresult);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public static String decryptBy3DES(String src,String DES_KEY){
        String deresult=null;
        try{
            SecureRandom secureRandom=new SecureRandom();
            DESedeKeySpec deSedeKeySpec=new DESedeKeySpec(DES_KEY.getBytes());

            SecretKeyFactory secretKeyFactory=SecretKeyFactory.getInstance("DESede");
            SecretKey secretKey=secretKeyFactory.generateSecret(deSedeKeySpec);

            Cipher cipher=Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE,secretKey,secureRandom);

            deresult=new String(cipher.doFinal(new sun.misc.BASE64Decoder().decodeBuffer(src)));
        }catch (Exception e){
            e.printStackTrace();
        }
        return deresult;
    }

    public static void main(String[] args) {
        Des3Util des3Util=new Des3Util();
        String en=Des3Util.EncryptBy3DES("VOCtest_3", "B0BC4EBD22B55ECA59FEB087806CFF1F");

        String de=Des3Util.decryptBy3DES(en,"B0BC4EBD22B55ECA59FEB087806CFF1F");

        System.out.println("des3Util:"+ en);

        System.out.println("des3Util:"+de);

        de=Des3Util.decryptBy3DES("VQ4b5X5MPJ+KVKTQmdDwjA==","B0BC4EBD22B55ECA59FEB087806CFF1F");

        System.out.println("des3Util:"+de);
    }
}
