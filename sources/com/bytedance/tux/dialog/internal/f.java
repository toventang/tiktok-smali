package com.bytedance.tux.dialog.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.internal.d;
import h.f.b.l;

public final class f extends TuxButton {

    /* renamed from: e  reason: collision with root package name */
    private boolean f44920e = true;

    /* renamed from: f  reason: collision with root package name */
    private final d f44921f;

    static {
        Covode.recordClassIndex(27416);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!this.f44920e) {
            super.setBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context, null, 0, 6);
        l.c(context, "");
        d a2 = d.a.a(context);
        this.f44921f = a2;
        setButtonVariant(a2.u);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(a2.q));
        stateListDrawable.addState(new int[0], new ColorDrawable(a2.f44913k));
        setBackground(stateListDrawable);
    }

    @Override // android.widget.TextView
    public final void setTextColor(int i2) {
        super.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{this.f44921f.n, i2}));
    }
}
