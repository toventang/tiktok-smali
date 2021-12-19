package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class UserPronounsInfo implements Serializable {
    @c(a = "enable_edit_pronouns")
    private Boolean enableEditPronouns;
    @c(a = "pronouns")
    private String pronouns;

    static {
        Covode.recordClassIndex(75288);
    }

    public final Boolean getEnableEditPronouns() {
        return this.enableEditPronouns;
    }

    public final String getPronouns() {
        return this.pronouns;
    }

    public final void setEnableEditPronouns(Boolean bool) {
        this.enableEditPronouns = bool;
    }

    public final void setPronouns(String str) {
        this.pronouns = str;
    }
}
