package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CatalogosActivity extends AppCompatActivity {

    RecyclerView idRecCatalogo;
    List<Bike> listabikes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalogos_layout);

        idRecCatalogo = findViewById(R.id.idRecCatalogo);
        listabikes = new ArrayList<>();
        //Lista das bicicletas

        listabikes.add(
                new Bike(
                        "Bike Classica", "2.500,00", "50", R.drawable.bike_classica)
        );
        listabikes.add(
                new Bike(
                        "Bike adviatica", "5.500,00", "12", R.drawable.bike_adviatica)
        );
        listabikes.add(
                new Bike(
                        "Bike Bags", "2.500,00", "50", R.drawable.bike_bags)
        );
        listabikes.add(
                new Bike(
                        "Bike  Eletrica", "15.500,00", "5", R.drawable.bike_eletrica)
        );
        listabikes.add(
                new Bike(
                        "bike  Gece", "5.600,00", "50", R.drawable.bike_gece)
        );
        listabikes.add(
                new Bike(
                        "Bike Henk", "3.000,45", "10", R.drawable.bike_henk)
        );
        listabikes.add(
                new Bike(
                        "bike Passion", "7.500,00", "150", R.drawable.bike_passion)
        );
        listabikes.add(
                new Bike(
                        "bike Severino", "500,00", "450", R.drawable.bike_severino)
        );
        listabikes.add(
                new Bike(
                        "bike verde", "1.500,00", "100", R.drawable.bike_verde_menta)
        );
        listabikes.add(
                new Bike(
                        " Bike sped", "2.500,00", "50", R.drawable.bicke_check)
        );


        //Instanciar a classe adaptadora

        MyAdapterBike adapterBike = new MyAdapterBike(getApplicationContext(), listabikes);


        //definiçao do tipo de layaout para grid
        idRecCatalogo.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));


        //Definir o tipo de gerenciador de layout

        //deixando lista mais flexivel
        idRecCatalogo.setHasFixedSize(true);

        idRecCatalogo.setAdapter(adapterBike);


    }
}