package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder firstStr = new StringBuilder();
        int size = evenElements.size();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                firstStr.append(evenElements.pollFirst());
            } else {
                evenElements.pollFirst();
            }
        }
        return firstStr.toString();
    }

    private String getDescendingElements() {
        StringBuilder secondStr = new StringBuilder();
        int size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            secondStr.append(descendingElements.pollLast());
        }
        return secondStr.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
