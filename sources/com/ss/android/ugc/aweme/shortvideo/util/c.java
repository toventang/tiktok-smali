package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f132279a;

    /* renamed from: b  reason: collision with root package name */
    private final String f132280b;

    static {
        Covode.recordClassIndex(86639);
    }

    c(Context context, String str) {
        this.f132279a = context;
        this.f132280b = str;
    }

    public final void run() {
        a b2 = a.b(this.f132279a, this.f132280b);
        b2.f132187b++;
        if (!b2.f132188c) {
            b2.f132188c = true;
            b2.f132186a = b2.a(b2.f132189d, "entering");
        }
    }
}
