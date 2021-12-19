package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.c.b;
import com.bytedance.android.live.broadcast.stream.capture.a.a;
import com.bytedance.android.live.broadcast.widget.LinkVideo2View;
import com.bytedance.android.live.effect.api.a.h;
import com.bytedance.android.live.effect.api.a.l;
import com.bytedance.android.live.effect.d;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LinkVideo2View.AnonymousClass1 f8769a;

    static {
        Covode.recordClassIndex(4484);
    }

    c(LinkVideo2View.AnonymousClass1 r1) {
        this.f8769a = r1;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        LinkVideo2View linkVideo2View = LinkVideo2View.this;
        if (!linkVideo2View.f8698e) {
            linkVideo2View.f8698e = true;
            h d2 = d.d();
            l.a aVar = new l.a();
            aVar.f9654d = linkVideo2View.f8700g;
            d2.a(aVar.a());
            if (linkVideo2View.f8696c == null) {
                linkVideo2View.f8696c = new a();
                linkVideo2View.f8697d.a(linkVideo2View.f8696c);
            }
            if (linkVideo2View.f8695b == null) {
                linkVideo2View.f8695b = new b();
                linkVideo2View.f8695b.a(linkVideo2View.f8694a == null ? linkVideo2View.f8695b.f7779d : linkVideo2View.f8694a.f7536a);
            }
            if (linkVideo2View.f8694a != null && linkVideo2View.f8694a.f7537b != null) {
                d.d().a(com.bytedance.android.live.effect.api.a.f9638c, linkVideo2View.f8694a.f7537b);
            }
        }
    }
}
