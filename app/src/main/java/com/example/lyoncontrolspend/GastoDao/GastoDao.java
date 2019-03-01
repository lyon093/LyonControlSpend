package com.example.lyoncontrolspend.GastoDao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.lyoncontrolspend.Gasto.Gasto;

import java.util.ArrayList;
import java.util.List;

public class GastoDao extends SQLiteOpenHelper {


    public GastoDao(Context context) {
        super(context, "Lista", null, 1);


    }
    public long inserir(Gasto gasto) {
        ContentValues dados = new ContentValues();
        dados.put("descrição",gasto.getDescricao());
        dados.put("data",gasto.getData());
        dados.put("valor",gasto.getValor());
        dados.put("categoria",gasto.getCategoria());
        SQLiteDatabase db = getWritableDatabase();
        return db.insert("gastos",null,dados);
    }

    public List<Gasto>listaTodosGastos(){
        SQLiteDatabase db = getReadableDatabase();
        String sql = "Select * FROM Gastos";
        Cursor cursor = db.rawQuery(sql,null);
        List<Gasto> listaGastos = new ArrayList<>();
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table gastos("+
                "idGasto INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "descricao text not null,"+
                "categoria text not null,"+
                "data text not null"+
                "valor decimal not null)";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}


