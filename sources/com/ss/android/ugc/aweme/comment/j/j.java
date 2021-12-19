package com.ss.android.ugc.aweme.comment.j;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final i f72045a;

    /* renamed from: b  reason: collision with root package name */
    private final String f72046b;

    /* renamed from: c  reason: collision with root package name */
    private final long f72047c;

    /* renamed from: d  reason: collision with root package name */
    private final int f72048d = 20;

    /* renamed from: e  reason: collision with root package name */
    private final Long f72049e;

    /* renamed from: f  reason: collision with root package name */
    private final int f72050f;

    static {
        Covode.recordClassIndex(44257);
    }

    j(i iVar, String str, long j2, Long l2, int i2) {
        this.f72045a = iVar;
        this.f72046b = str;
        this.f72047c = j2;
        this.f72049e = l2;
        this.f72050f = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f72045a.a(this.f72046b, this.f72047c, this.f72048d, this.f72049e, this.f72050f);
    }
}
