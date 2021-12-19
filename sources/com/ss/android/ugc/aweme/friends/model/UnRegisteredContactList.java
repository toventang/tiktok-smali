package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class UnRegisteredContactList {
    @c(a = "unregistered_user")
    public List<ContactModel> contacts;
    @c(a = "status_code")
    public int status_code = -1;

    static {
        Covode.recordClassIndex(61621);
    }
}
