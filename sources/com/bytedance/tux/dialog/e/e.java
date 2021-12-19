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

public final class e extends h {

    /* renamed from: a  reason: collision with root package name */
    public int f44869a;

    /* renamed from: b  reason: collision with root package name */
    public int f44870b;

    /* renamed from: c  reason: collision with root package name */
    public final View f44871c;

    static {
        Covode.recordClassIndex(27394);
    }

    @Override // com.bytedance.tux.dialog.internal.c
    public final View a() {
        MethodCollector.i(7482);
        View view = this.f44871c;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f44869a, this.f44870b);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(this.f44902f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a2 = a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        frameLayout.setPadding(0, a2, 0, a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics())));
        frameLayout.setLayoutParams(layoutParams2);
        frameLayout.setBackground(new ColorDrawable(this.f44874g));
        frameLayout.addView(this.f44871c);
        MethodCollector.o(7482);
        return frameLayout;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, View view) {
        super(context, 0);
        l.c(context, "");
        l.c(view, "");
        this.f44871c = view;
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.f44869a = a.a(TypedValue.applyDimension(1, 48.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        this.f44870b = a.a(TypedValue.applyDimension(1, 48.0f, system2.getDisplayMetrics()));
    }
}
