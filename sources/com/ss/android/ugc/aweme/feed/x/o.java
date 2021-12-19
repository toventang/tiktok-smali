package com.ss.android.ugc.aweme.feed.x;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.param.b;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final ag f95334a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95335b;

    /* renamed from: c  reason: collision with root package name */
    private final b f95336c;

    static {
        Covode.recordClassIndex(60382);
    }

    o(ag agVar, String str, b bVar) {
        this.f95334a = agVar;
        this.f95335b = str;
        this.f95336c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return n.a(this.f95334a, this.f95335b, this.f95336c);
    }
}
