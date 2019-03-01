package com.example.lyoncontrolspend;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.lyoncontrolspend.Gasto.Gasto;
import com.example.lyoncontrolspend.GastoDao.GastoDao;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton faddGastos;
    private ListView listViewGastos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewGastos = findViewById(R.id.listViewGastos);
        faddGastos = findViewById(R.id.faddGastos);

        faddGastos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdicionarGastosActivity.class);
                startActivity(intent);
            }
        });

        listViewGastos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();

   //     GastoDao gastoDao = new GastoDao(this);
     //   List<Gasto> gasto = gastoDao.listaTodosGastos();

     //   ArrayAdapter<Gasto> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, gasto);

       // listViewGastos.setAdapter(adapter);
    }
}


