package com.lynx.component.svg.a;

import com.bytedance.covode.number.Covode;
import com.lynx.component.svg.a.f;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    d f55229a;

    /* renamed from: b  reason: collision with root package name */
    public f.a f55230b;

    /* renamed from: c  reason: collision with root package name */
    public float f55231c = 14.0f;

    static {
        Covode.recordClassIndex(34639);
    }

    public final boolean a() {
        if (this.f55230b != null) {
            return true;
        }
        return false;
    }

    public e(float f2) {
        this.f55231c = f2;
    }

    public e(e eVar) {
        if (eVar != null) {
            this.f55229a = eVar.f55229a;
            this.f55230b = eVar.f55230b;
            this.f55231c = eVar.f55231c;
        }
    }

    public final e a(float f2, float f3) {
        this.f55230b = new f.a(0.0f, 0.0f, f2, f3);
        return this;
    }
}
