package com.ss.android.ugc.aweme.feed.caption.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class CaptionData implements Serializable {
    @c(a = "end_time")
    private final int endTime;
    @c(a = "gender")
    private final String gender;
    @c(a = "start_time")
    private final int startTime;
    @c(a = "text")
    private String text;

    static {
        Covode.recordClassIndex(58847);
    }

    public CaptionData() {
        this(0, 0, null, null, 15, null);
    }

    public static int com_ss_android_ugc_aweme_feed_caption_edit_CaptionData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ CaptionData copy$default(CaptionData captionData, int i2, int i3, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = captionData.startTime;
        }
        if ((i4 & 2) != 0) {
            i3 = captionData.endTime;
        }
        if ((i4 & 4) != 0) {
            str = captionData.text;
        }
        if ((i4 & 8) != 0) {
            str2 = captionData.gender;
        }
        return captionData.copy(i2, i3, str, str2);
    }

    public final int component1() {
        return this.startTime;
    }

    public final int component2() {
        return this.endTime;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.gender;
    }

    public final CaptionData copy(int i2, int i3, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return new CaptionData(i2, i3, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionData)) {
            return false;
        }
        CaptionData captionData = (CaptionData) obj;
        return this.startTime == captionData.startTime && this.endTime == captionData.endTime && l.a(this.text, captionData.text) && l.a(this.gender, captionData.gender);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_caption_edit_CaptionData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_feed_caption_edit_CaptionData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.startTime) * 31) + com_ss_android_ugc_aweme_feed_caption_edit_CaptionData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.endTime)) * 31;
        String str = this.text;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_caption_edit_CaptionData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.gender;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CaptionData(startTime=" + this.startTime + ", endTime=" + this.endTime + ", text=" + this.text + ", gender=" + this.gender + ")";
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final String getGender() {
        return this.gender;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        l.d(str, "");
        this.text = str;
    }

    public CaptionData(int i2, int i3, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.startTime = i2;
        this.endTime = i3;
        this.text = str;
        this.gender = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CaptionData(int i2, int i3, String str, String str2, int i4, g gVar) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? "male" : str2);
    }
}
