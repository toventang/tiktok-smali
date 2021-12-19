package com.bytedance.android.livesdk.util.rxutils.autodispose.b;

import com.bytedance.covode.number.Covode;
import f.a.d.k;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements k {

    /* renamed from: a  reason: collision with root package name */
    private final Comparator f22144a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f22145b;

    static {
        Covode.recordClassIndex(13054);
    }

    f(Comparator comparator, Object obj) {
        this.f22144a = comparator;
        this.f22145b = obj;
    }

    @Override // f.a.d.k
    public final boolean a(Object obj) {
        return this.f22144a.compare(obj, this.f22145b) >= 0;
    }
}
