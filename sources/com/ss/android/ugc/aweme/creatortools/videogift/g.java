package com.ss.android.ugc.aweme.creatortools.videogift;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class g extends BaseResponse {
    @c(a = "video_gift_status")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f78484a;

    static {
        Covode.recordClassIndex(48743);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g) && l.a(this.f78484a, ((g) obj).f78484a);
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.f78484a;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "VideoGiftSettingResponse(videoGiftStatus=" + this.f78484a + ")";
    }
}
