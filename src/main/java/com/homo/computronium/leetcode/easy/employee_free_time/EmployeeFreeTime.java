package com.homo.computronium.leetcode.employee_free_time;

import java.util.List;

public class EmployeeFreeTime {

    public List<Interval> employeeFreeTime(List<List<Interval>> schedules) {
        WorkTable workTable = new WorkTable(schedules);
        return workTable.calculateGaps();
    }
}