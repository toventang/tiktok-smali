package com.bytedance.hybrid.spark.d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.f;
import com.bytedance.lynx.a.a.b.b;
import com.bytedance.lynx.a.a.e.a;
import h.f.b.l;

public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f31139a;

    /* renamed from: b  reason: collision with root package name */
    private final View f31140b;

    static {
        Covode.recordClassIndex(18085);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        int i2 = 0;
        if (this.f31139a.getMaskBgColor() != null) {
            View view = this.f31140b;
            a maskBgColor = this.f31139a.getMaskBgColor();
            if (maskBgColor != null) {
                i2 = maskBgColor.getColor(this.f31140b.getContext());
            }
            view.setBackgroundColor(i2);
            return;
        }
        this.f31140b.setBackgroundColor(0);
    }

    public e(b bVar, View view) {
        l.c(bVar, "");
        l.c(view, "");
        this.f31139a = bVar;
        this.f31140b = view;
    }
}
