package com.example.android.newsapp;

public class Article {

    private String mSection;

    private String mTitle;

    private String mPublicationDate;

    private String mUrl;

    private String mAuthorName;

    public Article(String section, String title, String publicationDate, String url, String authorName) {
        mSection = section;
        mTitle = title;
        mPublicationDate = publicationDate;
        mUrl = url;
        mAuthorName = authorName;
    }

    public String getSection() {
        return mSection;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getPublicationDate() {
        return mPublicationDate;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getAuthorName () {return mAuthorName; }
}
