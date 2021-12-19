package com.ss.android.ugc.aweme.feed.q;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f93793a;

    static {
        Covode.recordClassIndex(59678);
    }

    l(a aVar) {
        this.f93793a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        r.onEvent(MobClick.obtain().setEventName("video_request_leave").setLabelName("perf_monitor").setJsonObject(new s().a("duration", String.valueOf(SystemClock.elapsedRealtime() - this.f93793a.K)).a()));
        return null;
    }
}
