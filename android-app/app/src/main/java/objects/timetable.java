package objects;

import java.util.ArrayList;
import java.util.Dictionary;

public class timetable {
    private ArrayList<Integer> workoutDays;
    //From 0 to 6
    private Dictionary<Integer,ArrayList<Integer>> dailyWorkout;
    //The key is the day of the week, the value the list of exercises (ids) to do that particular day
}
