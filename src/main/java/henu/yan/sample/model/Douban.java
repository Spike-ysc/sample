package henu.yan.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "douban")
public class Douban {
    @Id
    private String id;
    private String name;
    private String alias;
    private String actors;
    private String cover;
    private String directors;
    private double douban_score;
    private int douban_votes;
    private String genres;
    private String IMDB_id;
    private String languages;
    private double mins;
    private String official_site;
    private String regions;
    private String release_data;
    private String storyline;
    private String tags;
    private String year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public double getDouban_score() {
        return douban_score;
    }

    public void setDouban_score(double douban_score) {
        this.douban_score = douban_score;
    }

    public int getDouban_votes() {
        return douban_votes;
    }

    public void setDouban_votes(int douban_votes) {
        this.douban_votes = douban_votes;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getIMDB_id() {
        return IMDB_id;
    }

    public void setIMDB_id(String IMDB_id) {
        this.IMDB_id = IMDB_id;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public double getMins() {
        return mins;
    }

    public void setMins(double mins) {
        this.mins = mins;
    }

    public String getOfficial_site() {
        return official_site;
    }

    public void setOfficial_site(String official_site) {
        this.official_site = official_site;
    }

    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }

    public String getRelease_data() {
        return release_data;
    }

    public void setRelease_data(String release_data) {
        this.release_data = release_data;
    }

    public String getStoryline() {
        return storyline;
    }

    public void setStoryline(String storyline) {
        this.storyline = storyline;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
