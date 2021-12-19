package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.d;
import h.f.b.l;

public final class e extends View {

    /* renamed from: a  reason: collision with root package name */
    private TextPaint f126358a;

    /* renamed from: b  reason: collision with root package name */
    private Path f126359b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f126360c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f126361d;

    /* renamed from: e  reason: collision with root package name */
    private String f126362e;

    /* renamed from: f  reason: collision with root package name */
    private int f126363f;

    /* renamed from: g  reason: collision with root package name */
    private int f126364g;

    /* renamed from: h  reason: collision with root package name */
    private int f126365h;

    /* renamed from: i  reason: collision with root package name */
    private int f126366i;

    /* renamed from: j  reason: collision with root package name */
    private int f126367j;

    /* renamed from: k  reason: collision with root package name */
    private int f126368k;

    /* renamed from: l  reason: collision with root package name */
    private int f126369l;

    /* renamed from: m  reason: collision with root package name */
    private int f126370m;
    private int n;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f126371a;

        /* renamed from: b  reason: collision with root package name */
        public int f126372b;

        /* renamed from: c  reason: collision with root package name */
        public int f126373c;

        /* renamed from: d  reason: collision with root package name */
        public int f126374d;

        /* renamed from: e  reason: collision with root package name */
        public int f126375e;

        /* renamed from: f  reason: collision with root package name */
        public int f126376f;

        /* renamed from: g  reason: collision with root package name */
        public int f126377g;

        /* renamed from: h  reason: collision with root package name */
        public int f126378h;

        /* renamed from: i  reason: collision with root package name */
        public int f126379i;

        static {
            Covode.recordClassIndex(82914);
        }
    }

    static {
        Covode.recordClassIndex(82913);
    }

    public final void setText(String str) {
        this.f126362e = str;
        invalidate();
    }

    public final void setBgColor(int i2) {
        Paint paint = this.f126360c;
        if (paint == null) {
            l.a("mBgPaint");
        }
        paint.setColor(i2);
        invalidate();
    }

    public final void setTextColor(int i2) {
        TextPaint textPaint = this.f126358a;
        if (textPaint == null) {
            l.a("textPaint");
        }
        textPaint.setColor(i2);
        invalidate();
    }

    public final void setTextSize(int i2) {
        TextPaint textPaint = this.f126358a;
        if (textPaint == null) {
            l.a("textPaint");
        }
        textPaint.setTextSize((float) i2);
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private e(Context context) {
        super(context, null);
        l.d(context, "");
        MethodCollector.i(2921);
        TextPaint textPaint = new TextPaint();
        this.f126358a = textPaint;
        textPaint.setAntiAlias(true);
        this.f126360c = new Paint();
        this.f126359b = new Path();
        Paint paint = this.f126360c;
        if (paint == null) {
            l.a("mBgPaint");
        }
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f126361d = paint2;
        paint2.setAntiAlias(true);
        Typeface a2 = b.a().a(d.f33801g);
        if (a2 != null) {
            try {
                TextPaint textPaint2 = this.f126358a;
                if (textPaint2 == null) {
                    l.a("textPaint");
                }
                textPaint2.setTypeface(a2);
                MethodCollector.o(2921);
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        MethodCollector.o(2921);
    }

    public final void setAttribute(a aVar) {
        l.d(aVar, "");
        this.f126369l = aVar.f126377g;
        this.f126370m = aVar.f126378h;
        this.f126367j = aVar.f126375e;
        this.f126366i = aVar.f126374d;
        this.f126363f = aVar.f126371a;
        this.f126364g = aVar.f126372b;
        this.f126365h = aVar.f126373c;
        this.n = aVar.f126379i;
        Paint paint = this.f126360c;
        if (paint == null) {
            l.a("mBgPaint");
        }
        paint.setColor(this.f126370m);
        Paint paint2 = this.f126361d;
        if (paint2 == null) {
            l.a("anglePaint");
        }
        paint2.setColor(this.f126370m);
        TextPaint textPaint = this.f126358a;
        if (textPaint == null) {
            l.a("textPaint");
        }
        textPaint.setColor(this.f126369l);
        TextPaint textPaint2 = this.f126358a;
        if (textPaint2 == null) {
            l.a("textPaint");
        }
        textPaint2.setTextSize((float) this.n);
        this.f126368k = aVar.f126376f;
        Paint paint3 = this.f126361d;
        if (paint3 == null) {
            l.a("anglePaint");
        }
        paint3.setPathEffect(new CornerPathEffect((float) this.f126368k));
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        l.d(canvas, "");
        if (!TextUtils.isEmpty(this.f126362e)) {
            TextPaint textPaint = this.f126358a;
            if (textPaint == null) {
                l.a("textPaint");
                l.b();
            }
            int measureText = ((int) textPaint.measureText(this.f126362e)) + (this.f126366i * 2);
            Rect rect = new Rect();
            TextPaint textPaint2 = this.f126358a;
            if (textPaint2 == null) {
                l.a("textPaint");
            }
            String str = this.f126362e;
            if (str == null) {
                l.b();
            }
            textPaint2.getTextBounds(str, 0, str.length(), rect);
            int height = rect.height() + (this.f126366i * 2);
            int i2 = this.f126367j;
            float f2 = (float) height;
            RectF rectF = new RectF((float) i2, 0.0f, (float) (i2 + measureText), f2);
            int i3 = this.f126367j;
            float f3 = (float) i3;
            float f4 = (float) i3;
            Paint paint = this.f126360c;
            if (paint == null) {
                l.a("mBgPaint");
            }
            canvas.drawRoundRect(rectF, f3, f4, paint);
            Path path = this.f126359b;
            if (path == null) {
                l.a("anglePath");
            }
            path.moveTo((float) (this.f126365h + this.f126363f + this.f126367j), f2);
            Path path2 = this.f126359b;
            if (path2 == null) {
                l.a("anglePath");
            }
            path2.lineTo((float) (this.f126365h + (this.f126363f / 2) + this.f126367j), (float) (this.f126364g + height));
            Path path3 = this.f126359b;
            if (path3 == null) {
                l.a("anglePath");
            }
            path3.lineTo((float) (this.f126365h + this.f126367j), f2);
            Path path4 = this.f126359b;
            if (path4 == null) {
                l.a("anglePath");
            }
            Paint paint2 = this.f126361d;
            if (paint2 == null) {
                l.a("anglePaint");
            }
            canvas.drawPath(path4, paint2);
            String str2 = this.f126362e;
            if (str2 == null) {
                l.b();
            }
            String str3 = this.f126362e;
            if (str3 == null) {
                l.b();
            }
            int length = str3.length();
            int i4 = this.f126366i;
            float f5 = (float) (this.f126367j + i4);
            float f6 = (float) ((height - i4) - 4);
            TextPaint textPaint3 = this.f126358a;
            if (textPaint3 == null) {
                l.a("textPaint");
                l.b();
            }
            canvas.drawText(str2, 0, length, f5, f6, (Paint) textPaint3);
        }
    }

    public /* synthetic */ e(Context context, byte b2) {
        this(context);
    }

    public final void onMeasure(int i2, int i3) {
        if (TextUtils.isEmpty(this.f126362e)) {
            setMeasuredDimension(0, 0);
            return;
        }
        TextPaint textPaint = this.f126358a;
        if (textPaint == null) {
            l.a("textPaint");
            l.b();
        }
        int measureText = ((int) textPaint.measureText(this.f126362e)) + (this.f126366i * 2) + (this.f126367j * 2);
        Rect rect = new Rect();
        TextPaint textPaint2 = this.f126358a;
        if (textPaint2 == null) {
            l.a("textPaint");
            l.b();
        }
        String str = this.f126362e;
        if (str == null) {
            l.b();
        }
        textPaint2.getTextBounds(str, 0, str.length(), rect);
        setMeasuredDimension(measureText, rect.height() + (this.f126366i * 2) + this.f126364g);
    }
}
