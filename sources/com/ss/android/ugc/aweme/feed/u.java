package com.ss.android.ugc.aweme.feed;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.cache.j;
import h.f.a.a;

final /* synthetic */ class u implements a {

    /* renamed from: a  reason: collision with root package name */
    private final int f93953a;

    /* renamed from: b  reason: collision with root package name */
    private final long f93954b;

    /* renamed from: c  reason: collision with root package name */
    private final long f93955c;

    /* renamed from: d  reason: collision with root package name */
    private final int f93956d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f93957e;

    /* renamed from: f  reason: collision with root package name */
    private final String f93958f;

    /* renamed from: g  reason: collision with root package name */
    private final int f93959g;

    /* renamed from: h  reason: collision with root package name */
    private final int f93960h;

    /* renamed from: i  reason: collision with root package name */
    private final String f93961i;

    /* renamed from: j  reason: collision with root package name */
    private final String f93962j;

    /* renamed from: k  reason: collision with root package name */
    private final String f93963k;

    /* renamed from: l  reason: collision with root package name */
    private final long f93964l;

    /* renamed from: m  reason: collision with root package name */
    private final j f93965m;
    private final Bundle n;
    private final Boolean o;

    static {
        Covode.recordClassIndex(59762);
    }

    u(int i2, long j2, long j3, int i3, Integer num, String str, int i4, int i5, String str2, String str3, String str4, long j4, j jVar, Bundle bundle, Boolean bool) {
        this.f93953a = i2;
        this.f93954b = j2;
        this.f93955c = j3;
        this.f93956d = i3;
        this.f93957e = num;
        this.f93958f = str;
        this.f93959g = i4;
        this.f93960h = i5;
        this.f93961i = str2;
        this.f93962j = str3;
        this.f93963k = str4;
        this.f93964l = j4;
        this.f93965m = jVar;
        this.n = bundle;
        this.o = bool;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        return FeedApiService.a(this.f93953a, this.f93954b, this.f93955c, this.f93956d, this.f93957e, this.f93958f, this.f93959g, this.f93960h, this.f93961i, this.f93962j, this.f93963k, this.f93965m, this.o);
    }
}
