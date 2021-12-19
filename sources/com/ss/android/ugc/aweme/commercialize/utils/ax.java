package com.ss.android.ugc.aweme.commercialize.utils;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.commercialize.utils.av;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ax implements g {

    /* renamed from: a  reason: collision with root package name */
    private final av.a f75621a;

    static {
        Covode.recordClassIndex(46647);
    }

    ax(av.a aVar) {
        this.f75621a = aVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        boolean z;
        av.a aVar = this.f75621a;
        if (f.f34637l || System.currentTimeMillis() - f.o < 5000) {
            z = true;
        } else {
            z = false;
        }
        aVar.a(z);
        return null;
    }
}
