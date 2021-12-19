package com.bytedance.android.livesdk.container.util;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b  reason: collision with root package name */
    public static int f16894b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f16895c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final ViewGroup f16896a;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16897d;

    static {
        Covode.recordClassIndex(9384);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(9385);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onGlobalLayout() {
        boolean z;
        boolean z2 = this.f16897d;
        Rect rect = new Rect();
        this.f16896a.getWindowVisibleDisplayFrame(rect);
        View rootView = this.f16896a.getRootView();
        l.b(rootView, "");
        int height = rootView.getHeight();
        int i2 = height - rect.bottom;
        double d2 = (double) height;
        Double.isNaN(d2);
        if (((double) i2) > d2 * 0.25d) {
            f16894b = i2;
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            this.f16897d = !this.f16897d;
        }
    }
}
