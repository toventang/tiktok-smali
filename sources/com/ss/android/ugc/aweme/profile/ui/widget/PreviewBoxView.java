package com.ss.android.ugc.aweme.profile.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class PreviewBoxView extends View {

    /* renamed from: a  reason: collision with root package name */
    public boolean f117355a;

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f117356b;

    /* renamed from: c  reason: collision with root package name */
    public int f117357c;

    /* renamed from: d  reason: collision with root package name */
    public int f117358d;

    /* renamed from: e  reason: collision with root package name */
    public float f117359e = 0.5625f;

    /* renamed from: f  reason: collision with root package name */
    public float f117360f;

    /* renamed from: g  reason: collision with root package name */
    public a f117361g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f117362h;

    /* renamed from: i  reason: collision with root package name */
    private RectF f117363i;

    /* renamed from: j  reason: collision with root package name */
    private Bitmap f117364j;

    /* renamed from: k  reason: collision with root package name */
    private Context f117365k;

    /* renamed from: l  reason: collision with root package name */
    private int f117366l = -1;

    public interface a {
        static {
            Covode.recordClassIndex(75838);
        }
    }

    static {
        Covode.recordClassIndex(75835);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public Rect getVisibleRect() {
        Rect rect = new Rect();
        rect.set((int) this.f117363i.left, (int) this.f117363i.top, (int) this.f117363i.right, (int) this.f117363i.bottom);
        return rect;
    }

    public final void a() {
        if (Math.abs(this.f117360f - 0.85f) >= Float.MIN_NORMAL && !this.f117355a) {
            this.f117355a = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 0.85f);
            this.f117356b = ofFloat;
            ofFloat.setEvaluator(new FloatEvaluator());
            this.f117356b.setDuration(300L);
            this.f117356b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.ugc.aweme.profile.ui.widget.PreviewBoxView.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(75836);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PreviewBoxView.this.f117360f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    PreviewBoxView previewBoxView = PreviewBoxView.this;
                    previewBoxView.setAlpha(previewBoxView.f117360f);
                    if (PreviewBoxView.this.f117361g != null) {
                        valueAnimator.getAnimatedFraction();
                    }
                }
            });
            this.f117356b.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.profile.ui.widget.PreviewBoxView.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(75837);
                }

                public final void onAnimationEnd(Animator animator) {
                    PreviewBoxView.this.f117360f = 0.85f;
                    PreviewBoxView.this.f117355a = false;
                }
            });
            this.f117356b.setStartDelay(300);
            this.f117356b.start();
        }
    }

    public void setTopOffset(int i2) {
        this.f117366l = i2;
    }

    public void onDraw(Canvas canvas) {
        int parseColor;
        boolean z;
        MethodCollector.i(9293);
        if (this.f117363i == null) {
            MethodCollector.o(9293);
            return;
        }
        if (this.f117364j == null) {
            int width = getWidth();
            int height = getHeight();
            RectF rectF = this.f117363i;
            Context context = this.f117365k;
            if (context != null) {
                parseColor = b.c(context, R.color.bk);
            } else {
                parseColor = Color.parseColor("#d9161823");
            }
            if (this.f117358d == 1) {
                z = true;
            } else {
                z = false;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
            Canvas canvas2 = new Canvas(createBitmap);
            canvas2.drawColor(parseColor);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            if (z) {
                canvas2.drawOval(rectF, paint);
            } else {
                canvas2.drawRect(rectF, paint);
            }
            this.f117364j = createBitmap;
        }
        canvas.drawBitmap(this.f117364j, 0.0f, 0.0f, this.f117362h);
        MethodCollector.o(9293);
    }

    public PreviewBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(9107);
        this.f117365k = context;
        Paint paint = new Paint();
        this.f117362h = paint;
        paint.setAntiAlias(true);
        this.f117357c = (int) n.b(context, 16.0f);
        this.f117360f = 0.5f;
        setAlpha(0.5f);
        MethodCollector.o(9107);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        int width = getWidth() - (this.f117357c * 2);
        int i6 = (int) (((float) width) * this.f117359e);
        int i7 = this.f117366l;
        if (i7 < 0) {
            i7 = Math.max(0, (getHeight() - i6) / 2);
        }
        int i8 = this.f117357c;
        this.f117363i = new RectF((float) i8, (float) i7, (float) (i8 + width), (float) (i7 + i6));
    }
}
