package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class hj implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final hk f51761a;

    /* renamed from: b  reason: collision with root package name */
    final String f51762b;

    /* renamed from: c  reason: collision with root package name */
    private final URL f51763c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f51764d = null;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f51765e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ hh f51766f;

    static {
        Covode.recordClassIndex(32285);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068 A[Catch:{ IOException -> 0x00e6, all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.hj.run():void");
    }

    public hj(hh hhVar, String str, URL url, hk hkVar) {
        this.f51766f = hhVar;
        r.a(str);
        r.a(url);
        r.a(hkVar);
        this.f51763c = url;
        this.f51761a = hkVar;
        this.f51762b = str;
        this.f51765e = null;
    }

    private final void a(int i2, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.f51766f.p().a(new hm(this, i2, exc, bArr, map));
    }
}
