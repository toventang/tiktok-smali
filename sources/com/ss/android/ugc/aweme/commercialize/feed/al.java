package com.ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.feed.assem.AdInteractiveVM;
import com.ss.android.ugc.aweme.commercialize.feed.assem.a;
import com.ss.android.ugc.aweme.commercialize.feed.assem.o;

final /* synthetic */ class al implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f74072a;

    static {
        Covode.recordClassIndex(45624);
    }

    al(h hVar) {
        this.f74072a = hVar;
    }

    public final void run() {
        h hVar = this.f74072a;
        if (o.f74116a) {
            AdInteractiveVM a2 = a.a(hVar.ab);
            if (a2 != null) {
                a2.a(AdInteractiveVM.a.f74081a);
                return;
            }
            return;
        }
        hVar.ac.a("ad_feed_show_interactive_ad", (Object) null);
    }
}
