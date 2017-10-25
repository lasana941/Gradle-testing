package com.k.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateStatistics {
    Statistics statistics;
    private int averagePostsByUser;
    private int averageCommentsByUser;
    private int acerageCommentsByPost;

    public CalculateStatistics(Statistics statistics){
        this.statistics = statistics;
    }
    public List<String> calculateAdvStatistics(Statistics statistics){
        List<String> resulList = new ArrayList<>();

        for (String temp: statistics.usersNames()) {
            resulList.add(temp);
        }
        return resulList;
    }
    public int getAveragePostsByUser() {
        return averagePostsByUser;
    }

    public int getAverageCommentsByUser() {
        return averageCommentsByUser;
    }

    public int getAcerageCommentsByPost() {
        return acerageCommentsByPost;
    }
}
