package ru.mentee.power;

public record MenteeProgress(String menteeName, int sprintNumber, int plannedHoursPerWeek) {

    public boolean readyForSprint() {
        return plannedHoursPerWeek >= 3;
    }

    public String summary() {
        System.out.println("Summary");
        return "Sprint %d → %s: planned %d h".formatted(sprintNumber, menteeName, plannedHoursPerWeek);
    }
}