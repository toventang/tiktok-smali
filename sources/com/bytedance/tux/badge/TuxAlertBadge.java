package com.bytedance.tux.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class TuxAlertBadge extends View implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f44704a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final c f44705b;

    /* renamed from: c  reason: collision with root package name */
    private int f44706c;

    /* renamed from: d  reason: collision with root package name */
    private int f44707d;

    /* renamed from: e  reason: collision with root package name */
    private int f44708e;

    static {
        Covode.recordClassIndex(27328);
    }

    public TuxAlertBadge(Context context) {
        this(context, null, 0, 6);
    }

    public TuxAlertBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27329);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getCount() {
        return this.f44707d;
    }

    public final int getMaxCount() {
        return this.f44708e;
    }

    public final int getVariant() {
        return this.f44706c;
    }

    public final int getDotSize() {
        return this.f44705b.f44731i;
    }

    private final void a() {
        this.f44705b.a(a.a(getVariant(), getMaxCount(), getCount()));
        requestLayout();
    }

    @Override // com.bytedance.tux.badge.b
    public final void setCount(int i2) {
        this.f44707d = i2;
        a();
    }

    @Override // com.bytedance.tux.badge.b
    public final void setMaxCount(int i2) {
        this.f44708e = i2;
        a();
    }

    @Override // com.bytedance.tux.badge.b
    public final void setVariant(int i2) {
        this.f44706c = i2;
        a();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        l.c(canvas, "");
        this.f44705b.draw(canvas);
    }

    @Override // com.bytedance.tux.badge.b
    public final void setDotSize(int i2) {
        this.f44705b.f44731i = i2;
        if (this.f44705b.f44726d.length() == 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(9140);
        this.f44705b.a();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f44705b.f44725c, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f44705b.f44724b, 1073741824));
        MethodCollector.o(9140);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxAlertBadge(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
        MethodCollector.i(9338);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.cr, R.attr.cs, R.attr.ct, R.attr.aoe, R.attr.aof, R.attr.aog, R.attr.aok}, i2, 0);
        l.a((Object) obtainStyledAttributes, "");
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.f44705b = a.a(obtainStyledAttributes, -1, -16777216, h.g.a.a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
        setVariant(obtainStyledAttributes.getInt(6, 0));
        setCount(obtainStyledAttributes.getInt(3, 0));
        setMaxCount(obtainStyledAttributes.getInt(5, 0));
        obtainStyledAttributes.recycle();
        a();
        MethodCollector.o(9338);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxAlertBadge(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.bn : i2);
    }
}
