package com.bytedance.android.live.broadcast.widget;

import android.widget.TextView;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import f.a.a.a.a;
import f.a.t;
import h.f.a.b;
import h.z;
import java.util.concurrent.TimeUnit;

final /* synthetic */ class o implements b {

    /* renamed from: a  reason: collision with root package name */
    private final StickerTipWidget f8816a;

    static {
        Covode.recordClassIndex(4499);
    }

    o(StickerTipWidget stickerTipWidget) {
        this.f8816a = stickerTipWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        StickerTipWidget stickerTipWidget = this.f8816a;
        String str = (String) obj;
        if (stickerTipWidget.f8726a != null && !stickerTipWidget.f8726a.isDisposed()) {
            stickerTipWidget.f8726a.dispose();
        }
        if (m.a(str)) {
            stickerTipWidget.getView().setVisibility(4);
        } else {
            stickerTipWidget.show();
            ((TextView) stickerTipWidget.getView()).setText(str);
            stickerTipWidget.f8726a = t.b(3, TimeUnit.SECONDS).a(stickerTipWidget.getAutoUnbindTransformer()).a(a.a(f.a.a.b.a.f157156a)).a(new m(stickerTipWidget), n.f8815a);
        }
        return z.f158842a;
    }
}
