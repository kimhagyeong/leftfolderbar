package com.example.testtesttest;

<<<<<<< HEAD
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
=======
import android.os.Bundle;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;
>>>>>>> 622c6346bdad7803d22ead8550ca2930e05204ac
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
<<<<<<< HEAD
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.RequiresApi;
=======
import androidx.annotation.IdRes;
>>>>>>> 622c6346bdad7803d22ead8550ca2930e05204ac
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
<<<<<<< HEAD

import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
=======
import android.view.Menu;
import android.view.MenuItem;
>>>>>>> 622c6346bdad7803d22ead8550ca2930e05204ac
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class MainActivity extends AppCompatActivity {
    RecyclerView gridImage;
    ArrayList<String> imageBitmapList = new ArrayList<>();
    GridImageAdapter gridAdapter;
    File loadPath;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ///////툴바랑 하단메뉴바 설정중
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //툴바 액티비티 이름대로 사용안할때
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //이름은 이렇게 바꿔요
        toolbar.setTitle("tt");

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);

<<<<<<< HEAD
        gridImage = findViewById(R.id.gridImage_recycler) ;
        gridImage.setHasFixedSize(true);
        gridImage.setLayoutManager(new GridLayoutManager(this, 3)) ;
        gridAdapter = new GridImageAdapter(imageBitmapList, this) ;
        gridImage.setAdapter(gridAdapter) ;

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
=======
        // We're doing nothing with this listener here this time. Check example usage
        // from ThreeTabsActivity on how to use it.
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
>>>>>>> 622c6346bdad7803d22ead8550ca2930e05204ac
            @Override
            public void onTabSelected(@IdRes int tabId) {

            }
        });




        //Test용 객체 생성..
        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i<30; i++) {
            list.add(String.format("TEXT %d", i)) ;
        }


        // 리사이클러뷰에 LinearLayoutManager 객체 지정.
        RecyclerView sideBar = findViewById(R.id.sidebar_recycler) ;
        sideBar.setLayoutManager(new LinearLayoutManager(this)) ;

        // 리사이클러뷰에 SideImageAdapter 객체 지정.
        SideImageAdapter sideAdapter = new SideImageAdapter(list) ;
        sideBar.setAdapter(sideAdapter) ;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onResume() {
        super.onResume();
        imageBitmapList.clear();
        String sdPath = Environment.getExternalStorageDirectory().getAbsolutePath();
        loadPath = new File(sdPath+"/DCIM");
        for(File s:loadPath.listFiles()) {
            if(!s.isHidden())
                for(File k:s.listFiles())
                    imageBitmapList.add(k.getAbsolutePath());

        }
<<<<<<< HEAD
        imageBitmapList.sort(null);
        
=======
        RecyclerView gridImage = findViewById(R.id.gridImage_recycler) ;
        gridImage.setLayoutManager(new GridLayoutManager(this, 3)) ;

        // 리사이클러뷰에 SimpleTextAdapter 객체 지정.
        GridImageAdapter gridAdapter = new GridImageAdapter(imageBitmapList) ;
        gridImage.setAdapter(gridAdapter) ;


>>>>>>> 622c6346bdad7803d22ead8550ca2930e05204ac
    }

    //////////////////////////////////////////buttomlistenr


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuCompat.setGroupDividerEnabled(menu, true);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_accending_name) {
            
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            //이름은 이렇게 바꿔요
            toolbar.setTitle("ss");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
