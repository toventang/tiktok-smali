package com.ss.android.ugc.aweme.social.widget.card.permission;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.social.widget.card.a.f;
import h.f.b.l;

public final class a extends c {

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.social.widget.card.a.a f133823b;

    static {
        Covode.recordClassIndex(87546);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.permission.c
    public final com.ss.android.ugc.aweme.social.widget.card.a.a a() {
        return this.f133823b;
    }

    public final int hashCode() {
        com.ss.android.ugc.aweme.social.widget.card.a.a aVar = this.f133823b;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ContactItem(variant=" + this.f133823b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.ss.android.ugc.aweme.social.widget.card.a.a aVar) {
        super(f.CONTACT, aVar);
        l.d(aVar, "");
        this.f133823b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a) || !l.a(this.f133823b, ((a) obj).f133823b)) {
            return false;
        }
        return true;
    }
}
