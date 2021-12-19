package com.ss.android.ugc.aweme.live;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class am implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LivePlayActivity f108324a;

    static {
        Covode.recordClassIndex(69398);
    }

    am(LivePlayActivity livePlayActivity) {
        this.f108324a = livePlayActivity;
    }

    public final void run() {
        this.f108324a.h();
    }
}
