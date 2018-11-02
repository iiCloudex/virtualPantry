package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.design.widget.TextInputEditText;

import java.util.UUID;

import database.PantryDBSchema.PantryTable;

public class PantryBaseHelper extends SQLiteOpenHelper
{
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "PantryDatabase.db";

    public PantryBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + PantryTable.NAME + "(" +
        " _id integer primary key autoincrement, " +
                PantryTable.Cols.UUID + ", " +
                PantryTable.Cols.TITLE + ")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}