package com.springapp.bean;

/**
 * Created with IntelliJ IDEA.
 * User: lenovo
 * Date: 13-11-16
 * Time: 下午3:41
 * To change this template use File | Settings | File Templates.
 */
public class Message {
    private int id;
    private String subject;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
