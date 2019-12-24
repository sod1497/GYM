package com.example.sod14.gym;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import persistence.InternalDBContract.*;

import persistence.InternalDBContract;
import persistence.InternalDBHelper;

public class Dashboard extends AppCompatActivity {

    private InternalDBHelper dbHelper = new InternalDBHelper(this.getApplicationContext());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    // TODO finish this method for testing the DB
    protected void buttonClicHandler(){
        // Gets the data repository in write mode
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        //values.put(Exercise.COLUMN_NAME_TITLE, title);
        //values.put(Exercise.COLUMN_NAME_SUBTITLE, subtitle);

        // Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(Exercise.TABLE_NAME, null, values);
    }
}
