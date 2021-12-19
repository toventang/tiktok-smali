package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;

public final class f extends Exception {
    private final a<b<?>, ConnectionResult> zaba;

    static {
        Covode.recordClassIndex(31203);
    }

    public final a<b<?>, ConnectionResult> zaj() {
        return this.zaba;
    }

    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (b<?> bVar : this.zaba.keySet()) {
            ConnectionResult connectionResult = this.zaba.get(bVar);
            if (connectionResult.b()) {
                z = false;
            }
            String str = bVar.f50085b.f49972b;
            String valueOf = String.valueOf(connectionResult);
            arrayList.add(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(valueOf).length()).append(str).append(": ").append(valueOf).toString());
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }

    public f(a<b<?>, ConnectionResult> aVar) {
        this.zaba = aVar;
    }

    public final ConnectionResult getConnectionResult(h<? extends a.d> hVar) {
        boolean z;
        b<O> bVar = hVar.f49979d;
        if (this.zaba.get(bVar) != null) {
            z = true;
        } else {
            z = false;
        }
        r.b(z, "The given API was not part of the availability request.");
        return this.zaba.get(bVar);
    }

    public final ConnectionResult getConnectionResult(j<? extends a.d> jVar) {
        boolean z;
        b<? extends a.d> c2 = jVar.c();
        if (this.zaba.get(c2) != null) {
            z = true;
        } else {
            z = false;
        }
        r.b(z, "The given API was not part of the availability request.");
        return this.zaba.get(c2);
    }
}
