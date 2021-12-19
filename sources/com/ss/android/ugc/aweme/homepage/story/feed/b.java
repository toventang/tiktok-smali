package com.ss.android.ugc.aweme.homepage.story.feed;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f99397a;

    /* renamed from: b  reason: collision with root package name */
    public final a f99398b;

    static {
        Covode.recordClassIndex(63325);
    }

    public b() {
        this(false, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f99397a == bVar.f99397a && l.a(this.f99398b, bVar.f99398b);
    }

    public final int hashCode() {
        boolean z = this.f99397a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        a aVar = this.f99398b;
        return i5 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "ContainerMessage(newData=" + this.f99397a + ", nextInstruction=" + this.f99398b + ")";
    }

    public b(boolean z, a aVar) {
        l.d(aVar, "");
        this.f99397a = z;
        this.f99398b = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(boolean z, a aVar, int i2) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? a.DEFAULT : aVar);
    }
}
