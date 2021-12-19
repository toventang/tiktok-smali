package com.ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public boolean f123562a;

    /* renamed from: b  reason: collision with root package name */
    public int f123563b;

    /* renamed from: c  reason: collision with root package name */
    public String f123564c;

    static {
        Covode.recordClassIndex(81117);
    }

    public i() {
        this.f123563b = -1;
        this.f123564c = "";
    }

    public final void a(String str) {
        l.d(str, "");
        this.f123564c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i(boolean z, String str) {
        this();
        l.d(str, "");
        this.f123562a = z;
        this.f123564c = str;
    }
}
