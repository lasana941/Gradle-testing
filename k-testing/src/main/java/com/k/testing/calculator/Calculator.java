package com.k.testing.calculator;
/*
Zadanie polega na napisaniu prostej klasy - kalkulatora oraz przygotowaniu testu jednostkowego dla tej klasy. Wykonanie zadania składa się z kroków:

    w pakiecie com.kodilla.testing utwórz podpakiet calculator,
    w tym pakiecie stwórz i zaimplementuj nową klasę Calculator reprezentującą prosty kalkulator z dwoma funkcjami: add(int a, int b) oraz subtract(int a, int b).
    w metodzie main klasy TestingMain napisz test sprawdzający działanie klasy Calculator - dla każdej metody kalkulatora po jednym teście.
    Rozwiązanie zadania prześlij do repozytorium GitHub.

Link do repozytorium wklej poniżej i wyślij do mentora.
 */
public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }

}