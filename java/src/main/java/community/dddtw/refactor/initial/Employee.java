package community.dddtw.refactor.initial;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {

    public String name;

    private PayCalculator payCalculator;
    private HourReporter hourReporter;
    private WorkingWeek workingWeek;

    public Employee(String name, int[] workHours) {
        if (workHours.length != 7) {
            throw new IllegalArgumentException("應該要有一週的工時資料");
        }
        for (int workHour : workHours) {
            if (workHour < 0 || workHour > 16) {
                throw new IllegalArgumentException("工時資料應該為 0 - 16 的數字");
            }
        }

        this.name = name;

        workingWeek = new WorkingWeek(workHours);
        payCalculator = new PayCalculator(workingWeek);
        hourReporter = new HourReporter(workingWeek);
    }


    // CFO
    public int calculatePay() {
        return payCalculator.calculatePay();
    }

    // COO
    public String reportHours() {
        return "Regular Hours: " + hourReporter.reportHours();
    }

    // CTO
    public String save() {
        return "saved";
    }

}


