package com.ss.android.ugc.aweme.arch.widgets.base;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public class LifecycleOwnerWidget extends Widget implements m, au {

    /* renamed from: a  reason: collision with root package name */
    n f67005a = new n(this);

    static {
        Covode.recordClassIndex(41297);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final m af_() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // androidx.lifecycle.m
    public i getLifecycle() {
        return this.f67005a;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f67005a.a(i.a.ON_CREATE);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onDestroy() {
        this.f67005a.a(i.a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onPause() {
        this.f67005a.a(i.a.ON_PAUSE);
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onResume() {
        super.onResume();
        this.f67005a.a(i.a.ON_RESUME);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onStart() {
        super.onStart();
        this.f67005a.a(i.a.ON_START);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onStop() {
        this.f67005a.a(i.a.ON_STOP);
        super.onStop();
    }
}
