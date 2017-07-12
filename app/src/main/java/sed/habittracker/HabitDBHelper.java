package sed.habittracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import sed.habittracker.HabitContract.HabitEntry;


public class HabitDBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "HabitTracker.db";
    public static final int DATABASE_VERSION = 1;

    public HabitDBHelper (Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    // The onCreate method defines a SQLite database variable db
    @Override
    public void onCreate(SQLiteDatabase db) {
        // The string used to create SQL database
        String SQL_CREATE_HABIT_TABLE = "CREATE TABLE " + HabitEntry.TABLE_NAME + "(" +
                HabitEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                HabitEntry.COLUMN_NAME + " TEXT, " +
                HabitEntry.COLUMN_MONDAY + " INTEGER, " +
                HabitEntry.COLUMN_TUESDAY + " INTEGER, " +
                HabitEntry.COLUMN_WEDNESDAY + " INTEGER, " +
                HabitEntry.COLUMN_THURSDAY + " INTEGER, " +
                HabitEntry.COLUMN_FRIDAY + " INTEGER, " +
                HabitEntry.COLUMN_SATURDAY + " INTEGER, " +
                HabitEntry.COLUMN_SUNDAY + " INTEGER);";

        db.execSQL(SQL_CREATE_HABIT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
