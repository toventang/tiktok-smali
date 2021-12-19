package com.ss.android.ugc.aweme.ecommerce.util;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.core.app.d;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class KeyBoardVisibilityUtil implements ViewTreeObserver.OnGlobalLayoutListener, au {

    /* renamed from: a  reason: collision with root package name */
    public boolean f87543a;

    /* renamed from: b  reason: collision with root package name */
    public final i f87544b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f87545c;

    /* renamed from: d  reason: collision with root package name */
    public final View f87546d;

    /* renamed from: e  reason: collision with root package name */
    public final m<Boolean, Integer, z> f87547e;

    /* renamed from: f  reason: collision with root package name */
    private final int f87548f;

    /* renamed from: g  reason: collision with root package name */
    private final int f87549g;

    /* renamed from: h  reason: collision with root package name */
    private final Rect f87550h;

    static {
        Covode.recordClassIndex(55033);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        a();
    }

    public final void a() {
        int i2 = Build.VERSION.SDK_INT;
        this.f87546d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public final void onGlobalLayout() {
        float f2 = (float) this.f87549g;
        Resources resources = this.f87546d.getResources();
        l.b(resources, "");
        boolean z = true;
        int applyDimension = (int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        this.f87546d.getWindowVisibleDisplayFrame(this.f87550h);
        View rootView = this.f87546d.getRootView();
        l.b(rootView, "");
        if (rootView.getHeight() - (this.f87550h.bottom - this.f87550h.top) < applyDimension) {
            z = false;
        }
        if (z != this.f87543a) {
            this.f87543a = z;
            this.f87547e.invoke(Boolean.valueOf(z), Integer.valueOf(this.f87550h.bottom));
        }
    }

    public /* synthetic */ KeyBoardVisibilityUtil(d dVar, m mVar) {
        this(dVar, 240, mVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KeyBoardVisibilityUtil(androidx.core.app.d r9, java.lang.Integer r10, h.f.a.m<? super java.lang.Boolean, ? super java.lang.Integer, h.z> r11) {
        /*
            r8 = this;
            java.lang.String r2 = ""
            h.f.b.l.d(r9, r2)
            r7 = r11
            h.f.b.l.d(r7, r2)
            androidx.lifecycle.i r3 = r9.getLifecycle()
            h.f.b.l.b(r3, r2)
            android.view.Window r4 = r9.getWindow()
            h.f.b.l.b(r4, r2)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r9.findViewById(r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 0
            android.view.View r5 = r1.getChildAt(r0)
            h.f.b.l.b(r5, r2)
            r2 = r8
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil.<init>(androidx.core.app.d, java.lang.Integer, h.f.a.m):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.m<? super java.lang.Boolean, ? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public KeyBoardVisibilityUtil(i iVar, Window window, View view, Integer num, m<? super Boolean, ? super Integer, z> mVar) {
        int i2;
        l.d(iVar, "");
        l.d(window, "");
        l.d(view, "");
        l.d(mVar, "");
        this.f87544b = iVar;
        this.f87545c = window;
        this.f87546d = view;
        this.f87547e = mVar;
        this.f87548f = 100;
        if (Build.VERSION.SDK_INT >= 21) {
            i2 = 48;
        } else {
            i2 = 0;
        }
        this.f87549g = 100 + i2;
        this.f87550h = new Rect();
        if (num != null) {
            window.setSoftInputMode(num.intValue());
        }
        iVar.a(this);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
