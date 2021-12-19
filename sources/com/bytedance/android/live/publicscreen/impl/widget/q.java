package com.bytedance.android.live.publicscreen.impl.widget;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q implements b {

    /* renamed from: a  reason: collision with root package name */
    private final PublicScreenWidget f12586a;

    static {
        Covode.recordClassIndex(6927);
    }

    q(PublicScreenWidget publicScreenWidget) {
        this.f12586a = publicScreenWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        PublicScreenWidget publicScreenWidget = this.f12586a;
        Boolean bool = (Boolean) obj;
        if (publicScreenWidget.e()) {
            boolean booleanValue = bool.booleanValue();
            publicScreenWidget.n.notifyDataSetChanged();
            publicScreenWidget.f12515k = booleanValue;
            publicScreenWidget.l();
        }
        return z.f158842a;
    }
}
