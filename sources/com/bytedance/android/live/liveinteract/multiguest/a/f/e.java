package com.bytedance.android.live.liveinteract.multiguest.a.f;

import com.bytedance.android.live.liveinteract.multiguest.a.b.a;
import com.bytedance.android.live.liveinteract.platform.common.g.i;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f11151a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11152b;

    static {
        Covode.recordClassIndex(5989);
    }

    e(a aVar, boolean z) {
        this.f11151a = aVar;
        this.f11152b = z;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f11151a;
        boolean z = this.f11152b;
        Throwable th = (Throwable) obj;
        ((a.b) aVar.f11898g).b(th);
        i.a(th, z ? 1 : 2, aVar.f11135a.getOwnerUserId(), g.a.f14199a.a(aVar.f11135a.getOwnerUserId()));
        aVar.f11138d = false;
    }
}
