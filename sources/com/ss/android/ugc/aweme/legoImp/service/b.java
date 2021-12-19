package com.ss.android.ugc.aweme.legoImp.service;

import android.view.Choreographer;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.utils.aw;

final /* synthetic */ class b implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    static final Choreographer.FrameCallback f107716a = new b();

    static {
        Covode.recordClassIndex(68903);
    }

    private b() {
    }

    public final void doFrame(long j2) {
        a.b.f109011a.b("cold_boot_main_resume_to_measure", false);
        aw.b("cold_boot_main_resume_to_measure");
        a.b.f109011a.a("cold_boot_main_measure_duration", false);
    }
}
