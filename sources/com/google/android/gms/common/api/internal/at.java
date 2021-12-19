package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.p;

public interface at {
    static {
        Covode.recordClassIndex(31236);
    }

    <A extends a.b, R extends p, T extends d.a<R, A>> T a(T t);

    void a();

    void a(int i2);

    void a(Bundle bundle);

    void a(ConnectionResult connectionResult, a<?> aVar, boolean z);

    <A extends a.b, T extends d.a<? extends p, A>> T b(T t);

    boolean b();

    void c();
}
