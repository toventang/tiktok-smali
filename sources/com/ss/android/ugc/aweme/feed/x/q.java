package com.ss.android.ugc.aweme.feed.x;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.param.b;
import java.util.concurrent.Callable;

public final /* synthetic */ class q implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f95344a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95345b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95346c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95347d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95348e;

    /* renamed from: f  reason: collision with root package name */
    private final b f95349f;

    static {
        Covode.recordClassIndex(60384);
    }

    public q(boolean z, String str, String str2, String str3, String str4, b bVar) {
        this.f95344a = z;
        this.f95345b = str;
        this.f95346c = str2;
        this.f95347d = str3;
        this.f95348e = str4;
        this.f95349f = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return n.a(this.f95344a, this.f95345b, this.f95346c, this.f95347d, this.f95348e, this.f95349f);
    }
}
