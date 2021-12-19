package com.bytedance.hybrid.spark.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.f;
import com.bytedance.hybrid.spark.e.d;
import com.bytedance.lynx.a.a.b.b;
import h.f.b.l;
import h.j.h;

public final class s implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f31176a;

    /* renamed from: b  reason: collision with root package name */
    private final View f31177b;

    static {
        Covode.recordClassIndex(18103);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        int width;
        ViewGroup.LayoutParams layoutParams = this.f31177b.getLayoutParams();
        if (this.f31176a.getWidth() > 0) {
            width = h.c(this.f31176a.getWidth(), com.bytedance.lynx.a.a.f.b.b());
        } else if (this.f31176a.getWidth() != 0) {
            width = this.f31176a.getWidth();
        } else if (l.a((Object) this.f31176a.getGravity(), (Object) "center")) {
            Context context = this.f31177b.getContext();
            l.a((Object) context, "");
            width = d.a(context, 300.0d);
        } else {
            width = -1;
        }
        layoutParams.width = width;
    }

    public s(b bVar, View view) {
        l.c(bVar, "");
        l.c(view, "");
        this.f31176a = bVar;
        this.f31177b = view;
    }
}
