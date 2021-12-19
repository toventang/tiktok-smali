package com.bytedance.tux.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.b.a.b;
import com.bytedance.tux.b.a.e;
import com.bytedance.tux.b.g;
import com.bytedance.tux.b.k;
import com.bytedance.tux.h.d;
import com.bytedance.tux.h.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Map;

public final class TuxCheckBox extends AppCompatCheckBox implements a {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f45116a;

    /* renamed from: b  reason: collision with root package name */
    public int f45117b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f45118c;

    /* renamed from: d  reason: collision with root package name */
    private final k<TuxCheckBox> f45119d;

    /* renamed from: e  reason: collision with root package name */
    private h.f.a.a<Boolean> f45120e;

    /* renamed from: f  reason: collision with root package name */
    private final ColorMatrixColorFilter f45121f;

    /* renamed from: g  reason: collision with root package name */
    private final ColorMatrixColorFilter f45122g;

    static {
        Covode.recordClassIndex(27520);
    }

    public TuxCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    public final void toggle() {
        Boolean invoke;
        h.f.a.a<Boolean> aVar = this.f45120e;
        if (aVar == null || (invoke = aVar.invoke()) == null || !invoke.booleanValue()) {
            super.toggle();
        }
    }

    public final void setChecked(boolean z) {
        super.setChecked(z);
    }

    @Override // com.bytedance.tux.input.a
    public final void setInterceptToggleListener(h.f.a.a<Boolean> aVar) {
        this.f45120e = aVar;
    }

    final class a extends b<TuxCheckBox> {

        /* renamed from: b  reason: collision with root package name */
        private final e f45124b = new e();

        static {
            Covode.recordClassIndex(27521);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
        @Override // com.bytedance.tux.b.a.b
        public final /* synthetic */ Map a(TuxCheckBox tuxCheckBox, Map map) {
            l.c(tuxCheckBox, "");
            l.c(map, "");
            return super.a(tuxCheckBox, this.f45124b.a(tuxCheckBox, map));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
        @Override // com.bytedance.tux.b.a.b
        public final /* synthetic */ boolean a(TuxCheckBox tuxCheckBox, int i2, Object obj) {
            l.c(tuxCheckBox, "");
            l.c(obj, "");
            if (i2 == g.t().f44668a) {
                TuxCheckBox tuxCheckBox2 = TuxCheckBox.this;
                Context context = tuxCheckBox2.getContext();
                l.a((Object) context, "");
                g.t();
                l.c(obj, "");
                int intValue = ((Number) obj).intValue();
                l.c(context, "");
                tuxCheckBox2.f45116a = (Drawable) d.a(context, intValue, new d.b(context));
                TuxCheckBox tuxCheckBox3 = TuxCheckBox.this;
                tuxCheckBox3.setButtonDrawable(tuxCheckBox3.f45116a);
                return true;
            } else if (i2 != g.u().f44668a) {
                return false;
            } else {
                TuxCheckBox tuxCheckBox4 = TuxCheckBox.this;
                g.u();
                l.c(obj, "");
                tuxCheckBox4.f45117b = ((Number) obj).intValue();
                return true;
            }
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f45118c) {
            this.f45119d.a(this);
        }
    }

    public final void setShape(int i2) {
        this.f45119d.a(this, R.attr.aor, i2);
    }

    public final void setSize(int i2) {
        this.f45119d.a(this, R.attr.aos, i2);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (canvas != null && (drawable = this.f45116a) != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (isChecked()) {
                colorMatrixColorFilter = this.f45121f;
            } else {
                colorMatrixColorFilter = this.f45122g;
            }
            drawable.setColorFilter(colorMatrixColorFilter);
            float height = ((float) getHeight()) / ((float) intrinsicHeight);
            canvas.save();
            canvas.scale(height, height);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4 = this.f45117b;
        if (i4 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        int i5 = this.f45117b;
        if (i5 > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxCheckBox(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
        k<TuxCheckBox> kVar = new k<>(new a());
        this.f45119d = kVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aoq, R.attr.aor, R.attr.aos, R.attr.aot}, i2, 0);
        l.a((Object) obtainStyledAttributes, "");
        int i3 = obtainStyledAttributes.getInt(1, 0);
        int i4 = obtainStyledAttributes.getInt(2, 0);
        int color = obtainStyledAttributes.getColor(0, 0);
        int color2 = obtainStyledAttributes.getColor(3, 0);
        obtainStyledAttributes.recycle();
        this.f45121f = i.a(color);
        this.f45122g = i.a(color2);
        this.f45118c = true;
        setShape(i3);
        setSize(i4);
        kVar.a(this, (int) R.attr.cv);
        setGravity(51);
        setBackground(null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxCheckBox(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.bp : i2);
    }
}
