package com.example.android.newsapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArticleAdapter extends ArrayAdapter<Article> {

    private static final String LOG_TAG = ArticleAdapter.class.getSimpleName();

    public ArticleAdapter(Activity context, ArrayList<Article> articles) {
        super(context, 0, articles);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Article currentArticle = getItem(position);

        TextView sectionView = (TextView) listItemView.findViewById(R.id.article_section);
        sectionView.setText(currentArticle.getSection());

        TextView authorNameView = (TextView) listItemView.findViewById(R.id.article_author);
        authorNameView.setText(currentArticle.getAuthorName());

        TextView articleTitleView = (TextView) listItemView.findViewById(R.id.article_title);
        articleTitleView.setText(currentArticle.getTitle());

        String publicationDate = currentArticle.getPublicationDate();
        publicationDate = publicationDate.replace("Z", "");
        String[] separated = publicationDate.split("T");
        String date = separated[0];
        String time = separated[1];

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(date);

        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        timeView.setText(time);

        return listItemView;
    }
}
