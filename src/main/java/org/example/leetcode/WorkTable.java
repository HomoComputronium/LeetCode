package org.example.leetcode;

import org.example.leetcode.employee_free_time.Interval;

import java.util.ArrayList;
import java.util.List;

public class WorkTable {

    private final List<List<Interval>> schedules;
    private final int[] workTable = new int[24];

    public WorkTable(List<List<Interval>> schedules) {
        this.schedules = schedules;
    }

    public List<Interval> calculateGaps() {
        fillWorkTable();

        List<Interval> freeTimeGaps = new ArrayList<>();

        boolean isAtIntervalStart = true;
        boolean isInInterval = false;
        Interval currentInterval = null;
        for (int i = 0; i < workTable.length; i++) {
            int hour = workTable[i];
            if (hour == 0 && i == 0) {
                continue;
            }
            if (hour == 0 && isAtIntervalStart) {
                currentInterval = new Interval();
                currentInterval.setStart(i);
                isAtIntervalStart = false;
                isInInterval = true;
            }
            if (hour == 1 && isInInterval) {
                currentInterval.setEnd(i);
                freeTimeGaps.add(currentInterval);
                isInInterval = false;
                isAtIntervalStart = true;
            }
        }

        return freeTimeGaps;
    }

    private void fillWorkTable() {
        for (List<Interval> schedule : schedules) {
            for (Interval interval : schedule) {
                fillWorkTableWithSingleInterval(workTable, interval);
            }
        }
    }

    private void fillWorkTableWithSingleInterval(int[] workTable, Interval interval) {
        for (int i = interval.getStart(); i < interval.getEnd(); i++) {
            workTable[i] = 1;
        }
    }
}
