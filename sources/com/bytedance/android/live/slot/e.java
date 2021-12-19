package com.bytedance.android.live.slot;

import com.bytedance.android.livesdk.event.m;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final BarrageWidget f12767a;

    static {
        Covode.recordClassIndex(7099);
    }

    e(BarrageWidget barrageWidget) {
        this.f12767a = barrageWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        BarrageWidget barrageWidget = this.f12767a;
        m mVar = (m) obj;
        if (mVar != null) {
            barrageWidget.f12610c = mVar.f17205b;
            if (barrageWidget.f12609b != null) {
                barrageWidget.f12609b.setPadding(barrageWidget.f12609b.getPaddingLeft(), barrageWidget.f12609b.getPaddingTop(), barrageWidget.f12610c, barrageWidget.f12609b.getPaddingBottom());
            }
        }
    }
}
