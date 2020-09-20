package com.vadym.test;


import com.vadym.model.ContactData;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static com.vadym.test.TestBase.app;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactPhoneTests extends TestBase {
    @Test
    public void testContactPhones() {
        app.goTo().HomePage();
        ContactData contact = app.contact().all().iterator().next();
        ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

        assertThat(contact.getAllPhones(), equalTo(mergePhones(contactInfoFromEditForm)));

    }

    private String mergePhones(ContactData contact) {
      return  Arrays.asList(contact.getHomePhone(), contact.getMobilePhone(), contact.getWorkPhone()).stream()
              .filter((s) -> !equals("")).map(ContactPhoneTests::cleaned)
              .collect(Collectors.joining(""));
    }

    public static String cleaned(String phones){
        return phones.replaceAll("\\s","")
                .replaceAll("[-()]","");
    }
}
