package fr.sio.gsb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.strictmode.SqliteObjectLeakedViolation;


public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context) {
        super(context, "Login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table user(nom text primary key,password text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists user");

    }
    //insert dans la dataBase
    public boolean insert(String nom, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("nom", nom);
        contentValues.put("password", password);
        long ins = db.insert("user",null,contentValues);
        if (ins ==-1) return false;
        else return true;
    }
    //regarde si le nom n'est pas utilisé dans la base de donnée
    public Boolean NomValide(String nom){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select*from user where nom=?", new String[]{(nom)});
       if(cursor.getCount()>0) return false;
       else return true;
    }
    // Nom et mot de passe valide
    public Boolean nomPsw(String nom, String password){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from user where nom=? and password=?",new String[]{nom,password});
        if(cursor.getCount()>0) return true;
        else return false;
    }
}
