/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7storybook;

/**
 *
 * @author banor
 */
public class StorybookModel {

    private String userName;
    private String crime;

    public String getUsername() {
        return this.userName;
    }

    public void setUserName(String newUserName) {
        this.userName = newUserName;
    }

    public String getCrime() {
        return this.crime;
    }

    public void setCrime(String newCrime) {
        this.crime = newCrime;
    }
}
