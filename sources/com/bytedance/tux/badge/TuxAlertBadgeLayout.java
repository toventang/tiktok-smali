package com.bytedance.tux.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class TuxAlertBadgeLayout extends FrameLayout implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final int f44709c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f44710d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f44711a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f44712b;

    /* renamed from: e  reason: collision with root package name */
    private final c f44713e;

    /* renamed from: f  reason: collision with root package name */
    private int f44714f;

    /* renamed from: g  reason: collision with root package name */
    private int f44715g;

    /* renamed from: h  reason: collision with root package name */
    private int f44716h;

    /* renamed from: i  reason: collision with root package name */
    private int f44717i;

    /* renamed from: j  reason: collision with root package name */
    private int f44718j;

    /* renamed from: k  reason: collision with root package name */
    private int f44719k;

    /* renamed from: l  reason: collision with root package name */
    private View f44720l;

    /* renamed from: m  reason: collision with root package name */
    private int f44721m;
    private int n;

    public TuxAlertBadgeLayout(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public TuxAlertBadgeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27331);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getAttachTo() {
        return this.f44717i;
    }

    public final int getCount() {
        return this.f44715g;
    }

    public final int getMaxCount() {
        return this.f44716h;
    }

    public final int getOffsetX() {
        return this.f44718j;
    }

    public final int getOffsetY() {
        return this.f44719k;
    }

    public final int getVariant() {
        return this.f44714f;
    }

    public final void a() {
        this.f44712b = true;
        invalidate();
    }

    public final void b() {
        this.f44712b = false;
        invalidate();
    }

    public final int getDotSize() {
        return this.f44713e.f44731i;
    }

    private final void c() {
        this.f44713e.a(a.a(getVariant(), getMaxCount(), getCount()));
        this.f44713e.a();
        requestLayout();
    }

    static {
        Covode.recordClassIndex(27330);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        f44709c = h.g.a.a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
    }

    @Override // com.bytedance.tux.badge.b
    public final void setCount(int i2) {
        this.f44715g = i2;
        c();
    }

    @Override // com.bytedance.tux.badge.b
    public final void setMaxCount(int i2) {
        this.f44716h = i2;
        c();
    }

    public final void setOffsetX(int i2) {
        this.f44718j = i2;
        requestLayout();
    }

    public final void setOffsetY(int i2) {
        this.f44719k = i2;
        requestLayout();
    }

    public final void setTopmost(boolean z) {
        this.f44711a = z;
        invalidate();
    }

    @Override // com.bytedance.tux.badge.b
    public final void setVariant(int i2) {
        this.f44714f = i2;
        c();
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        l.c(canvas, "");
        super.dispatchDraw(canvas);
        if (this.f44711a) {
            a(canvas);
        }
    }

    private final void a(Canvas canvas) {
        if (this.f44712b) {
            canvas.save();
            canvas.translate((float) this.f44721m, (float) this.n);
            this.f44713e.draw(canvas);
            canvas.restore();
        }
    }

    public final void setAttachTo(int i2) {
        View findViewById;
        this.f44717i = i2;
        if (i2 == -1) {
            findViewById = null;
        } else {
            findViewById = findViewById(i2);
        }
        this.f44720l = findViewById;
        requestLayout();
    }

    @Override // com.bytedance.tux.badge.b
    public final void setDotSize(int i2) {
        this.f44713e.f44731i = i2;
        if (this.f44713e.f44726d.length() == 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(9679);
        this.f44713e.a();
        super.onMeasure(i2, i3);
        MethodCollector.o(9679);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ TuxAlertBadgeLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        l.c(canvas, "");
        boolean drawChild = super.drawChild(canvas, view, j2);
        if (!this.f44711a && l.a(view, this.f44720l)) {
            a(canvas);
        }
        return drawChild;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxAlertBadgeLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        MethodCollector.i(10025);
        this.f44717i = -1;
        this.f44712b = true;
        this.f44713e = a.a(context, attributeSet, 0, 0, 0, 60);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aod, R.attr.aoe, R.attr.aof, R.attr.aog, R.attr.aoh, R.attr.aoi, R.attr.aoj, R.attr.aok}, 0, 0);
        setVariant(obtainStyledAttributes.getInt(7, 0));
        setCount(obtainStyledAttributes.getInt(1, 0));
        setMaxCount(obtainStyledAttributes.getInt(3, 0));
        setAttachTo(obtainStyledAttributes.getResourceId(0, -1));
        setTopmost(obtainStyledAttributes.getBoolean(6, false));
        setOffsetX(obtainStyledAttributes.getDimensionPixelOffset(4, 0));
        setOffsetY(obtainStyledAttributes.getDimensionPixelOffset(5, 0));
        obtainStyledAttributes.recycle();
        MethodCollector.o(10025);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.badge.TuxAlertBadgeLayout.onLayout(boolean, int, int, int, int):void");
    }
}
