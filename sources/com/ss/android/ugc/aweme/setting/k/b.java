package com.ss.android.ugc.aweme.setting.k;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.api.BlackApiManager;
import java.util.concurrent.Callable;

final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f122249a;

    /* renamed from: b  reason: collision with root package name */
    private final int f122250b;

    /* renamed from: c  reason: collision with root package name */
    private final int f122251c;

    /* renamed from: d  reason: collision with root package name */
    private final int f122252d;

    static {
        Covode.recordClassIndex(80151);
    }

    b(a aVar, int i2, int i3, int i4) {
        this.f122249a = aVar;
        this.f122250b = i2;
        this.f122251c = i3;
        this.f122252d = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return BlackApiManager.a(this.f122250b);
    }
}
