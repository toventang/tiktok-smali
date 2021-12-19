package com.ss.android.ugc.tools.view.widget;

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
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.j.f;

public class CircleImageView extends SimpleDraweeView {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f150243a = true;

    /* renamed from: b  reason: collision with root package name */
    private Paint f150244b = new Paint();

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f150245c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f150246d;

    /* renamed from: e  reason: collision with root package name */
    private BitmapShader f150247e;

    /* renamed from: f  reason: collision with root package name */
    private Canvas f150248f;

    /* renamed from: g  reason: collision with root package name */
    private int f150249g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f150250h = false;

    /* renamed from: i  reason: collision with root package name */
    private d<f> f150251i = new c<f>() {
        /* class com.ss.android.ugc.tools.view.widget.CircleImageView.AnonymousClass1 */

        static {
            Covode.recordClassIndex(98862);
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
            CircleImageView.this.f150243a = true;
        }
    };

    static {
        Covode.recordClassIndex(98861);
    }

    public d<f> getControllerListener() {
        return this.f150251i;
    }

    public void a() {
        e eVar = new e();
        eVar.f47476b = true;
        ((a) getHierarchy()).a(eVar);
        ((a) getHierarchy()).a(q.b.f47442h);
        b();
    }

    private void b() {
        Bitmap.Config config;
        MethodCollector.i(6479);
        if (!this.f150250h) {
            MethodCollector.o(6479);
            return;
        }
        Drawable drawable = getDrawable();
        this.f150246d = drawable;
        if (drawable == null) {
            MethodCollector.o(6479);
        } else if (getWidth() <= 0 || getHeight() <= 0) {
            MethodCollector.o(6479);
        } else {
            if (this.f150246d.getOpacity() != -1) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            int intrinsicWidth = this.f150246d.getIntrinsicWidth();
            int intrinsicHeight = this.f150246d.getIntrinsicHeight();
            if (intrinsicWidth <= 0) {
                intrinsicWidth = getWidth();
            }
            if (intrinsicHeight <= 0) {
                intrinsicHeight = getHeight();
            }
            Bitmap bitmap = this.f150245c;
            if (bitmap != null) {
                if (intrinsicWidth == bitmap.getWidth() && intrinsicHeight == this.f150245c.getHeight()) {
                    Canvas canvas = this.f150248f;
                    if (canvas != null) {
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    }
                    MethodCollector.o(6479);
                    return;
                } else if (!this.f150245c.isRecycled()) {
                    this.f150245c.recycle();
                }
            }
            this.f150249g = intrinsicWidth / 2;
            this.f150245c = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
            Canvas canvas2 = new Canvas(this.f150245c);
            this.f150248f = canvas2;
            this.f150246d.setBounds(0, 0, canvas2.getWidth(), this.f150248f.getHeight());
            Bitmap bitmap2 = this.f150245c;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f150247e = new BitmapShader(bitmap2, tileMode, tileMode);
            this.f150244b.setAntiAlias(true);
            this.f150244b.setShader(this.f150247e);
            MethodCollector.o(6479);
        }
    }

    @Override // com.facebook.drawee.view.c
    public void setController(com.facebook.drawee.h.a aVar) {
        if (this.f150250h) {
            this.f150243a = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    @Override // com.facebook.drawee.view.c
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f150250h) {
            if (this.f150243a) {
                b();
                this.f150243a = false;
            }
            Drawable drawable = this.f150246d;
            if (!(drawable == null || (canvas2 = this.f150248f) == null)) {
                drawable.draw(canvas2);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f150249g, this.f150244b);
            return;
        }
        super.onDraw(canvas);
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        b();
    }
}
