package com.bytedance.tiktok.homepage.mainpagefragment;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.i.b;
import com.ss.android.ugc.aweme.friends.model.BackFromSettingEvent;
import com.ss.android.ugc.aweme.friends.model.SyncContactStatusEvent;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class d implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public String f44267a = "";

    static {
        Covode.recordClassIndex(27129);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(297, new g(d.class, "onSyncContactStatusEvent", SyncContactStatusEvent.class, ThreadMode.MAIN, 0, false));
        hashMap.put(398, new g(d.class, "onBackFromSettingEvent", BackFromSettingEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public d() {
        EventBus.a(EventBus.a(), this);
    }

    @r(a = ThreadMode.MAIN)
    public final void onBackFromSettingEvent(BackFromSettingEvent backFromSettingEvent) {
        l.d(backFromSettingEvent, "");
        this.f44267a = backFromSettingEvent.enterFrom;
    }

    @r(a = ThreadMode.MAIN)
    public final void onSyncContactStatusEvent(SyncContactStatusEvent syncContactStatusEvent) {
        l.d(syncContactStatusEvent, "");
        if (l.a((Object) this.f44267a, (Object) syncContactStatusEvent.enterFrom) && syncContactStatusEvent.isSuccess && !syncContactStatusEvent.lastValue) {
            b.a();
        }
    }
}
