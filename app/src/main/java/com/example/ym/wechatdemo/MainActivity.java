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
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = (NavigationView)findViewById(R.id.navigation);
        
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.message:
                        Toast.makeText(MainActivity.this, "message", Toast.LENGTH_SHORT).show();
                        
                        break;
                    case R.id.contacts:
                        replaceFragment(new ConFrag());

                        break;
                    case R.id.user:
                        replaceFragment(new UserFrag());

                        break;
                    case R.id.setting:
                        replaceFragment(new SetFrag());

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
    
    
    private  void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = null;
        fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main,fragment);
        transaction.commit();
    }
}
