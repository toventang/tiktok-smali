package com.bytedance.android.livesdk.service.assets;

import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21263a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f21264b;

    static {
        Covode.recordClassIndex(12543);
    }

    d(boolean z, WeakReference weakReference) {
        this.f21263a = z;
        this.f21264b = weakReference;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        GiftManager.lambda$syncGiftList$3$GiftManager(this.f21263a, this.f21264b, (Throwable) obj);
    }
}
