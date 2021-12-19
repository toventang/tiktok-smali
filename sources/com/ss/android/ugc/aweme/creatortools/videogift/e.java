package com.ss.android.ugc.aweme.creatortools.videogift;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class e extends BaseResponse {
    @c(a = "image")

    /* renamed from: a  reason: collision with root package name */
    public final b f78481a;
    @c(a = "requirements")

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f78482b;

    static {
        Covode.recordClassIndex(48741);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f78481a, eVar.f78481a) && l.a(this.f78482b, eVar.f78482b);
    }

    public final int hashCode() {
        b bVar = this.f78481a;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        List<d> list = this.f78482b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "VideoGiftEligibilityResponse(image=" + this.f78481a + ", requirements=" + this.f78482b + ")";
    }
}
