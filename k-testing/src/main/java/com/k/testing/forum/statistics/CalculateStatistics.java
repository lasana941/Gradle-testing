package com.k.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateStatistics {
    Statistics statistics;
    int averagePostsByUser;
    int averageCommentsByUser;
    int acerageCommentsByPost;

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
}
