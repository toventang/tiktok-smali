package com.ss.android.ugc.aweme.tux.business.story;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.z;
import java.util.concurrent.TimeUnit;

public final class StoryBrandView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.b<? super Float, z> f141591a;

    /* renamed from: b  reason: collision with root package name */
    ValueAnimator f141592b;

    /* renamed from: c  reason: collision with root package name */
    public float f141593c;

    /* renamed from: d  reason: collision with root package name */
    private float f141594d;

    /* renamed from: e  reason: collision with root package name */
    private final int f141595e;

    /* renamed from: f  reason: collision with root package name */
    private final int f141596f;

    /* renamed from: g  reason: collision with root package name */
    private final int f141597g;

    /* renamed from: h  reason: collision with root package name */
    private f.a.b.b f141598h;

    /* renamed from: i  reason: collision with root package name */
    private final Paint f141599i;

    /* renamed from: j  reason: collision with root package name */
    private b f141600j;

    /* renamed from: k  reason: collision with root package name */
    private float f141601k;

    /* renamed from: l  reason: collision with root package name */
    private a f141602l;

    /* renamed from: m  reason: collision with root package name */
    private RectF f141603m;
    private RectF n;
    private float o;
    private LinearGradient p;
    private LinearGradient q;
    private final int r;
    private final int s;
    private final int t;

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f141606a = new c();

        static {
            Covode.recordClassIndex(92530);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(92526);
    }

    public StoryBrandView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public StoryBrandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final a getMode() {
        return this.f141602l;
    }

    public final Paint getPaint() {
        return this.f141599i;
    }

    public final float getProgress() {
        return this.f141601k;
    }

    public final float getRadius() {
        return this.o;
    }

    public final float getRingWidth() {
        return this.f141594d;
    }

    public final b getThemeType() {
        return this.f141600j;
    }

    private final int getGray() {
        if (this.f141600j == b.CONST) {
            return this.s;
        }
        return this.r;
    }

    public final void setRadius(float f2) {
        this.o = f2;
        invalidate();
    }

    public final void setThemeType(b bVar) {
        l.d(bVar, "");
        this.f141600j = bVar;
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryBrandView f141604a;

        static {
            Covode.recordClassIndex(92527);
        }

        a(StoryBrandView storyBrandView) {
            this.f141604a = storyBrandView;
        }

        @Override // f.a.w
        public final void subscribe(final v<Float> vVar) {
            l.d(vVar, "");
            this.f141604a.f141591a = new h.f.a.b<Float, z>() {
                /* class com.ss.android.ugc.aweme.tux.business.story.StoryBrandView.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(92528);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(Float f2) {
                    float floatValue = f2.floatValue();
                    v vVar = vVar;
                    l.b(vVar, "");
                    if (!vVar.isDisposed()) {
                        vVar.a(Float.valueOf(floatValue));
                    }
                    return z.f158842a;
                }
            };
        }
    }

    public final void setRingWidth(float f2) {
        this.f141594d = f2;
        this.f141599i.setStrokeWidth(f2);
        a(getWidth(), getHeight());
        invalidate();
    }

    public static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryBrandView f141607a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f141608b;

        static {
            Covode.recordClassIndex(92531);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            float f2;
            StoryBrandView storyBrandView = this.f141607a;
            Float f3 = null;
            if (valueAnimator != null) {
                obj = valueAnimator.getAnimatedValue();
            } else {
                obj = null;
            }
            if (obj instanceof Float) {
                f3 = obj;
            }
            Float f4 = f3;
            if (f4 != null) {
                f2 = f4.floatValue();
            } else {
                f2 = this.f141608b;
            }
            storyBrandView.f141593c = f2;
            this.f141607a.invalidate();
        }

        d(StoryBrandView storyBrandView, float f2) {
            this.f141607a = storyBrandView;
            this.f141608b = f2;
        }
    }

    public final void setProgress(float f2) {
        this.f141601k = f2;
        if (this.f141602l == a.PRORGRESS) {
            float f3 = this.f141601k;
            if (f3 < this.f141593c) {
                ValueAnimator valueAnimator = this.f141592b;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.f141592b;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator3 = this.f141592b;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllListeners();
                }
                float f4 = this.f141601k;
                if (f4 == 0.0f) {
                    this.f141593c = f4;
                    invalidate();
                    return;
                }
                return;
            }
            h.f.a.b<? super Float, z> bVar = this.f141591a;
            if (bVar != null) {
                bVar.invoke(Float.valueOf(f3));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryBrandView f141605a;

        static {
            Covode.recordClassIndex(92529);
        }

        b(StoryBrandView storyBrandView) {
            this.f141605a = storyBrandView;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ValueAnimator valueAnimator;
            Float f2 = (Float) obj;
            StoryBrandView storyBrandView = this.f141605a;
            l.b(f2, "");
            float floatValue = f2.floatValue();
            if (floatValue != storyBrandView.f141593c) {
                ValueAnimator valueAnimator2 = storyBrandView.f141592b;
                if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = storyBrandView.f141592b) == null)) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator3 = storyBrandView.f141592b;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllListeners();
                }
                ValueAnimator valueAnimator4 = storyBrandView.f141592b;
                if (valueAnimator4 != null) {
                    valueAnimator4.removeAllUpdateListeners();
                }
                storyBrandView.f141592b = ValueAnimator.ofFloat(storyBrandView.f141593c, floatValue);
                ValueAnimator valueAnimator5 = storyBrandView.f141592b;
                if (valueAnimator5 != null) {
                    valueAnimator5.addUpdateListener(new d(storyBrandView, floatValue));
                }
                ValueAnimator valueAnimator6 = storyBrandView.f141592b;
                if (valueAnimator6 != null) {
                    valueAnimator6.setDuration((long) (Math.abs(floatValue - storyBrandView.f141593c) * 2000.0f));
                }
                ValueAnimator valueAnimator7 = storyBrandView.f141592b;
                if (valueAnimator7 != null) {
                    valueAnimator7.setInterpolator(new LinearInterpolator());
                }
                ValueAnimator valueAnimator8 = storyBrandView.f141592b;
                if (valueAnimator8 != null) {
                    valueAnimator8.start();
                }
            }
        }
    }

    public final void setMode(a aVar) {
        l.d(aVar, "");
        if (this.f141602l != aVar) {
            this.f141602l = aVar;
            f.a.b.b bVar = this.f141598h;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f141598h = null;
            this.f141591a = null;
            if (this.f141602l == a.PRORGRESS) {
                setProgress(0.0f);
                t d2 = t.a(new a(this)).d(300, TimeUnit.MILLISECONDS);
                l.b(d2, "");
                this.f141598h = d2.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), c.f141606a);
            }
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        int height;
        if (canvas != null) {
            switch (c.f141611a[this.f141602l.ordinal()]) {
                case 1:
                    this.f141599i.setStyle(Paint.Style.STROKE);
                    this.f141599i.setShader(null);
                    this.f141599i.setColor(getGray());
                    canvas.drawArc(this.f141603m, 0.0f, 360.0f, false, this.f141599i);
                    this.f141599i.setShader(this.p);
                    this.f141599i.setColor(-16777216);
                    canvas.drawArc(this.f141603m, -90.0f, this.f141593c * 360.0f, false, this.f141599i);
                    break;
                case 2:
                    this.f141599i.setShader(this.p);
                    this.f141599i.setStyle(Paint.Style.STROKE);
                    this.f141599i.setColor(-16777216);
                    canvas.drawArc(this.f141603m, -90.0f, 360.0f, false, this.f141599i);
                    break;
                case 3:
                    this.f141599i.setShader(this.p);
                    this.f141599i.setStyle(Paint.Style.FILL);
                    this.f141599i.setColor(-16777216);
                    if (getWidth() < getHeight()) {
                        height = getWidth();
                    } else {
                        height = getHeight();
                    }
                    canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((float) height) / 2.0f, this.f141599i);
                    break;
                case 4:
                    this.f141599i.setStyle(Paint.Style.STROKE);
                    this.f141599i.setShader(null);
                    this.f141599i.setColor(getGray());
                    canvas.drawArc(this.f141603m, -90.0f, 360.0f, false, this.f141599i);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    this.f141599i.setStyle(Paint.Style.STROKE);
                    this.f141599i.setShader(null);
                    this.f141599i.setColor(this.t);
                    canvas.drawArc(this.f141603m, -90.0f, 360.0f, false, this.f141599i);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    this.f141599i.setShader(this.p);
                    this.f141599i.setStyle(Paint.Style.FILL);
                    this.f141599i.setColor(-16777216);
                    RectF rectF = this.n;
                    float f2 = this.o;
                    canvas.drawRoundRect(rectF, f2, f2, this.f141599i);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    this.f141599i.setShader(this.q);
                    this.f141599i.setStyle(Paint.Style.FILL);
                    this.f141599i.setColor(-16777216);
                    RectF rectF2 = this.n;
                    float f3 = this.o;
                    canvas.drawRoundRect(rectF2, f3, f3, this.f141599i);
                    this.f141599i.setShader(null);
                    this.f141599i.setColor(Color.parseColor("#33000000"));
                    RectF rectF3 = this.n;
                    float f4 = this.o;
                    canvas.drawRoundRect(rectF3, f4, f4, this.f141599i);
                    break;
            }
            super.dispatchDraw(canvas);
        }
    }

    private final void a(int i2, int i3) {
        if (i2 > 0 && i3 > 0) {
            RectF rectF = this.f141603m;
            rectF.left = this.f141594d / 2.0f;
            rectF.top = (this.f141594d / 2.0f) + 0.0f;
            float f2 = (float) i2;
            rectF.right = f2 - (this.f141594d / 2.0f);
            float f3 = (float) i3;
            rectF.bottom = f3 - (this.f141594d / 2.0f);
            RectF rectF2 = this.n;
            rectF2.left = 0.0f;
            rectF2.top = 0.0f;
            rectF2.right = f2;
            rectF2.bottom = f3;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ StoryBrandView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StoryBrandView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        int i2;
        a aVar;
        b bVar;
        l.d(context, "");
        int i3 = 0;
        MethodCollector.i(11969);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.f141594d = TypedValue.applyDimension(1, 1.5f, system.getDisplayMetrics());
        this.f141595e = Color.parseColor("#10B7FF");
        this.f141596f = Color.parseColor("#20D5EC");
        this.f141597g = Color.parseColor("#17E9B6");
        Paint paint = new Paint();
        paint.setStrokeWidth(this.f141594d);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f141599i = paint;
        this.f141600j = b.LIGHT;
        this.f141602l = a.BRAND_RING;
        this.f141603m = new RectF();
        this.n = new RectF();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.lf, R.attr.a8p, R.attr.a__, R.attr.ail}, 0, 0);
            l.b(obtainStyledAttributes, "");
            setRadius((float) obtainStyledAttributes.getDimensionPixelSize(1, 0));
            switch (obtainStyledAttributes.getInt(0, 1)) {
                case 0:
                    aVar = a.PRORGRESS;
                    break;
                case 1:
                    aVar = a.BRAND_RING;
                    break;
                case 2:
                    aVar = a.GRAY_RING;
                    break;
                case 3:
                    aVar = a.RED_RING;
                    break;
                case 4:
                    aVar = a.BRAND_FILL_CIRCLE;
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    aVar = a.BRAND_BACKGROUND;
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    aVar = a.GUIDE_BACKGROUND;
                    break;
                default:
                    aVar = a.BRAND_RING;
                    break;
            }
            setMode(aVar);
            int i4 = obtainStyledAttributes.getInt(3, 0);
            if (i4 == 0) {
                bVar = b.LIGHT;
            } else if (i4 == 1) {
                bVar = b.DARK;
            } else if (i4 != 2) {
                bVar = b.LIGHT;
            } else {
                bVar = b.CONST;
            }
            this.f141600j = bVar;
            float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(2, 0);
            if (dimensionPixelSize <= 0.0f) {
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                dimensionPixelSize = TypedValue.applyDimension(1, 1.5f, system2.getDisplayMetrics());
            }
            setRingWidth(dimensionPixelSize);
            obtainStyledAttributes.recycle();
        }
        Integer a2 = com.bytedance.tux.h.d.a(context, R.attr.an);
        if (a2 != null) {
            i2 = a2.intValue();
        } else {
            i2 = 0;
        }
        this.r = i2;
        Integer a3 = com.bytedance.tux.h.d.a(context, R.attr.a9);
        this.s = a3 != null ? a3.intValue() : i3;
        this.t = Color.parseColor("#FF4C3A");
        MethodCollector.o(11969);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        a(i2, i3);
        if (i2 > 0 && i3 > 0) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int[] iArr = new int[3];
            int i6 = 0;
            int i7 = 0;
            loop0:
            while (true) {
                int i8 = this.f141595e;
                while (true) {
                    iArr[i7] = i8;
                    i7++;
                    if (i7 >= 3) {
                        break loop0;
                    } else if (i7 != 0) {
                        if (i7 != 1) {
                            i8 = this.f141597g;
                        } else {
                            i8 = this.f141596f;
                        }
                    }
                }
            }
            float[] fArr = new float[3];
            int i9 = 0;
            loop2:
            while (true) {
                float f2 = 0.0f;
                while (true) {
                    fArr[i9] = f2;
                    i9++;
                    f2 = 1.0f;
                    if (i9 >= 3) {
                        break loop2;
                    } else if (i9 != 0) {
                        if (i9 == 1) {
                            f2 = 0.5f;
                        }
                    }
                }
            }
            this.p = new LinearGradient(0.0f, 0.0f, width, height, iArr, fArr, Shader.TileMode.CLAMP);
            float width2 = (float) getWidth();
            float height2 = (float) getHeight();
            int[] iArr2 = new int[3];
            int i10 = 0;
            loop4:
            while (true) {
                int i11 = this.f141595e;
                while (true) {
                    iArr2[i10] = i11;
                    i10++;
                    if (i10 >= 3) {
                        break loop4;
                    } else if (i10 != 0) {
                        if (i10 != 1) {
                            i11 = this.f141597g;
                        } else {
                            i11 = this.f141596f;
                        }
                    }
                }
            }
            float[] fArr2 = new float[3];
            while (true) {
                float f3 = 0.0f;
                while (true) {
                    fArr2[i6] = f3;
                    i6++;
                    if (i6 >= 3) {
                        this.q = new LinearGradient(0.0f, 0.0f, width2, height2, iArr2, fArr2, Shader.TileMode.CLAMP);
                        return;
                    } else if (i6 != 0) {
                        if (i6 != 1) {
                            f3 = 1.0f;
                        } else {
                            f3 = 0.53f;
                        }
                    }
                }
            }
        }
    }
}
