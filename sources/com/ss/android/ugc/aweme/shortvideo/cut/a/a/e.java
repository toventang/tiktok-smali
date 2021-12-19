package com.ss.android.ugc.aweme.shortvideo.cut.a.a;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.IVideo2GifService;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.x;

public final /* synthetic */ class e implements r {

    /* renamed from: a  reason: collision with root package name */
    private final IVideo2GifService.ConvertListener f125430a;

    /* renamed from: b  reason: collision with root package name */
    private final x f125431b;

    static {
        Covode.recordClassIndex(82324);
    }

    public e(IVideo2GifService.ConvertListener convertListener, x xVar) {
        this.f125430a = convertListener;
        this.f125431b = xVar;
    }

    @Override // com.ss.android.vesdk.r
    public final void onCallback(int i2, int i3, float f2, String str) {
        i.b(new f(this.f125430a, this.f125431b), i.f4826c);
    }
}
