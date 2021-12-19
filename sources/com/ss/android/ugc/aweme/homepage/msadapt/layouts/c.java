package com.ss.android.ugc.aweme.homepage.msadapt.layouts;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.homepage.msadapt.core.a;
import com.ss.android.ugc.aweme.homepage.msadapt.core.b;
import com.ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    b f99226a = b.SINGLE_SCREEN;

    /* renamed from: b  reason: collision with root package name */
    final Context f99227b;

    /* renamed from: c  reason: collision with root package name */
    final SurfaceDuoLayout f99228c;

    /* renamed from: d  reason: collision with root package name */
    private final SurfaceDuoLayout.a f99229d;

    static {
        Covode.recordClassIndex(63218);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (this.f99228c.getOrientation() != 1 || !this.f99229d.f99218g) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (this.f99228c.getOrientation() != 0 || !this.f99229d.f99216e) {
            return false;
        }
        return true;
    }

    private final FrameLayout d() {
        MethodCollector.i(4319);
        FrameLayout frameLayout = new FrameLayout(this.f99228c.getContext());
        frameLayout.setId(R.id.b3j);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        MethodCollector.o(4319);
        return frameLayout;
    }

    private final View e() {
        MethodCollector.i(4620);
        View view = new View(this.f99228c.getContext());
        view.setId(R.id.bg7);
        Rect a2 = a.C2425a.a(this.f99227b);
        if (a2 != null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(a2.width(), a2.height()));
        }
        view.setBackground(new ColorDrawable(androidx.core.content.b.c(this.f99227b, R.color.a2)));
        MethodCollector.o(4620);
        return view;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        MethodCollector.i(4311);
        View e2 = e();
        FrameLayout frameLayout = new FrameLayout(this.f99228c.getContext());
        frameLayout.setId(R.id.dw7);
        List<Rect> c2 = a.C2425a.c(this.f99227b);
        if (c2 != null) {
            int orientation = this.f99228c.getOrientation();
            View findViewById = this.f99228c.findViewById(R.id.b3j);
            l.b(findViewById, "");
            a(orientation, (FrameLayout) findViewById, frameLayout, c2.get(0), c2.get(1));
        }
        Integer valueOf = Integer.valueOf(this.f99229d.f99214c);
        if (!(valueOf.intValue() == -1 || valueOf == null)) {
            valueOf.intValue();
            frameLayout.addView(com.a.a(LayoutInflater.from(this.f99227b), this.f99229d.f99214c, this.f99228c, false));
        }
        this.f99228c.addView(e2);
        this.f99228c.addView(frameLayout);
        this.f99226a = b.DUAL_SCREEN;
        MethodCollector.o(4311);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r2 != 3) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r7, com.ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout r8, com.ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout.a r9) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.msadapt.layouts.c.<init>(android.content.Context, com.ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout, com.ss.android.ugc.aweme.homepage.msadapt.layouts.SurfaceDuoLayout$a):void");
    }

    private final void a(int i2, Rect rect, Rect rect2) {
        boolean z;
        MethodCollector.i(4558);
        this.f99228c.setOrientation(i2);
        View e2 = e();
        FrameLayout frameLayout = new FrameLayout(this.f99228c.getContext());
        frameLayout.setId(R.id.b3j);
        FrameLayout frameLayout2 = new FrameLayout(this.f99228c.getContext());
        frameLayout2.setId(R.id.dw7);
        a(i2, frameLayout, frameLayout2, rect, rect2);
        Integer valueOf = Integer.valueOf(this.f99229d.f99213b);
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z && valueOf != null) {
            valueOf.intValue();
            frameLayout.addView(com.a.a(LayoutInflater.from(this.f99227b), this.f99229d.f99213b, this.f99228c, false));
        }
        Integer valueOf2 = Integer.valueOf(this.f99229d.f99214c);
        if (!(valueOf2.intValue() == -1 || valueOf2 == null)) {
            valueOf2.intValue();
            frameLayout2.addView(com.a.a(LayoutInflater.from(this.f99227b), this.f99229d.f99214c, this.f99228c, false));
        }
        this.f99228c.addView(frameLayout);
        this.f99228c.addView(e2);
        this.f99228c.addView(frameLayout2);
        MethodCollector.o(4558);
    }

    private static void a(int i2, FrameLayout frameLayout, FrameLayout frameLayout2, Rect rect, Rect rect2) {
        if (i2 == 1) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            frameLayout.setLayoutParams(layoutParams);
            frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, rect2.height()));
            return;
        }
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(rect.width(), -1));
        frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(rect2.width(), -1));
    }
}
