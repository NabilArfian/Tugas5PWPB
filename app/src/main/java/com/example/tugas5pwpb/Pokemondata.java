package com.example.tugas5pwpb;

import java.util.ArrayList;

public class Pokemondata {
    public static String[][] data = new String[][]{
            {"Dragonite","Dragon / Flying", "Dragonite is a Dragon/Flying type Pokémon introduced in Generation 1. It is known as the Dragon Pokémon.", "https://img.pokemondb.net/artwork/dragonite.jpg"},
            {"Arceus","Normal", "Arceus is a Normal type Pokémon introduced in Generation 4. It is known as the Alpha Pokémon.", "https://img.pokemondb.net/artwork/arceus.jpg"},
            {"Giratina", "Ghost / Dragon","Giratina is a Ghost/Dragon type Pokémon introduced in Generation 4. It is known as the Renegade Pokémon.", "https://img.pokemondb.net/artwork/giratina-altered.jpg"},
            {"Kyogre", "Water","Kyogre is a Water type Pokémon introduced in Generation 3. It is known as the Sea Basin Pokémon. ", "https://img.pokemondb.net/artwork/kyogre-primal.jpg"},
            {"Nidoking", "Poison / Ground","Nidoking is a Poison/Ground type Pokémon introduced in Generation 1. It is known as the Drill Pokémon. ", "https://img.pokemondb.net/artwork/nidoking.jpg"},
            {"Golem", "Rock / Ground","Golem is a Rock/Ground type Pokémon introduced in Generation 1. It is known as the Megaton Pokémon.", "https://img.pokemondb.net/artwork/golem.jpg"},
            {"Zapdos", "Electric","Zapdos is an Electric/Flying type Pokémon introduced in Generation 1. It is known as the Electric Pokémon.", "https://img.pokemondb.net/artwork/zapdos.jpg"},

    };

    public static ArrayList<Pokemon> getListData(){
        ArrayList<Pokemon> list = new ArrayList<>();
        for (String[] adata: data){
            Pokemon pokemon = new Pokemon();
            pokemon.setName(adata[0]);
            pokemon.setFrom(adata[2]);
            pokemon.setPhoto(adata[3]);
            list.add(pokemon);
        }
        return list;
    }
}
