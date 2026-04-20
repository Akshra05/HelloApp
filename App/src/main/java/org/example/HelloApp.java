package org.example;

public class HelloApp {
    public static void main(String[] args) {
        System.out.println("Enter name to remove:");
        String removeName = sc.nextLine();

        names.remove(removeName);

        System.out.println("Updated names:");
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
