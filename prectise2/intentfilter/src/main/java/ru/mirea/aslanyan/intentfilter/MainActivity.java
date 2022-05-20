package ru.mirea.aslanyan.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import ru.mirea.aslanyan.intentfilter.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onShareButtonClick(android.view.View view) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "MIREA");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "АСЛАНЯН ДАВИД АРТАКОВИЧ");
        startActivity(Intent.createChooser(shareIntent, "МОИ ФИО"));
    }

    public void onBrowserButtonClick(android.view.View view) {
        // Open the aipserver.ru site through the browser
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://aipserver.ru"));
        startActivity(browserIntent);
    }


}