/**
 * Copyright (c) 2008-2024: Shizhong Shang
 * Project: LAB1
 *
 * @className: BuddyInfo
 * @Description: TODO
 * @version: v1.17.0
 * @author: SHIZHONG SHANG
 * @date: 2022-09-12 4:59 p.m.
 */

public class BuddyInfo {

    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    private String name;
    private String address;
    private String phone;


    public static void main(String[] args) {
        BuddyInfo n = new BuddyInfo("Homer","111 st","6135558888");
        System.out.println("personal info:" + n);
    }
}
