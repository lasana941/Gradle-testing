package com.k.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateStatistics {
    Statistics statistics;
    private double averagePostsByUser;
    private double averageCommentsByUser;
    private double acerageCommentsByPost;

    public CalculateStatistics(Statistics statistics){
        this.statistics = statistics;
    }
    public List<String> calculateAdvStatistics(Statistics statistics){
        List<String> resulList = new ArrayList<>();

        for (String temp: statistics.usersNames()) {
            resulList.add(temp);
            averagePostsByUser = Double.valueOf(resulList.size()) / Double.valueOf(statistics.postsCount());
        }
        return resulList;
    }
    public double getAveragePostsByUser() {
        return averagePostsByUser;
    }

    public double getAverageCommentsByUser() {
        return averageCommentsByUser;
    }

    public double getAcerageCommentsByPost() {
        return acerageCommentsByPost;
    }
}
