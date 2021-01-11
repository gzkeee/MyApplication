package com.example.myapplication123;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHelper extends SQLiteOpenHelper {
    public static final String CREATE_PATIENT = "create table Patient(" +
            "id integer primary key autoincrement," +
            "name text," +
            "age integer," +
            "sex text," +
            "doctor text)";
    private Context mcontext;

    public MyDBHelper(Context context, String name,
                      SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);
        mcontext = context;

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_PATIENT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
