package com.ss.android.ugc.aweme.shortvideo.cut.a.a;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.IVideo2GifService;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.x;

public final /* synthetic */ class d implements r {

    /* renamed from: a  reason: collision with root package name */
    private final IVideo2GifService.ConvertListener f125428a;

    /* renamed from: b  reason: collision with root package name */
    private final x f125429b;

    static {
        Covode.recordClassIndex(82323);
    }

    public d(IVideo2GifService.ConvertListener convertListener, x xVar) {
        this.f125428a = convertListener;
        this.f125429b = xVar;
    }

    @Override // com.ss.android.vesdk.r
    public final void onCallback(int i2, int i3, float f2, String str) {
        i.b(new g(i2, this.f125428a, f2, this.f125429b), i.f4826c);
    }
}
