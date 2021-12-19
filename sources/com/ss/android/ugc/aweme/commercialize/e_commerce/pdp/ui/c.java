package com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.h;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public final a f73828a;

    /* renamed from: b  reason: collision with root package name */
    private float f73829b;

    /* renamed from: c  reason: collision with root package name */
    private float f73830c;

    /* renamed from: d  reason: collision with root package name */
    private float f73831d;

    /* renamed from: e  reason: collision with root package name */
    private float f73832e;

    static {
        Covode.recordClassIndex(45467);
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public final void setContentView(int i2) {
        cg_();
        super.setContentView(i2);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public final void setContentView(View view) {
        l.d(view, "");
        cg_();
        super.setContentView(view);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r5.f73829b > r1) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1 != 3) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui.c.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    private c(Context context, a aVar) {
        super(context, R.style.a1c);
        this.f73828a = aVar;
    }

    public /* synthetic */ c(Context context, a aVar, byte b2) {
        this(context, aVar);
    }
}
