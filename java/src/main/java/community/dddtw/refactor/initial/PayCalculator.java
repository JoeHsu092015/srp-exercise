package community.dddtw.refactor.initial;

import java.util.ArrayList;
import java.util.Arrays;

public class PayCalculator {

    private WorkingWeek workingWeek;

    public PayCalculator(WorkingWeek workingWeek) {
        this.workingWeek = workingWeek;
    }

    public int calculatePay() {
        return workingWeek.regularHours() * 200 + workingWeek.overtimeHours() * 350;
    }
}
