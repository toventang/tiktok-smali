package com.ss.android.ugc.aweme.favorites.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.MixStruct;
import h.f.b.l;
import java.util.List;

public final class a extends BaseResponse {
    @c(a = "mix_infos")

    /* renamed from: a  reason: collision with root package name */
    public final List<MixStruct> f90472a;
    @c(a = "cursor")

    /* renamed from: b  reason: collision with root package name */
    public final long f90473b;
    @c(a = "has_more")

    /* renamed from: c  reason: collision with root package name */
    public final int f90474c;

    static {
        Covode.recordClassIndex(56791);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f90472a, aVar.f90472a) && this.f90473b == aVar.f90473b && this.f90474c == aVar.f90474c;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "MixListCollectionResponse(mixInfos=" + this.f90472a + ", cursor=" + this.f90473b + ", hasMore=" + this.f90474c + ")";
    }

    public final int hashCode() {
        int i2;
        List<MixStruct> list = this.f90472a;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f90473b;
        return (((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f90474c;
    }
}
