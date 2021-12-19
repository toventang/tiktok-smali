package com.bytedance.android.livesdk.widgets.giftwidget.b;

import com.bytedance.android.livesdk.service.b.d;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class ah implements b {

    /* renamed from: a  reason: collision with root package name */
    private final ag f22724a;

    static {
        Covode.recordClassIndex(13398);
    }

    ah(ag agVar) {
        this.f22724a = agVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        ag agVar = this.f22724a;
        d dVar = (d) obj;
        if (!agVar.f22700a.isEmpty() && !dVar.f21295k) {
            d pollLast = agVar.f22700a.pollLast();
            if (pollLast != null) {
                if (pollLast.f21293i.getId() == dVar.f21293i.getId() && pollLast.f21286b == dVar.f21286b) {
                    pollLast.f21291g++;
                    agVar.f22700a.addLast(pollLast);
                } else {
                    agVar.f22700a.addLast(pollLast);
                }
            }
            return z.f158842a;
        }
        agVar.f22700a.addLast(dVar);
        if (!agVar.f22701b) {
            agVar.a();
        }
        return z.f158842a;
    }
}
