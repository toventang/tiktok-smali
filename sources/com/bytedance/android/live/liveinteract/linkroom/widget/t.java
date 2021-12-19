package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.aj;
import com.bytedance.android.live.liveinteract.cohost.a.d.d;
import com.bytedance.android.live.liveinteract.cohost.widget.LinkCrossRoomWidget;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.a.b;

final /* synthetic */ class t implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LinkControlWidget f10654a;

    static {
        Covode.recordClassIndex(5683);
    }

    t(LinkControlWidget linkControlWidget) {
        this.f10654a = linkControlWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar;
        LinkControlWidget linkControlWidget = this.f10654a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (linkControlWidget.f10607d == null) {
            return null;
        }
        linkControlWidget.f10613j = booleanValue;
        linkControlWidget.f10612i.d(booleanValue);
        if (linkControlWidget.f10613j) {
            linkControlWidget.f10607d.f10501f = true;
            if (aj.a(linkControlWidget.f10610g, 4)) {
                linkControlWidget.o();
                if (linkControlWidget.f10605b == null) {
                    return null;
                }
                LinkCrossRoomWidget linkCrossRoomWidget = linkControlWidget.f10605b;
                if (linkCrossRoomWidget.f10468g == null) {
                    return null;
                }
                d dVar = linkCrossRoomWidget.f10468g;
                if (dVar.f10118b) {
                    ao.a(y.e(), y.a((int) R.string.e0g), 0);
                    dVar.b(210);
                    return null;
                }
                dVar.b(PrivacyCert.Builder.with("bpea-524").usage("").tag("link mic stop").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                return null;
            } else if (!aj.a(linkControlWidget.f10610g, 2)) {
                return null;
            } else {
                linkControlWidget.f10614k = true;
                if (linkControlWidget.f10604a == null || (bVar = linkControlWidget.f10604a.f11442a) == null) {
                    return null;
                }
                ao.a(y.e(), (int) R.string.e0g);
                bVar.a(LinkApi.c.MIC_ROOM, PrivacyCert.Builder.Companion.with("bpea-528").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                return null;
            }
        } else {
            linkControlWidget.f10607d.f10501f = false;
            if (!linkControlWidget.f10614k) {
                return null;
            }
            linkControlWidget.f10607d.a(LinkApi.e.RESTART_AFTER_MIC_ROOM);
            linkControlWidget.f10614k = false;
            return null;
        }
    }
}
