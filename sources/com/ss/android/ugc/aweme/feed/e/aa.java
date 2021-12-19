package com.ss.android.ugc.aweme.feed.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aa implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final o f92887a;

    /* renamed from: b  reason: collision with root package name */
    private final aj f92888b;

    /* renamed from: c  reason: collision with root package name */
    private final String f92889c;

    /* renamed from: d  reason: collision with root package name */
    private final long f92890d;

    /* renamed from: e  reason: collision with root package name */
    private final String f92891e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f92892f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f92893g;

    static {
        Covode.recordClassIndex(58926);
    }

    aa(o oVar, aj ajVar, String str, long j2, String str2, boolean z, boolean z2) {
        this.f92887a = oVar;
        this.f92888b = ajVar;
        this.f92889c = str;
        this.f92890d = j2;
        this.f92891e = str2;
        this.f92892f = z;
        this.f92893g = z2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f92887a.a(this.f92888b, this.f92889c, this.f92890d, this.f92891e, this.f92892f, this.f92893g);
    }
}
