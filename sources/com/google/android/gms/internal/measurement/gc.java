package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

final class gc {

    /* renamed from: a  reason: collision with root package name */
    static final ga<?> f50905a = new fz();

    /* renamed from: b  reason: collision with root package name */
    private static final ga<?> f50906b = b();

    static ga<?> a() {
        ga<?> gaVar = f50906b;
        if (gaVar != null) {
            return gaVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static {
        Covode.recordClassIndex(31810);
    }

    private static ga<?> b() {
        try {
            return (ga) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
