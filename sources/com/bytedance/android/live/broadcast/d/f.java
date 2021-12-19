package com.bytedance.android.live.broadcast.d;

import com.bytedance.android.live.broadcast.stream.a.b;
import com.bytedance.android.live.core.c.a;
import com.bytedance.covode.number.Covode;

public final class f implements b {
    static {
        Covode.recordClassIndex(3882);
    }

    @Override // com.bytedance.android.live.broadcast.stream.a.b
    public final void a(String str) {
        a.a(4, "live-stream-sdk", str);
    }

    @Override // com.bytedance.android.live.broadcast.stream.a.b
    public final void a(String str, Throwable th) {
        a.b("live-stream-sdk", str, th);
    }
}
