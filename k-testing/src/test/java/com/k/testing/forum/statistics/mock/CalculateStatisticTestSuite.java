package com.k.testing.forum.statistics.mock;

import com.k.testing.forum.statistics.CalculateStatistics;
import com.k.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticTestSuite{
    @Test
    public void testCalculateStatisticsWithAveragePostsByUserPostZeroMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();
        usersNamesList.add("Heinrich Otto Abetz");
        usersNamesList.add("Milan Babić");
        usersNamesList.add("Pietro Caruso");
        usersNamesList.add("Kurt Daluege ");
        usersNamesList.add("Adolf Eichmann ");
        usersNamesList.add("Miroslav Filipović");
        int numbersOfPosts = 0;

        when(statisticsMock.postsCount()).thenReturn(numbersOfPosts);
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);

        CalculateStatistics calcStatistics = new CalculateStatistics(statisticsMock);

        //When
        calcStatistics.calculateAdvStatistics(statisticsMock);
        double averagePostsByUser = calcStatistics.getAveragePostsByUser();

        //Then
        Assert.assertEquals(0, averagePostsByUser , 0.000001);
    }
    @Test
    public void testCalculateStatisticsWithAveragePostsByUserMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();
        usersNamesList.add("Heinrich Otto Abetz");
        usersNamesList.add("Milan Babić");
        usersNamesList.add("Pietro Caruso");
        usersNamesList.add("Kurt Daluege ");
        usersNamesList.add("Adolf Eichmann ");
        usersNamesList.add("Miroslav Filipović");
        int numbersOfPosts = 6;

        when(statisticsMock.postsCount()).thenReturn(numbersOfPosts);
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);

        CalculateStatistics calcStatistics = new CalculateStatistics(statisticsMock);

        //When
        calcStatistics.calculateAdvStatistics(statisticsMock);
        double averagePostsByUser = calcStatistics.getAveragePostsByUser();

        //Then
        Assert.assertEquals(1, averagePostsByUser , 0.001);
    }
    @Test
    public void testCalculateStatisticsWithThousandCommentsMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int numbersOfComments = 1000;

        when(statisticsMock.commentsCount()).thenReturn(numbersOfComments);

        //When
        int quantityOfComments = statisticsMock.commentsCount();

        //Then
        Assert.assertEquals(1000, quantityOfComments);
    }
    @Test
    public void testCalculateStatisticsWithZeroCommentsMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int numbersOfComments = 0;

        when(statisticsMock.commentsCount()).thenReturn(numbersOfComments);

        //When
        int quantityOfComments = statisticsMock.commentsCount();

        //Then
        Assert.assertEquals(0, quantityOfComments);
    }
    @Test
    public void testCalculateStatisticsWithThousandPostsMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int numbersOfPosts = 1000;

        when(statisticsMock.postsCount()).thenReturn(numbersOfPosts);

        //When
        int quantityOfPosts = statisticsMock.postsCount();

        //Then
        Assert.assertEquals(1000, quantityOfPosts);
    }
    @Test
    public void testCalculateStatisticsWithZeroPostsMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int numbersOfPosts = 0;

        when(statisticsMock.postsCount()).thenReturn(numbersOfPosts);

        //When
        int quantityOfPosts = statisticsMock.postsCount();

        //Then
        Assert.assertEquals(0, quantityOfPosts);
    }
    @Test
    public void testCalculateStatisticsWithUsersMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();
        usersNamesList.add("Heinrich Otto Abetz");
        usersNamesList.add("Milan Babić");
        usersNamesList.add("Pietro Caruso");
        usersNamesList.add("Kurt Daluege ");
        usersNamesList.add("Adolf Eichmann ");
        usersNamesList.add("Miroslav Filipović");

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);

        CalculateStatistics CalcStatistics = new CalculateStatistics(statisticsMock);

        //When
        int quantityOfUsers = CalcStatistics.calculateAdvStatistics(statisticsMock).size();

        //Then
        Assert.assertEquals(6, quantityOfUsers);
    }
    @Test
    public void testCalculateStatisticsWithZeroUsersMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);

        CalculateStatistics CalcStatistics = new CalculateStatistics(statisticsMock);

        //When
        int quantityOfUsers = CalcStatistics.calculateAdvStatistics(statisticsMock).size();

        //Then
        Assert.assertEquals(0, quantityOfUsers);
    }
}
