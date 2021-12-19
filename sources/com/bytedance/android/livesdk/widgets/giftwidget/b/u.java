package com.bytedance.android.livesdk.widgets.giftwidget.b;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class u implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f22798a;

    static {
        Covode.recordClassIndex(13440);
    }

    u(b bVar) {
        this.f22798a = bVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        b bVar = this.f22798a;
        Boolean bool = (Boolean) obj;
        if (bVar.f22768b != null) {
            bVar.f22768b.b(bool.booleanValue());
        }
        return z.f158842a;
    }
}
