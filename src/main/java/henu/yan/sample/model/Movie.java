package henu.yan.sample.model;

import java.io.Serializable;

/**
 * Ehcache缓存测试实体类
 */
public class Movie implements Serializable {
    private Integer id;
    private String name;
    private String director;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
