package com.ss.android.ugc.aweme.music.ui.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.Music;
import h.f.b.l;
import java.util.List;

public final class g extends BaseResponse {
    @c(a = "next_cursor")

    /* renamed from: a  reason: collision with root package name */
    public final int f111960a;
    @c(a = "has_more")

    /* renamed from: b  reason: collision with root package name */
    public final boolean f111961b;
    @c(a = "music_list")

    /* renamed from: c  reason: collision with root package name */
    public final List<Music> f111962c;
    @c(a = "log_pb")

    /* renamed from: d  reason: collision with root package name */
    public final LogPbBean f111963d;

    static {
        Covode.recordClassIndex(71961);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f111960a == gVar.f111960a && this.f111961b == gVar.f111961b && l.a(this.f111962c, gVar.f111962c) && l.a(this.f111963d, gVar.f111963d);
    }

    public final int hashCode() {
        int i2 = this.f111960a * 31;
        boolean z = this.f111961b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i2 + i3) * 31;
        List<Music> list = this.f111962c;
        int i7 = 0;
        int hashCode = (i6 + (list != null ? list.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.f111963d;
        if (logPbBean != null) {
            i7 = logPbBean.hashCode();
        }
        return hashCode + i7;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "MusicListResponse(cursor=" + this.f111960a + ", hasMore=" + this.f111961b + ", musicList=" + this.f111962c + ", logPb=" + this.f111963d + ")";
    }
}
