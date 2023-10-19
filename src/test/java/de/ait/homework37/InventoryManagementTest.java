package de.ait.homework37;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
class InventoryManagementTest {
    private InventoryManagement inventoryManagement;
    List<MobilePhone> mobilephones =new ArrayList<>();
    @BeforeEach
    public void setUP()
    {
        inventoryManagement =new InventoryManagement();
    }
    @Description("hi")
    @Test

    void addMobilePhoneTest()
    {
        MobilePhone phone1=new MobilePhone(1,"Samsung","Galaxy", "Android", 350);
        inventoryManagement.addMobilePhone(phone1);
        assertEquals(phone1, inventoryManagement.getMobilePhone(1));
    }
    @Test
    void getMobilePhoneTest()
    {
        MobilePhone phone1=new MobilePhone(1,"Samsung","Galaxy", "Android", 350);
        List<MobilePhone> mobilephones =new ArrayList<>();
        mobilephones.add(phone1);
        assertEquals(1, phone1.getId());
    }
    @Test
    void getMobilePhoneNotFoundTest()
    {
        List<MobilePhone> mobilephones =new ArrayList<>();
        assertEquals(null, inventoryManagement.getMobilePhone(1));
    }
    @Test
    void updateMobilePhoneTest()
    {
        MobilePhone phone1=new MobilePhone(1,"Samsung","Galaxy", "Android", 350);
        phone1.setBrand("IPHONE");
        phone1.setModel("A37");
        phone1.setOperatingSystem("new System");
        phone1.setPrice(1000.00);
        assertEquals(true, phone1);

    }

}