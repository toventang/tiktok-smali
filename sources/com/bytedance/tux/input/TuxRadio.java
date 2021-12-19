package com.bytedance.tux.input;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.b.k;
import com.bytedance.tux.c.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class TuxRadio extends n implements a {

    /* renamed from: a  reason: collision with root package name */
    private final k<TextView> f45130a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f45131b;

    /* renamed from: c  reason: collision with root package name */
    private h.f.a.a<Boolean> f45132c;

    static {
        Covode.recordClassIndex(27525);
    }

    public TuxRadio(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    static final class a extends g {

        /* renamed from: a  reason: collision with root package name */
        private final int f45133a;

        /* renamed from: b  reason: collision with root package name */
        private final Paint f45134b = new Paint();

        /* renamed from: c  reason: collision with root package name */
        private final int f45135c;

        static {
            Covode.recordClassIndex(27526);
        }

        public final int getIntrinsicHeight() {
            return this.f45133a;
        }

        public final int getIntrinsicWidth() {
            return this.f45133a;
        }

        public a(int i2) {
            this.f45135c = i2;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            this.f45133a = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
        }

        public final void draw(Canvas canvas) {
            l.c(canvas, "");
            int i2 = this.f45133a;
            float f2 = ((float) i2) / 2.0f;
            float f3 = ((float) i2) / 12.0f;
            this.f45134b.setAntiAlias(true);
            this.f45134b.setStyle(Paint.Style.STROKE);
            this.f45134b.setStrokeWidth(f3);
            this.f45134b.setColor(this.f45135c);
            canvas.drawCircle(f2, f2, f2 - (f3 / 2.0f), this.f45134b);
            this.f45134b.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f2, f2, ((float) i2) / 3.0f, this.f45134b);
        }
    }

    static final class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final int f45136a;

        /* renamed from: b  reason: collision with root package name */
        private final Paint f45137b = new Paint();

        /* renamed from: c  reason: collision with root package name */
        private final int f45138c;

        /* renamed from: d  reason: collision with root package name */
        private final int f45139d;

        static {
            Covode.recordClassIndex(27527);
        }

        public final int getIntrinsicHeight() {
            return this.f45136a;
        }

        public final int getIntrinsicWidth() {
            return this.f45136a;
        }

        public final void draw(Canvas canvas) {
            l.c(canvas, "");
            int i2 = this.f45136a;
            float f2 = ((float) i2) / 2.0f;
            float f3 = ((float) i2) / 16.0f;
            this.f45137b.setAntiAlias(true);
            this.f45137b.setStyle(Paint.Style.FILL);
            this.f45137b.setColor(this.f45139d);
            canvas.drawCircle(f2, f2, f2 - f3, this.f45137b);
            this.f45137b.setStyle(Paint.Style.STROKE);
            this.f45137b.setStrokeWidth(f3);
            this.f45137b.setColor(this.f45138c);
            canvas.drawCircle(f2, f2, f2 - (f3 / 2.0f), this.f45137b);
        }

        public b(int i2, int i3) {
            this.f45138c = i2;
            this.f45139d = i3;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            this.f45136a = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
        }
    }

    public final void toggle() {
        Boolean invoke;
        h.f.a.a<Boolean> aVar = this.f45132c;
        if (aVar == null || (invoke = aVar.invoke()) == null || !invoke.booleanValue()) {
            super.toggle();
        }
    }

    public final void setChecked(boolean z) {
        super.setChecked(z);
    }

    @Override // com.bytedance.tux.input.a
    public final void setInterceptToggleListener(h.f.a.a<Boolean> aVar) {
        this.f45132c = aVar;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f45131b) {
            this.f45130a.a(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxRadio(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
        k<TextView> kVar = new k<>(new com.bytedance.tux.b.a.a());
        this.f45130a = kVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aqd, R.attr.aqe, R.attr.aqf}, i2, 0);
        l.a((Object) obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(0, 0);
        int color2 = obtainStyledAttributes.getColor(2, 0);
        int color3 = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f45131b = true;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, new a(color));
        stateListDrawable.addState(new int[0], new b(color2, color3));
        setButtonDrawable(stateListDrawable);
        kVar.a(this, (int) R.attr.et);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxRadio(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.c2 : i2);
    }
}
