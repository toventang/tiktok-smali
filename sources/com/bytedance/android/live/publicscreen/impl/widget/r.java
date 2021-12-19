package com.bytedance.android.live.publicscreen.impl.widget;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements b {

    /* renamed from: a  reason: collision with root package name */
    private final PublicScreenWidget f12587a;

    static {
        Covode.recordClassIndex(6928);
    }

    r(PublicScreenWidget publicScreenWidget) {
        this.f12587a = publicScreenWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        PublicScreenWidget publicScreenWidget = this.f12587a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        publicScreenWidget.n.notifyDataSetChanged();
        publicScreenWidget.f12516l = booleanValue;
        publicScreenWidget.l();
        return z.f158842a;
    }
}
