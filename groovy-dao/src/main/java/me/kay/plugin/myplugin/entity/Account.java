package me.kay.plugin.myplugin.entity;


public class Account {

    private String name = "kay";

    public Account() {
    }

    public String getName() {
        System.out.println("get name");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
