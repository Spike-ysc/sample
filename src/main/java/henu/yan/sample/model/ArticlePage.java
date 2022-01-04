package henu.yan.sample.model;

import java.io.Serializable;
import java.util.Date;

public class ArticlePage implements Serializable {
    private Integer id;
    private String title;
    private String head;
    private String source;
    private String tags;
    private String message;
    private String author;
    private Date updateTime;

    public ArticlePage(Integer id, String title, String head, String source, String message,String tags, String author, Date updateTime){
        this.id = id;
        this.title = title;
        this.head = head;
        this.source = source;
        this.tags = tags;
        this.message = message;
        this.author = author;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
