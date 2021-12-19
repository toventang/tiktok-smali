package com.ss.android.ugc.aweme.feed.q;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final w f93747a;

    static {
        Covode.recordClassIndex(59641);
    }

    aa(w wVar) {
        this.f93747a = wVar;
    }

    public final void run() {
        w wVar = this.f93747a;
        if (wVar.f93825i != null && wVar.f93825i.isShowing()) {
            wVar.f93825i.dismiss();
        }
        wVar.f93825i = null;
    }
}
