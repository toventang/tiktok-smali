package com.ss.android.ugc.aweme.publish.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f118613a = 408;
    @c(a = "video_info")

    /* renamed from: b  reason: collision with root package name */
    public final c f118614b = null;
    @c(a = "valid_info")

    /* renamed from: c  reason: collision with root package name */
    public final a f118615c = null;

    static {
        Covode.recordClassIndex(77031);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f118613a == bVar.f118613a && l.a(this.f118614b, bVar.f118614b) && l.a(this.f118615c, bVar.f118615c);
    }

    public final int hashCode() {
        int i2 = this.f118613a * 31;
        c cVar = this.f118614b;
        int i3 = 0;
        int hashCode = (i2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        a aVar = this.f118615c;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "VideoInfoFromURLResponse(statusCode=" + this.f118613a + ", videoInfo=" + this.f118614b + ", validInfo=" + this.f118615c + ")";
    }
}
