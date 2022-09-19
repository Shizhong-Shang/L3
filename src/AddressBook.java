import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Copyright (c) 2008-2024: Shizhong Shang
 * Project: LAB1
 *
 * @className: AddressBook
 * @Description: TODO
 * @version: v1.17.0
 * @author: SHIZHONG SHANG
 * @date: 2022-09-19 2:26 p.m.
 */

public class AddressBook {
    private BuddyInfo buddy;
    private ArrayList<BuddyInfo> buddies;

    public void AddBuddy(){
        buddies.add(buddy);
    }

    public void removeBuddy(){
        buddies.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
