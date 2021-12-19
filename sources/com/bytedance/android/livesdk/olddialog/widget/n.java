package com.bytedance.android.livesdk.olddialog.widget;

import com.bytedance.android.livesdk.firstrecharge.d;
import com.bytedance.android.livesdk.gift.model.a.b;
import com.bytedance.android.livesdk.olddialog.giftpanellist.a.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.Iterator;

final /* synthetic */ class n implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewGiftPanelWidget f20166a;

    static {
        Covode.recordClassIndex(11897);
    }

    n(LiveNewGiftPanelWidget liveNewGiftPanelWidget) {
        this.f20166a = liveNewGiftPanelWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f20166a;
        if (liveNewGiftPanelWidget.f20132f != null) {
            a aVar = liveNewGiftPanelWidget.f20132f;
            Iterator<b<? extends com.bytedance.android.livesdk.model.b>> it = aVar.f20027f.iterator();
            while (it.hasNext()) {
                b<? extends com.bytedance.android.livesdk.model.b> next = it.next();
                if ((d.u.g() != null && next.d() == d.u.g().f19761d) || (d.h() != null && next.d() == d.h().f19761d)) {
                    it.remove();
                }
                if (next.f17863a == 0) {
                    it.remove();
                }
            }
            aVar.a(aVar.f20027f);
            if (aVar.c(aVar.f20028g) == -1 && aVar.f20027f.size() > 0) {
                aVar.f20028g = aVar.f20027f.get(0).d();
            }
            aVar.notifyDataSetChanged();
            if (aVar.f20025d != null) {
                int size = aVar.f20027f.size() > 0 ? ((aVar.f20027f.size() - 1) / 8) + 1 : 0;
                if (aVar.c(aVar.f20028g) != -1 || aVar.f20027f == null || aVar.f20027f.isEmpty()) {
                    aVar.f20025d.a(((aVar.c(aVar.f20028g) / 8) * 8) + 7);
                } else {
                    aVar.f20025d.a(0);
                }
                aVar.f20025d.a(aVar.c(aVar.f20028g) / 8, size);
            }
        }
    }
}
