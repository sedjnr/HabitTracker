package sed.habittracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sed.habittracker.HabitContract.HabitEntry;

import static android.os.Build.VERSION_CODES.N;

public class HabitActivity extends AppCompatActivity {

    HabitDBHelper mDBhelper = new HabitDBHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habit);
    }

    @Override
    protected void onStart(){
        super.onStart();
        getDatabaseInfo();
        insertHabit();
        getDatabaseInfo();
    }
    private void getDatabaseInfo(){

        // Defines an SQLite database object that performs a query to get all data from
        // HabitEntry table
        SQLiteDatabase db = mDBhelper.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM " + HabitEntry.TABLE_NAME, null);
        cursor.close();
    }
    private void insertHabit() {

        // Defines an SQLite database object that enables writing to database
        SQLiteDatabase db =  mDBhelper.getWritableDatabase();

        // Creates content values object that holds values for entry
        ContentValues contentValues = new ContentValues();

        contentValues.put(HabitEntry.COLUMN_NAME,"Dance");
        contentValues.put(HabitEntry.COLUMN_MONDAY,2);
        contentValues.put(HabitEntry.COLUMN_TUESDAY,0);
        contentValues.put(HabitEntry.COLUMN_WEDNESDAY,1);
        contentValues.put(HabitEntry.COLUMN_THURSDAY,8);
        contentValues.put(HabitEntry.COLUMN_FRIDAY,0);
        contentValues.put(HabitEntry.COLUMN_SATURDAY,0);
        contentValues.put(HabitEntry.COLUMN_SUNDAY,0);

        db.insert(HabitEntry.TABLE_NAME,null,contentValues);
    }

}
