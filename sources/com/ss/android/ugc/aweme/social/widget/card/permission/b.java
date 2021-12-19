package com.ss.android.ugc.aweme.social.widget.card.permission;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.social.widget.card.a.a;
import com.ss.android.ugc.aweme.social.widget.card.a.f;
import h.f.b.l;

public final class b extends c {

    /* renamed from: b  reason: collision with root package name */
    private final a f133824b;

    static {
        Covode.recordClassIndex(87547);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.permission.c
    public final a a() {
        return this.f133824b;
    }

    public final int hashCode() {
        a aVar = this.f133824b;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FacebookItem(variant=" + this.f133824b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(f.FACEBOOK, aVar);
        l.d(aVar, "");
        this.f133824b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b) || !l.a(this.f133824b, ((b) obj).f133824b)) {
            return false;
        }
        return true;
    }
}
