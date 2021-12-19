package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.content.DialogInterface;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.livesetting.gift.LiveFreeGiftSendSetting;
import com.bytedance.android.livesdk.service.b.d;
import com.bytedance.android.livesdk.widgets.giftwidget.b.ag;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ar implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ag.AnonymousClass3 f22753a;

    /* renamed from: b  reason: collision with root package name */
    private final d f22754b;

    static {
        Covode.recordClassIndex(13408);
    }

    ar(ag.AnonymousClass3 r1, d dVar) {
        this.f22753a = r1;
        this.f22754b = dVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        ag.AnonymousClass3 r5 = this.f22753a;
        d dVar = this.f22754b;
        aw.b(ag.this.f22702c, "over_threshold_two", dVar.f21286b);
        if (!((IHostContext) a.a(IHostContext.class)).isLocalTest() || !LiveFreeGiftSendSetting.INSTANCE.getValue()) {
            ag.this.a(dVar, dVar.f21290f);
        } else {
            ag.this.b(dVar);
        }
    }
}
