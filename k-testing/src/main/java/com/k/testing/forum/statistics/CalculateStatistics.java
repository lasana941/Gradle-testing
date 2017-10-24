package com.k.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {
    Statistics statistics;
    int averagePostsByUser;
    int averageCommentsByUser;
    int acerageCommentsByPost;

    public CalculateStatistics(Statistics statistics){
        this.statistics = statistics;
    }
    public List<String> calculateAdvStatistics(){
        for (String temp: statistics.usersNames()) {
            temp;
        }

        return;
    }
}
