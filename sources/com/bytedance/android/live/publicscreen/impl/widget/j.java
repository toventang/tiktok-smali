package com.bytedance.android.live.publicscreen.impl.widget;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final PublicScreenWidget f12578a;

    static {
        Covode.recordClassIndex(6920);
    }

    j(PublicScreenWidget publicScreenWidget) {
        this.f12578a = publicScreenWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        PublicScreenWidget publicScreenWidget = this.f12578a;
        if (publicScreenWidget.f12511g != null) {
            publicScreenWidget.f12511g.h();
        }
    }
}
