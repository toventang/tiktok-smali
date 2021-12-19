package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

public class TransEdgeView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private int[] f144582a;

    /* renamed from: b  reason: collision with root package name */
    private float[] f144583b;

    /* renamed from: c  reason: collision with root package name */
    private float f144584c;

    /* renamed from: d  reason: collision with root package name */
    private int f144585d;

    /* renamed from: e  reason: collision with root package name */
    private int f144586e;

    /* renamed from: f  reason: collision with root package name */
    private int f144587f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f144588g;

    static {
        Covode.recordClassIndex(94611);
    }

    public final void a() {
        this.f144587f = 8;
        invalidate();
    }

    public final void b() {
        this.f144587f = 4;
        invalidate();
    }

    public final void c() {
        this.f144587f = 12;
        invalidate();
    }

    public void setDrawSize(float f2) {
        this.f144584c = f2;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(6384);
        super.onDraw(canvas);
        MethodCollector.o(6384);
    }

    public TransEdgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TransEdgeView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        boolean z = false;
        MethodCollector.i(6375);
        this.f144582a = new int[]{-1, 0};
        this.f144583b = new float[]{0.0f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.sb, R.attr.sc});
        this.f144587f = obtainStyledAttributes.getInt(0, 0);
        int i2 = Build.VERSION.SDK_INT;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? true : z) {
            if ((this.f144587f & 16) != 0) {
                this.f144587f = 4;
            }
            if ((this.f144587f & 32) != 0) {
                this.f144587f = 16;
            }
        } else {
            if ((this.f144587f & 16) != 0) {
                this.f144587f = 8;
            }
            if ((this.f144587f & 32) != 0) {
                this.f144587f = 4;
            }
        }
        this.f144584c = obtainStyledAttributes.getDimension(1, n.b(getContext(), 20.0f));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f144588g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f144588g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        MethodCollector.o(6375);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31);
        boolean drawChild = super.drawChild(canvas, view, j2);
        int i2 = this.f144587f;
        if (i2 == 0 || (i2 & 1) != 0) {
            canvas.drawRect(0.0f, -3.0f, (float) this.f144585d, this.f144584c, this.f144588g);
        }
        int i3 = this.f144587f;
        if (i3 == 0 || (i3 & 2) != 0) {
            int save = canvas.save();
            canvas.rotate(180.0f, (float) (this.f144585d / 2), (float) (this.f144586e / 2));
            canvas.drawRect(0.0f, -3.0f, (float) this.f144585d, this.f144584c, this.f144588g);
            canvas.restoreToCount(save);
        }
        int i4 = (this.f144586e - this.f144585d) / 2;
        int i5 = this.f144587f;
        if (i5 == 0 || (i5 & 4) != 0) {
            int save2 = canvas.save();
            canvas.rotate(90.0f, (float) (this.f144585d / 2), (float) (this.f144586e / 2));
            canvas.translate(0.0f, (float) i4);
            canvas.drawRect((float) (0 - i4), -3.0f, (float) (this.f144585d + i4), this.f144584c, this.f144588g);
            canvas.restoreToCount(save2);
        }
        int i6 = this.f144587f;
        if (i6 == 0 || (i6 & 8) != 0) {
            int save3 = canvas.save();
            canvas.rotate(270.0f, (float) (this.f144585d / 2), (float) (this.f144586e / 2));
            canvas.translate(0.0f, (float) i4);
            canvas.drawRect((float) (0 - i4), -3.0f, (float) (this.f144585d + i4), this.f144584c, this.f144588g);
            canvas.restoreToCount(save3);
        }
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f144588g.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f144584c, this.f144582a, this.f144583b, Shader.TileMode.CLAMP));
        this.f144585d = getWidth();
        this.f144586e = getHeight();
    }
}
