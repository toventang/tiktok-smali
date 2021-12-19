package com.bytedance.tiktok.homepage.mainpagefragment;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.aq.a.a;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.b;
import h.f.b.l;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f44266a;

    static {
        Covode.recordClassIndex(27128);
    }

    c(a aVar) {
        this.f44266a = aVar;
    }

    public final void run() {
        a aVar = this.f44266a;
        b bVar = (b) HomeTabViewModel.a.a(aVar.f44264b).a("PUBLISH");
        if (bVar != null) {
            if (!a.a() ? false : a.a(com.ss.android.ugc.aweme.aq.a.b.f66968a.a(), System.currentTimeMillis())) {
                com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar2 = bVar.f99553b;
                if (aVar2 == null) {
                    l.a("tabView");
                }
                aVar2.p();
                com.ss.android.ugc.aweme.aq.a.b.f66968a.a(System.currentTimeMillis());
            } else {
                com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar3 = bVar.f99553b;
                if (aVar3 == null) {
                    l.a("tabView");
                }
                aVar3.o();
            }
            aVar.f44263a.d();
        }
    }
}
