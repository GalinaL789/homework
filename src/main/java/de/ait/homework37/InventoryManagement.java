package de.ait.homework37;

import java.util.List;
import java.util.ArrayList;
public class InventoryManagement {
    private List<MobilePhone> mobilephones =new ArrayList<>();
    public void addMobilePhone(MobilePhone phone)
    {
        mobilephones.add(phone);
    }
    public MobilePhone getMobilePhone(int id) {
        MobilePhone mobilePhonefound = null;
        for (MobilePhone mobilePhone : mobilephones) {
            if (mobilePhone.getId() == id) {
                mobilePhonefound = mobilePhone;
                break;
            }
        }
        return mobilePhonefound;
    }

    public boolean updateMobilePhone(int id)
    {
        MobilePhone mobilephone = getMobilePhone(id);
        if (mobilephone != null) {
            mobilephone.setBrand(mobilephone.getBrand());
            mobilephone.setBrand(mobilephone.getModel());
            mobilephone.setPrice(mobilephone.getPrice());
            return true;
        }
        return false;
    }


    public void deleteMobilePhone ( int id)
    {
        if (mobilephones.size()!= 0) {
            for (MobilePhone mobilePhone : mobilephones) {
                if (mobilePhone.getId() == id) {
                    mobilephones.remove(mobilePhone);
                }
            }
        } else {
            System.out.println("Телефонов в списке нет. Удаление невозможно");
        }

    }
    public List<MobilePhone> getMobilephones ()
    {
        return mobilephones;
    }

}










