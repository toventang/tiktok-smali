package com.ss.android.ugc.aweme.ad.feed.b;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<e> f65752a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f65753b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(40456);
    }

    public static final e a() {
        WeakReference<e> weakReference = f65752a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
