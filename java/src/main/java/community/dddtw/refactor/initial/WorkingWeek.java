package community.dddtw.refactor.initial;

import java.util.ArrayList;
import java.util.Arrays;

public class WorkingWeek {

    public int[] workHours;

    public WorkingWeek(int[] workHours) {
        this.workHours = workHours;
    }

    private int getDoubleWorkHours(int day) {
        // SOLID wednesday
        if (day==3)
            return 2;
        return 1;
    }

    public int overtimeHours() {
        int hourCounter = 0;
        ArrayList<Integer> workDays = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        for (int i = 0; i < this.workHours.length; i++) {
            int workDay = i;
            int workHour = this.workHours[i] * getDoubleWorkHours(i);

            if (workDays.contains(workDay)) {
                hourCounter += Math.max(workHour - 8, 0);
            } else {
                hourCounter += workHour;
            }
        }
        return hourCounter;
    }

    public int regularHours() {
        int hourCounter = 0;
        for (int i = 0; i < this.workHours.length; i++) {
            int workHour = this.workHours[i] * getDoubleWorkHours(i);
            if (i == 0 || i == 6) {
                continue;
            }
            hourCounter += Math.min(workHour, 8);
        }
        return hourCounter;
    }
}
