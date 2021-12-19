package com.ss.android.ugc.aweme.shoutouts.review.cell;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shoutouts.review.b.b;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f133415a;

    static {
        Covode.recordClassIndex(87251);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f133415a, ((a) obj).f133415a);
        }
        return true;
    }

    public final int hashCode() {
        b bVar = this.f133415a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ShoutoutsRemoveCell(item=" + this.f133415a + ")";
    }

    public a(b bVar) {
        l.d(bVar, "");
        this.f133415a = bVar;
    }
}
