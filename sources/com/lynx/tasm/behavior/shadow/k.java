package com.lynx.tasm.behavior.shadow;

import android.view.View;
import com.bytedance.covode.number.Covode;

public class k implements c {

    /* renamed from: a  reason: collision with root package name */
    public View f55974a;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f55975b;

    static {
        Covode.recordClassIndex(34973);
    }

    public k(View view) {
        this.f55974a = view;
    }

    @Override // com.lynx.tasm.behavior.shadow.c
    public final void a(Runnable runnable) {
        View view = this.f55974a;
        if (view != null) {
            view.requestLayout();
        }
        this.f55975b = runnable;
    }
}
