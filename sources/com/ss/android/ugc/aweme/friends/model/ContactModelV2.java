package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.c.a.i;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ContactModelV2 {
    @c(a = "addresses")
    public List<String> addresses;
    @c(a = "birthday")
    public String birthday;
    @c(a = "department_name")
    public String department;
    @c(a = "emails")
    public List<String> emails;
    public String familyName;
    public String givenName;
    @c(a = "instant_message_addresses")
    public Map<String, String> instantMessageAddresses;
    @c(a = "job_desc")
    public String jobDesc;
    @c(a = "image_url")
    public String mImageUrl;
    @c(a = "modification_date")
    public String modificationDate;
    @c(a = StringSet.name)
    public String name;
    @c(a = "nick_name")
    public String nickName;
    @c(a = "note")
    public String note;
    @c(a = "organization_name")
    public String organization;
    @c(a = "phone_number")
    public List<String> phoneNumber;
    public transient String photoUri;
    public String section;
    @c(a = "urls")
    public List<String> urls;

    static {
        Covode.recordClassIndex(61569);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.phoneNumber, this.name});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ContactModelV2 contactModelV2 = (ContactModelV2) obj;
            if (!i.a(this.phoneNumber, contactModelV2.phoneNumber) || !i.a(this.name, contactModelV2.name)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
