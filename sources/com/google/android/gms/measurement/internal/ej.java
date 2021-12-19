package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import java.util.List;
import java.util.Map;

final class ej implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final eh f51507a;

    /* renamed from: b  reason: collision with root package name */
    private final int f51508b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f51509c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f51510d;

    /* renamed from: e  reason: collision with root package name */
    private final String f51511e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, List<String>> f51512f;

    static {
        Covode.recordClassIndex(32204);
    }

    public final void run() {
        this.f51507a.a(this.f51511e, this.f51508b, this.f51509c, this.f51510d, this.f51512f);
    }

    private ej(String str, eh ehVar, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        r.a(ehVar);
        this.f51507a = ehVar;
        this.f51508b = i2;
        this.f51509c = th;
        this.f51510d = bArr;
        this.f51511e = str;
        this.f51512f = map;
    }

    /* synthetic */ ej(String str, eh ehVar, int i2, Throwable th, byte[] bArr, Map map, byte b2) {
        this(str, ehVar, i2, th, bArr, map);
    }
}
