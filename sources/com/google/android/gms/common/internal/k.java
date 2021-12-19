package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.c;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final SparseIntArray f50425a;

    /* renamed from: b  reason: collision with root package name */
    private c f50426b;

    static {
        Covode.recordClassIndex(31407);
    }

    public k() {
        this(GoogleApiAvailability.getInstance());
    }

    public k(c cVar) {
        this.f50425a = new SparseIntArray();
        r.a(cVar);
        this.f50426b = cVar;
    }

    public final int a(Context context, a.f fVar) {
        int isGooglePlayServicesAvailable;
        r.a(context);
        r.a(fVar);
        int e2 = fVar.e();
        int i2 = this.f50425a.get(e2, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f50425a.size()) {
                isGooglePlayServicesAvailable = this.f50426b.isGooglePlayServicesAvailable(context, e2);
                break;
            }
            int keyAt = this.f50425a.keyAt(i3);
            if (keyAt > e2 && this.f50425a.get(keyAt) == 0) {
                isGooglePlayServicesAvailable = 0;
                break;
            }
            i3++;
        }
        this.f50425a.put(e2, isGooglePlayServicesAvailable);
        return isGooglePlayServicesAvailable;
    }
}
