package com.ss.android.ugc.aweme.profile.ui;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ao implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final al f116880a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116881b;

    /* renamed from: c  reason: collision with root package name */
    private final long f116882c;

    /* renamed from: d  reason: collision with root package name */
    private final int f116883d;

    static {
        Covode.recordClassIndex(75478);
    }

    ao(al alVar, String str, long j2, int i2) {
        this.f116880a = alVar;
        this.f116881b = str;
        this.f116882c = j2;
        this.f116883d = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f116880a.a(this.f116881b, this.f116882c, this.f116883d);
    }
}
