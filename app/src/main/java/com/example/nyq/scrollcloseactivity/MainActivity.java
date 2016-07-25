package com.example.nyq.scrollcloseactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends Activity {


    private ListView lv1;
    private ListView lv2;
    private ListView lv3;
    ArrayList<String> al1 = new ArrayList<>();
    ArrayList<String> al2 = new ArrayList<>();
    ArrayList<String> al3 = new ArrayList<>();
    private ScrollView sv;
    private ArrayList<ListView> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < 30; i++) {

            al1.add("position" + i);
            al2.add("position" + i);
            al3.add("position" + i);


        }
        initView();


//        lv1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, al1));
//        lv2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2, al2));
//        lv3.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, al3));


        ListAdapter myAdapter1 = new MyBaseAdapter(al1, this);
        lv1.setAdapter(myAdapter1);


        ListAdapter myAdapter2 = new MyBaseAdapter(al2, this);
        lv2.setAdapter(myAdapter2);
        lv3.setAdapter(myAdapter2);

        for (ListView lv : al) {


            MyScrollListener myScrollListener = new MyScrollListener();
            lv.setOnScrollListener(myScrollListener);
        }

//        setListViewHeightBasedOnChildren(lv1);


    }


    private void initView() {
        lv1 = (ListView) findViewById(R.id.lv1);
        lv2 = (ListView) findViewById(R.id.lv2);
        lv3 = (ListView) findViewById(R.id.lv3);

        al = new ArrayList<>();

        al.add(lv1);
        al.add(lv2);
        al.add(lv3);

    }




    private class MyScrollListener implements AbsListView.OnScrollListener{
        @Override
        public void onScrollStateChanged(AbsListView view, int scrollState) {

        }

        @Override
        public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

        }
    }
}
