package com.bytedance.android.live.broadcast.bgbroadcast.a;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f7621a;

    static {
        Covode.recordClassIndex(3755);
    }

    c(b bVar) {
        this.f7621a = bVar;
    }

    public final void run() {
        ao.a(this.f7621a.f7612b, (int) R.string.gth);
        b.a.a("livesdk_anchor_network_error").a("error_type", "1").b();
    }
}
