package com.ss.android.newmedia.e.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.newmedia.e.a.a;
import java.util.concurrent.Callable;

final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f59967a;

    /* renamed from: b  reason: collision with root package name */
    private final String f59968b;

    static {
        Covode.recordClassIndex(37054);
    }

    b(Context context, String str) {
        this.f59967a = context;
        this.f59968b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return a.AnonymousClass1.AnonymousClass1.a(this.f59967a, this.f59968b);
    }
}
