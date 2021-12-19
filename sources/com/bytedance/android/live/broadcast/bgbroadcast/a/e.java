package com.bytedance.android.live.broadcast.bgbroadcast.a;

import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f7623a;

    static {
        Covode.recordClassIndex(3757);
    }

    e(b bVar) {
        this.f7623a = bVar;
    }

    public final void run() {
        ao.a(this.f7623a.f7612b, (int) R.string.gti);
    }
}
