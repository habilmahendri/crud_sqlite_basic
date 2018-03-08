package com.example.mydeveloper.biodatamahasiswa;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;
import android.util.Log;

/**
 * Created by MyDeveloper on 3/6/2018.
 */

public class DataHelper extends SQLiteOpenHelper {
    //Deklarasi untuk nama databasenya dan version databasenya
    private static final String DATABASE_NAME = " biodatadiri.db";
    private static final int DATABASE_VERSION = 1;

    //Ngebuat Konstruktor untuk datahelpernya, harus sama dengan nama Class
    public DataHelper(Context context){
        //Memanggil database name dan version
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        //Ngebuat Atribut Database
        String sql = "create table biodata(no integer primary key, nama text null, tgl text null, jk text null, alamat text null);";
        Log.d("Data","onCreate: "+sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1,int arg2){

    }
}
