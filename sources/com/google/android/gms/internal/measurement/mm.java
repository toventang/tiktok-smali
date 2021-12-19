package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class mm implements mn {

    /* renamed from: a  reason: collision with root package name */
    private static final br<Boolean> f51192a = new cb(bs.a("com.google.android.gms.measurement")).a("measurement.collection.firebase_global_collection_flag_enabled", true);

    @Override // com.google.android.gms.internal.measurement.mn
    public final boolean a() {
        return f51192a.b().booleanValue();
    }

    static {
        Covode.recordClassIndex(31991);
    }
}
