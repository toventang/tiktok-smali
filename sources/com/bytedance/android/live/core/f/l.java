package com.bytedance.android.live.core.f;

import android.graphics.Bitmap;
import com.bytedance.android.live.core.f.p;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final p.b f9097a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap f9098b;

    static {
        Covode.recordClassIndex(4652);
    }

    l(p.b bVar, Bitmap bitmap) {
        this.f9097a = bVar;
        this.f9098b = bitmap;
    }

    public final void run() {
        this.f9097a.a(this.f9098b);
    }
}
