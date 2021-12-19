package com.bytedance.android.livesdk.utils.crop;

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
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class PreviewBoxView extends View {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22296a;

    /* renamed from: b  reason: collision with root package name */
    ValueAnimator f22297b;

    /* renamed from: c  reason: collision with root package name */
    int f22298c;

    /* renamed from: d  reason: collision with root package name */
    int f22299d;

    /* renamed from: e  reason: collision with root package name */
    float f22300e = 0.5625f;

    /* renamed from: f  reason: collision with root package name */
    public float f22301f;

    /* renamed from: g  reason: collision with root package name */
    public a f22302g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f22303h;

    /* renamed from: i  reason: collision with root package name */
    private RectF f22304i;

    /* renamed from: j  reason: collision with root package name */
    private Bitmap f22305j;

    /* renamed from: k  reason: collision with root package name */
    private Context f22306k;

    /* renamed from: l  reason: collision with root package name */
    private int f22307l = -1;

    public interface a {
        static {
            Covode.recordClassIndex(13167);
        }
    }

    static {
        Covode.recordClassIndex(13164);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public Rect getVisibleRect() {
        Rect rect = new Rect();
        rect.set((int) this.f22304i.left, (int) this.f22304i.top, (int) this.f22304i.right, (int) this.f22304i.bottom);
        return rect;
    }

    public final void a() {
        if (Math.abs(this.f22301f - 0.85f) >= Float.MIN_NORMAL && !this.f22296a) {
            this.f22296a = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 0.85f);
            this.f22297b = ofFloat;
            ofFloat.setEvaluator(new FloatEvaluator());
            this.f22297b.setDuration(300L);
            this.f22297b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.android.livesdk.utils.crop.PreviewBoxView.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(13165);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PreviewBoxView.this.f22301f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    PreviewBoxView previewBoxView = PreviewBoxView.this;
                    previewBoxView.setAlpha(previewBoxView.f22301f);
                    if (PreviewBoxView.this.f22302g != null) {
                        valueAnimator.getAnimatedFraction();
                    }
                }
            });
            this.f22297b.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.android.livesdk.utils.crop.PreviewBoxView.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(13166);
                }

                public final void onAnimationEnd(Animator animator) {
                    PreviewBoxView.this.f22301f = 0.85f;
                    PreviewBoxView.this.f22296a = false;
                }
            });
            this.f22297b.setStartDelay(300);
            this.f22297b.start();
        }
    }

    public void setTopOffset(int i2) {
        this.f22307l = i2;
    }

    public void onDraw(Canvas canvas) {
        int parseColor;
        boolean z;
        MethodCollector.i(12767);
        if (this.f22304i == null) {
            MethodCollector.o(12767);
            return;
        }
        if (this.f22305j == null) {
            int width = getWidth();
            int height = getHeight();
            RectF rectF = this.f22304i;
            Context context = this.f22306k;
            if (context != null) {
                parseColor = context.getResources().getColor(R.color.ym);
            } else {
                parseColor = Color.parseColor("#d9161823");
            }
            if (this.f22299d == 1) {
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
            this.f22305j = createBitmap;
        }
        canvas.drawBitmap(this.f22305j, 0.0f, 0.0f, this.f22303h);
        MethodCollector.o(12767);
    }

    public PreviewBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f2;
        MethodCollector.i(12765);
        this.f22306k = context;
        Paint paint = new Paint();
        this.f22303h = paint;
        paint.setAntiAlias(true);
        if (context != null) {
            f2 = (context.getResources().getDisplayMetrics().density * 16.0f) + 0.5f;
        } else {
            f2 = 0.0f;
        }
        this.f22298c = (int) f2;
        this.f22301f = 0.5f;
        setAlpha(0.5f);
        MethodCollector.o(12765);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        int width = getWidth() - (this.f22298c * 2);
        int i6 = (int) (((float) width) * this.f22300e);
        int i7 = this.f22307l;
        if (i7 < 0) {
            i7 = Math.max(0, (getHeight() - i6) / 2);
        }
        int i8 = this.f22298c;
        this.f22304i = new RectF((float) i8, (float) i7, (float) (i8 + width), (float) (i7 + i6));
    }
}
