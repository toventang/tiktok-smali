package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class IMNoticeMsgStruct {
    @c(a = "msg_content")
    private IMFromMessageTips msgContent;
    @c(a = "msg_type")
    private Integer msgType;
    @c(a = "notice_code")
    private String noticeCode;

    static {
        Covode.recordClassIndex(64045);
    }

    public static /* synthetic */ IMNoticeMsgStruct copy$default(IMNoticeMsgStruct iMNoticeMsgStruct, Integer num, String str, IMFromMessageTips iMFromMessageTips, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = iMNoticeMsgStruct.msgType;
        }
        if ((i2 & 2) != 0) {
            str = iMNoticeMsgStruct.noticeCode;
        }
        if ((i2 & 4) != 0) {
            iMFromMessageTips = iMNoticeMsgStruct.msgContent;
        }
        return iMNoticeMsgStruct.copy(num, str, iMFromMessageTips);
    }

    public final Integer component1() {
        return this.msgType;
    }

    public final String component2() {
        return this.noticeCode;
    }

    public final IMFromMessageTips component3() {
        return this.msgContent;
    }

    public final IMNoticeMsgStruct copy(Integer num, String str, IMFromMessageTips iMFromMessageTips) {
        l.d(iMFromMessageTips, "");
        return new IMNoticeMsgStruct(num, str, iMFromMessageTips);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMNoticeMsgStruct)) {
            return false;
        }
        IMNoticeMsgStruct iMNoticeMsgStruct = (IMNoticeMsgStruct) obj;
        return l.a(this.msgType, iMNoticeMsgStruct.msgType) && l.a(this.noticeCode, iMNoticeMsgStruct.noticeCode) && l.a(this.msgContent, iMNoticeMsgStruct.msgContent);
    }

    public final int hashCode() {
        Integer num = this.msgType;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.noticeCode;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        IMFromMessageTips iMFromMessageTips = this.msgContent;
        if (iMFromMessageTips != null) {
            i2 = iMFromMessageTips.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "IMNoticeMsgStruct(msgType=" + this.msgType + ", noticeCode=" + this.noticeCode + ", msgContent=" + this.msgContent + ")";
    }

    public final IMFromMessageTips getMsgContent() {
        return this.msgContent;
    }

    public final Integer getMsgType() {
        return this.msgType;
    }

    public final String getNoticeCode() {
        return this.noticeCode;
    }

    public final void setMsgType(Integer num) {
        this.msgType = num;
    }

    public final void setNoticeCode(String str) {
        this.noticeCode = str;
    }

    public final void setMsgContent(IMFromMessageTips iMFromMessageTips) {
        l.d(iMFromMessageTips, "");
        this.msgContent = iMFromMessageTips;
    }

    public IMNoticeMsgStruct(Integer num, String str, IMFromMessageTips iMFromMessageTips) {
        l.d(iMFromMessageTips, "");
        this.msgType = num;
        this.noticeCode = str;
        this.msgContent = iMFromMessageTips;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IMNoticeMsgStruct(Integer num, String str, IMFromMessageTips iMFromMessageTips, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : str, iMFromMessageTips);
    }
}
