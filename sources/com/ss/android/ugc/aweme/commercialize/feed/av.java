package com.ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.commercialize.feed.h;
import com.ss.android.ugc.aweme.commercialize.link.a.a;
import com.ss.android.ugc.aweme.commercialize.log.j;

/* access modifiers changed from: package-private */
public final /* synthetic */ class av implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h.AnonymousClass2 f74167a;

    static {
        Covode.recordClassIndex(45762);
    }

    av(h.AnonymousClass2 r1) {
        this.f74167a = r1;
    }

    public final void run() {
        h.AnonymousClass2 r3 = this.f74167a;
        if (r3.f74230a > 0) {
            a.C1683a a2 = r3.e().a("display_1s");
            int i2 = 0;
            if (!h.this.G() && !h.this.C() && o.b(h.this.N)) {
                i2 = 100;
            }
            j.a(h.this.ae, a2.a(i2).a());
        }
    }
}
