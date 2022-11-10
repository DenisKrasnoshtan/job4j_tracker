package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int sum = 0;
        double counter = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                counter++;
            }
        }
        return sum / counter;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        int sum = 0;
        double counter = 0;
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                counter++;
            }
            labels.add(new Label(pupil.name(), sum / counter));
            sum = 0;
            counter = 0;

        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        double count = 0;
        List<Label> labels = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            count++;
            for (Subject subject : pupil.subjects()) {
                if (map.containsKey(subject.name())) {
                    map.put(subject.name(), subject.score() + map.get(subject.name()));
                } else {
                    map.put(subject.name(), subject.score());
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            labels.add(new Label(key, value / count));
        }
        return labels;

    }

    public static Label bestStudent(List<Pupil> pupils) {
        int sum = 0;
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            labels.add(new Label(pupil.name(), sum));
            sum = 0;

        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (map.containsKey(subject.name())) {
                    map.put(subject.name(), subject.score() + map.get(subject.name()));
                } else {
                    map.put(subject.name(), subject.score());
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            labels.add(new Label(key, value));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}