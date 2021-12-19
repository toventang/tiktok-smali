package com.ss.android.ugc.aweme.feed.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.q.al;
import java.util.concurrent.Callable;

final /* synthetic */ class z implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final o f93011a;

    /* renamed from: b  reason: collision with root package name */
    private final long f93012b;

    /* renamed from: c  reason: collision with root package name */
    private final long f93013c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f93014d;

    /* renamed from: e  reason: collision with root package name */
    private final aj f93015e;

    /* renamed from: f  reason: collision with root package name */
    private final int f93016f;

    /* renamed from: g  reason: collision with root package name */
    private final String f93017g;

    /* renamed from: h  reason: collision with root package name */
    private final String f93018h;

    /* renamed from: i  reason: collision with root package name */
    private final al f93019i;

    /* renamed from: j  reason: collision with root package name */
    private final String f93020j;

    static {
        Covode.recordClassIndex(58993);
    }

    z(o oVar, long j2, long j3, boolean z, aj ajVar, int i2, String str, String str2, al alVar, String str3) {
        this.f93011a = oVar;
        this.f93012b = j2;
        this.f93013c = j3;
        this.f93014d = z;
        this.f93015e = ajVar;
        this.f93016f = i2;
        this.f93017g = str;
        this.f93018h = str2;
        this.f93019i = alVar;
        this.f93020j = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f93011a.a(this.f93012b, this.f93013c, this.f93014d, this.f93015e, this.f93016f, this.f93017g, this.f93018h, this.f93019i, this.f93020j);
    }
}
