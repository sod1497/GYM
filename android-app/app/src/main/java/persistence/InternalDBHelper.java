package persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import persistence.InternalDBContract.*;

public class InternalDBHelper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "InternalDB.db";

    public InternalDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_EXERCISE_TABLE);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_EXERCISE_TABLE);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    //---------------------------------------------------------------------------
    // TODO add for each table these methods to create and delete the tables from the SQLite DB
    private static final String SQL_CREATE_EXERCISE_TABLE =
            "CREATE TABLE " + Exercise.TABLE_NAME + " (" +
                    Exercise.COLUMN_NAME_EXERCISE_ID + " TEXT," +
                    Exercise.COLUMN_NAME_EXERCISE_NAME + " TEXT," +
                    Exercise.COLUMN_NAME_UNITS_ID + " TEXT)";

    private static final String SQL_DELETE_EXERCISE_TABLE =
            "DROP TABLE IF EXISTS " + Exercise.TABLE_NAME;
}
