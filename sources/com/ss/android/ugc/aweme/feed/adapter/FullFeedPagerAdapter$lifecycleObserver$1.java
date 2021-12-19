package com.ss.android.ugc.aweme.feed.adapter;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class FullFeedPagerAdapter$lifecycleObserver$1 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z f91508a;

    static {
        Covode.recordClassIndex(57575);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FullFeedPagerAdapter$lifecycleObserver$1 f91509a;

        static {
            Covode.recordClassIndex(57576);
        }

        a(FullFeedPagerAdapter$lifecycleObserver$1 fullFeedPagerAdapter$lifecycleObserver$1) {
            this.f91509a = fullFeedPagerAdapter$lifecycleObserver$1;
        }

        public final void run() {
            i lifecycle;
            z zVar = this.f91509a.f91508a;
            Fragment fragment = zVar.f91659i;
            if (!(fragment == null || (lifecycle = fragment.getLifecycle()) == null)) {
                lifecycle.b(zVar.q);
            }
            zVar.p.a();
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    FullFeedPagerAdapter$lifecycleObserver$1(z zVar) {
        this.f91508a = zVar;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.d(mVar, "");
        l.d(aVar, "");
        if (aVar == i.a.ON_DESTROY) {
            com.ss.android.ugc.aweme.base.m.f68150a.execute(new a(this));
        }
    }
}
