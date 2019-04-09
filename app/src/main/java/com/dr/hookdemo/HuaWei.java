package com.dr.hookdemo;

/**
 * 项目名称：HookDemo
 * 类描述：
 * 创建人：yuliyan
 * 创建时间：2019/4/9 11:15 AM
 * 修改人：yuliyan
 * 修改时间：2019/4/9 11:15 AM
 * 修改备注：
 */
public class HuaWei {
    private String name;
    private String type;
    
    public HuaWei(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "HuaWei{" +
            "name='" + name + '\'' +
            ", type='" + type + '\'' +
            '}';
    }
    
    
    public String makeHuaWei() {
        return String.format("生产一部%s手机，型号是%s", getName(), type);
    }
}
