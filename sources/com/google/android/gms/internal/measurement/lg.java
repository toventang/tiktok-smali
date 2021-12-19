package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class lg implements lh {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51152a = new cb(bs.a("com.google.android.gms.measurement")).a("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.lh
    public final boolean a() {
        return f51152a.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31958);
    }
}
