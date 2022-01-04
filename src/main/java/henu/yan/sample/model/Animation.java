package henu.yan.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "animation")
public class Animation {
    @Id
    private String id;
    private String douban;
    private String title;
    private String directors;
    private String casts;
    private String cover;
    private String cover_x;
    private String cover_y;
    private String rate;
    private String star;
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDouban() {
        return douban;
    }

    public void setDouban(String douban) {
        this.douban = douban;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getCasts() {
        return casts;
    }

    public void setCasts(String casts) {
        this.casts = casts;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCover_x() {
        return cover_x;
    }

    public void setCover_x(String cover_x) {
        this.cover_x = cover_x;
    }

    public String getCover_y() {
        return cover_y;
    }

    public void setCover_y(String cover_y) {
        this.cover_y = cover_y;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
