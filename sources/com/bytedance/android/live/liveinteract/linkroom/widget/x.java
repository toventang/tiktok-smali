package com.bytedance.android.live.liveinteract.linkroom.widget;

import androidx.fragment.app.e;
import com.bytedance.android.live.liveinteract.cohost.a.d.w;
import com.bytedance.android.live.liveinteract.cohost.ui.b.c;
import com.bytedance.android.live.liveinteract.match.b.a.a;
import com.bytedance.android.live.liveinteract.match.b.b.a;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

final /* synthetic */ class x implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LinkControlWidget f10658a;

    static {
        Covode.recordClassIndex(5687);
    }

    x(LinkControlWidget linkControlWidget) {
        this.f10658a = linkControlWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        long b2;
        LinkControlWidget linkControlWidget = this.f10658a;
        Integer num = (Integer) obj;
        if (num.intValue() == 1) {
            b2 = a.f10675b.b();
        } else {
            b2 = a.f10674a.b();
        }
        int intValue = num.intValue();
        l.d(linkControlWidget, "");
        c cVar = new c(linkControlWidget);
        w.a aVar = w.a.TYPE_PK_BE_INVITED;
        a.C0197a aVar2 = new a.C0197a((byte) 0);
        aVar2.f10671a = intValue;
        aVar2.f10672b = b2;
        linkControlWidget.f10611h = cVar.b(aVar, aVar2);
        linkControlWidget.f10611h.show(((e) linkControlWidget.context).getSupportFragmentManager(), "LinkDialog");
        return z.f158842a;
    }
}
