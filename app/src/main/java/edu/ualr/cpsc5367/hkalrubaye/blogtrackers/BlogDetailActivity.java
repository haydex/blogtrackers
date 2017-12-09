package edu.ualr.cpsc5367.hkalrubaye.blogtrackers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/**
 * Created by haydex on 12/8/17.
 */

public class BlogDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        if (savedInstanceState == null) {

            Bundle arguments = new Bundle();
            arguments.putString(BlogDetailFragment.ARG_ITEM_ID,
                    getIntent().getStringExtra(BlogDetailFragment.ARG_ITEM_ID));
            BlogDetailFragment fragment = new BlogDetailFragment();
            fragment.setArguments(arguments);
            /*getSupportFragmentManager().beginTransaction()
                    .add(R.id.item_detail_container, fragment)
                    .commit();*/
        }
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();
            if (id == android.R.id.home) {

            NavUtils.navigateUpTo(this, new Intent(this, MainActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
