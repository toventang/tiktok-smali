package com.bytedance.android.live.publicscreen.impl.e;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f12355a;

    /* renamed from: b  reason: collision with root package name */
    private final a f12356b;

    static {
        Covode.recordClassIndex(6792);
    }

    m(h hVar, a aVar) {
        this.f12355a = hVar;
        this.f12356b = aVar;
    }

    public final void run() {
        this.f12355a.onMessage(this.f12356b);
    }
}
