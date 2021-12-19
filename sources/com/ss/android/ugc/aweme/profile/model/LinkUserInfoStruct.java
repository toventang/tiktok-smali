package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class LinkUserInfoStruct implements Serializable {
    @c(a = "auth_status")
    public int authStatus = -1;
    @c(a = "auth_type")
    public int authType = -1;

    static {
        Covode.recordClassIndex(75234);
    }
}
