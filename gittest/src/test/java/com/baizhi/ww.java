package com.baizhi;

/**
 * @program: gittest
 * @description:
 * @author: llm
 * @create: 2019-08-27 16:05
 **/
public class ww {
    private String id;
    private String name;
    public void show(String id, String name){
        if(id.length()>2){
            System.out.println("id格式正确");
        }
        if(name.length()>=4&&name.length()<=40){
            System.out.println("姓名格式正确");
        }
    }
}
