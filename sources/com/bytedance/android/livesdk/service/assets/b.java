package com.bytedance.android.livesdk.service.assets;

import com.bytedance.covode.number.Covode;
import f.a.d.g;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final GiftManager f21255a;

    static {
        Covode.recordClassIndex(12541);
    }

    b(GiftManager giftManager) {
        this.f21255a = giftManager;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        return this.f21255a.lambda$syncGiftList$1$GiftManager((com.bytedance.android.live.network.response.b) obj);
    }
}
