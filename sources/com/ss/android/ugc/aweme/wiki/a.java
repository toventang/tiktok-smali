package com.ss.android.ugc.aweme.wiki;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "status_code")
    private final int code;
    @c(a = "status_msg")
    private final String msg;
    @c(a = "review_result_type")
    private final Integer reviewResultType;
    @c(a = "review_text")
    private final String reviewText;

    static {
        Covode.recordClassIndex(94885);
    }

    public static int com_ss_android_ugc_aweme_wiki_CheckAnchorModerationResultResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ a copy$default(a aVar, int i2, String str, Integer num, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = aVar.code;
        }
        if ((i3 & 2) != 0) {
            str = aVar.msg;
        }
        if ((i3 & 4) != 0) {
            num = aVar.reviewResultType;
        }
        if ((i3 & 8) != 0) {
            str2 = aVar.reviewText;
        }
        return aVar.copy(i2, str, num, str2);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.msg;
    }

    public final Integer component3() {
        return this.reviewResultType;
    }

    public final String component4() {
        return this.reviewText;
    }

    public final a copy(int i2, String str, Integer num, String str2) {
        return new a(i2, str, num, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.code == aVar.code && l.a(this.msg, aVar.msg) && l.a(this.reviewResultType, aVar.reviewResultType) && l.a(this.reviewText, aVar.reviewText);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_wiki_CheckAnchorModerationResultResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_wiki_CheckAnchorModerationResultResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.code) * 31;
        String str = this.msg;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_wiki_CheckAnchorModerationResultResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.reviewResultType;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.reviewText;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "CheckAnchorModerationResultResponse(code=" + this.code + ", msg=" + this.msg + ", reviewResultType=" + this.reviewResultType + ", reviewText=" + this.reviewText + ")";
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final Integer getReviewResultType() {
        return this.reviewResultType;
    }

    public final String getReviewText() {
        return this.reviewText;
    }

    public a(int i2, String str, Integer num, String str2) {
        this.code = i2;
        this.msg = str;
        this.reviewResultType = num;
        this.reviewText = str2;
    }
}
