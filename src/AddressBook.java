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
    public AddressBook(){
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if(buddy != null){
            buddies.add(buddy);
        }
    }

    public void removeBuddy(int index){
        if(index >= 0 && index < buddies.size()){
            buddies.remove(buddy);
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
