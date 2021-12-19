package com.bytedance.android.live.publicscreen.impl.widget;

import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements h.f.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final PublicScreenWidget f12526a;

    static {
        Covode.recordClassIndex(6895);
    }

    b(PublicScreenWidget publicScreenWidget) {
        this.f12526a = publicScreenWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        PublicScreenWidget publicScreenWidget = this.f12526a;
        if (((View) obj).getTranslationY() >= 0.0f || publicScreenWidget.s.f12196c == null || publicScreenWidget.s.f12196c.d().f12179a != 0) {
            return null;
        }
        publicScreenWidget.f12511g.a(publicScreenWidget.s.f12196c);
        publicScreenWidget.s.f12196c.d().f12179a++;
        publicScreenWidget.f12511g.b(publicScreenWidget.s.f12196c);
        return null;
    }
}
