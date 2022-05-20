package ru.mirea.aslanyan.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.mirea.aslanyan.multiactivity.R;

public class MultiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);
    }

    public void onClickNewActivity(android.view.View view) {
        android.content.Intent intent = new android.content.Intent(this, SecondActivity.class);
        intent.putExtra("key", "АСЛАНЯН ДАВИД АРТАКОВИЧ");
        startActivity(intent);
    }
}