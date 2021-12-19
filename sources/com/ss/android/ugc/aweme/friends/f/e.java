package com.ss.android.ugc.aweme.friends.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.f.c;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c.b f96843a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96844b;

    static {
        Covode.recordClassIndex(61452);
    }

    e(c.b bVar, String str) {
        this.f96843a = bVar;
        this.f96844b = str;
    }

    public final void run() {
        c.b bVar = this.f96843a;
        String str = this.f96844b;
        if (bVar != null) {
            bVar.a(str);
        }
    }
}
