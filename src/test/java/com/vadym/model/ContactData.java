package com.vadym.model;

import java.io.File;

public class ContactData {
    private int id;
    private String firstname;
    private String lastname;
    private String group;
    private String homePhone;
    private String mobilePhone;
    private String workPhone;
    private String allPhones;
    private File photo;


    public String getFirstname() {
        return firstname;
    }

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGroup() {
        return group;
    }

    public String getHomePhone() { return homePhone; }

    public String getMobilePhone() { return mobilePhone; }

    public String getWorkPhone() { return workPhone; }

    public String getAllPhones() { return allPhones; }

    public File getPhoto() { return photo; }

    public ContactData withId(int id) { this.id = id; return this;}

    public ContactData withFirstname(String firstname) { this.firstname = firstname; return this;  }

    public ContactData withLastname(String lastname) { this.lastname = lastname; return this; }

    public ContactData withHomePhone(String homePhone) { this.homePhone = homePhone; return this;  }

    public ContactData withMobilePhone(String mobilePhone) { this.mobilePhone = mobilePhone; return this;  }

    public ContactData withWorkPhone(String workPhone) { this.workPhone = workPhone; return this; }

    public ContactData withAllPhones(String allPhones) { this.allPhones = allPhones; return this;  }

    public ContactData withPhoto(File photo) { this.photo = photo; return this; }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", group='" + group + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", workPhone='" + workPhone + '\'' +
                '}';
    }
}
