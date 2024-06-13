package com.example.a10thexp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {
    public DBHandler(Context context)
    {
        super(context,"coursedb",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query="create table mycourses (id integer primary key autoincrement,name text,duration text,description text,tracks text)";
        db.execSQL(query);
    }
    public void addNewCourse(String cname,String ctime,String cdes,String ctracks)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues v=new ContentValues();
        v.put("name",cname);
        v.put("duration",ctime);
        v.put("description",cdes);
        v.put("tracks",ctracks);
        db.insert("mycourses",null,v);
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists mycourses");
        onCreate(db);
    }
}
