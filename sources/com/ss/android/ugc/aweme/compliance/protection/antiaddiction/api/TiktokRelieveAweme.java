package com.ss.android.ugc.aweme.compliance.protection.antiaddiction.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.io.Serializable;

public final class TiktokRelieveAweme extends BaseResponse implements Serializable {
    @c(a = "aweme_id")
    private final String awemeId;

    static {
        Covode.recordClassIndex(48294);
    }

    public static /* synthetic */ TiktokRelieveAweme copy$default(TiktokRelieveAweme tiktokRelieveAweme, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tiktokRelieveAweme.awemeId;
        }
        return tiktokRelieveAweme.copy(str);
    }

    public final String component1() {
        return this.awemeId;
    }

    public final TiktokRelieveAweme copy(String str) {
        l.d(str, "");
        return new TiktokRelieveAweme(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TiktokRelieveAweme) && l.a(this.awemeId, ((TiktokRelieveAweme) obj).awemeId);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.awemeId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "TiktokRelieveAweme(awemeId=" + this.awemeId + ")";
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public TiktokRelieveAweme(String str) {
        l.d(str, "");
        this.awemeId = str;
    }
}
