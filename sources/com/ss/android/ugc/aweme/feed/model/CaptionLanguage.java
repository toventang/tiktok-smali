package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class CaptionLanguage implements Serializable {
    @c(a = "language_id")
    public long languageId;
    @c(a = "lang")
    public String languageName;

    static {
        Covode.recordClassIndex(59356);
    }

    public CaptionLanguage() {
        this(null, 0, 3, null);
    }

    public static int com_ss_android_ugc_aweme_feed_model_CaptionLanguage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ CaptionLanguage copy$default(CaptionLanguage captionLanguage, String str, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = captionLanguage.languageName;
        }
        if ((i2 & 2) != 0) {
            j2 = captionLanguage.languageId;
        }
        return captionLanguage.copy(str, j2);
    }

    public final String component1() {
        return this.languageName;
    }

    public final long component2() {
        return this.languageId;
    }

    public final CaptionLanguage copy(String str, long j2) {
        l.d(str, "");
        return new CaptionLanguage(str, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionLanguage)) {
            return false;
        }
        CaptionLanguage captionLanguage = (CaptionLanguage) obj;
        return l.a(this.languageName, captionLanguage.languageName) && this.languageId == captionLanguage.languageId;
    }

    public final int hashCode() {
        String str = this.languageName;
        return ((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_feed_model_CaptionLanguage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.languageId);
    }

    public final String toString() {
        return "CaptionLanguage(languageName=" + this.languageName + ", languageId=" + this.languageId + ")";
    }

    public final long getLanguageId() {
        return this.languageId;
    }

    public final String getLanguageName() {
        return this.languageName;
    }

    public CaptionLanguage(String str, long j2) {
        l.d(str, "");
        this.languageName = str;
        this.languageId = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CaptionLanguage(String str, long j2, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : j2);
    }
}
