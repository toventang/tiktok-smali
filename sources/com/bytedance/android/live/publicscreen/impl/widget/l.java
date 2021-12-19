package com.bytedance.android.live.publicscreen.impl.widget;

import com.bytedance.covode.number.Covode;
import f.a.d.a;

final /* synthetic */ class l implements a {

    /* renamed from: a  reason: collision with root package name */
    private final PublicScreenWidget f12580a;

    static {
        Covode.recordClassIndex(6922);
    }

    l(PublicScreenWidget publicScreenWidget) {
        this.f12580a = publicScreenWidget;
    }

    @Override // f.a.d.a
    public final void a() {
        PublicScreenWidget publicScreenWidget = this.f12580a;
        if (publicScreenWidget.f12511g != null) {
            publicScreenWidget.f12511g.f12337b = "";
        }
        publicScreenWidget.f12509e.setVisibility(8);
        publicScreenWidget.p = "";
    }
}
