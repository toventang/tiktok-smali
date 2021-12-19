package com.ss.android.ugc.aweme.feed.activity;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import org.greenrobot.eventbus.EventBus;

public final class GlobalAcViewModel$mainActivityLifecycleObserver$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GlobalAcViewModel f91485a;

    static {
        Covode.recordClassIndex(57563);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        EventBus.a().b(this.f91485a);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    GlobalAcViewModel$mainActivityLifecycleObserver$1(GlobalAcViewModel globalAcViewModel) {
        this.f91485a = globalAcViewModel;
    }
}
