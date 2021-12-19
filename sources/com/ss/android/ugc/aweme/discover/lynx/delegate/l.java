package com.ss.android.ugc.aweme.discover.lynx.delegate;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.xsearch.c;
import com.ss.android.ugc.aweme.xsearch.d;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    int f81543a = -1;

    /* renamed from: b  reason: collision with root package name */
    public c f81544b;

    static {
        Covode.recordClassIndex(50674);
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (this.f81543a >= 0) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (b()) {
            d.f145151b.a(this.f81543a);
            this.f81543a = -1;
        }
    }
}
