package com.lynx.b.a.e;

import android.graphics.PointF;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.b.a.a.j;
import com.lynx.b.a.h.b;

public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    public PointF f55187a;

    /* renamed from: b  reason: collision with root package name */
    public j f55188b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f55189c = true;

    static {
        Covode.recordClassIndex(34603);
    }

    @Override // com.lynx.b.a.a.j
    public final boolean a(View view) {
        j jVar = this.f55188b;
        if (jVar != null) {
            return jVar.a(view);
        }
        return b.a(view, this.f55187a);
    }

    @Override // com.lynx.b.a.a.j
    public final boolean b(View view) {
        j jVar = this.f55188b;
        if (jVar != null) {
            return jVar.b(view);
        }
        return b.a(view, this.f55187a, this.f55189c);
    }
}
