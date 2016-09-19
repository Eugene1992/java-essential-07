package com.cbs.edu;

/**
 * Created by evgeniy on 05/09/16.
 */
public class Main {

    /**
     * Start point of side program.
     * @param args input arguments.
     */
    public static void main(String[] args) {
        final int humanOneSalary = 6000;
        int[] zp1 = new int[]{humanOneSalary, 10000, 11000, 12000};
        int[] old = new int[]{34, 32, 17, 25};
        String[] name = new String[]{"Savchyk Denis", "Gevelev Sergiy", "Kulik Vlad", "Chybaka Yarik"};
        price(zp1, old, name);
    }

    /**
     * Method which calculate max price for employees.
     *
     * @param zp1  input employees salaries
     * @param old  input employees ages
     * @param name input employees names
     */
    static void price(int[] zp1, int[] old, String[] name) {
        int maxzp = 0;
        int count = 0;
        for (int i = 0; i < zp1.length; i++) {
            if (maxzp < zp1[i]) {
                maxzp = zp1[i];
                count = i;
            }
        }
        System.out.println(zp1[count] + " " + old[count] + " " + name[count] + " ");
    }
}
