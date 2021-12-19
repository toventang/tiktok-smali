package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ac.a;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import h.f.b.l;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<VideoSegment> f125663a;

    /* renamed from: b  reason: collision with root package name */
    public final long f125664b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f125665c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f125666d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f125667e;

    /* renamed from: f  reason: collision with root package name */
    public final c f125668f;

    /* renamed from: g  reason: collision with root package name */
    public final a f125669g;

    static {
        Covode.recordClassIndex(82535);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f125663a, bVar.f125663a) && this.f125664b == bVar.f125664b && this.f125665c == bVar.f125665c && this.f125666d == bVar.f125666d && this.f125667e == bVar.f125667e && l.a(this.f125668f, bVar.f125668f) && l.a(this.f125669g, bVar.f125669g);
    }

    public final String toString() {
        return "CutStatusModel(videoSegments=" + this.f125663a + ", videoLength=" + this.f125664b + ", isMusicStickPointMode=" + this.f125665c + ", isMultiEditMode=" + this.f125666d + ", hadChangeSpeed=" + this.f125667e + ", stickPointMusic=" + this.f125668f + ", stickPointData=" + this.f125669g + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        List<VideoSegment> list = this.f125663a;
        int i4 = 0;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f125664b;
        int i5 = ((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.f125665c;
        int i6 = 1;
        if (z) {
            z = true;
        }
        int i7 = z ? 1 : 0;
        int i8 = z ? 1 : 0;
        int i9 = z ? 1 : 0;
        int i10 = (i5 + i7) * 31;
        boolean z2 = this.f125666d;
        if (z2) {
            z2 = true;
        }
        int i11 = z2 ? 1 : 0;
        int i12 = z2 ? 1 : 0;
        int i13 = z2 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        if (!this.f125667e) {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 31;
        c cVar = this.f125668f;
        if (cVar != null) {
            i3 = cVar.hashCode();
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 31;
        a aVar = this.f125669g;
        if (aVar != null) {
            i4 = aVar.hashCode();
        }
        return i16 + i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends VideoSegment> list, long j2, boolean z, boolean z2, boolean z3, c cVar, a aVar) {
        l.d(list, "");
        this.f125663a = list;
        this.f125664b = j2;
        this.f125665c = z;
        this.f125666d = z2;
        this.f125667e = z3;
        this.f125668f = cVar;
        this.f125669g = aVar;
    }
}
