package com.bytedance.android.live.liveinteract.cohost.widget;

import com.bytedance.android.live.liveinteract.cohost.a.d.d;
import com.bytedance.android.live.liveinteract.platform.c.c;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.Client;
import h.f.a.b;
import h.f.b.l;
import h.z;

final /* synthetic */ class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LinkCrossRoomWidget f10475a;

    static {
        Covode.recordClassIndex(5562);
    }

    a(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f10475a = linkCrossRoomWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f10475a;
        d dVar = linkCrossRoomWidget.f10468g;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (!dVar.f10122f.b()) {
            dVar.f10120d.ae = booleanValue;
            c cVar = dVar.f10122f;
            String str = dVar.f10120d.M;
            l.d(str, "");
            com.bytedance.android.live.liveinteract.platform.b.a aVar = cVar.f11894i;
            if (aVar == null) {
                l.a("mLinkLogger");
            }
            aVar.a().d(str);
            Client client = cVar.f11892g;
            if (client != null) {
                client.muteRemoteAudioStream(str, booleanValue);
            }
            dVar.f10122f.d();
            if (linkCrossRoomWidget.f10472k != null) {
                linkCrossRoomWidget.f10472k.c();
            }
        }
        return z.f158842a;
    }
}
