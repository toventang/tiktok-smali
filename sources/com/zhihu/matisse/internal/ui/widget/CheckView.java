package com.zhihu.matisse.internal.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.a.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class CheckView extends View {

    /* renamed from: a  reason: collision with root package name */
    private boolean f156492a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f156493b;

    /* renamed from: c  reason: collision with root package name */
    private int f156494c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f156495d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f156496e;

    /* renamed from: f  reason: collision with root package name */
    private TextPaint f156497f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f156498g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f156499h;

    /* renamed from: i  reason: collision with root package name */
    private float f156500i;

    /* renamed from: j  reason: collision with root package name */
    private Rect f156501j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f156502k = true;

    static {
        Covode.recordClassIndex(103914);
    }

    private Rect getCheckRect() {
        if (this.f156501j == null) {
            float f2 = this.f156500i;
            int i2 = (int) (((f2 * 48.0f) / 2.0f) - ((f2 * 16.0f) / 2.0f));
            float f3 = this.f156500i;
            float f4 = (float) i2;
            this.f156501j = new Rect(i2, i2, (int) ((f3 * 48.0f) - f4), (int) ((f3 * 48.0f) - f4));
        }
        return this.f156501j;
    }

    private void a() {
        if (this.f156496e == null) {
            Paint paint = new Paint();
            this.f156496e = paint;
            paint.setAntiAlias(true);
            this.f156496e.setStyle(Paint.Style.FILL);
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.xq});
            int color = obtainStyledAttributes.getColor(0, f.b(getResources(), R.color.a39, getContext().getTheme()));
            obtainStyledAttributes.recycle();
            this.f156496e.setColor(color);
        }
    }

    public void setCountable(boolean z) {
        this.f156492a = z;
    }

    public void setEnabled(boolean z) {
        if (this.f156502k != z) {
            this.f156502k = z;
            invalidate();
        }
    }

    public void setChecked(boolean z) {
        if (!this.f156492a) {
            this.f156493b = z;
            invalidate();
            return;
        }
        throw new IllegalStateException("CheckView is countable, call setCheckedNum() instead.");
    }

    public void setCheckedNum(int i2) {
        if (!this.f156492a) {
            throw new IllegalStateException("CheckView is not countable, call setChecked() instead.");
        } else if (i2 == Integer.MIN_VALUE || i2 > 0) {
            this.f156494c = i2;
            invalidate();
        } else {
            throw new IllegalArgumentException("checked num can't be negative.");
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        MethodCollector.i(3419);
        super.onDraw(canvas);
        if (this.f156498g == null) {
            Paint paint = new Paint();
            this.f156498g = paint;
            paint.setAntiAlias(true);
            Paint paint2 = this.f156498g;
            float f3 = this.f156500i;
            paint2.setShader(new RadialGradient((f3 * 48.0f) / 2.0f, (f3 * 48.0f) / 2.0f, f3 * 19.0f, new int[]{Color.parseColor("#00000000"), Color.parseColor("#0D000000"), Color.parseColor("#0D000000"), Color.parseColor("#00000000")}, new float[]{0.21052632f, 0.5263158f, 0.68421054f, 1.0f}, Shader.TileMode.CLAMP));
        }
        float f4 = this.f156500i;
        canvas.drawCircle((f4 * 48.0f) / 2.0f, (f4 * 48.0f) / 2.0f, f4 * 19.0f, this.f156498g);
        float f5 = this.f156500i;
        canvas.drawCircle((f5 * 48.0f) / 2.0f, (f5 * 48.0f) / 2.0f, f5 * 11.5f, this.f156495d);
        if (this.f156492a) {
            if (this.f156494c != Integer.MIN_VALUE) {
                a();
                float f6 = this.f156500i;
                canvas.drawCircle((f6 * 48.0f) / 2.0f, (48.0f * f6) / 2.0f, f6 * 11.0f, this.f156496e);
                if (this.f156497f == null) {
                    TextPaint textPaint = new TextPaint();
                    this.f156497f = textPaint;
                    textPaint.setAntiAlias(true);
                    this.f156497f.setColor(-1);
                    this.f156497f.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                    this.f156497f.setTextSize(this.f156500i * 12.0f);
                }
                String valueOf = String.valueOf(this.f156494c);
                canvas.drawText(valueOf, (float) (((int) (((float) canvas.getWidth()) - this.f156497f.measureText(valueOf))) / 2), (float) (((int) ((((float) canvas.getHeight()) - this.f156497f.descent()) - this.f156497f.ascent())) / 2), this.f156497f);
            }
        } else if (this.f156493b) {
            a();
            float f7 = this.f156500i;
            canvas.drawCircle((f7 * 48.0f) / 2.0f, (48.0f * f7) / 2.0f, f7 * 11.0f, this.f156496e);
            this.f156499h.setBounds(getCheckRect());
            this.f156499h.draw(canvas);
        }
        if (this.f156502k) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        setAlpha(f2);
        MethodCollector.o(3419);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(3416);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (this.f156500i * 48.0f), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
        MethodCollector.o(3416);
    }

    public CheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(3415);
        this.f156500i = context.getResources().getDisplayMetrics().density;
        Paint paint = new Paint();
        this.f156495d = paint;
        paint.setAntiAlias(true);
        this.f156495d.setStyle(Paint.Style.STROKE);
        this.f156495d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.f156495d.setStrokeWidth(this.f156500i * 3.0f);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.xr});
        int color = obtainStyledAttributes.getColor(0, f.b(getResources(), R.color.a3_, getContext().getTheme()));
        obtainStyledAttributes.recycle();
        this.f156495d.setColor(color);
        this.f156499h = f.a(context.getResources(), 2131232211, context.getTheme());
        MethodCollector.o(3415);
    }
}
