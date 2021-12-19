package com.ss.android.ugc.aweme.dsp.library.a;

import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playpage.model.g;
import h.f.b.l;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final g f83329a;

    static {
        Covode.recordClassIndex(51984);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.f83329a, ((d) obj).f83329a);
        }
        return true;
    }

    public final int hashCode() {
        g gVar = this.f83329a;
        if (gVar != null) {
            return gVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MDPageSceneData(pageScene=" + this.f83329a + ")";
    }

    public d(g gVar) {
        l.d(gVar, "");
        this.f83329a = gVar;
    }
}
