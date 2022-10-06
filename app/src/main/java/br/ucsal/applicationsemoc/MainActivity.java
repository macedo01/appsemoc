package br.ucsal.applicationsemoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
//        Toolbar toolbar = findViewById(R.id.toolbar);
        Toolbar toolbar = null;
        setSupportActionBar(toolbar);
//
        drawerLayout = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
                break;
            case R.id.nav_certificados:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CertificadosFragment()).commit();
                break;
            case R.id.nav_contatos:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ContatosFragment()).commit();
                break;
            case R.id.nav_cronograma:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CronogramaFragment()).commit();
                break;
            case R.id.nav_thematic_axis:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new EixosFragment()).commit();
                break;
            case R.id.nav_enroll:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new InscricaoFragment()).commit();
                break;
            case R.id.nav_schedule:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ProgramacaoFragment()).commit();
                break;
            case R.id.nav_project:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ProjectFragment()).commit();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}