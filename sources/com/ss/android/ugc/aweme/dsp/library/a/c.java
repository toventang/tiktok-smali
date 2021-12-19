package com.ss.android.ugc.aweme.dsp.library.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.dsp.playerservice.c.f;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final int f83324a;

    /* renamed from: b  reason: collision with root package name */
    public final int f83325b;

    /* renamed from: c  reason: collision with root package name */
    public final f f83326c;

    /* renamed from: d  reason: collision with root package name */
    public final b<Context, z> f83327d;

    static {
        Covode.recordClassIndex(51983);
    }

    private static c a(int i2, int i3, f fVar, b<? super Context, z> bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        return new c(i2, i3, fVar, bVar);
    }

    public static /* synthetic */ c a(c cVar, int i2, int i3, f fVar, b bVar, int i4) {
        if ((i4 & 1) != 0) {
            i2 = cVar.f83324a;
        }
        if ((i4 & 2) != 0) {
            i3 = cVar.f83325b;
        }
        if ((i4 & 4) != 0) {
            fVar = cVar.f83326c;
        }
        if ((i4 & 8) != 0) {
            bVar = cVar.f83327d;
        }
        return a(i2, i3, fVar, bVar);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f83324a == cVar.f83324a && this.f83325b == cVar.f83325b && l.a(this.f83326c, cVar.f83326c) && l.a(this.f83327d, cVar.f83327d);
    }

    public final int hashCode() {
        int i2 = ((this.f83324a * 31) + this.f83325b) * 31;
        f fVar = this.f83326c;
        int i3 = 0;
        int hashCode = (i2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        b<Context, z> bVar = this.f83327d;
        if (bVar != null) {
            i3 = bVar.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "LibraryTitleItem(title=" + this.f83324a + ", count=" + this.f83325b + ", playbackState=" + this.f83326c + ", onPlayClickListener=" + this.f83327d + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super android.content.Context, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(int i2, int i3, f fVar, b<? super Context, z> bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f83324a = i2;
        this.f83325b = i3;
        this.f83326c = fVar;
        this.f83327d = bVar;
    }
}
