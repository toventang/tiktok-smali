package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final w f53089a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetPackState f53090b;

    static {
        Covode.recordClassIndex(32774);
    }

    t(w wVar, AssetPackState assetPackState) {
        this.f53089a = wVar;
        this.f53090b = assetPackState;
    }

    public final void run() {
        this.f53089a.a((Object) this.f53090b);
    }
}
