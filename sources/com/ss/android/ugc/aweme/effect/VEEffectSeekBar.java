package com.ss.android.ugc.aweme.effect;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;

public class VEEffectSeekBar extends View {

    /* renamed from: a  reason: collision with root package name */
    private float f88745a;

    /* renamed from: b  reason: collision with root package name */
    private int f88746b;

    /* renamed from: c  reason: collision with root package name */
    private int f88747c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f88748d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f88749e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<EffectPointModel> f88750f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f88751g;

    /* renamed from: h  reason: collision with root package name */
    private RectF f88752h;

    /* renamed from: i  reason: collision with root package name */
    private RectF f88753i;

    /* renamed from: j  reason: collision with root package name */
    private int f88754j;

    /* renamed from: k  reason: collision with root package name */
    private int f88755k;

    /* renamed from: l  reason: collision with root package name */
    private int f88756l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f88757m;

    static {
        Covode.recordClassIndex(55841);
    }

    public final void a(boolean z) {
        if (this.f88757m != z) {
            this.f88757m = z;
            invalidate();
        }
    }

    public void setDuration(int i2) {
        this.f88754j = i2;
        this.f88745a = ((float) this.f88746b) / ((float) i2);
    }

    public void setNormalColor(int i2) {
        this.f88755k = i2;
        if (!this.f88757m) {
            invalidate();
        }
    }

    public void setOverlayColor(int i2) {
        if (this.f88756l != i2) {
            this.f88756l = i2;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        float f3;
        MethodCollector.i(848);
        super.onDraw(canvas);
        if (this.f88757m) {
            this.f88748d.setColor(this.f88756l);
            if (this.f88756l != 0) {
                this.f88748d.setAlpha(230);
            }
            canvas.drawRect(this.f88752h, this.f88748d);
            MethodCollector.o(848);
            return;
        }
        this.f88748d.setColor(this.f88755k);
        RectF rectF = this.f88752h;
        int i2 = this.f88747c;
        canvas.drawRoundRect(rectF, (float) (i2 / 2), (float) (i2 / 2), this.f88748d);
        for (int i3 = 0; i3 < this.f88750f.size(); i3++) {
            EffectPointModel effectPointModel = this.f88750f.get(i3);
            if (effectPointModel.getSelectedColor() != 0) {
                this.f88749e.setColor(effectPointModel.getSelectedColor());
                this.f88749e.setAlpha(230);
                int uiStartPoint = effectPointModel.getUiStartPoint();
                int uiEndPoint = effectPointModel.getUiEndPoint();
                boolean isFromEnd = effectPointModel.isFromEnd() ^ this.f88751g;
                if (isFromEnd) {
                    f2 = (float) (this.f88754j - uiEndPoint);
                } else {
                    f2 = (float) uiStartPoint;
                }
                float f4 = f2 * this.f88745a;
                if (isFromEnd) {
                    f3 = (float) (this.f88754j - uiStartPoint);
                } else {
                    f3 = (float) uiEndPoint;
                }
                this.f88753i.set(f4, 0.0f, f3 * this.f88745a, (float) this.f88747c);
                if (uiStartPoint == 0 && uiEndPoint == this.f88754j) {
                    RectF rectF2 = this.f88753i;
                    int i4 = this.f88747c;
                    canvas.drawRoundRect(rectF2, (float) (i4 / 2), (float) (i4 / 2), this.f88749e);
                } else {
                    canvas.drawRect(this.f88753i, this.f88749e);
                }
            }
        }
        MethodCollector.o(848);
    }

    public VEEffectSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void a(ArrayList<EffectPointModel> arrayList, boolean z) {
        this.f88750f = arrayList;
        this.f88751g = z;
        postInvalidate();
    }

    public final void a(boolean z, int i2) {
        boolean z2;
        if (this.f88757m != z) {
            this.f88757m = z;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && this.f88756l != i2) {
            this.f88756l = i2;
        } else if (!z2) {
            return;
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(826);
        super.onMeasure(i2, i3);
        this.f88747c = View.MeasureSpec.getSize(i3);
        if (this.f88752h == null) {
            this.f88752h = new RectF();
        }
        this.f88752h.set(0.0f, 0.0f, (float) this.f88746b, (float) this.f88747c);
        MethodCollector.o(826);
    }

    private VEEffectSeekBar(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(791);
        this.f88746b = d.f88937a;
        this.f88747c = (int) n.b(getContext(), 5.0f);
        Paint paint = new Paint();
        this.f88748d = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f88749e = paint2;
        paint2.setAntiAlias(true);
        this.f88750f = new ArrayList<>();
        this.f88753i = new RectF();
        MethodCollector.o(791);
    }
}
