package com.ss.android.ugc.aweme.dsp.playpage.queue;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playpage.base.b;
import h.f.b.l;

public final class c implements com.bytedance.assem.arch.extensions.c {

    /* renamed from: a  reason: collision with root package name */
    public final b f83916a;

    static {
        Covode.recordClassIndex(52335);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.f83916a, ((c) obj).f83916a);
        }
        return true;
    }

    public final int hashCode() {
        b bVar = this.f83916a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MDQueueHierarchyData(playPage=" + this.f83916a + ")";
    }

    public c(b bVar) {
        l.d(bVar, "");
        this.f83916a = bVar;
    }
}
