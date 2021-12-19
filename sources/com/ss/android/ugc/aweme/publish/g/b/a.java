package com.ss.android.ugc.aweme.publish.g.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.shortvideo.publish.o;
import h.f.b.l;

public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f118792b;

    static {
        Covode.recordClassIndex(77146);
    }

    private static boolean d() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.publish.g.b.d
    public final int a() {
        return com.ss.android.ugc.aweme.publish.g.c.a.a(this.f118792b, 11);
    }

    @Override // com.ss.android.ugc.aweme.publish.g.b.d
    public final o b() {
        if (this.f118792b instanceof com.ss.android.ugc.aweme.publish.d.a) {
            return o.CLIENT;
        }
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = d();
        }
        if (j.f107226e) {
            return o.CLIENT;
        }
        return o.SERVER;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Throwable th) {
        super(th);
        l.d(th, "");
        this.f118792b = th;
    }
}
