package com.ss.android.ugc.aweme.tools.draft.d;

import com.bytedance.covode.number.Covode;

public final class l extends a {

    /* renamed from: c  reason: collision with root package name */
    public String f139509c;

    /* renamed from: d  reason: collision with root package name */
    public String f139510d;

    /* renamed from: e  reason: collision with root package name */
    private final int f139511e;

    static {
        Covode.recordClassIndex(91217);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.d.a
    public final int a() {
        return this.f139511e;
    }

    public /* synthetic */ l() {
        this("", "");
    }

    public final int hashCode() {
        return this.f139510d.hashCode();
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        this.f139509c = str;
    }

    public final void b(String str) {
        h.f.b.l.d(str, "");
        this.f139510d = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (lVar.f139511e != this.f139511e || !h.f.b.l.a((Object) lVar.f139509c, (Object) this.f139509c) || !h.f.b.l.a((Object) lVar.f139510d, (Object) this.f139510d)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private l(String str, String str2) {
        super((byte) 0);
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        this.f139511e = 103;
        this.f139509c = str;
        this.f139510d = str2;
    }
}
