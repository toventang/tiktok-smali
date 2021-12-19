package com.ss.android.ugc.gamora.editor.lightening.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.c;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final c f146122a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f146123b;

    static {
        Covode.recordClassIndex(96026);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f146122a, iVar.f146122a) && this.f146123b == iVar.f146123b;
    }

    public final int hashCode() {
        c cVar = this.f146122a;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        boolean z = this.f146123b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "RecMusicLoadSuccessResult(music=" + this.f146122a + ", isAlreadyChooseMusic=" + this.f146123b + ")";
    }

    public i(c cVar, boolean z) {
        l.d(cVar, "");
        this.f146122a = cVar;
        this.f146123b = z;
    }
}
