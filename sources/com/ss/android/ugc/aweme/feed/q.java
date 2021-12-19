package com.ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;

final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final Runnable f93690a = new q();

    static {
        Covode.recordClassIndex(59618);
    }

    private q() {
    }

    public final void run() {
        if (k.c() != null && k.c().getItems() != null && k.c().getItems().get(0) != null) {
            g.b().execute(r.f93852a);
        }
    }
}
