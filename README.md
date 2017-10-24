
JAVA 2017-09 (dashboard)
6. Wprowadzenie do testowania oprogramowania (Moduł)
6.5. Mockito, mockujemy obiekty!
Zadanie: mockujemy forum dyskusyjne

Wyobraź sobie, że dostałeś zadanie dopisania modułu prezentującego statystyki forum dyskusyjnego. Forum jeszcze nie jest ukończone, otrzymałeś jednak specyfikację interfejsu, przy pomocy którego będziesz pobierał dane. Oto on (utwórz sobie pakiet com.kodilla.testing.forum.statistics w katalogu src/main/java):

package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {
    List<String> usersNames(); // list of users names
    int postsCount();          // total quantity of forum posts
    int commentsCount();       // total quantity of forum comments
}

Pamiętaj, że brak public przed nazwą metody w interfejsie również oznacza, że jest ona publiczna. Interfejs nie może posiadać innych metod niż publiczne, więc nie trzeba tego pisać.

W pakiecie com.kodilla.testing.forum.statistics utwórz klasę obliczającą następujące statystyki:

    Ilość użytkowników
    Ilość postów
    Ilość komentarzy
    Średnia ilość postów na użytkownika
    Średnia ilość komentarzy na użytkownika
    Średnia ilość komentarzy na post

Stworzona klasa powinna posiadać metodę calculateAdvStatistics(Statistics statistics), która obliczy podane powyżej wartości i zapamięta je we właściwościach (polach) klasy. Możesz również dopisać metodę ShowStatistics(), która wyświetli zapamiętane we właściwościach statystyki.

Następnie utwórz pakiet com.kodilla.testing.forum.statistics w katalogu src/test/java i stwórz zestaw testów, zawierający testy sprawdzające metodę calculateAdvStatistics(Statistics statistics) testowanej klasy. Testy zrealizuj przy pomocy mocka interfejsu Statistics. Przetestuj poprawność obliczeń wartości średnich dla różnych przypadków:

    gdy liczba postów = 0
    gdy liczba postów = 1000
    gdy liczba komentarzy = 0
    gdy liczba komentarzy < liczba postów
    gdy liczba komentarzy > liczba postów
    gdy liczba użytkowników = 0
    gdy liczba użytkowników = 100

Przygotowany kod umieść w repozytorium Github. Link do repozytorium wklej poniżej i prześlij do mentora.