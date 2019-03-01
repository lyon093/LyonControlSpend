package com.example.lyoncontrolspend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lyoncontrolspend.Gasto.Gasto;
import com.example.lyoncontrolspend.GastoDao.GastoDao;
import com.example.lyoncontrolspend.GastoHelper.GastoHelper;

public class AdicionarGastosActivity extends AppCompatActivity {

    private Button btnAdicionarGasto;
    private GastoDao gastoDao;
    private GastoHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_gastos);

        btnAdicionarGasto = findViewById(R.id.btnAdicionarGasto);
        helper = new GastoHelper(this);
        gastoDao = new GastoDao(this);

        btnAdicionarGasto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gasto gasto = helper.getGasto();
                if (gastoDao.inserir(gasto)==1){
                    Toast.makeText(AdicionarGastosActivity.this,
                            "Não Foi Adicionado Com Sucesso!", Toast.LENGTH_LONG);
                }else{
                    finish();
                }
            }
        });

    }
}