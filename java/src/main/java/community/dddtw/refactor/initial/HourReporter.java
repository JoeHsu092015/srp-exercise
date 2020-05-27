package community.dddtw.refactor.initial;

public class HourReporter {

    private WorkingWeek workingWeek;

    public HourReporter(WorkingWeek workingWeek) {
        this.workingWeek = workingWeek;
    }

    public int reportHours() {
        return workingWeek.regularHours();
    }
}
