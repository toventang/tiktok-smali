package com.bytedance.android.livesdk;

import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class aj implements f {

    /* renamed from: a  reason: collision with root package name */
    static final f f13794a = new aj();

    static {
        Covode.recordClassIndex(7670);
    }

    private aj() {
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        i.b();
        a.a(5, "ttlive_exception", ((Throwable) obj).getStackTrace());
    }
}
