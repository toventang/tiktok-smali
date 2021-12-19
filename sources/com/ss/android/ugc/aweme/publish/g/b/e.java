package com.ss.android.ugc.aweme.publish.g.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.g.c.a;
import com.ss.android.ugc.aweme.shortvideo.ee;
import com.ss.android.ugc.aweme.shortvideo.publish.o;
import h.f.b.l;

public final class e extends d {

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f118797b;

    static {
        Covode.recordClassIndex(77150);
    }

    @Override // com.ss.android.ugc.aweme.publish.g.b.d
    public final int a() {
        return a.b(this.f118797b);
    }

    @Override // com.ss.android.ugc.aweme.publish.g.b.d
    public final o b() {
        Throwable th = this.f118797b;
        if (th instanceof com.ss.android.ugc.aweme.publish.d.a) {
            return o.CLIENT;
        }
        if (a.a(th)) {
            return o.CLIENT;
        }
        if (a.c(this.f118797b)) {
            return o.CLIENT;
        }
        return o.VESDK;
    }

    @Override // com.ss.android.ugc.aweme.publish.g.b.d
    public final String c() {
        com.ss.android.ugc.aweme.shortvideo.publish.a.a cancelCause;
        String str;
        if (a.c(this.f118797b)) {
            Throwable th = this.f118797b;
            if (!(th instanceof ee)) {
                th = null;
            }
            ee eeVar = (ee) th;
            if (!(eeVar == null || (cancelCause = eeVar.getCancelCause()) == null || (str = cancelCause.f129677a) == null)) {
                return str;
            }
        }
        return super.c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Throwable th) {
        super(th);
        l.d(th, "");
        this.f118797b = th;
    }
}
