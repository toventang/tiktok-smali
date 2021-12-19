package com.snapchat.kit.sdk.core.metrics.skate;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import dagger.a.c;
import java.util.Random;
import javax.a.a;

public final class e implements c<d> {

    /* renamed from: a  reason: collision with root package name */
    private final a<SharedPreferences> f57237a;

    /* renamed from: b  reason: collision with root package name */
    private final a<Random> f57238b;

    static {
        Covode.recordClassIndex(35779);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return new d(this.f57237a.get(), this.f57238b.get());
    }

    public e(a<SharedPreferences> aVar, a<Random> aVar2) {
        this.f57237a = aVar;
        this.f57238b = aVar2;
    }
}
