package com.example.minimart;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.minimart.adapter.CategoryAdapter;
import com.example.minimart.adapter.ProductAdapter;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;
    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);

        recyclerView = findViewById(R.id.rcv);
        productAdapter= new ProductAdapter(this);
        categoryAdapter = new CategoryAdapter(this);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(gridLayoutManager);

        productAdapter.setData(getListProduct());
        categoryAdapter.setData(getListCategory());
        recyclerView.setAdapter(productAdapter);
    }
    //    call from api
    private List<Product> getListProduct() {
        List<Product> list = new ArrayList<>();
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));

        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));
        list.add(new Product(R.drawable.img, "produc1"));

        return list;

    }
    private List<Category> getListCategory() {
        List<Category> list = new ArrayList<>();
        list.add(new Category( "produc1"));
        list.add(new Category( "produc1"));
        list.add(new Category( "produc1"));
        list.add(new Category( "produc1"));
        list.add(new Category( "produc1"));
        list.add(new Category( "produc1"));
        list.add(new Category( "produc1"));
        list.add(new Category( "produc1"));
        list.add(new Category( "produc1"));
        list.add(new Category( "produc1"));
        list.add(new Category( "produc1"));

        return list;

    }
}