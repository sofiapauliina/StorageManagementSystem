package com.company;

import java.util.ArrayList;

public class StorageList {

    private ArrayList<String> storageList = new ArrayList<String>();

    public void printStorageList() {
        System.out.println(storageList.size() + " items in storage");

        for (int i = 0; i < storageList.size(); i++) {
            System.out.println(i + ". " + storageList.get(i));
        }
    }

    public void findStorageItem(String searchItem) {
        boolean containsItem = storageList.contains(searchItem);

        if (containsItem) {
            System.out.println(searchItem + " in storage. Position: " + storageList.indexOf(searchItem));
        } else {
            System.out.println(searchItem + " not in storage");
        }
    }

    public void addStorageItem(String item) {
        storageList.add(item);
        System.out.println("Storage item " + item + " added to position: " + storageList.indexOf(item));
    }


    public void modifyStorageItem(int position, String newItem) {
        storageList.set(position, newItem);
        System.out.println("Storage item " + position + " modified");
    }

    public void removeStorageItem(int position) {
        String theItem = storageList.get(position);
        storageList.remove(position);
        System.out.println(theItem + " at " + position + " removed");
    }


}
