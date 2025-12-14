package hard;

import dto.Transaction;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class HighestSpendDay {

    private static List<Transaction> transactions;

    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(
                new Transaction("1", LocalDate.of(2025, 01, 01), 10000),
                new Transaction("1", LocalDate.of(2025, 01, 01), 4000),
                new Transaction("1", LocalDate.of(2025, 01, 02), 10000));

        Optional<Map.Entry<LocalDate, Double>> max = transactions.stream().collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingDouble(Transaction::getAmount)))
                .entrySet().stream().max(Map.Entry.comparingByValue());

        System.out.println(max);

    }
}
