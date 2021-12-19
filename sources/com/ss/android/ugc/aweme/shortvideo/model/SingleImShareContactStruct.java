package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class SingleImShareContactStruct extends ImShareContactStruct {
    private int followStatus = -1;
    private String nickname = "";
    private String remarkName = "";
    private String secUid = "";
    private String uid = "";

    static {
        Covode.recordClassIndex(84483);
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getRemarkName() {
        return this.remarkName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.model.ImShareContactStruct
    public final String getDisplayName() {
        if (this.remarkName.length() > 0) {
            return this.remarkName;
        }
        return this.nickname;
    }

    public final void setFollowStatus(int i2) {
        this.followStatus = i2;
    }

    public final void setNickname(String str) {
        l.d(str, "");
        this.nickname = str;
    }

    public final void setRemarkName(String str) {
        l.d(str, "");
        this.remarkName = str;
    }

    public final void setSecUid(String str) {
        l.d(str, "");
        this.secUid = str;
    }

    public final void setUid(String str) {
        l.d(str, "");
        this.uid = str;
    }
}
