package com.ss.android.ugc.aweme.account.base;

import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public class SafeHandler extends Handler implements au {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f62881a;

    /* renamed from: b  reason: collision with root package name */
    private final m f62882b;

    static {
        Covode.recordClassIndex(38739);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            destroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void destroy() {
        this.f62881a = true;
        removeCallbacksAndMessages(null);
    }

    public SafeHandler(m mVar) {
        this.f62882b = mVar;
        mVar.getLifecycle().a(this);
    }
}
