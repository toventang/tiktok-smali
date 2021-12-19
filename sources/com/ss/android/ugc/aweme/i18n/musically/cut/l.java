package com.ss.android.ugc.aweme.i18n.musically.cut;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OnActivityResultCallback;

final /* synthetic */ class l implements OnActivityResultCallback {

    /* renamed from: a  reason: collision with root package name */
    private final j f99866a;

    static {
        Covode.recordClassIndex(63668);
    }

    l(j jVar) {
        this.f99866a = jVar;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i2, int i3, Intent intent) {
        this.f99866a.a(i2, i3, intent);
    }
}
