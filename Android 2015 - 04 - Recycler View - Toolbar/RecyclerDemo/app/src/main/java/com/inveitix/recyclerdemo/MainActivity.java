package com.inveitix.recyclerdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements
        PostAdapter.OnPostClickedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<Post> posts = generatePosts();

        final RecyclerView recView = (RecyclerView) findViewById(R.id.rec_view);
        recView.setLayoutManager(new LinearLayoutManager(this));
        final PostAdapter adapter = new PostAdapter(posts, this);

        recView.setAdapter(adapter);

        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.addPost(new Post(R.drawable.cat1, "This is new"));
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    private List<Post> generatePosts() {
        int[] cats = new int[]{
                R.drawable.cat1,
                R.drawable.cat2,
                R.drawable.cat3,
                R.drawable.cat4,
                R.drawable.cat5
        };

        List<Post> posts = new ArrayList<>();
        int numPosts = new Random().nextInt(400) + 30;
        for (int i = 0; i < numPosts; i++) {
            Post post = new Post(cats[i % cats.length],
                    "Random cat No." + (i + 1));
            post.setRating(new Random().nextInt(5));
            posts.add(post);
        }

        return posts;
    }

    @Override
    public void onPostClicked(String postTitle) {
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://google.com/search?q=" + postTitle));
        startActivity(i);
    }
}
