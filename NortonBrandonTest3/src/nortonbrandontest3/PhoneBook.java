/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nortonbrandontest3;

import java.util.ArrayList;

/**
 *
 * @author banor
 */
public class PhoneBook {

    private ArrayList<Entry> entries = new ArrayList();

    /**
     *
     * @param name
     * @param phoneNum
     * @param category
     */
    public void addEntry(String name, String phoneNum, String category) {
        Entry entry = new Entry(name, phoneNum, category);
        entries.add(entry);
    }

    /**
     *
     * @param name
     * @return
     */
    public Entry getEntry(String name) {
        for (Entry entry : entries) {
            if (entry.getName().equals(name)) {
                return entry;
            }
        }
        return null;
    }

    /**
     *
     * @param name
     * @param newPhoneNum
     * @return
     */
    public boolean updatePhoneNum(String name, String newPhoneNum) {
        Entry entry = this.getEntry(name);
        if (entry != null) {
            entry.setPhoneNum(newPhoneNum);
            return true;
        }
        return false;
    }

    /**
     *
     * @param name
     * @return
     */
    public boolean deleteEntry(String name) {
        Entry entry = this.getEntry(name);
        if (entry != null) {
            entries.remove(entry);
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    public String displayAll() {
        String info = "";
        for (Entry entry : entries) {
            info = info + entry.toString() + System.lineSeparator();
        }
        return info;
    }

    /**
     *
     * @param phoneNumber
     * @return
     */
    public static boolean isPhoneNum(String phoneNumber) {
        if (phoneNumber.length() != 10) {
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if ((c != '1') && (c != '2') && (c != '3') && (c != '4') && (c != '5') && (c != '6') && (c != '7') && (c != '8') && (c != '9') && (c != '0')) {
                return false;
            }
        }
        return true;
    }

}
