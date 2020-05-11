package ru.igorek.addressbook.tests;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import ru.igorek.addressbook.model.ContactData;
import ru.igorek.addressbook.model.TestBase;

import java.util.List;

public class contactModification extends TestBase {
    @Ignore

    @Test
    public void testContatcModification(){
        if (! app.getContactHElper().contactExistanceCheck()){
            app.getContactHElper().createNewContact(new ContactData("Cent", "50",
                    "Jacobs", "LUL", "mexico", "911","[none]"));
            app.getContactHElper().goHome();
        }
        //int before = app.getContactHElper().countContact();
        List<ContactData> before = app.getContactHElper().getContactList();

        app.getContactHElper().chooseEdit();
        app.getContactHElper().fillContact(new ContactData("George",null,
                null,null,null,null,null));
        app.getContactHElper().clickUpdate();
        app.getContactHElper().goHome();
        List<ContactData> after = app.getContactHElper().getContactList();



        Assert.assertEquals(after,before);

        //int after = app.getContactHElper().countContact();
        //Assert.assertEquals(after, before -1);
    }
}
