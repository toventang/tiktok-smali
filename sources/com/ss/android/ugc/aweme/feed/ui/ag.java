package com.ss.android.ugc.aweme.feed.ui;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.l;
import java.util.concurrent.Callable;

final /* synthetic */ class ag implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final af f94229a;

    static {
        Covode.recordClassIndex(59868);
    }

    ag(af afVar) {
        this.f94229a = afVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        af afVar = this.f94229a;
        l a2 = new l("enter_homepage_hot").a("open_app");
        a2.f109583a = "open_app";
        Fragment fragment = afVar.v;
        if (fragment instanceof com.ss.android.ugc.aweme.main.l) {
            a2.f109584b = ((com.ss.android.ugc.aweme.main.l) fragment).q();
        }
        if (!(afVar.n == null || afVar.n.aD() == null)) {
            a2.f(afVar.n.aD());
        }
        a2.f();
        return null;
    }
}
