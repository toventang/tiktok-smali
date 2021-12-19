package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class jq implements eh {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f51957a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ jo f51958b;

    static {
        Covode.recordClassIndex(32347);
    }

    jq(jo joVar, String str) {
        this.f51958b = joVar;
        this.f51957a = str;
    }

    @Override // com.google.android.gms.measurement.internal.eh
    public final void a(String str, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f51958b.a(i2, th, bArr);
    }
}
