package com.bytedance.tux.input;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.b.k;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.f.b.l;

public final class TuxSwitch extends SwitchCompat implements a {

    /* renamed from: a  reason: collision with root package name */
    private int f45140a;

    /* renamed from: b  reason: collision with root package name */
    private int f45141b;

    /* renamed from: c  reason: collision with root package name */
    private int f45142c;

    /* renamed from: d  reason: collision with root package name */
    private int f45143d;

    /* renamed from: e  reason: collision with root package name */
    private final k<TextView> f45144e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f45145f;

    /* renamed from: g  reason: collision with root package name */
    private a<Boolean> f45146g;

    static {
        Covode.recordClassIndex(27528);
    }

    public TuxSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public final void toggle() {
        Boolean invoke;
        a<Boolean> aVar = this.f45146g;
        if (aVar == null || (invoke = aVar.invoke()) == null || !invoke.booleanValue()) {
            super.toggle();
        }
    }

    @Override // com.bytedance.tux.input.a
    public final void setInterceptToggleListener(a<Boolean> aVar) {
        this.f45146g = aVar;
    }

    private final void setCheckedThumbColor(int i2) {
        this.f45140a = i2;
        a(i2, this.f45141b);
    }

    private final void setCheckedTrackColor(int i2) {
        this.f45142c = i2;
        b(i2, this.f45143d);
    }

    private final void setUncheckedThumbColor(int i2) {
        this.f45141b = i2;
        a(this.f45140a, i2);
    }

    private final void setUncheckedTrackColor(int i2) {
        this.f45143d = i2;
        b(this.f45142c, i2);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f45145f) {
            this.f45144e.a(this, (int) R.attr.fi);
        }
    }

    private final void a(int i2, int i3) {
        androidx.core.graphics.drawable.a.a(getThumbDrawable(), new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{i2, i3}));
    }

    private final void b(int i2, int i3) {
        androidx.core.graphics.drawable.a.a(getTrackDrawable(), new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{i2, i3}));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxSwitch(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
        k<TextView> kVar = new k<>(new com.bytedance.tux.b.a.a());
        this.f45144e = kVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aow, R.attr.aox, R.attr.arr, R.attr.ars}, i2, 0);
        l.a((Object) obtainStyledAttributes, "");
        setCheckedThumbColor(obtainStyledAttributes.getColor(0, 0));
        setUncheckedThumbColor(obtainStyledAttributes.getColor(2, 0));
        setCheckedTrackColor(obtainStyledAttributes.getColor(1, 0));
        setUncheckedTrackColor(obtainStyledAttributes.getColor(3, 0));
        obtainStyledAttributes.recycle();
        this.f45145f = true;
        kVar.a(this, (int) R.attr.fi);
        a(this.f45140a, this.f45141b);
        b(this.f45142c, this.f45143d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxSwitch(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.c8 : i2);
    }
}
