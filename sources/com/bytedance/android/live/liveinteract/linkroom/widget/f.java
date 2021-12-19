package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.multilive.anchor.b.d;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LinkControlWidget f10640a;

    static {
        Covode.recordClassIndex(5669);
    }

    f(LinkControlWidget linkControlWidget) {
        this.f10640a = linkControlWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LinkControlWidget linkControlWidget = this.f10640a;
        d dVar = (d) obj;
        b.a.a().al = dVar.f11596a;
        if (linkControlWidget.f10608e && dVar.f11597b.equals("close_link")) {
            if (dVar.f11596a) {
                linkControlWidget.f10606c = linkControlWidget.f10609f.a(4);
            } else if (linkControlWidget.f10606c != null) {
                linkControlWidget.f10609f.a(linkControlWidget.f10606c);
            }
        }
        return z.f158842a;
    }
}
