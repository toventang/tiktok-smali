package com.ss.android.ugc.aweme.sticker.i;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f134914a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f134915b;

    static {
        Covode.recordClassIndex(88193);
    }

    public b(a aVar, Context context) {
        this.f134914a = aVar;
        this.f134915b = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f134914a.a(this.f134915b);
        return null;
    }
}
