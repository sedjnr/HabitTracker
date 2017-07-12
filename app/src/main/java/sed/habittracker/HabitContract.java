package sed.habittracker;

import android.provider.BaseColumns;


public class HabitContract {

    public static abstract class HabitEntry implements BaseColumns{

    /* * * *
     * This abstract class is used to define the variables of the
     * table HabitHours which helps user log the amount of hours that
     * user does each task for the week.
     * * * */

    public static final String TABLE_NAME = "HabitHours";

    public static final String _ID = BaseColumns._ID;
    public static final String COLUMN_NAME = "Name";
    public static final String COLUMN_MONDAY = "M";
    public static final String COLUMN_TUESDAY = "TU";
    public static final String COLUMN_WEDNESDAY = "W";
    public static final String COLUMN_THURSDAY = "TH";
    public static final String COLUMN_FRIDAY = "F";
    public static final String COLUMN_SATURDAY = "SA";
    public static final String COLUMN_SUNDAY = "SU";
    }

}
