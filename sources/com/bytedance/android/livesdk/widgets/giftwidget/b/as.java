package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.service.b.d;
import com.bytedance.android.livesdk.widgets.giftwidget.b.ag;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class as implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ag.AnonymousClass3 f22755a;

    /* renamed from: b  reason: collision with root package name */
    private final d f22756b;

    static {
        Covode.recordClassIndex(13409);
    }

    as(ag.AnonymousClass3 r1, d dVar) {
        this.f22755a = r1;
        this.f22756b = dVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        ag.AnonymousClass3 r5 = this.f22755a;
        d dVar = this.f22756b;
        aw.c(ag.this.f22702c, "over_threshold_two", dVar.f21286b);
        if (!r5.f22717a) {
            dVar.f21288d = true;
        }
        dVar.f21287c = 1;
        ag.this.b(dVar);
    }
}
