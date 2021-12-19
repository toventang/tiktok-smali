package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.aq.a.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.s;
import java.util.Map;

final /* synthetic */ class dc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cv f94558a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f94559b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f94560c;

    static {
        Covode.recordClassIndex(60026);
    }

    dc(cv cvVar, Aweme aweme, Map map) {
        this.f94558a = cvVar;
        this.f94559b = aweme;
        this.f94560c = map;
    }

    public final void run() {
        cv cvVar = this.f94558a;
        Aweme aweme = this.f94559b;
        Map<String, Object> map = this.f94560c;
        cvVar.Q.a("video_digg", (Object) 5);
        cvVar.a(true, aweme, map);
        Boolean bool = (Boolean) cvVar.f94511a.getTag(a.f66964a);
        if (bool != null && bool.booleanValue()) {
            s.a(cvVar.f94511a);
        } else {
            cvVar.f94511a.g();
        }
    }
}
