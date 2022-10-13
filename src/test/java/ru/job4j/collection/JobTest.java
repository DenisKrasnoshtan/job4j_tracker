package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorDescByNameAndDescPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().
                thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorAscByNameAndAscByPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().
                thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenJobDescByName() {
        Job one = new Job("Fix bug", 1);
        Job two = new Job("Make a deal", 4);
        Job three = new Job("Do best", 2);
        List<Job> jobs = new ArrayList<>();
        jobs.add(one);
        jobs.add(two);
        jobs.add(three);
        List<Job> expected = List.of(two, one, three);
        jobs.sort(new JobDescByName());
        assertThat(jobs, is(expected));
    }

    @Test
    public void whenJobAscByName() {
        Job one = new Job("Fix bug", 1);
        Job two = new Job("Make a deal", 4);
        Job three = new Job("Do best", 2);
        List<Job> jobs = new ArrayList<>();
        jobs.add(one);
        jobs.add(two);
        jobs.add(three);
        List<Job> expected = List.of(three, one, two);
        jobs.sort(new JobAscByName());
        assertThat(jobs, is(expected));
    }

    @Test
    public void whenJobAscByPriority() {
        Job one = new Job("Fix bug", 1);
        Job two = new Job("Make a deal", 4);
        Job three = new Job("Do best", 2);
        List<Job> jobs = new ArrayList<>();
        jobs.add(one);
        jobs.add(two);
        jobs.add(three);
        List<Job> expected = List.of(one, three, two);
        jobs.sort(new JobAscByPriority());
        assertThat(jobs, is(expected));
    }

    @Test
    public void whenJobDescByPriority() {
        Job one = new Job("Fix bug", 1);
        Job two = new Job("Make a deal", 4);
        Job three = new Job("Do best", 2);
        List<Job> jobs = new ArrayList<>();
        jobs.add(one);
        jobs.add(two);
        jobs.add(three);
        List<Job> expected = List.of(two, three, one);
        jobs.sort(new JobDescByPriority());
        assertThat(jobs, is(expected));
    }
}