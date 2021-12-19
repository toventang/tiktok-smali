package com.snapchat.kit.sdk.core.a;

import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final long f57087a;

    /* renamed from: b  reason: collision with root package name */
    public final long f57088b;

    /* renamed from: c  reason: collision with root package name */
    public final long f57089c;

    static {
        Covode.recordClassIndex(35569);
    }

    public final boolean a(e eVar) {
        if (this.f57088b == eVar.f57088b && this.f57089c == eVar.f57089c) {
            return true;
        }
        return false;
    }

    public e(long j2, long j3, long j4) {
        this.f57087a = j2;
        this.f57088b = j3;
        this.f57089c = j4;
    }
}
