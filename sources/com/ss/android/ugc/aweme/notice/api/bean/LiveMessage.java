package com.ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public class LiveMessage extends b {
    @c(a = "anchor_avatar")
    private UrlModel anchorAvatar;
    @c(a = "anchor_id")
    private String anchorId;
    @c(a = StringSet.type)
    private int liveMessageType;

    static {
        Covode.recordClassIndex(72411);
    }

    public UrlModel getAnchorAvatar() {
        return this.anchorAvatar;
    }

    public String getAnchorId() {
        return this.anchorId;
    }

    public int getLiveMessageType() {
        return this.liveMessageType;
    }

    public LiveMessage() {
        this.msgType = f.LIVE;
    }

    public void setAnchorAvatar(UrlModel urlModel) {
        this.anchorAvatar = urlModel;
    }

    public void setAnchorId(String str) {
        this.anchorId = str;
    }

    public void setLiveMessageType(int i2) {
        this.liveMessageType = i2;
    }
}
