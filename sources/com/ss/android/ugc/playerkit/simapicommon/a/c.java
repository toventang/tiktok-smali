package com.ss.android.ugc.playerkit.simapicommon.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class c implements Serializable {
    private final String language;
    private final long languageId;

    static {
        Covode.recordClassIndex(98029);
    }

    public static int com_ss_android_ugc_playerkit_simapicommon_model_OriginalLanguageInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ c copy$default(c cVar, String str, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cVar.language;
        }
        if ((i2 & 2) != 0) {
            j2 = cVar.languageId;
        }
        return cVar.copy(str, j2);
    }

    public final String component1() {
        return this.language;
    }

    public final long component2() {
        return this.languageId;
    }

    public final c copy(String str, long j2) {
        l.c(str, "");
        return new c(str, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.language, cVar.language) && this.languageId == cVar.languageId;
    }

    public final int hashCode() {
        String str = this.language;
        return ((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_playerkit_simapicommon_model_OriginalLanguageInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.languageId);
    }

    public final String toString() {
        return "OriginalLanguageInfo(language=" + this.language + ", languageId=" + this.languageId + ")";
    }

    public final String getLanguage() {
        return this.language;
    }

    public final long getLanguageId() {
        return this.languageId;
    }

    public c(String str, long j2) {
        l.c(str, "");
        this.language = str;
        this.languageId = j2;
    }
}
