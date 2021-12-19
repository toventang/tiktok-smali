package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final w f53091a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f53092b;

    /* renamed from: c  reason: collision with root package name */
    private final AssetPackState f53093c;

    static {
        Covode.recordClassIndex(32775);
    }

    u(w wVar, Bundle bundle, AssetPackState assetPackState) {
        this.f53091a = wVar;
        this.f53092b = bundle;
        this.f53093c = assetPackState;
    }

    public final void run() {
        w wVar = this.f53091a;
        Bundle bundle = this.f53092b;
        AssetPackState assetPackState = this.f53093c;
        bm bmVar = wVar.f53096a;
        if (((Boolean) bmVar.a(new bc(bmVar, bundle))).booleanValue()) {
            wVar.a(assetPackState);
            wVar.f53098c.a().a();
        }
    }
}
