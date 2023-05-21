package com.example.minimart;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;


public class header_activity_main extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.header_activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.home:
                    {
                        Toast.makeText(header_activity_main.this, "Home Selected", Toast.LENGTH_SHORT).show();
                        break;
                    }

                    case R.id.search:
                    {
                        Toast.makeText(header_activity_main.this, "Search Selected", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.voice:
                    {
                        Toast.makeText(header_activity_main.this, "Voice Selected", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.account:
                    {
                        Toast.makeText(header_activity_main.this, "Account Selected", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.promotion:
                    {
                        Toast.makeText(header_activity_main.this, "Promotion Selected", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.notification:
                    {
                        Toast.makeText(header_activity_main.this, "Notification Selected", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.contact:
                    {
                        Toast.makeText(header_activity_main.this, "Contact Selected", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.share:
                    {
                        Toast.makeText(header_activity_main.this, "Share Selected", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
                return false;
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer((GravityCompat.START));
        }
        else
        {
            super.onBackPressed();
        }
    }
}