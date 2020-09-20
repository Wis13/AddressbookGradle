package com.vadym.test;

import com.vadym.model.ContactData;
import org.testng.annotations.Test;

import java.io.File;

public class ContactCreationTests extends TestBase {

    @Test
    public void contactCreationTest() {
        app.goTo().HomePage();
        app.contact().initContactCreation();
        File photo = new File("src/test/resources/mord.png");
        app.contact().fillContactForm(new ContactData().withFirstname("Dura").withLastname("Polnaya").withPhoto(photo), true);
//        ContactData contact = new ContactData().withFirstname("test55").withLastname("best55").withPhoto(photo);
        app.contact().submitContactCreation();
        app.contact().returnToHomePage();
    }
}
