package com.ss.android.ugc.aweme.shortvideo.cut.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.IVideo2GifService;
import com.ss.android.vesdk.x;
import java.util.concurrent.Callable;

final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final int f125434a;

    /* renamed from: b  reason: collision with root package name */
    private final IVideo2GifService.ConvertListener f125435b;

    /* renamed from: c  reason: collision with root package name */
    private final float f125436c;

    /* renamed from: d  reason: collision with root package name */
    private final x f125437d;

    static {
        Covode.recordClassIndex(82326);
    }

    g(int i2, IVideo2GifService.ConvertListener convertListener, float f2, x xVar) {
        this.f125434a = i2;
        this.f125435b = convertListener;
        this.f125436c = f2;
        this.f125437d = xVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return c.a(this.f125434a, this.f125435b, this.f125436c, this.f125437d);
    }
}
