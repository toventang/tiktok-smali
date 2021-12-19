package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class TagBAUser implements Serializable {
    @c(a = "handle_name")
    private final String handleName;
    @c(a = "uid")
    private final String uid;

    static {
        Covode.recordClassIndex(75263);
    }

    public final String getHandleName() {
        return this.handleName;
    }

    public final String getUid() {
        return this.uid;
    }
}
