package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Quelle est ta date de naissance ? (dd/MM/yyyy): ");

        String date = br.readLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate naissance = LocalDate.parse(date, formatter);
        LocalDate actuel = LocalDate.now();

        Period period = Period.between(naissance, actuel);
        System.out.print("Tu as donc ");
        System.out.print(period.getYears());
        System.out.println(" ans");
    }
}
