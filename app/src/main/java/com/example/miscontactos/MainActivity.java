package com.example.miscontactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> contactos;
    private RecyclerView listaContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        /*Toolbar miActionBar = findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);*/

        listaContactos = findViewById(R.id.rvContactos);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        //GridLayoutManager glm = new GridLayoutManager(this, 2);

        listaContactos.setLayoutManager(llm);
        incializarListaContactos();
        inicilizarAdapter();

        /*
        ListView lstContactos = findViewById(R.id.lstContactos);
        lstContactos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombresContacto));

        lstContactos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetalleContacto.class);
                intent.putExtra(getResources().getString(R.string.pnombre), contactos.get(i).getNombre());
                intent.putExtra(getResources().getString(R.string.ptelefono), contactos.get(i).getTelefono());
                intent.putExtra(getResources().getString(R.string.pemail), contactos.get(i).getEmail());
                startActivity(intent);
                finish();
            }
        });
        */
    }

    public void incializarListaContactos(){
        contactos = new ArrayList<Contacto>();

        contactos.add(new Contacto("Alexeis", "1111111111", "alex@gmail.com", R.drawable.computadora_1));
        contactos.add(new Contacto("Carlos", "2222222222", "carlos@gmail.com", R.drawable.comp2));
        contactos.add(new Contacto("Aly", "3333333333", "aly@gmail.com", R.drawable.comp3));
        contactos.add(new Contacto("Pedro", "4444444444", "pedro@gmail.com",R.drawable.comp4));
    }

    public void inicilizarAdapter() {
        ContactoAdapter adapter = new ContactoAdapter(contactos, this);
        listaContactos.setAdapter(adapter);
    }
}















