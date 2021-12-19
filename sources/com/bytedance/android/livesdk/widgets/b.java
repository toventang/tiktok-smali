package com.bytedance.android.livesdk.widgets;

import android.view.View;
import com.bytedance.android.livesdk.az;
import com.bytedance.android.livesdk.service.b.d;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewSpecialGiftWidget f22659a;

    static {
        Covode.recordClassIndex(13372);
    }

    b(LiveNewSpecialGiftWidget liveNewSpecialGiftWidget) {
        this.f22659a = liveNewSpecialGiftWidget;
    }

    public final void onClick(View view) {
        LiveNewSpecialGiftWidget liveNewSpecialGiftWidget = this.f22659a;
        if (liveNewSpecialGiftWidget.f22655b != null && liveNewSpecialGiftWidget.dataChannel != null) {
            d dVar = new d(liveNewSpecialGiftWidget.f22655b.f21285a, liveNewSpecialGiftWidget.f22655b.f21286b, liveNewSpecialGiftWidget.f22655b.f21292h);
            dVar.f21293i = liveNewSpecialGiftWidget.f22655b.f21293i;
            dVar.f21290f = liveNewSpecialGiftWidget.f22655b.f21290f;
            dVar.q = liveNewSpecialGiftWidget.f22655b.q;
            dVar.f21295k = true;
            liveNewSpecialGiftWidget.dataChannel.c(az.class, dVar);
            liveNewSpecialGiftWidget.f22654a.a(new c(liveNewSpecialGiftWidget));
        }
    }
}
