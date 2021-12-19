package com.ss.android.ugc.aweme.livewallpaper.f;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f108915a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f108916b;

    static {
        Covode.recordClassIndex(69748);
    }

    public g(Context context, boolean z) {
        this.f108915a = context;
        this.f108916b = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return f.a(this.f108915a, this.f108916b);
    }
}
