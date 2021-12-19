package com.bytedance.android.livesdk.r;

import com.bytedance.android.livesdk.chatroom.c.h;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements f {

    /* renamed from: a  reason: collision with root package name */
    private final k f20579a;

    /* renamed from: b  reason: collision with root package name */
    private final long f20580b;

    static {
        Covode.recordClassIndex(12151);
    }

    l(k kVar, long j2) {
        this.f20579a = kVar;
        this.f20580b = j2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        h hVar;
        k kVar = this.f20579a;
        long j2 = this.f20580b;
        if ((obj instanceof h) && (hVar = (h) obj) != null && j2 == hVar.f15120b) {
            kVar.f20574a = GiftManager.inst().findGiftById(hVar.f15119a);
            if (kVar.f20574a == null || hVar.f15119a <= 0) {
                com.bytedance.android.live.p.l.FAST_GIFT.hide(kVar.f20575b);
                return;
            }
            com.bytedance.android.live.p.l.FAST_GIFT.show(kVar.f20575b);
            kVar.a();
            if (kVar.f20577d != null) {
                kVar.f20577d.a(kVar.f20574a);
            }
        }
    }
}
