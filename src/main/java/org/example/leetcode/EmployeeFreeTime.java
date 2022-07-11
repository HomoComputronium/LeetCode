package org.example.leetcode;

import org.example.leetcode.employee_free_time.Interval;

import java.util.List;

public class EmployeeFreeTime {

    public List<Interval> employeeFreeTime(List<List<Interval>> schedules) {
        WorkTable workTable = new WorkTable(schedules);
        return workTable.calculateGaps();
    }
}