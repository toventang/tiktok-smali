package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;

public final class HotSoonRelationNotice extends IMUser {
    private final String notice;

    static {
        Covode.recordClassIndex(61575);
    }

    public final String getNotice() {
        return this.notice;
    }

    public HotSoonRelationNotice(String str) {
        l.d(str, "");
        this.notice = str;
    }
}
