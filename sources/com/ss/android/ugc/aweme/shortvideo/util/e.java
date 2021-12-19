package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f132285a;

    /* renamed from: b  reason: collision with root package name */
    private final String f132286b;

    static {
        Covode.recordClassIndex(86641);
    }

    e(Context context, String str) {
        this.f132285a = context;
        this.f132286b = str;
    }

    public final void run() {
        a b2 = a.b(this.f132285a, this.f132286b);
        if (a.f132184f.get(b2.f132190e) != null) {
            a.f132184f.remove(b2.f132190e);
        }
    }
}
