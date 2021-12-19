package com.ss.android.ugc.aweme.feed.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.playerkit.model.n;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class x implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final o f92997a;

    /* renamed from: b  reason: collision with root package name */
    private final Video f92998b;

    /* renamed from: c  reason: collision with root package name */
    private final aj f92999c;

    /* renamed from: d  reason: collision with root package name */
    private final n f93000d;

    static {
        Covode.recordClassIndex(58991);
    }

    x(o oVar, Video video, aj ajVar, n nVar) {
        this.f92997a = oVar;
        this.f92998b = video;
        this.f92999c = ajVar;
        this.f93000d = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f92997a.a(this.f92998b, this.f92999c, this.f93000d);
    }
}
