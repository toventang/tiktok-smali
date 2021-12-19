package com.bytedance.android.live.publicscreen.impl.widget;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private final PublicScreenWidget f12574a;

    static {
        Covode.recordClassIndex(6916);
    }

    f(PublicScreenWidget publicScreenWidget) {
        this.f12574a = publicScreenWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        PublicScreenWidget publicScreenWidget = this.f12574a;
        if (publicScreenWidget.o != null) {
            publicScreenWidget.a(publicScreenWidget.o);
        }
        return z.f158842a;
    }
}
