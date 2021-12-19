package com.ss.android.ugc.aweme.i18n.musically.cut;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OnActivityResultCallback;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements OnActivityResultCallback {

    /* renamed from: a  reason: collision with root package name */
    private final j f99865a;

    static {
        Covode.recordClassIndex(63667);
    }

    k(j jVar) {
        this.f99865a = jVar;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i2, int i3, Intent intent) {
        this.f99865a.a(i2, i3, intent);
    }
}
