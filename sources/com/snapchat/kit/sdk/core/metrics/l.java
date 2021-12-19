package com.snapchat.kit.sdk.core.metrics;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.c.i;
import dagger.a.c;
import dagger.a.f;
import javax.a.a;

public final class l implements c<i> {

    /* renamed from: a  reason: collision with root package name */
    private final a<SharedPreferences> f57200a;

    static {
        Covode.recordClassIndex(35638);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        i iVar = new i(this.f57200a.get());
        iVar.f57183b = iVar.f57182a.getLong("sequence_id_max", 0);
        return f.a(iVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    public l(a<SharedPreferences> aVar) {
        this.f57200a = aVar;
    }
}
