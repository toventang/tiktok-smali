package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.c.a.i;
import com.google.gson.a.a;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.util.Arrays;

public class ContactModel {
    @a(a = false, b = false)
    public String firstName;
    @a
    @c(a = "invited")
    public boolean invited;
    @a(a = false, b = false)
    public String lastName;
    @a(a = false, b = false)
    public String mSection;
    @a
    @c(a = StringSet.name)
    public String name;
    @a(a = false, b = false)
    public int originIndex;
    @a
    @c(a = "phone_number")
    public String phoneNumber;
    public transient String photoUri;
    @a
    @c(a = "region_code")
    public String regionCode;
    @a(a = false, b = false)
    public String url;

    static {
        Covode.recordClassIndex(61568);
    }

    public ContactModel() {
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.phoneNumber, this.name});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ContactModel contactModel = (ContactModel) obj;
            if (!i.a(this.phoneNumber, contactModel.phoneNumber) || !i.a(this.name, contactModel.name)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public ContactModel(String str, String str2) {
        this.phoneNumber = str;
        this.name = str2;
    }
}
