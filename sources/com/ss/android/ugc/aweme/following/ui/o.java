package com.ss.android.ugc.aweme.following.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.x.h;
import com.ss.android.ugc.aweme.following.a.a;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

public final class o implements Serializable {
    private boolean isMine;
    private String mSecUid;
    private a pageType;
    private String uid;

    static {
        Covode.recordClassIndex(61168);
    }

    public final a getPageType() {
        return this.pageType;
    }

    public final String getSecUid() {
        return this.mSecUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final User getUser() {
        return h.f95333c;
    }

    public final boolean isMine() {
        return this.isMine;
    }

    public final Boolean isPageTypeFollower() {
        boolean z;
        if (this.pageType == a.FOLLOWER) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void setMine(boolean z) {
        this.isMine = z;
    }

    public final void setPageType(a aVar) {
        this.pageType = aVar;
    }

    public final void setSecUid(String str) {
        this.mSecUid = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public o(String str, boolean z, a aVar) {
        this.uid = str;
        this.isMine = z;
        this.pageType = aVar;
    }
}
