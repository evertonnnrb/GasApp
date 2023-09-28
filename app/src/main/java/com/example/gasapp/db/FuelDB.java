package com.example.gasapp.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class FuelDB extends SQLiteOpenHelper {

    public static final String DB_NAME = "fuel.db";
    public static final int DB_VERSION = 1;

    Cursor cursor;

    SQLiteDatabase sqLiteDatabase;

    public FuelDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        sqLiteDatabase = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlTableFuel = "CREATE TABLE fuel (id INTEGER PRIMARY KEY AUTOINCREMENT, typeFuel TEXT, valueFuel REAL, recomendation TEXT)";
        sqLiteDatabase.execSQL(sqlTableFuel);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
