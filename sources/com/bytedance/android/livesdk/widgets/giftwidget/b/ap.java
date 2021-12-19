package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.content.DialogInterface;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.livesetting.gift.LiveFreeGiftSendSetting;
import com.bytedance.android.livesdk.service.b.d;
import com.bytedance.android.livesdk.widgets.giftwidget.b.ag;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ap implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ag.AnonymousClass2 f22746a;

    /* renamed from: b  reason: collision with root package name */
    private final d f22747b;

    static {
        Covode.recordClassIndex(13406);
    }

    ap(ag.AnonymousClass2 r1, d dVar) {
        this.f22746a = r1;
        this.f22747b = dVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        ag.AnonymousClass2 r4 = this.f22746a;
        d dVar = this.f22747b;
        aw.c(ag.this.f22702c, dVar.f21286b);
        if (!((IHostContext) a.a(IHostContext.class)).isLocalTest() || !LiveFreeGiftSendSetting.INSTANCE.getValue()) {
            ag.this.a(dVar, dVar.f21290f);
        } else {
            ag.this.b(dVar);
        }
    }
}
