package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.c.c;
import com.facebook.drawee.c.d;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.a;
import com.facebook.drawee.f.e;
import com.facebook.imagepipeline.j.f;

public class CircleImageView extends AnimatedImageView {

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f68291e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f68292f = false;

    /* renamed from: g  reason: collision with root package name */
    private Paint f68293g = new Paint();

    /* renamed from: h  reason: collision with root package name */
    private Bitmap f68294h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f68295i;

    /* renamed from: j  reason: collision with root package name */
    private BitmapShader f68296j;

    /* renamed from: k  reason: collision with root package name */
    private Canvas f68297k;

    /* renamed from: l  reason: collision with root package name */
    private int f68298l;

    /* renamed from: m  reason: collision with root package name */
    private d<f> f68299m = new c<f>() {
        /* class com.ss.android.ugc.aweme.base.ui.CircleImageView.AnonymousClass1 */

        static {
            Covode.recordClassIndex(42054);
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
            CircleImageView.this.f68291e = true;
        }
    };

    static {
        Covode.recordClassIndex(42053);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.AnimatedImageView
    public d<f> getControllerListener() {
        return this.f68299m;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.RemoteImageView, com.ss.android.ugc.aweme.base.ui.AnimatedImageView
    public void a() {
        super.a();
        e eVar = new e();
        eVar.f47476b = true;
        ((a) getHierarchy()).a(eVar);
        ((a) getHierarchy()).a(q.b.f47442h);
        d();
    }

    private void d() {
        Bitmap.Config config;
        MethodCollector.i(4370);
        if (!this.f68292f) {
            MethodCollector.o(4370);
            return;
        }
        Drawable drawable = getDrawable();
        this.f68295i = drawable;
        if (drawable == null) {
            MethodCollector.o(4370);
        } else if (getWidth() <= 0 || getHeight() <= 0) {
            MethodCollector.o(4370);
        } else {
            if (this.f68295i.getOpacity() != -1) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            int intrinsicWidth = this.f68295i.getIntrinsicWidth();
            int intrinsicHeight = this.f68295i.getIntrinsicHeight();
            if (intrinsicWidth <= 0) {
                intrinsicWidth = getWidth();
            }
            if (intrinsicHeight <= 0) {
                intrinsicHeight = getHeight();
            }
            Bitmap bitmap = this.f68294h;
            if (bitmap != null) {
                if (intrinsicWidth == bitmap.getWidth() && intrinsicHeight == this.f68294h.getHeight()) {
                    Canvas canvas = this.f68297k;
                    if (canvas != null) {
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    }
                    MethodCollector.o(4370);
                    return;
                } else if (!this.f68294h.isRecycled()) {
                    this.f68294h.recycle();
                }
            }
            this.f68298l = intrinsicWidth / 2;
            this.f68294h = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
            Canvas canvas2 = new Canvas(this.f68294h);
            this.f68297k = canvas2;
            this.f68295i.setBounds(0, 0, canvas2.getWidth(), this.f68297k.getHeight());
            Bitmap bitmap2 = this.f68294h;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f68296j = new BitmapShader(bitmap2, tileMode, tileMode);
            this.f68293g.setAntiAlias(true);
            this.f68293g.setShader(this.f68296j);
            MethodCollector.o(4370);
        }
    }

    @Override // com.facebook.drawee.view.c
    public void setController(com.facebook.drawee.h.a aVar) {
        if (this.f68292f) {
            this.f68291e = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    public CircleImageView(Context context) {
        super(context);
    }

    @Override // com.facebook.drawee.view.c
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f68292f) {
            if (this.f68291e) {
                d();
                this.f68291e = false;
            }
            Drawable drawable = this.f68295i;
            if (!(drawable == null || (canvas2 = this.f68297k) == null)) {
                drawable.draw(canvas2);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f68298l, this.f68293g);
            return;
        }
        super.onDraw(canvas);
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        d();
    }
}
