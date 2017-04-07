package com.example.syed_bakhtiyar.recyclerviewpractice;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.UUID;

public class MainActivity extends SingleFragmentActivity {

    public static final String EXTRA_CRIME_ID =
            "com.example.android.RecyclerViewPractice.crime_id";
    public static Intent newIntent(Context packageContext, UUID crimeId) {
        Intent intent = new Intent(packageContext, MainActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        FragmentManager fm = getSupportFragmentManager();
//
//        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
//        if (fragment == null) {
//            fragment = new CrimeFragment();
//            fm.beginTransaction()
//                    .add(R.id.fragment_container, fragment)
//                    .commit();
//        }
//
//
//
//
//
//    }

    @Override
    protected Fragment createFragment() {
//        return new CrimeFragment();
        UUID crimeId = (UUID) getIntent()
                .getSerializableExtra(EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeId);
    }
}


//<android.support.v7.widget.RecyclerView
//        xmlns:android="http://schemas.android.com/apk/res/android"
//        xmlns:tools="http://schemas.android.com/tools"
//        android:id="@+id/recyclerView"
//        android:layout_width="match_parent"
//        android:layout_height="match_parent"
//        tools:context=".MainActivity"
//        />



//    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
//
//
//    ItemData itemsData[] = { new ItemData("Help",R.drawable.help),
//            new ItemData("Delete",R.drawable.content_discard),
//            new ItemData("Cloud",R.drawable.collections_cloud),
//            new ItemData("Favorite",R.drawable.rating_favorite),
//            new ItemData("Like",R.drawable.rating_good),
//            new ItemData("Rating",R.drawable.rating_important)};
//
//
//recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        MyAdapter mAdapter = new MyAdapter(itemsData, this);
//        recyclerView.setAdapter(mAdapter);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
