package com.bytedance.android.livesdk.widgets.giftwidget;

import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final GiftWidget f22675a;

    static {
        Covode.recordClassIndex(13376);
    }

    a(GiftWidget giftWidget) {
        this.f22675a = giftWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        GiftWidget giftWidget = this.f22675a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if ((giftWidget.f22665d == null || !(giftWidget.f22665d.getStreamType() == i.THIRD_PARTY || com.bytedance.android.livesdk.u.a.b() == a.EnumC0481a.LINK_MIC_ANCHOR || com.bytedance.android.livesdk.u.a.b() == a.EnumC0481a.LINK_MIC_PK)) && giftWidget.f22666e && !booleanValue) {
            giftWidget.a(y.a(276.0f));
        }
        return z.f158842a;
    }
}
