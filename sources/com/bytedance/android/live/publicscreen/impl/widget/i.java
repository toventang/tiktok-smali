package com.bytedance.android.live.publicscreen.impl.widget;

import com.bytedance.android.live.liveinteract.api.b.k;
import com.bytedance.android.live.publicscreen.a.b.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements f {

    /* renamed from: a  reason: collision with root package name */
    private final PublicScreenWidget f12577a;

    static {
        Covode.recordClassIndex(6919);
    }

    i(PublicScreenWidget publicScreenWidget) {
        this.f12577a = publicScreenWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        PublicScreenWidget publicScreenWidget = this.f12577a;
        if (obj instanceof a) {
            publicScreenWidget.onEvent((a) obj);
        } else if (obj instanceof k) {
            publicScreenWidget.onEvent((k) obj);
        }
    }
}
