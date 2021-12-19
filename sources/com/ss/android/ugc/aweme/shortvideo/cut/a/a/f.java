package com.ss.android.ugc.aweme.shortvideo.cut.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.IVideo2GifService;
import com.ss.android.vesdk.x;
import java.util.concurrent.Callable;

final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final IVideo2GifService.ConvertListener f125432a;

    /* renamed from: b  reason: collision with root package name */
    private final x f125433b;

    static {
        Covode.recordClassIndex(82325);
    }

    f(IVideo2GifService.ConvertListener convertListener, x xVar) {
        this.f125432a = convertListener;
        this.f125433b = xVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return c.a(this.f125432a, this.f125433b);
    }
}
