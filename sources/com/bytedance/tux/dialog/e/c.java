package com.bytedance.tux.dialog.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.g.a;

public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public int f44867a;

    /* renamed from: b  reason: collision with root package name */
    public final View f44868b;

    static {
        Covode.recordClassIndex(27392);
    }

    @Override // com.bytedance.tux.dialog.internal.c
    public final View a() {
        MethodCollector.i(7748);
        FrameLayout frameLayout = new FrameLayout(this.f44902f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        frameLayout.setPadding(0, 0, 0, this.f44867a);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(new ColorDrawable(this.f44874g));
        View view = this.f44868b;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 48;
        view.setLayoutParams(layoutParams2);
        frameLayout.addView(view);
        MethodCollector.o(7748);
        return frameLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, View view) {
        super(context, 0);
        l.c(context, "");
        l.c(view, "");
        this.f44868b = view;
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.f44867a = a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
    }
}
