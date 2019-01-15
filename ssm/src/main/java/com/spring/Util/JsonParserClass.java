package com.spring.Util;

import java.util.Scanner;

public class JsonParserClass {
    public void ParserJson(String originString){
        originString=originString.trim();
        if (!((originString.startsWith("{") && originString.endsWith("}")) || (originString.startsWith("[")
         && originString.endsWith("]")))){
//            throw new RuntimeException("Invalid Json String!");
            System.err.println("Invalid Json String!");
        }
        char c,b;
        char a=0;
        int indent=0;
        System.out.print(originString.charAt(0));
        for(int i=1;i<originString.length();i++){
            b=originString.charAt(i-1);
            if (i!=originString.length()-1){
                a=originString.charAt(i+1);
            }
            c=originString.charAt(i);
            switch (c){
                case '[':
                case '{':{
                    if (b!=',') {
                        indent++;
                    }
                    System.out.print("\n");
                    for (int j=0;j<indent;j++){
                        System.out.print("\t");
                    }
                    System.out.print(c);
                    break;
                }
                case '"': {
                    if (b=='{') {
                        indent++;
                        System.out.print("\n");
                        for (int j=0;j<indent;j++){
                            System.out.print("\t");
                        }
                    }else if(b==','){
                        System.out.print("\n");
                        for (int j=0;j<indent;j++){
                            System.out.print("\t");
                        }
                    }
                    System.out.print(c);
                    break;
                }
                case ',': {
                    if(b==a || (b=='}' && a=='{')) {
                        if (b != '}' && b != ']') {
                            System.out.print(c);
                        } else {
                            System.out.print("\n");
                            if (b == ']') {
                                indent = indent - 1;
                            }
                            for (int j = 0; j < indent; j++) {
                                System.out.print("\t");
                            }
                            System.out.print(c);
                        }
                    }
                    else{
                       indent--;
                        System.out.print("\n");
                        for (int j=0;j<indent;j++){
                            System.out.print("\t");
                        }
                        System.out.print(c);
                    }
                    break;
                }
                case '}':
                case ']':{
                    indent--;
                    if (b==']')
                        indent--;
                    System.out.print("\n");
                    for (int j=0;j<indent;j++){
                        System.out.print("\t");
                    }
                    System.out.print(c);
                    break;
                }
                default:
                    System.out.print(c);
            }
        }
    }

    public static void main(String[] args) {
        JsonParserClass jsonParserClass=new JsonParserClass();
//        jsonParserClass.ParserJson("oo");
//        jsonParserClass.ParserJson("**pp_}");
//        jsonParserClass.ParserJson("{OOO}");
//        jsonParserClass.ParserJson("{yy:0");
//        jsonParserClass.ParserJson("[99999");
//        jsonParserClass.ParserJson("[FHDDJ(]");
//        jsonParserClass.ParserJson("[{}]");
//        jsonParserClass.ParserJson("uuu&&&}");
//        jsonParserClass.ParserJson("ooo**]");
//        String test="[{\"key1\":[{\"key1211\":\"val1211\"," +
//                "\"key1212\":\"val212\"},{\"key1221\":\"val221\",\"key1222\":\"val222\"}]}," +
//                "{\"key2\":{\"key211\":\"val211\",\"key212\":\"val212\"},\"key3\":\"val3\"}]";
//        System.out.println(test);
//        jsonParserClass.ParserJson(test);

        while (true) {
            Scanner sc = new Scanner(System.in);
            String convertString = sc.next();
            jsonParserClass.ParserJson(convertString);
        }

    }
}
