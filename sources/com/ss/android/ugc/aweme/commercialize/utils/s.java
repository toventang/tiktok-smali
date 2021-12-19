package com.ss.android.ugc.aweme.commercialize.utils;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.o;
import com.ss.android.ugc.aweme.commercialize.utils.n;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s implements g {

    /* renamed from: a  reason: collision with root package name */
    private final n.a f75806a;

    static {
        Covode.recordClassIndex(46752);
    }

    s(n.a aVar) {
        this.f75806a = aVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        boolean z;
        n.a aVar = this.f75806a;
        if (o.a().f66861a.f99089b || System.currentTimeMillis() - o.a().f66861a.f99090c < 5000) {
            z = true;
        } else {
            z = false;
        }
        aVar.sendLog(z);
        return null;
    }
}
