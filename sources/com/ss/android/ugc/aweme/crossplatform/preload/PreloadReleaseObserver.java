package com.ss.android.ugc.aweme.crossplatform.preload;

import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.crossplatform.view.c;

public final class PreloadReleaseObserver implements au {

    /* renamed from: a  reason: collision with root package name */
    public final String f78922a;

    /* renamed from: b  reason: collision with root package name */
    public e f78923b;

    static {
        Covode.recordClassIndex(48978);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        c a2 = a.a(this.f78922a);
        a.b(this.f78922a);
        if (a2 != null) {
            a2.d(this.f78923b);
        }
        this.f78923b = null;
    }
}
