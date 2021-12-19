package com.bytedance.android.livesdk.service.assets;

import com.bytedance.android.live.network.response.b;
import com.bytedance.covode.number.Covode;
import f.a.v;
import f.a.w;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements w {

    /* renamed from: a  reason: collision with root package name */
    private final GiftManager f21268a;

    /* renamed from: b  reason: collision with root package name */
    private final b f21269b;

    static {
        Covode.recordClassIndex(12547);
    }

    h(GiftManager giftManager, b bVar) {
        this.f21268a = giftManager;
        this.f21269b = bVar;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        this.f21268a.lambda$null$0$GiftManager(this.f21269b, vVar);
    }
}
