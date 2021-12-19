package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.f.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class BaseContent extends c implements PreloadFetcher, Serializable {
    @com.google.gson.a.c(a = "ext")
    SystemContent extContent;
    @com.google.gson.a.c(a = "is_card")
    public boolean isCard;
    private long mSendStartTime;
    protected String msgHint = "";
    @com.google.gson.a.c(a = "prev_id")
    Long prevId;
    @com.google.gson.a.c(a = "root_id")
    Long rootId;
    @com.google.gson.a.c(a = "aweType")
    int type;

    static {
        Covode.recordClassIndex(64021);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher
    public List<UrlModel> fetchPreload() {
        return null;
    }

    public SharePackage generateSharePackage() {
        return null;
    }

    public boolean isValid() {
        return true;
    }

    public void tryInit() {
    }

    public int getType() {
        return this.type;
    }

    public Map<String, String> eventParam() {
        return Collections.emptyMap();
    }

    public SystemContent getExtContent() {
        setSystem(this.extContent);
        return this.extContent;
    }

    public String getMsgHint() {
        tryInit();
        return this.msgHint;
    }

    public Long getSendStartTime() {
        return Long.valueOf(this.mSendStartTime);
    }

    public String toString() {
        return getClass().getSimpleName() + "{type=" + this.type + ", prevId=" + this.prevId + ", rootId=" + this.rootId + ", isCard=" + this.isCard + ", extContent=" + this.extContent + ", msgHint='" + this.msgHint + '\'' + ", mSendStartTime=" + this.mSendStartTime + '}';
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public String getQuoteHint(Context context) {
        return getMsgHint();
    }

    public void setExtContent(SystemContent systemContent) {
        setSystem(systemContent);
        this.extContent = systemContent;
    }

    public void setSendStartTime(Long l2) {
        this.mSendStartTime = l2.longValue();
    }

    public void setSystem(SystemContent systemContent) {
        if (systemContent != null) {
            systemContent.setType(100);
        }
    }

    public static void wrapForward(BaseContent baseContent, long j2) {
        if (baseContent != null && j2 > 0) {
            baseContent.prevId = Long.valueOf(j2);
            Long l2 = baseContent.rootId;
            if (l2 == null || l2.longValue() <= 0) {
                baseContent.rootId = Long.valueOf(j2);
            }
        }
    }

    public String wrapMsgHint(boolean z, boolean z2, String str) {
        return getMsgHint();
    }
}
