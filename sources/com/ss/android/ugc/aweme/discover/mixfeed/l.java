package com.ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.mixfeed.i;
import com.ss.android.ugc.aweme.search.l.a.a;
import com.ss.android.ugc.aweme.search.l.a.g;

final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i.AnonymousClass1 f81810a;

    static {
        Covode.recordClassIndex(50810);
    }

    l(i.AnonymousClass1 r1) {
        this.f81810a = r1;
    }

    public final void run() {
        i iVar = i.this;
        iVar.f81247k = null;
        a.f121303d.c();
        iVar.mIsLoading = false;
        iVar.f81249m = false;
        if (iVar.mData == null || ((m) iVar.mData).f81826c == null || ((m) iVar.mData).f81826c.size() == 0) {
            iVar.f81794c.a(2, null);
            g.a(iVar.f81245i).b(1).r = 1;
            return;
        }
        iVar.f81794c.a(0, null);
    }
}
