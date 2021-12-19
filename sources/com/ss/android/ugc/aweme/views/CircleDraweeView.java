package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.c.c;
import com.facebook.drawee.c.d;
import com.facebook.drawee.h.a;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.lancet.k;
import com.ss.android.ugc.tools.utils.r;

public class CircleDraweeView extends a {

    /* renamed from: a  reason: collision with root package name */
    public static int f144431a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static int f144432b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f144433c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f144434d = false;

    /* renamed from: e  reason: collision with root package name */
    private float f144435e = r.a(getContext(), 6.0f);

    /* renamed from: f  reason: collision with root package name */
    private Paint f144436f = new Paint();

    /* renamed from: g  reason: collision with root package name */
    private Bitmap f144437g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f144438h;

    /* renamed from: i  reason: collision with root package name */
    private BitmapShader f144439i;

    /* renamed from: j  reason: collision with root package name */
    private Canvas f144440j;

    /* renamed from: k  reason: collision with root package name */
    private float f144441k = this.f144435e;

    /* renamed from: l  reason: collision with root package name */
    private RectF f144442l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    private int f144443m = f144432b;
    private d<f> n = new c<f>() {
        /* class com.ss.android.ugc.aweme.views.CircleDraweeView.AnonymousClass1 */

        static {
            Covode.recordClassIndex(94562);
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onFailure(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onRelease(String str) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
            CircleDraweeView.this.f144433c = true;
        }
    };

    @Override // com.facebook.drawee.view.c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    static {
        Covode.recordClassIndex(94561);
    }

    private void a() {
        Bitmap.Config config;
        MethodCollector.i(6751);
        if (!this.f144434d) {
            MethodCollector.o(6751);
            return;
        }
        Drawable drawable = getDrawable();
        this.f144438h = drawable;
        if (drawable == null) {
            MethodCollector.o(6751);
        } else if (getWidth() <= 0 || getHeight() <= 0) {
            MethodCollector.o(6751);
        } else {
            if (this.f144438h.getOpacity() != -1) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            int intrinsicWidth = this.f144438h.getIntrinsicWidth();
            int intrinsicHeight = this.f144438h.getIntrinsicHeight();
            if (intrinsicWidth <= 0) {
                intrinsicWidth = getWidth();
            }
            if (intrinsicHeight <= 0) {
                intrinsicHeight = getHeight();
            }
            Bitmap bitmap = this.f144437g;
            if (bitmap != null) {
                if (intrinsicWidth == bitmap.getWidth() && intrinsicHeight == this.f144437g.getHeight()) {
                    Canvas canvas = this.f144440j;
                    if (canvas != null) {
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    }
                    MethodCollector.o(6751);
                    return;
                } else if (!this.f144437g.isRecycled()) {
                    this.f144437g.recycle();
                }
            }
            this.f144437g = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
            Canvas canvas2 = new Canvas(this.f144437g);
            this.f144440j = canvas2;
            this.f144438h.setBounds(0, 0, canvas2.getWidth(), this.f144440j.getHeight());
            Bitmap bitmap2 = this.f144437g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f144439i = new BitmapShader(bitmap2, tileMode, tileMode);
            this.f144436f.setAntiAlias(true);
            this.f144436f.setShader(this.f144439i);
            MethodCollector.o(6751);
        }
    }

    public void setClipStyle(int i2) {
        this.f144443m = i2;
    }

    public void setRectFRadius(float f2) {
        this.f144441k = f2;
    }

    @Override // com.ss.android.ugc.aweme.views.a, com.facebook.drawee.view.c
    public void setController(a aVar) {
        if (this.f144434d) {
            this.f144433c = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    @Override // com.facebook.drawee.view.c
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f144434d) {
            if (this.f144433c) {
                a();
                this.f144433c = false;
            }
            Drawable drawable = this.f144438h;
            if (!(drawable == null || (canvas2 = this.f144440j) == null)) {
                drawable.draw(canvas2);
            }
            if (this.f144443m == f144432b) {
                double width = (double) getWidth();
                Double.isNaN(width);
                canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) (width / 2.0d), this.f144436f);
                return;
            }
            this.f144442l.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            RectF rectF = this.f144442l;
            float f2 = this.f144441k;
            canvas.drawRoundRect(rectF, f2, f2, this.f144436f);
            return;
        }
        super.onDraw(canvas);
    }

    public CircleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        a();
    }
}
