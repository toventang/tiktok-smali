package com.ss.android.ugc.aweme.feed.u;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final d f94032a;

    /* renamed from: b  reason: collision with root package name */
    private final int f94033b;

    /* renamed from: c  reason: collision with root package name */
    private final int f94034c;

    /* renamed from: d  reason: collision with root package name */
    private final String f94035d;

    /* renamed from: e  reason: collision with root package name */
    private final long f94036e;

    /* renamed from: f  reason: collision with root package name */
    private final long f94037f;

    /* renamed from: g  reason: collision with root package name */
    private final int f94038g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f94039h;

    /* renamed from: i  reason: collision with root package name */
    private final String f94040i;

    /* renamed from: j  reason: collision with root package name */
    private final String f94041j;

    /* renamed from: k  reason: collision with root package name */
    private final String f94042k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f94043l;

    static {
        Covode.recordClassIndex(59782);
    }

    j(d dVar, int i2, int i3, String str, long j2, long j3, int i4, Integer num, String str2, String str3, String str4, boolean z) {
        this.f94032a = dVar;
        this.f94033b = i2;
        this.f94034c = i3;
        this.f94035d = str;
        this.f94036e = j2;
        this.f94037f = j3;
        this.f94038g = i4;
        this.f94039h = num;
        this.f94040i = str2;
        this.f94041j = str3;
        this.f94042k = str4;
        this.f94043l = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f94032a.a(this.f94033b, this.f94034c, this.f94035d, this.f94036e, this.f94037f, this.f94038g, this.f94039h, this.f94040i, this.f94041j, this.f94042k, this.f94043l);
    }
}
