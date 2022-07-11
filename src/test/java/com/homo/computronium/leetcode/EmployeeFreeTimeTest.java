package com.homo.computronium.leetcode;

import com.homo.computronium.leetcode.easy.employee_free_time.EmployeeFreeTime;
import com.homo.computronium.leetcode.easy.employee_free_time.Interval;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeFreeTimeTest {

    @Test
    public void case1() {
        EmployeeFreeTime employeeFreeTime = new EmployeeFreeTime();

        List<Interval> employee1Schedule = List.of(
                new Interval(1, 2),
                new Interval(5, 6)
        );
        List<Interval> employee2Schedule = List.of(
                new Interval(1, 3),
                new Interval(4, 10)
        );

        List<List<Interval>> scheduleList = List.of(
                employee1Schedule,
                employee2Schedule
        );

        List<Interval> actualCommonFreeTimeIntervals = employeeFreeTime.employeeFreeTime(scheduleList);
        List<Interval> expectedCommonFreeTimeIntervals = List.of(new Interval(3, 4));
        assertEquals(expectedCommonFreeTimeIntervals, actualCommonFreeTimeIntervals);
    }

    @Test
    public void case2() {
        EmployeeFreeTime employeeFreeTime = new EmployeeFreeTime();
//        [[[1,3],[6,7]],[[2,4]],[[2,5],[9,12]]]
        List<Interval> employee1Schedule = List.of(
                new Interval(1, 3),
                new Interval(6, 7)
        );
        List<Interval> employee2Schedule = List.of(
                new Interval(2, 4)
        );
        List<Interval> employee3Schedule = List.of(
                new Interval(2, 5),
                new Interval(9, 12)
        );
        List<List<Interval>> scheduleList = List.of(
                employee1Schedule,
                employee2Schedule,
                employee3Schedule
        );

        List<Interval> actualCommonFreeTimeIntervals = employeeFreeTime.employeeFreeTime(scheduleList);

        List<Interval> expectedCommonFreeTimeIntervals = List.of(
                new Interval(5, 6),
                new Interval(7, 9)
        );
        assertEquals(expectedCommonFreeTimeIntervals, actualCommonFreeTimeIntervals);
    }

}