package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.facebook.common.g.a;
import com.facebook.common.g.i;
import com.facebook.common.g.l;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    private final ab f48054a;

    /* renamed from: b  reason: collision with root package name */
    private d f48055b;

    /* renamed from: c  reason: collision with root package name */
    private j f48056c;

    /* renamed from: d  reason: collision with root package name */
    private n f48057d;

    /* renamed from: e  reason: collision with root package name */
    private x f48058e;

    /* renamed from: f  reason: collision with root package name */
    private i f48059f;

    /* renamed from: g  reason: collision with root package name */
    private l f48060g;

    /* renamed from: h  reason: collision with root package name */
    private a f48061h;

    static {
        Covode.recordClassIndex(29043);
    }

    public final int c() {
        return this.f48054a.f48034c.f48068g;
    }

    private j f() {
        if (this.f48056c == null) {
            this.f48056c = new j(this.f48054a.f48035d, this.f48054a.f48036e, this.f48054a.f48037f);
        }
        return this.f48056c;
    }

    private x g() {
        if (this.f48058e == null) {
            this.f48058e = new x(this.f48054a.f48035d, this.f48054a.f48036e, this.f48054a.f48037f);
        }
        return this.f48058e;
    }

    public final l d() {
        if (this.f48060g == null) {
            this.f48060g = new l(e());
        }
        return this.f48060g;
    }

    public final a e() {
        if (this.f48061h == null) {
            this.f48061h = new o(this.f48054a.f48035d, this.f48054a.f48038g, this.f48054a.f48039h);
        }
        return this.f48061h;
    }

    public final n b() {
        if (this.f48057d == null) {
            this.f48057d = new n(this.f48054a.f48035d, this.f48054a.f48034c);
        }
        return this.f48057d;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final d a() {
        if (this.f48055b == null) {
            String str = this.f48054a.f48040i;
            switch (str.hashCode()) {
                case -1868884870:
                    if (str.equals("legacy_default_params")) {
                        this.f48055b = new h(this.f48054a.f48035d, k.a(), this.f48054a.f48033b);
                        break;
                    }
                    this.f48055b = new h(this.f48054a.f48035d, this.f48054a.f48032a, this.f48054a.f48033b);
                    break;
                case -1106578487:
                    if (str.equals("legacy")) {
                    }
                    this.f48055b = new h(this.f48054a.f48035d, this.f48054a.f48032a, this.f48054a.f48033b);
                    break;
                case -404562712:
                    if (str.equals("experimental")) {
                        this.f48055b = new p(this.f48054a.f48041j, this.f48054a.f48042k, y.a());
                        break;
                    }
                    this.f48055b = new h(this.f48054a.f48035d, this.f48054a.f48032a, this.f48054a.f48033b);
                    break;
                case 95945896:
                    if (str.equals("dummy")) {
                        this.f48055b = new m();
                        break;
                    }
                    this.f48055b = new h(this.f48054a.f48035d, this.f48054a.f48032a, this.f48054a.f48033b);
                    break;
                default:
                    this.f48055b = new h(this.f48054a.f48035d, this.f48054a.f48032a, this.f48054a.f48033b);
                    break;
            }
        }
        return this.f48055b;
    }

    public ac(ab abVar) {
        this.f48054a = (ab) com.facebook.common.d.i.a(abVar);
    }

    private s b(int i2) {
        if (i2 == 0) {
            return g();
        }
        if (i2 == 1) {
            return f();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    public final i a(int i2) {
        if (this.f48059f == null) {
            this.f48059f = new v(b(i2), d());
        }
        return this.f48059f;
    }
}
