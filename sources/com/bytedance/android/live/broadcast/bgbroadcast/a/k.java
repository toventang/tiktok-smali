package com.bytedance.android.live.broadcast.bgbroadcast.a;

import com.bytedance.android.live.core.c.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public final class k implements l {

    /* renamed from: a  reason: collision with root package name */
    public p f7693a;

    /* renamed from: b  reason: collision with root package name */
    private q f7694b;

    /* renamed from: c  reason: collision with root package name */
    private q f7695c;

    static {
        Covode.recordClassIndex(3799);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.l
    public final void b() {
        q qVar = this.f7694b;
        if (qVar == null) {
            l.a("snapped");
        }
        qVar.b();
        q qVar2 = this.f7695c;
        if (qVar2 == null) {
            l.a("floating");
        }
        qVar2.b();
        f();
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.l
    public final void c() {
        q qVar = this.f7694b;
        if (qVar == null) {
            l.a("snapped");
        }
        qVar.b();
        q qVar2 = this.f7695c;
        if (qVar2 == null) {
            l.a("floating");
        }
        qVar2.a();
        f();
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.l
    public final void d() {
        q qVar = this.f7694b;
        if (qVar == null) {
            l.a("snapped");
        }
        qVar.a();
        q qVar2 = this.f7695c;
        if (qVar2 == null) {
            l.a("floating");
        }
        qVar2.b();
        f();
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.l
    public final void e() {
        f();
        q qVar = this.f7694b;
        if (qVar == null) {
            l.a("snapped");
        }
        qVar.c();
        q qVar2 = this.f7695c;
        if (qVar2 == null) {
            l.a("floating");
        }
        qVar2.c();
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.l
    public final void a() {
        this.f7694b = new q();
        this.f7695c = new q();
        this.f7693a = new p();
    }

    private final void f() {
        p pVar = this.f7693a;
        if (pVar != null) {
            q qVar = this.f7694b;
            if (qVar == null) {
                l.a("snapped");
            }
            pVar.f7703b = qVar.f7707a;
            q qVar2 = this.f7695c;
            if (qVar2 == null) {
                l.a("floating");
            }
            pVar.f7705d = qVar2.f7707a;
            pVar.f7702a = pVar.f7703b + pVar.f7705d;
            if (pVar.f7702a > 0) {
                pVar.f7704c = a(((float) pVar.f7703b) / ((float) pVar.f7702a));
                pVar.f7706e = a(((float) pVar.f7705d) / ((float) pVar.f7702a));
            }
            a.a(3, "GameUiTimeLogger", pVar.toString());
        }
    }

    private static float a(float f2) {
        try {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            String format = decimalFormat.format(Float.valueOf(f2));
            l.b(format, "");
            return Float.parseFloat(format);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }
}
