package com.ss.android.ugc.aweme.aabplugin.core.base;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.m.c;
import com.google.android.play.core.tasks.a;
import com.google.android.play.core.tasks.n;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f62482a;

    /* renamed from: b  reason: collision with root package name */
    private final n f62483b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62484c;

    static {
        Covode.recordClassIndex(38450);
    }

    e(a aVar, n nVar, String str) {
        this.f62482a = aVar;
        this.f62483b = nVar;
        this.f62484c = str;
    }

    @Override // com.google.android.play.core.tasks.a
    public final void a(Exception exc) {
        a aVar = this.f62482a;
        n nVar = this.f62483b;
        String str = this.f62484c;
        m<?> b2 = aVar.b(nVar.f62518l);
        if (b2 != null) {
            com.bytedance.m.b.a aVar2 = new com.bytedance.m.b.a(str, c.f41338c.b(), 6);
            if (exc instanceof com.google.android.play.core.e.a) {
                aVar2.f41333g = ((n) exc).getErrorCode();
            } else {
                aVar2.f41333g = 1;
            }
            aVar2.f41335i = exc;
            i.b(new k(b2, aVar2), i.f4824a);
        }
    }
}
