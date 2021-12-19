package com.bytedance.android.live.broadcast.bgbroadcast.a;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f7622a;

    static {
        Covode.recordClassIndex(3756);
    }

    d(b bVar) {
        this.f7622a = bVar;
    }

    public final void run() {
        ao.a(this.f7622a.f7612b, (int) R.string.guc);
        b.a.a("livesdk_anchor_network_error").a("error_type", "2").b();
    }
}
