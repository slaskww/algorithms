package org.sda.algorithms.exercices;

import org.junit.jupiter.api.Test;
import org.sda.algorithms.exercises.Queue;
import org.sda.algorithms.exercises.Stack;

import static org.assertj.core.api.Assertions.assertThat;

public class QueueTest {

    @Test // annotacja mówiąca że to będzie metoda testowa
    public void testQueueSize(){
        // W tym teście sprawdzać będziemy czy rozmiar kolejki jest prawidłowy po przeprowadzonych na niej operacjach.

        // GIVEN - określa warunki początkowe
        // Przygotowywujemy daną testówą w tym przypadku zmienną typu Integer o wartości 34.
        Integer integer = 34;
        // Przygotowywujemy obiekt typu Queue() -> kolejka -> która będzie testowana
        Queue queue = new Queue();

        // WHEN - opisuje akcje
        // Wykonujemy akcję -> Dodajemy do kolejki zmienną typu integer, powiększamy kolejkę poprzez dodanie do niej naszej zmiennej.
        queue.enqueue(integer);

        // THEN - informuje o oczekiwanych rezultatach
        // Sprawdzamy CZY -> assertThat -> rozmiar kolejki jest równy -> isEqualTo -> 1. Jeśli tak, to true i test wykona się poprawnie.
        assertThat(queue.size()).isEqualTo(1);
    }

    @Test
    public void testGettingObjectFromQueue(){
        // W tym teście sprawdzać będziemy czy wyjęta z kolejki wartość to ta włożona na początku (zgodnie z FIFO)
        // i czy rozmiar kolejki zostaje pomniejszony o ilość wyjętych wartości.

        // GIVEN -> Przygotowywujemy
        // Zmienna typu Integer równa 34
        Integer integer = 34;
        // Zmienna typu string równa "value"
        String someValue = "value";
        // Queue który będziemy testować
        Queue queue = new Queue();

        // WHEN -> Wykonujemy akcję
        // Dodajemy do kolejki zmienną integer.
        queue.enqueue(integer);
        // Dodajemy do kolejki zmienną someValue
        queue.enqueue(someValue);

        // THEN sprawdzamy czy rozmiar kolejki jest równy 2! potrzebne do wykonania testu.
        assertThat(queue.size()).isEqualTo(2);

        // WHEN Tworzymy nowy obiekt wyjmując ostatnią włożoną do stacka wartość -> w naszym przypadku to będzie integer
        Object result = queue.dequeue();

        // THEN
        // Sprawdzamy czy wyjęta z kolejki wartość równa jest zmiennej integer -> Tą pierwszą włożyliśmy
        assertThat(result).isEqualTo(integer);
        // Sprawdzamy czy rozmiar naszego queue jest równy jeden, ponieważ usunęliśmy z niego jedną wartość poprzez dequeue.
        assertThat(queue.size()).isEqualTo(1);
    }

    @Test
    public void testFull(){
        // Ten test za zadanie ma sprawdzenie czy Queue prawidłowo obsługuje zwrócenie informacji o tym czy jest pełna.
        // QUEUE ma mieścić maksymalnie 10 wartości.

        // GIVEN -> Obiekt Queue który będziemy testować
        Queue queue = new Queue();

        // WHEN -> Petlą for wypełniamy klejkę 10 wartościami
        for(int i=0; i<10; i++){
            queue.enqueue(i);
        }

        // THEN
        // Sprawdzamy czy rozmiar kolejki jest równy 10 -> Tyle wartości włożyliśmy do niej.
        assertThat(queue.size()).isEqualTo(10);
        // Sprawdzamy czy dla queue maksymalna ilość wartości to ta którą go wypełniliśmy w tym teście
        // Porównując czy metoda isFull() zwraca true
        assertThat(queue.isFull()).isEqualTo(true);
    }

    @Test
    public void testAddMoreThanQueueSize(){
        // Test sprawdza czy jest możliwość dodania więcej niż MAX -> 10 wartości do kolejki.

        // GIVEN -> Obiekt kolejki do testów
        Queue queue = new Queue();

        // WHEN -> Próbujemy wypełnić QUEUE 11 wartościami.
        for(int i=0; i<11; i++){
            queue.enqueue(i);
        }

        // THEN
        // Sprawdzamy czy rozmiar kolejki jest równy 10 -> Tyle wartości maksymalnie może być przechowywane w Queue.
        assertThat(queue.size()).isEqualTo(10);
        // Sprawdzamy czy dla kolejki maksymalna ilość wartości została osiągnięta
        // Porównując czy metoda isFull() zwraca true
        assertThat(queue.isFull()).isEqualTo(true);

    }

    @Test
    public void testGetMoreThanIsInQueue(){
        // Test sprawdza czy jest możliwość sciągnięcia elementu z kolejki, gdy queue jest pusty

        // GIVEN -> Obiekt kolejki do testów
        Queue queue = new Queue();

        Integer integer = 34;
        queue.enqueue(integer);

        // WHEN -> ściągamy obiekt z kolejki
        Object o1 = queue.dequeue();
        Object o2 = queue.dequeue();

        // THEN
        // Sprawdzamy czy rozmiar kolejki jest równy 0

        assertThat(queue.size()).isEqualTo(0);
    }

    @Test
    public void testGetUsingPeek(){
        // Test sprawdza czy po tym jak pobierze się element, llczba elementóów w kolejce się nie zmienia

        // GIVEN -> Obiekt kolejki do testów
        Queue queue = new Queue();

        // WHEN -> dodajemy element do kolejki
        Integer integer = 34;
        queue.enqueue(integer);

        // THEN
        // Sprawdzamy czy po ściągnięciu elementu z kolejk, będzie ona miała tę samą wielkość

        assertThat(queue.size()).isEqualTo(1);
        Object result =  queue.peek();
        assertThat(result).isEqualTo(integer);
        assertThat(queue.size()).isEqualTo(1);
    }
}
