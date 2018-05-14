package com.example.android.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

public class ArticleLoader extends AsyncTaskLoader<List<Article>> {
    private static final String LOG_TAG = ArticleLoader.class.getName();
    private String mUrl;

    public ArticleLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
        Log.i(LOG_TAG, "TEST: Start loading");
    }

    @Override
    public List<Article> loadInBackground() {
        Log.i(LOG_TAG, "TEST: Loading in progress");
        if (mUrl == null) {
            return null;
        }

        List<Article> articles = QueryUtils.fetchNewsData(mUrl);
        return articles;
    }

}
