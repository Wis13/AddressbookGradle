package com.vadym.test;


import com.vadym.model.ContactData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Set;

public class ContactModificationTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondishions() {
        app.goTo().HomePage();
        if (app.contact().all().size() == 0) {
            File photo = new File("./mord.png");
                  app.contact().create(new ContactData().withId(1).withFirstname("test13")
                    .withLastname("rest13").withPhoto(photo), true);
        }
    }

    @Test
    public void testGroupModification() {

        Set<ContactData> before = app.contact().all();
        ContactData modifiedContact = before.iterator().next();
        File photo = new File("./mord.png");

        app.contact().modify(new ContactData().withId(modifiedContact.getId()).withFirstname("test222")
                .withLastname("rest222").withPhoto(photo), true);

    }


}
