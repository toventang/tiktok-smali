package com.ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class UnRegisteredUser {
    @c(a = "invite_status")
    public int inviteStatus;
    @c(a = "mobile_id")
    public String mobileId;
    @c(a = "remark_name")
    public String remarkName;

    static {
        Covode.recordClassIndex(61622);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof UnRegisteredUser) && TextUtils.equals(this.mobileId, ((UnRegisteredUser) obj).mobileId)) {
            return super.equals(obj);
        }
        return false;
    }
}
