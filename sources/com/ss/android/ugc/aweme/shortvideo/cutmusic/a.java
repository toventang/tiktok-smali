package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.d;
import h.f.b.l;

public final class a extends View {

    /* renamed from: a  reason: collision with root package name */
    public d f126329a;

    /* renamed from: b  reason: collision with root package name */
    float f126330b;

    /* renamed from: c  reason: collision with root package name */
    int f126331c;

    /* renamed from: d  reason: collision with root package name */
    int f126332d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f126333e;

    /* renamed from: f  reason: collision with root package name */
    private int f126334f;

    /* renamed from: g  reason: collision with root package name */
    private int f126335g;

    /* renamed from: h  reason: collision with root package name */
    private d f126336h;

    /* renamed from: i  reason: collision with root package name */
    private RectF f126337i;

    static {
        Covode.recordClassIndex(82907);
    }

    /* access modifiers changed from: protected */
    public final int getMHeight() {
        return this.f126335g;
    }

    /* access modifiers changed from: protected */
    public final Paint getMPaint() {
        return this.f126333e;
    }

    /* access modifiers changed from: protected */
    public final d getMusicWaveBean() {
        return this.f126336h;
    }

    public final int getViewWidth() {
        return this.f126334f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.a$a  reason: collision with other inner class name */
    public static final class RunnableC3286a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f126338a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f126339b;

        static {
            Covode.recordClassIndex(82908);
        }

        RunnableC3286a(a aVar, d dVar) {
            this.f126338a = aVar;
            this.f126339b = dVar;
        }

        public final void run() {
            if (this.f126338a.f126329a != null) {
                this.f126338a.f126329a.a(this.f126339b.getMusicWavePointArray());
                this.f126338a.invalidate();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setMHeight(int i2) {
        this.f126335g = i2;
    }

    /* access modifiers changed from: protected */
    public final void setMusicWaveBean(d dVar) {
        this.f126336h = dVar;
    }

    public final void setProgressMaxWidth(int i2) {
        this.f126332d = i2;
    }

    public final void setViewWidth(int i2) {
        this.f126334f = i2;
    }

    /* access modifiers changed from: protected */
    public final void setMPaint(Paint paint) {
        l.d(paint, "");
        this.f126333e = paint;
    }

    public final void setAudioWaveViewData(d dVar) {
        if (dVar != null) {
            this.f126336h = dVar;
            post(new RunnableC3286a(this, dVar));
        }
    }

    public final void setColor(int i2) {
        this.f126333e.setColor(i2);
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(2915);
        this.f126337i = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843173}, 0, 0);
        l.b(obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f126333e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f126333e.setColor(color);
        d dVar = new d();
        this.f126329a = dVar;
        dVar.a(context);
        this.f126329a.f126353i = false;
        MethodCollector.o(2915);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i2;
        l.d(canvas, "");
        canvas.save();
        this.f126329a.a(canvas);
        canvas.restore();
        canvas.save();
        int i3 = this.f126331c;
        this.f126337i.set((float) i3, 0.0f, ((float) i3) + (this.f126330b * ((float) getWidth())), (float) getHeight());
        canvas.clipRect(this.f126337i);
        d dVar = this.f126329a;
        Paint paint = this.f126333e;
        l.d(canvas, "");
        l.d(paint, "");
        int length = dVar.f126352h.length;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = (int) (dVar.f126352h[i4] * ((float) dVar.f126347c));
            int i6 = (dVar.f126346b + dVar.f126345a) * i4;
            if (dVar.f126350f <= 0 || dVar.f126350f <= dVar.f126349e) {
                i2 = dVar.f126345a;
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            int i8 = ((dVar.f126347c - i5) / 2) + dVar.f126348d;
            canvas.drawRoundRect(new RectF((float) i7, (float) i8, (float) (dVar.f126346b + i7), (float) (i5 + i8)), (float) dVar.f126351g, (float) dVar.f126351g, paint);
        }
    }

    private /* synthetic */ a(Context context, byte b2) {
        this(context);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(Context context, char c2) {
        this(context, (byte) 0);
        l.d(context, "");
    }

    public final void onMeasure(int i2, int i3) {
        MethodCollector.i(2894);
        d dVar = this.f126336h;
        if (dVar == null || !k.b.a(dVar.getMusicWavePointArray())) {
            super.onMeasure(i2, i3);
            MethodCollector.o(2894);
            return;
        }
        int i4 = k.f126400f.f126403a;
        k kVar = k.f126400f;
        if (kVar == null) {
            l.b();
        }
        int i5 = kVar.f126404b;
        d dVar2 = this.f126336h;
        if (dVar2 == null) {
            l.b();
        }
        this.f126334f = ((dVar2.getMusicWavePointArray().length - 1) * (i4 + i5)) + i5;
        k kVar2 = k.f126400f;
        if (kVar2 == null) {
            l.b();
        }
        int i6 = kVar2.f126405c;
        this.f126335g = i6;
        setMeasuredDimension(this.f126334f, i6);
        this.f126329a.a(this.f126334f, this.f126335g);
        MethodCollector.o(2894);
    }
}
