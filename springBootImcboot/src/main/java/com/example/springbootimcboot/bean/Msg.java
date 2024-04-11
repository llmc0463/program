package com.example.springbootimcboot.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 淡漠
 * @version 1.0
 */
public class Msg {
    //状态200 400
    private int code;
    //信息-说明
    private String msg;
    //数据
    private Map<String,Object> extend=new HashMap<String,Object>();

    public static Msg success(){
        Msg msg = new Msg();
        msg.setCode(200);
        msg.setMsg("success");
        return msg;
    }

    public Msg add(String key,Object value){
        extend.put(key,value);
        return this;
    }

    public static Msg fail(){
        Msg msg = new Msg();
        msg.setCode(400);
        msg.setMsg("fail");
        return msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", extend=" + extend +
                '}';
    }

    public Msg() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }

    public Msg(int code, String msg, Map<String, Object> extend) {
        this.code = code;
        this.msg = msg;
        this.extend = extend;
    }
}
