package com.bytedance.tiktok.homepage.mainpagefragment;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.aq.b.b;
import com.ss.android.ugc.aweme.shortvideo.festival.f;
import com.ss.android.ugc.aweme.shortvideo.festival.n;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class a implements i, j {

    /* renamed from: a  reason: collision with root package name */
    com.ss.android.ugc.aweme.im.service.f.a.a f44263a;

    /* renamed from: b  reason: collision with root package name */
    e f44264b;

    static {
        Covode.recordClassIndex(27126);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(296, new g(a.class, "onFestivalDataEvent", com.ss.android.ugc.aweme.aq.b.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public final void a() {
        b.a().a(new b(this));
    }

    @r
    public void onFestivalDataEvent(com.ss.android.ugc.aweme.aq.b.a aVar) {
        a();
        f.f128496a = new com.ss.android.ugc.aweme.shortvideo.festival.e();
        n.a().b();
    }

    public a(com.ss.android.ugc.aweme.im.service.f.a.a aVar, e eVar) {
        this.f44264b = eVar;
        this.f44263a = aVar;
        EventBus.a(EventBus.a(), this);
    }
}
