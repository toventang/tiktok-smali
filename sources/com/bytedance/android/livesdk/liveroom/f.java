package com.bytedance.android.livesdk.liveroom;

import com.bytedance.android.live.core.d.c;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

final /* synthetic */ class f implements f.a.d.f {

    /* renamed from: a  reason: collision with root package name */
    static final f.a.d.f f18701a = new f();

    static {
        Covode.recordClassIndex(10494);
    }

    private f() {
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", ((Throwable) obj).getMessage());
        c.a("ttlive_audience_task_report", 1, hashMap);
    }
}
