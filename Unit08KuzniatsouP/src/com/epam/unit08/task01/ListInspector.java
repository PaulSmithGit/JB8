package com.epam.unit08.task01;

public class ListInspector {
    public static void main(String[] args) {
        CustomersList buyers = new CustomersList();

        buyers.add(new Customer("Pavel", "Kuzniatsou", "Junior", 123456788, 998774848));
        buyers.add(new Customer("Pavel", "Kuzniatsou", "Suleiman", 987654322, 298774848));
        buyers.add(new Customer("Anna", "Karenina", "", 147852366, 398774848));
        buyers.add(new Customer("Zorg", "Zoltan", "Zest", 963258744, 498774848));
        buyers.add(new Customer("Kesha", "Shniperson", "Adamovich", 547852366, 598774848));

        System.out.println("Customers with card desired cardnumbers:\n");
        System.out.println(buyers.findByCardNumber(23, 444444444).toString());

        System.out.println("\nCustomers List sorter by name (ASC):\n");

        buyers.sortCustomers();

        for (int i = 0; i < buyers.size(); i++) {
            System.out.println(buyers.getCustomer(i).toString());
        }
    }
}
