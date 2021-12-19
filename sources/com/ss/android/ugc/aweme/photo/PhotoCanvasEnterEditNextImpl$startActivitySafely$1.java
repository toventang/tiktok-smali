package com.ss.android.ugc.aweme.photo;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import h.f.a.a;

public final class PhotoCanvasEnterEditNextImpl$startActivitySafely$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f114823a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f114824b;

    static {
        Covode.recordClassIndex(73867);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onActivityStart();
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onActivityStart() {
        ((m) this.f114823a).getLifecycle().b(this);
        this.f114824b.invoke();
    }

    PhotoCanvasEnterEditNextImpl$startActivitySafely$1(Context context, a aVar) {
        this.f114823a = context;
        this.f114824b = aVar;
    }
}
