package com.bytedance.hybrid.spark.d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.f;
import com.bytedance.lynx.a.a.b.b;
import h.f.b.l;

public final class r implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f31174a;

    /* renamed from: b  reason: collision with root package name */
    private final View f31175b;

    static {
        Covode.recordClassIndex(18102);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        if (this.f31174a.getShowMask()) {
            this.f31175b.setVisibility(0);
            return;
        }
        this.f31175b.setVisibility(0);
        this.f31175b.setAlpha(0.0f);
    }

    public r(b bVar, View view) {
        l.c(bVar, "");
        l.c(view, "");
        this.f31174a = bVar;
        this.f31175b = view;
    }
}
