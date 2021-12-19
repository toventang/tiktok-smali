package com.snapchat.kit.sdk;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import dagger.a.c;
import dagger.a.f;

public final class aa implements c<SharedPreferences> {

    /* renamed from: a  reason: collision with root package name */
    private final n f57067a;

    static {
        Covode.recordClassIndex(35556);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return f.a(d.a(this.f57067a.f57377a, "com.snapchat.connect.sdk.sharedPreferences", 0), "Cannot return null from a non-@Nullable @Provides method");
    }

    aa(n nVar) {
        this.f57067a = nVar;
    }
}
