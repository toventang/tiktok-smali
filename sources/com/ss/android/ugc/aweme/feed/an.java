package com.ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class an implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f91909a;

    /* renamed from: b  reason: collision with root package name */
    private final String f91910b;

    /* renamed from: c  reason: collision with root package name */
    private final String f91911c;

    /* renamed from: d  reason: collision with root package name */
    private final String f91912d;

    static {
        Covode.recordClassIndex(57852);
    }

    an(String str, String str2, String str3, String str4) {
        this.f91909a = str;
        this.f91910b = str2;
        this.f91911c = str3;
        this.f91912d = str4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return am.a(this.f91909a, this.f91910b, this.f91911c, this.f91912d);
    }
}
