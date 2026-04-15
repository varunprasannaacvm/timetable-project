package com.schedule;

import java.util.ArrayList;
import java.util.List;

public class TimetableService {
    private List<ScheduleSlot> schedules = new ArrayList<>();

    public String addSchedule(String className, String teacher, String room, String timeSlot) {
        for (ScheduleSlot slot : schedules) {
            // Check for Room Conflict
            if (slot.timeSlot.equals(timeSlot) && slot.room.equals(room)) {
                return "CONFLICT: Room " + room + " is already occupied.";
            }
            // Check for Teacher Conflict
            if (slot.timeSlot.equals(timeSlot) && slot.teacher.equals(teacher)) {
                return "CONFLICT: Teacher " + teacher + " is already teaching.";
            }
        }
        schedules.add(new ScheduleSlot(className, teacher, room, timeSlot));
        return "SUCCESS: Class scheduled.";
    }

    // Simple data structure for a slot
    public static class ScheduleSlot {
        String className, teacher, room, timeSlot;
        public ScheduleSlot(String c, String t, String r, String ts) {
            this.className = c; this.teacher = t; this.room = r; this.timeSlot = ts;
        }
    }
}