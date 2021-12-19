package com.ss.android.ugc.aweme.tools.draft.d;

import com.bytedance.covode.number.Covode;

public final class n extends a {

    /* renamed from: c  reason: collision with root package name */
    public int f139514c;

    /* renamed from: d  reason: collision with root package name */
    private final int f139515d;

    static {
        Covode.recordClassIndex(91219);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.d.a
    public final int a() {
        return this.f139515d;
    }

    public final int hashCode() {
        return this.f139514c;
    }

    private n() {
        super((byte) 0);
        this.f139515d = 102;
        this.f139514c = -1;
    }

    public /* synthetic */ n(byte b2) {
        this();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (nVar.f139515d == this.f139515d && nVar.f139514c == this.f139514c) {
            return true;
        }
        return false;
    }
}
