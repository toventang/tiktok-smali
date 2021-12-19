package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    boolean f44259a;

    /* renamed from: b  reason: collision with root package name */
    private FrameLayout f44260b;

    static {
        Covode.recordClassIndex(27123);
    }

    public m(FrameLayout frameLayout) {
        this.f44260b = frameLayout;
    }

    public final void a(c cVar) {
        MethodCollector.i(6520);
        if (cVar == null) {
            MethodCollector.o(6520);
            return;
        }
        View b2 = cVar.b();
        if (b2 == null) {
            MethodCollector.o(6520);
            return;
        }
        if (!cVar.d()) {
            b2.setOnClickListener(new n(cVar));
        }
        if (b2.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b2.getLayoutParams();
            layoutParams.gravity = cVar.c();
            b2.setLayoutParams(layoutParams);
        }
        this.f44260b.addView(b2);
        MethodCollector.o(6520);
    }

    public final void b(c cVar) {
        MethodCollector.i(6548);
        if (this.f44259a) {
            MethodCollector.o(6548);
            return;
        }
        if (cVar != null && cVar.a()) {
            View b2 = cVar.b();
            if (b2 == null) {
                MethodCollector.o(6548);
                return;
            }
            this.f44259a = true;
            b2.setOnClickListener(new o(cVar));
            if (b2.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b2.getLayoutParams();
                layoutParams.gravity = cVar.c();
                b2.setLayoutParams(layoutParams);
            }
            this.f44260b.addView(b2);
        }
        MethodCollector.o(6548);
    }
}
