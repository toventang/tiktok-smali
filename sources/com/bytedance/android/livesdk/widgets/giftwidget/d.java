package com.bytedance.android.livesdk.widgets.giftwidget;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final GiftWidget f22812a;

    static {
        Covode.recordClassIndex(13448);
    }

    d(GiftWidget giftWidget) {
        this.f22812a = giftWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        GiftWidget giftWidget = this.f22812a;
        com.bytedance.android.livesdk.gift.d.f fVar = (com.bytedance.android.livesdk.gift.d.f) obj;
        if (giftWidget.f22662a != null && giftWidget.f22663b != null) {
            if (fVar.f17849a) {
                giftWidget.f22662a.a();
                giftWidget.f22662a.b();
                giftWidget.f22663b.a();
                giftWidget.f22662a.f17979a = true;
                return;
            }
            giftWidget.f22662a.f17979a = false;
        }
    }
}
