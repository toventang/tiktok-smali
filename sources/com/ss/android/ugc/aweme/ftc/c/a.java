package com.ss.android.ugc.aweme.ftc.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final c f97534a;

    static {
        Covode.recordClassIndex(61968);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f97534a, ((a) obj).f97534a);
        }
        return true;
    }

    public final int hashCode() {
        c cVar = this.f97534a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DeleteDraftEvent(data=" + this.f97534a + ")";
    }

    public a(c cVar) {
        l.d(cVar, "");
        this.f97534a = cVar;
    }
}
