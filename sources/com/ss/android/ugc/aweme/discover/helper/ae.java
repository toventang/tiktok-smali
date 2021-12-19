package com.ss.android.ugc.aweme.discover.helper;

import com.bytedance.android.live.base.a.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.m.d;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class ae extends d implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final ae f81066a = new ae();

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(179, new g(ae.class, "onFollowStatusEvent", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        hashMap.put(316, new g(ae.class, "onReceiveRoomStatusEvent", a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(37, new g(ae.class, "onReceiveVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    private ae() {
    }

    static {
        Covode.recordClassIndex(50388);
    }

    @r
    public final void onFollowStatusEvent(FollowStatusEvent followStatusEvent) {
        l.d(followStatusEvent, "");
        a(followStatusEvent.status);
    }

    @r
    public final void onReceiveRoomStatusEvent(a aVar) {
        l.d(aVar, "");
        a(aVar);
    }

    @r
    public final void onReceiveVideoEvent(ag agVar) {
        l.d(agVar, "");
        a(agVar);
    }
}
