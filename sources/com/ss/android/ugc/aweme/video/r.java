package com.ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.u.d;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.video.preload.s;
import com.ss.android.ugc.aweme.video.simpreloader.l;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final w f143777a;

    static {
        Covode.recordClassIndex(94064);
    }

    public r(w wVar) {
        this.f143777a = wVar;
    }

    public final void run() {
        w wVar = this.f143777a;
        a.a("VideoCachePreloaderInitTask");
        v.O();
        d.a(new l(s.b()));
        if (b.a().a(true, "enable_precreate_session_application", true)) {
            v.O().w();
        }
        com.ss.android.ugc.aweme.base.ui.anchor.a.f68349a.f();
        try {
            if (com.ss.android.ugc.aweme.s.a.p()) {
                f.a(wVar);
            }
            s.b().a();
        } catch (Exception e2) {
            com.bytedance.services.apm.api.a.a((Throwable) e2);
        }
    }
}
