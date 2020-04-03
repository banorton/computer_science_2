/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nortonbrandontest3;

/**
 *
 * @author banor
 */
public class Entry {

    private String name;
    private String phoneNum;
    private String category;

    /**
     *
     * @param name
     * @param phoneNum
     * @param category
     */
    public Entry(String name, String phoneNum, String category) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.category = category;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return
     */
    public String getPhoneNum() {
        return this.phoneNum;
    }

    /**
     *
     * @return
     */
    public String getCategory() {
        return this.category;
    }

    /**
     *
     * @param newName
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     *
     * @param newPhoneNum
     */
    public void setPhoneNum(String newPhoneNum) {
        this.phoneNum = newPhoneNum;
    }

    /**
     *
     * @param newCategory
     */
    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    /**
     *
     * @return
     */
    public String toString() {
        return "[name: " + this.name + ", number: " + this.phoneNum + ", category: " + this.category + "]";
    }

}
