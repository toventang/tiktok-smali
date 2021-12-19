package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.User;

public class SmsParseResponse {
    @c(a = "status_code")
    public int statusCode;
    @c(a = "user")
    public User user;

    static {
        Covode.recordClassIndex(61605);
    }
}
