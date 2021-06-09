package com.example.apilikasi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
//digunakan untuk membuat DataHelper dengan mewarisi kelas SQLiteOpenHelper
public class DataHelper extends SQLiteOpenHelper {
    //untuk mendefinisikan nama dari databse
    private static final String DATABASE_NAME ="biodatadiri.db";
    //untuk mendefinisakan versi dari database
    private static final int DATABASE_VERSION = 1;
    //untuk memberikan context pada class DataHelper
    public DataHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION );
    }

    @Override
    //untuk membuat fungsi onCreate yang berguna dalam pembuatan tabel serta pemasukan data kedalam database
    public void onCreate(SQLiteDatabase db) {
        //untuk membuat tabel dari database
        String sql = "Create table biodata(no integer primary key, nama text null, tgl text null, jk text null, alamat text null);";
        //berguna untuk melihat log
        Log.d("Data", "onCreate: " + sql);
        //berguna untuk menyimpan dan menggunakan database
        db.execSQL(sql);
        //berguna untuk memasukkan data kedalam databse
        sql = "INSERT INTO biodata(no, nama, tgl, jk, alamat) VALUES ('1', 'Darsiwan', '1996-07-12', 'Laki-Laki', 'Indramayu');";
        //berguna untuk menyimpan dan menggunakan database
        db.execSQL(sql);
    }

    @Override
    //berguna untuk membuat fungsi onUpgarede
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){

    }
}