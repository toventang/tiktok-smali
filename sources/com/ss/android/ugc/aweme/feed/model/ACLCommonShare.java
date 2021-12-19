package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class ACLCommonShare implements Serializable {
    public static final Companion Companion = new Companion(null);
    public AclType awemeAclType = AclType.SHARE_GENERAL;
    @c(a = "code")
    public int code;
    @c(a = "extra")
    public String extra = "";
    @c(a = "mute")
    public boolean mute;
    @c(a = "platform_id")
    public String platformId = "";
    @c(a = "popup_msg")
    public String popupMsg = "";
    @c(a = "show_type")
    public int showType = 2;
    @c(a = "toast_msg")
    public String toastMsg = "";
    @c(a = "transcode")
    public int transcode = 3;

    static {
        Covode.recordClassIndex(59284);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(59285);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final AclType getAwemeAclType() {
        return this.awemeAclType;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final boolean getMute() {
        return this.mute;
    }

    public final String getPlatformId() {
        return this.platformId;
    }

    public final String getPopupMsg() {
        return this.popupMsg;
    }

    public final int getShowType() {
        return this.showType;
    }

    public final String getToastMsg() {
        return this.toastMsg;
    }

    public final int getTranscode() {
        return this.transcode;
    }

    public final void setCode(int i2) {
        this.code = i2;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setMute(boolean z) {
        this.mute = z;
    }

    public final void setPlatformId(String str) {
        this.platformId = str;
    }

    public final void setPopupMsg(String str) {
        this.popupMsg = str;
    }

    public final void setShowType(int i2) {
        this.showType = i2;
    }

    public final void setToastMsg(String str) {
        this.toastMsg = str;
    }

    public final void setTranscode(int i2) {
        this.transcode = i2;
    }

    public final void setAwemeAclType(AclType aclType) {
        l.d(aclType, "");
        this.awemeAclType = aclType;
    }
}
