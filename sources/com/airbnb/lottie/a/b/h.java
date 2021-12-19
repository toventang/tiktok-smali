package com.airbnb.lottie.a.b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.e;
import com.airbnb.lottie.i.g;
import com.airbnb.lottie.j.a;
import com.bytedance.covode.number.Covode;

public final class h extends a<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public Path f5277a;

    /* renamed from: m  reason: collision with root package name */
    private final a<PointF> f5278m;

    static {
        Covode.recordClassIndex(2219);
    }

    public final void a() {
        boolean z;
        if (this.f5711c == null || this.f5710b == null || !((PointF) this.f5710b).equals(((PointF) this.f5711c).x, ((PointF) this.f5711c).y)) {
            z = false;
        } else {
            z = true;
        }
        if (this.f5711c != null && !z) {
            this.f5277a = g.a((PointF) this.f5710b, (PointF) this.f5711c, this.f5278m.f5719k, this.f5278m.f5720l);
        }
    }

    public h(e eVar, a<PointF> aVar) {
        super(eVar, aVar.f5710b, aVar.f5711c, aVar.f5712d, aVar.f5713e, aVar.f5714f);
        this.f5278m = aVar;
        a();
    }
}
