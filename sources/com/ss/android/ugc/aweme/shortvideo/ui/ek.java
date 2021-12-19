package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;
import f.a.ad;
import f.a.af;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ek implements af {

    /* renamed from: a  reason: collision with root package name */
    static final af f131720a = new ek();

    static {
        Covode.recordClassIndex(86267);
    }

    private ek() {
    }

    @Override // f.a.af
    public final void subscribe(ad adVar) {
        try {
            adVar.a(Boolean.valueOf(c.r.a()));
        } catch (Exception e2) {
            adVar.b(e2);
        }
    }
}
