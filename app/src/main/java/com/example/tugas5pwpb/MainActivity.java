package com.example.tugas5pwpb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView pokemon;
    private ArrayList<Pokemon> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pokemon = findViewById(R.id.speedshop);
        pokemon.setHasFixedSize(true);

        list.addAll(Pokemondata.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        pokemon.setLayoutManager(new LinearLayoutManager(this));
        List_pokemon_adapter listHeroAdapter = new List_pokemon_adapter(list);
        pokemon.setAdapter(listHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void showRecylerCardView() {
        pokemon.setLayoutManager(new LinearLayoutManager(this));
        CardView_pokemon_adapter cardViewHeroAdapter = new CardView_pokemon_adapter(list);
        pokemon.setAdapter(cardViewHeroAdapter);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_cardview:
                showRecylerCardView();
                break;
        }
    }
}
