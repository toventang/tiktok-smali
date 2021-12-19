package com.bytedance.android.livesdk.widgets.giftwidget.b;

import com.bytedance.android.livesdk.h;
import com.bytedance.android.livesdk.r.j;
import com.bytedance.android.livesdk.service.b.d;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ao implements j.a {

    /* renamed from: a  reason: collision with root package name */
    private final ag f22744a;

    /* renamed from: b  reason: collision with root package name */
    private final d f22745b;

    static {
        Covode.recordClassIndex(13405);
    }

    ao(ag agVar, d dVar) {
        this.f22744a = agVar;
        this.f22745b = dVar;
    }

    @Override // com.bytedance.android.livesdk.r.j.a
    public final void a() {
        ag agVar = this.f22744a;
        d dVar = this.f22745b;
        dVar.t = "first_popup";
        agVar.a(dVar);
        if (agVar.f22702c != null) {
            agVar.f22702c.c(h.class, true);
        }
    }
}
