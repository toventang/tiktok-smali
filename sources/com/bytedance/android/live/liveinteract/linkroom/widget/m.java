package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class m implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LinkControlWidget f10647a;

    static {
        Covode.recordClassIndex(5676);
    }

    m(LinkControlWidget linkControlWidget) {
        this.f10647a = linkControlWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LinkControlWidget linkControlWidget = this.f10647a;
        b.a.a().V = (String) obj;
        linkControlWidget.c(false);
        return z.f158842a;
    }
}
