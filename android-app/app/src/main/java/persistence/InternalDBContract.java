package persistence;

import android.provider.BaseColumns;

public final class InternalDBContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private InternalDBContract() {}

    /* Inner class that defines the table contents */
    public static class Exercise implements BaseColumns {
        public static final String TABLE_NAME = "Exercise";
        public static final String COLUMN_NAME_EXERCISE_ID = "exercise_id";
        public static final String COLUMN_NAME_EXERCISE_NAME = "exercise_name";
        public static final String COLUMN_NAME_UNITS_ID = "units_id";
    }

    public static class Exercise_in_timetable implements BaseColumns {
        public static final String TABLE_NAME = "Exercise_in_timetable";
        public static final String COLUMN_NAME_TIMETABLE_ID = "timetable_id";
        public static final String COLUMN_NAME_DAY_OF_WEEK = "day_of_week";
        public static final String COLUMN_NAME_EXERCISE_ID = "exercise_id";
    }

    public static class GYMUser implements BaseColumns {
        public static final String TABLE_NAME = "GYMUser";
        public static final String COLUMN_NAME_USER_ID = "user_id";
        public static final String COLUMN_NAME_EMAIL = "email";
        public static final String COLUMN_NAME_STATUS = "status";
        public static final String COLUMN_NAME_FIRSTNAME = "firstname";
        public static final String COLUMN_NAME_LASTNAME = "lastname";
    }

    public static class Units implements BaseColumns {
        public static final String TABLE_NAME = "Units";
        public static final String COLUMN_NAME_UNITS_ID = "units_id";
        public static final String COLUMN_NAME_SHORT_NAME = "short_name";
        public static final String COLUMN_NAME_LONG_NAME = "long_name";
    }

    public static class Timetable implements BaseColumns {
        public static final String TABLE_NAME = "Timetable";
        public static final String COLUMN_NAME_TIMETABLE_ID = "timetable_id";
        public static final String COLUMN_NAME_USER_ID = "user_id";
        public static final String COLUMN_NAME_TIMETABLE_NAME = "timetable_name";
    }

    public static class Series implements BaseColumns {
        public static final String TABLE_NAME = "Series";
        public static final String COLUMN_NAME_SERIES_ID = "series_id";
        public static final String COLUMN_NAME_USER_ID = "user_id";
        public static final String COLUMN_NAME_WORKOUT_DATETIME = "workout_datetime";
        public static final String COLUMN_NAME_EXERCISE_ID = "exercise_id";
        public static final String COLUMN_NAME_REPETITIONS = "repetitions";
        public static final String COLUMN_NAME_MEASURE = "measure";
    }
}