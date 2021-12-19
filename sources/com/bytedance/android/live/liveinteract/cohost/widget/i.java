package com.bytedance.android.live.liveinteract.cohost.widget;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.b.g;
import com.bytedance.android.live.liveinteract.match.b.b.a;
import com.bytedance.android.live.liveinteract.match.b.b.b;
import com.bytedance.android.live.liveinteract.match.b.b.c;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.l;

final /* synthetic */ class i implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LinkCrossRoomWidget f10483a;

    static {
        Covode.recordClassIndex(5570);
    }

    i(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f10483a = linkCrossRoomWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f10483a;
        if (TextUtils.equals(g.f9980c, ((g) obj).f9984a) && linkCrossRoomWidget.f10466e) {
            b bVar = a.f10674a;
            c cVar = c.START;
            c cVar2 = c.END;
            l.d(cVar, "");
            l.d(cVar2, "");
            c a2 = bVar.a();
            if ((a2.compareTo((Object) cVar) < 0 || a2.compareTo((Object) cVar2) > 0) && linkCrossRoomWidget.f10472k != null) {
                linkCrossRoomWidget.f10472k.a();
            }
        }
    }
}
