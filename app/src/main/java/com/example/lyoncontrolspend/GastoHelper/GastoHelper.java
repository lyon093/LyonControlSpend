package com.example.lyoncontrolspend.GastoHelper;

import android.app.Activity;
import android.widget.EditText;

import com.example.lyoncontrolspend.AdicionarGastosActivity;
import com.example.lyoncontrolspend.MainActivity;

public class GastoHelper {

    private EditText editDescricao;
    private EditText editData;
    private EditText editValor;
    private EditText editCategoria;

    public GastoHelper(AdicionarGastosActivity activity) {carregaCampos(activity);}

    public GastoHelper(MainActivity activity) {carregaCampos(activity);}

    private void carregaCampos(Activity activity){

        editDescricao = activity.findViewById(R.id.editDescricao);
        editData = activity.findViewById(R.id.editdata);
        editValor = activity.findViewById(R.id.editValor);
        editCategoria = activity.findViewById(R.id.editCategoria);

    }

    public Gasto getGasto(){
        String descricao = editDescricao.getText().toString();
        String categoria = editCategoria.getText().toString();
        String data = editData.getText().toString();
        double valor = editValor.getValue();

        return new Gasto(descricao,categoria,data,valor);
    }
}
