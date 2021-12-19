package com.bytedance.android.livesdk.aj;

import com.bytedance.android.livesdkapi.depend.d.q;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final v f13911a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13912b;

    /* renamed from: c  reason: collision with root package name */
    private final q f13913c;

    static {
        Covode.recordClassIndex(7720);
    }

    w(v vVar, String str, q qVar) {
        this.f13911a = vVar;
        this.f13912b = str;
        this.f13913c = qVar;
    }

    public final void run() {
        this.f13913c.a(this.f13911a.d(this.f13912b));
    }
}
