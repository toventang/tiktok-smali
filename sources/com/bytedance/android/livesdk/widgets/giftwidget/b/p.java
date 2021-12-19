package com.bytedance.android.livesdk.widgets.giftwidget.b;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f22793a;

    static {
        Covode.recordClassIndex(13435);
    }

    p(b bVar) {
        this.f22793a = bVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        b bVar = this.f22793a;
        bVar.f22771e = ((Boolean) obj).booleanValue();
        bVar.f22770d.setValue(Boolean.valueOf(bVar.f22771e || !bVar.f22772f));
        return z.f158842a;
    }
}
