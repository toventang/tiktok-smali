package com.ss.android.ugc.aweme.challenge.ui;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* access modifiers changed from: package-private */
public final class r implements Serializable {
    boolean isInLiveDialog = false;
    String parentTagId;

    static {
        Covode.recordClassIndex(43303);
    }

    r(String str) {
        this.parentTagId = str;
    }
}
