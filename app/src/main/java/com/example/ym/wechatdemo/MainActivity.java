package com.example.ym.wechatdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentManagerNonConfig;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        /*

        HttpUtil.sendOkHttpRequest("http://guolin.tech/api/china",new okhttp3.Callback(){
            //  发送http请求到guolin.tech/api/china中

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String responseData = response.body().string();

                parseJSONWithGSON(responseData);
            }

            @Override
            public void onFailure(Call call, IOException e) {

            }
        });

        */







        NavigationView navigationView = (NavigationView)findViewById(R.id.navigation);
        
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {              //NavigationView的点击事件
                switch (item.getItemId()){
                    case R.id.message:
                        Toast.makeText(MainActivity.this, "message", Toast.LENGTH_SHORT).show();
                        
                        break;
                    case R.id.contacts:
                        //replaceFragment(new ConFrag());

                        break;
                    case R.id.user:
                       // replaceFragment(new UserFrag());

                        break;
                    case R.id.setting:
                        //replaceFragment(new SetFrag());

                        break;
                    case R.id.location:
                        Toast.makeText(MainActivity.this, "location", Toast.LENGTH_SHORT).show();

                        break;
                    default:
                        break;
                    
                    
                }
                return  true;
            }
        });
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        
        return true;
    }
    
    
    /*private  void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = null;
        fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main,fragment);
        transaction.commit();
    }

    private void parseJSONWithGSON(String jsonData){
        Gson gson = new Gson();
        List<City> cityList = gson.fromJson(jsonData,new TypeToken<List<City>>(){}.getType());
        for(City city:cityList){
            Log.e(TAG, "ID: " + city.getId());
            Log.e(TAG, "NAME: " + city.getCityName());
        }
    }*/









}
