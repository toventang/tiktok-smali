package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.ai;

final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ai f93851a;

    static {
        Covode.recordClassIndex(59706);
    }

    private z(ai aiVar) {
        this.f93851a = aiVar;
    }

    static Runnable a(ai aiVar) {
        return new z(aiVar);
    }

    public final void run() {
        this.f93851a.N();
    }
}
