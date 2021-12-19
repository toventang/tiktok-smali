package com.ss.android.ugc.aweme.share.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class b extends BaseResponse {
    @c(a = "checksum")

    /* renamed from: a  reason: collision with root package name */
    public final String f124105a;

    static {
        Covode.recordClassIndex(81509);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f124105a, ((b) obj).f124105a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f124105a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "SharerInfoChecksum(checksum=" + this.f124105a + ")";
    }
}
