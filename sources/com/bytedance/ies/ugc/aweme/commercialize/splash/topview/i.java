package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Callable;

final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final h f34893a;

    /* renamed from: b  reason: collision with root package name */
    private final List f34894b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f34895c;

    static {
        Covode.recordClassIndex(20932);
    }

    i(h hVar, List list, Context context) {
        this.f34893a = hVar;
        this.f34894b = list;
        this.f34895c = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f34893a.a(this.f34894b);
    }
}
