package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class LinkInfo {
    @c(a = "action_type")
    private final int actionType;
    @c(a = "link_url")
    private final String linkUrl;

    static {
        Covode.recordClassIndex(64051);
    }

    public static int com_ss_android_ugc_aweme_im_sdk_chat_data_model_LinkInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ LinkInfo copy$default(LinkInfo linkInfo, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = linkInfo.linkUrl;
        }
        if ((i3 & 2) != 0) {
            i2 = linkInfo.actionType;
        }
        return linkInfo.copy(str, i2);
    }

    public final String component1() {
        return this.linkUrl;
    }

    public final int component2() {
        return this.actionType;
    }

    public final LinkInfo copy(String str, int i2) {
        l.d(str, "");
        return new LinkInfo(str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkInfo)) {
            return false;
        }
        LinkInfo linkInfo = (LinkInfo) obj;
        return l.a(this.linkUrl, linkInfo.linkUrl) && this.actionType == linkInfo.actionType;
    }

    public final int hashCode() {
        String str = this.linkUrl;
        return ((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_im_sdk_chat_data_model_LinkInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.actionType);
    }

    public final String toString() {
        return "LinkInfo(linkUrl=" + this.linkUrl + ", actionType=" + this.actionType + ")";
    }

    public final int getActionType() {
        return this.actionType;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public LinkInfo(String str, int i2) {
        l.d(str, "");
        this.linkUrl = str;
        this.actionType = i2;
    }
}
