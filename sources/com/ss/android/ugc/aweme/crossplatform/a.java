package com.ss.android.ugc.aweme.crossplatform;

import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.crossplatform.view.d;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a implements d, i, j {

    /* renamed from: a  reason: collision with root package name */
    public boolean f78486a;

    /* renamed from: b  reason: collision with root package name */
    public final CrossPlatformWebView f78487b;

    static {
        Covode.recordClassIndex(48749);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf((int) LiveFeedRefreshTimeSetting.DEFAULT), new g(a.class, "onH5ComponentDidMount", com.ss.android.ugc.aweme.discover.ui.search.jsbridge.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public a(CrossPlatformWebView crossPlatformWebView) {
        l.d(crossPlatformWebView, "");
        this.f78487b = crossPlatformWebView;
        l.d(this, "");
        crossPlatformWebView.f78937b.add(this);
        EventBus.a(EventBus.a(), this);
    }

    @r
    public final void onH5ComponentDidMount(com.ss.android.ugc.aweme.discover.ui.search.jsbridge.a aVar) {
        l.d(aVar, "");
        this.f78486a = true;
        CrossPlatformLegacyServiceImpl.f();
        this.f78487b.getDisplayed();
    }
}
