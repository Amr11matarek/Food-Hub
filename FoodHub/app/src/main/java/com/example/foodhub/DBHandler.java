package com.example.foodhub;

import android.content.ContentValues;
import android.content.Context;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    private static final String DB_NAME = "SingUp";
    private static final int DB_VERSION = 1;
    private static final String TABLE_NAME = "mySingUP";
    private static final String ID_COL = "id";
    private static final String FIRST_NAME_COL = "firstName";
    private static final String PASSWORD_COL = "password";
    private static final String EMAIL_COL = "email";

    public DBHandler(Context context){
        super(context, DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE " +TABLE_NAME + "("
                +ID_COL+" INTEGER PRIMARY KEY AUTOINCREMENT,"
                +FIRST_NAME_COL+" TEXT,"
                +PASSWORD_COL+" TEXT,"
                +EMAIL_COL+" TEXT UNIQUE)";

        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }

    public Boolean addContact(String fullname, String password, String email) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(FIRST_NAME_COL,fullname);
        values.put(PASSWORD_COL,password);
        values.put(EMAIL_COL,email);
        long result = db.insert(TABLE_NAME,null,values);
        if (result==1) return true;
        else return false;

    }

    public Boolean checkemail (String email ) {

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM mySingUP WHERE email=? ", new String[]{email});

        if (cursor.getCount() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean checkemailpassoword (String email , String password) {

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM mySingUP WHERE email=? AND password=?", new String[]{email, password});

        if (cursor.getCount() > 0) {
            return true;
        } else {
            return false;
        }
    }

}
