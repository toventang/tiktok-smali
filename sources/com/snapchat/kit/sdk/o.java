package com.snapchat.kit.sdk;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.d;
import dagger.a.c;
import dagger.a.f;
import okhttp3.Cache;

public final class o implements c<Cache> {

    /* renamed from: a  reason: collision with root package name */
    private final n f57385a;

    static {
        Covode.recordClassIndex(35863);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        Context context = this.f57385a.f57377a;
        if (d.f107194b == null || !d.f107197e) {
            d.f107194b = context.getCacheDir();
        }
        return f.a(new Cache(d.f107194b, 1048576), "Cannot return null from a non-@Nullable @Provides method");
    }

    o(n nVar) {
        this.f57385a = nVar;
    }
}
