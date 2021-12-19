package com.ss.android.ugc.aweme.i18n.language.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.v;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f99772a;

    static {
        Covode.recordClassIndex(63615);
    }

    d(a aVar) {
        this.f99772a = aVar;
    }

    public final void run() {
        a aVar = this.f99772a;
        if (!aVar.isShowing()) {
            return;
        }
        if (v.O().o()) {
            v.O().B();
            aVar.f99768b = true;
            return;
        }
        aVar.b();
    }
}
