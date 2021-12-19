package com.ss.android.ugc.aweme.detail.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.ai;

final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ai f79739a;

    static {
        Covode.recordClassIndex(49550);
    }

    private i(ai aiVar) {
        this.f79739a = aiVar;
    }

    static Runnable a(ai aiVar) {
        return new i(aiVar);
    }

    public final void run() {
        this.f79739a.N();
    }
}
