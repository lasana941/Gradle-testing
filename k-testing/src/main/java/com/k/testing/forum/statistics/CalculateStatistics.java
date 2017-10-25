package com.k.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateStatistics {
    Statistics statistics;
    private double averagePostsByUser = 0;
    private double averageCommentsByUser = 0;
    private double averageCommentsByPost = 0;

    public CalculateStatistics(Statistics statistics){
        this.statistics = statistics;
    }
    public List<String> calculateAdvStatistics(Statistics statistics){
        List<String> resulList = new ArrayList<>();

        for (String temp: statistics.usersNames()) {
            resulList.add(temp);
        }

        if (statistics.postsCount() != 0){
            averagePostsByUser = Double.valueOf(resulList.size()) / Double.valueOf(statistics.postsCount());
        }
        if(statistics.commentsCount() != 0){
            averageCommentsByUser = Double.valueOf(resulList.size()) / Double.valueOf(statistics.commentsCount());
        }
        if(statistics.commentsCount() != 0){
            averageCommentsByPost = Double.valueOf(statistics.commentsCount()) / Double.valueOf(statistics.postsCount());
        }
        return resulList;
    }
    public double getAveragePostsByUser() {
        return averagePostsByUser;
    }

    public double getAverageCommentsByUser() {
        return averageCommentsByUser;
    }

    public double getAverageCommentsByPost() {
        return averageCommentsByPost;
    }
}
