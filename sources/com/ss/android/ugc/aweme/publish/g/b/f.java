package com.ss.android.ugc.aweme.publish.g.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.g.c.a;
import com.ss.android.ugc.aweme.shortvideo.publish.o;
import h.f.b.l;

public final class f extends d {

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f118798b;

    static {
        Covode.recordClassIndex(77151);
    }

    @Override // com.ss.android.ugc.aweme.publish.g.b.d
    public final int a() {
        return a.d(this.f118798b);
    }

    @Override // com.ss.android.ugc.aweme.publish.g.b.d
    public final o b() {
        if (this.f118798b instanceof com.ss.android.ugc.aweme.publish.d.a) {
            return o.CLIENT;
        }
        return o.UPLOAD_SDK;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Throwable th) {
        super(th);
        l.d(th, "");
        this.f118798b = th;
    }
}
