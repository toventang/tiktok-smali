package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.k;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f8787a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageModel f8788b;

    static {
        Covode.recordClassIndex(4489);
    }

    public g(e eVar, ImageModel imageModel) {
        this.f8787a = eVar;
        this.f8788b = imageModel;
    }

    public final void run() {
        e eVar = this.f8787a;
        k.a(eVar.f8774a, this.f8788b);
    }
}
