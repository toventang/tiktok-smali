package com.bytedance.android.live.broadcast.bgbroadcast.a;

import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f7624a;

    static {
        Covode.recordClassIndex(3758);
    }

    f(b bVar) {
        this.f7624a = bVar;
    }

    public final void run() {
        ao.a(this.f7624a.f7612b, (int) R.string.gtg);
    }
}
