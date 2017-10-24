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
    public void testStatisticsWithMock() {
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
        int quantityOfUsers = CalcStatistics.calculateAdvStatistics().size();

        //Then
        Assert.assertEquals(6, quantityOfUsers);
    }
}
