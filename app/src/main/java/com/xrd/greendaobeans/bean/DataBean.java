package com.xrd.greendaobeans.bean;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Keep;

/**
 * Created by WJ on 2019/7/16.
 */
@Entity
public class DataBean {
    @Id(autoincrement = true)
    private Long id;
    private String title;
    @Convert(converter = MovieRatingConvert.class , columnType = String.class)
    private MovieRating rating;
    private String year;
    @Convert(converter = MovieImagesConvert.class , columnType = String.class)
    private MovieImages images;
//    private String alt;
    private String mobile_url;
    private String share_url;
    private String schedule_url;
    private String collect_count;
    private String comments_count;
    private String ratings_count;
    private String original_title;
    private String summary;
    private String time;
    @Convert(converter = StringConvert.class , columnType = String.class)
    private List<String> countries;
    @Convert(converter = StringConvert.class , columnType = String.class)
    private List<String> genres;
    @Convert(converter = StringConvert.class , columnType = String.class)
    private List<String> aka;
    @Convert(converter = MovieCastsConvert.class , columnType = String.class)
    private List<MovieCasts> casts;
    @Convert(converter = MovieCastsConvert.class , columnType = String.class)
    private List<MovieCasts> directors;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<MovieCasts> getDirectors() {
        return this.directors;
    }
    public void setDirectors(List<MovieCasts> directors) {
        this.directors = directors;
    }
    public List<MovieCasts> getCasts() {
        return this.casts;
    }
    public void setCasts(List<MovieCasts> casts) {
        this.casts = casts;
    }
    public String getSummary() {
        return this.summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getOriginal_title() {
        return this.original_title;
    }
    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }
    public String getRatings_count() {
        return this.ratings_count;
    }
    public void setRatings_count(String ratings_count) {
        this.ratings_count = ratings_count;
    }
    public String getComments_count() {
        return this.comments_count;
    }
    public void setComments_count(String comments_count) {
        this.comments_count = comments_count;
    }
    public String getCollect_count() {
        return this.collect_count;
    }
    public void setCollect_count(String collect_count) {
        this.collect_count = collect_count;
    }
    public String getSchedule_url() {
        return this.schedule_url;
    }
    public void setSchedule_url(String schedule_url) {
        this.schedule_url = schedule_url;
    }
    public String getShare_url() {
        return this.share_url;
    }
    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }
    public String getMobile_url() {
        return this.mobile_url;
    }
    public void setMobile_url(String mobile_url) {
        this.mobile_url = mobile_url;
    }
  /*  public String getAlt() {
        return this.alt;
    }
    public void setAlt(String alt) {
        this.alt = alt;
    }*/
    public String getYear() {
        return this.year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public MovieRating getRating() {
        return this.rating;
    }
    public void setRating(MovieRating rating) {
        this.rating = rating;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public List<String> getAka() {
        return this.aka;
    }
    public void setAka(List<String> aka) {
        this.aka = aka;
    }
    public List<String> getGenres() {
        return this.genres;
    }
    public void setGenres(List<String> genres) {
        this.genres = genres;
    }
    public List<String> getCountries() {
        return this.countries;
    }
    public void setCountries(List<String> countries) {
        this.countries = countries;
    }
    public MovieImages getImages() {
        return this.images;
    }
    public void setImages(MovieImages images) {
        this.images = images;
    }
//    @Generated(hash = 1883303216)
    @Keep
    public DataBean(Long id, String title, MovieRating rating, String year,
            MovieImages images, /*String alt,*/ String mobile_url, String share_url,
            String schedule_url, String collect_count, String comments_count,
            String ratings_count, String original_title, String summary,
            String time, List<String> countries, List<String> genres,
            List<String> aka, List<MovieCasts> casts, List<MovieCasts> directors) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.year = year;
        this.images = images;
//        this.alt = alt;
        this.mobile_url = mobile_url;
        this.share_url = share_url;
        this.schedule_url = schedule_url;
        this.collect_count = collect_count;
        this.comments_count = comments_count;
        this.ratings_count = ratings_count;
        this.original_title = original_title;
        this.summary = summary;
        this.time = time;
        this.countries = countries;
        this.genres = genres;
        this.aka = aka;
        this.casts = casts;
        this.directors = directors;
    }

    @Generated(hash = 908697775)
    public DataBean() {
    }
}
