package com.bytedance.android.livesdk.toolbar.a;

import com.bytedance.android.live.design.view.b;
import com.bytedance.android.live.gift.i;
import com.bytedance.android.livesdk.service.c.b.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements b {

    /* renamed from: a  reason: collision with root package name */
    private final f f21687a;

    static {
        Covode.recordClassIndex(12787);
    }

    g(f fVar) {
        this.f21687a = fVar;
    }

    @Override // com.bytedance.android.live.design.view.b
    public final void a(int i2) {
        f fVar = this.f21687a;
        fVar.f21681a.postDelayed(j.f21692a, 3000);
        if (fVar.f21682b != null) {
            fVar.f21682b.b(i.class, (Object) false);
        }
        if (i2 == 1) {
            a.a(a.EnumC0459a.TIME_UP);
        } else if (i2 == 3) {
            a.a(a.EnumC0459a.USER_CLOSE);
        } else {
            a.a(a.EnumC0459a.OTHER);
        }
    }
}
