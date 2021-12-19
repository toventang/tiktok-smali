package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.e;
import com.google.c.h.a.l;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.f.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ef implements e {

    /* renamed from: a  reason: collision with root package name */
    static final e f128415a = new ef();

    static {
        Covode.recordClassIndex(84209);
    }

    private ef() {
    }

    @Override // com.google.c.h.a.e
    public final q a(Object obj) {
        Throwable th = (Throwable) obj;
        String sdkV4AuthKey = g.a().e().getSdkV4AuthKey("");
        if (TextUtils.isEmpty(sdkV4AuthKey)) {
            return l.a(th);
        }
        return l.a(g.a().G().a(sdkV4AuthKey, d.class));
    }
}
