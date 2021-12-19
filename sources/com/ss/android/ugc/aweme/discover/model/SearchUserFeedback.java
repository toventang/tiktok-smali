package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class SearchUserFeedback {
    public String schema;

    static {
        Covode.recordClassIndex(50972);
    }

    public final void setSchema(String str) {
        l.d(str, "");
        this.schema = str;
    }

    public SearchUserFeedback(String str) {
        l.d(str, "");
        this.schema = str;
    }
}
