package com.ss.android.ugc.aweme.account.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class CachedUserAgeInfo implements Serializable {
    private String birthday;

    static {
        Covode.recordClassIndex(40056);
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final void setBirthday(String str) {
        this.birthday = str;
    }

    public CachedUserAgeInfo(String str) {
        this.birthday = str;
    }
}
