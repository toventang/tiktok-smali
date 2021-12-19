package com.ss.android.ugc.aweme.shortvideo.l;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final b f128680a;

    static {
        Covode.recordClassIndex(84349);
    }

    e(b bVar) {
        this.f128680a = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return DetailApi.a(this.f128680a.f128657k.getAid(), "", 0, (String) null);
    }
}
