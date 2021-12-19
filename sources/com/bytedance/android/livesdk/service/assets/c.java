package com.bytedance.android.livesdk.service.assets;

import androidx.core.g.e;
import com.bytedance.android.livesdk.gift.e.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final GiftManager f21256a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21257b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f21258c;

    /* renamed from: d  reason: collision with root package name */
    private final long f21259d;

    /* renamed from: e  reason: collision with root package name */
    private final b f21260e;

    /* renamed from: f  reason: collision with root package name */
    private final long f21261f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f21262g;

    static {
        Covode.recordClassIndex(12542);
    }

    c(GiftManager giftManager, int i2, boolean z, long j2, b bVar, long j3, boolean z2) {
        this.f21256a = giftManager;
        this.f21257b = i2;
        this.f21258c = z;
        this.f21259d = j2;
        this.f21260e = bVar;
        this.f21261f = j3;
        this.f21262g = z2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f21256a.lambda$syncGiftList$2$GiftManager(this.f21257b, this.f21258c, this.f21259d, this.f21260e, this.f21261f, this.f21262g, (e) obj);
    }
}
