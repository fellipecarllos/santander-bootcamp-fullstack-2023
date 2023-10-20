package com.dio.santanderbootcampfullstack2023.domain.model;
import java.util.List;

public class User {
    
    private long id;
    private String name;
    private Account account;
    private Card card;
    private List<Feature> freatures;
    private List<News> news;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
    public List<Feature> getFreatures() {
        return freatures;
    }
    public void setFreatures(List<Feature> freatures) {
        this.freatures = freatures;
    }
    public List<News> getNews() {
        return news;
    }
    public void setNews(List<News> news) {
        this.news = news;
    }



}
