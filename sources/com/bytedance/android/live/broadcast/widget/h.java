package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.live.core.f.k;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f8789a;

    /* renamed from: b  reason: collision with root package name */
    private final b f8790b;

    static {
        Covode.recordClassIndex(4490);
    }

    public h(e eVar, b bVar) {
        this.f8789a = eVar;
        this.f8790b = bVar;
    }

    public final void run() {
        k.a(this.f8789a.f8774a, this.f8790b.getAvatarThumb());
    }
}
