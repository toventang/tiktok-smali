package com.ss.android.ugc.aweme.tools.draft.d;

import com.bytedance.covode.number.Covode;

public final class k extends a {

    /* renamed from: c  reason: collision with root package name */
    public int f139507c;

    /* renamed from: d  reason: collision with root package name */
    private final int f139508d;

    static {
        Covode.recordClassIndex(91216);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.d.a
    public final int a() {
        return this.f139508d;
    }

    public final int hashCode() {
        return this.f139507c;
    }

    private k() {
        super((byte) 0);
        this.f139508d = 108;
        this.f139507c = 0;
    }

    public /* synthetic */ k(byte b2) {
        this();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kVar.f139508d == this.f139508d && kVar.f139507c == this.f139507c) {
            return true;
        }
        return false;
    }
}
