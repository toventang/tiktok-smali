package com.ss.android.ugc.aweme.cn;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    k f71228a;

    /* renamed from: b  reason: collision with root package name */
    private f f71229b;

    static {
        Covode.recordClassIndex(43842);
    }

    public final boolean a() {
        if (this.f71229b == f.ALLOW_OPEN_CAMERA) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "SensitiveApiContext(allowOpenCamera = " + this.f71229b + ", allowOpenMic = " + this.f71228a + ')';
    }

    public final void a(f fVar) {
        l.d(fVar, "");
        this.f71229b = fVar;
    }

    public final void a(k kVar) {
        l.d(kVar, "");
        this.f71228a = kVar;
    }

    public g(f fVar, k kVar) {
        l.d(fVar, "");
        l.d(kVar, "");
        this.f71229b = fVar;
        this.f71228a = kVar;
    }
}
