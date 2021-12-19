package com.lynx.tasm.ui.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.c.a.e;
import com.facebook.c.a.j;
import com.facebook.drawee.e.q;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.j.c;
import com.facebook.imagepipeline.j.d;
import com.facebook.imagepipeline.j.g;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.lynx.tasm.behavior.ui.utils.b;
import java.util.List;

public class FrescoFilterImageView extends FrescoImageView {
    private int mBlurRadius;
    private com.facebook.common.h.a<c> mShadowBitmapRef;
    private j mShadowCacheKey;
    private int mShadowColor;
    private int mShadowOffsetX;
    private int mShadowOffsetY;
    private int mShadowRadius;

    static {
        Covode.recordClassIndex(35400);
    }

    public void FrescoFilterImageView__onDetachedFromWindow$___twin___() {
        super.onDetachedFromWindow();
    }

    public void markShadowDirty() {
        this.mIsDirty = true;
    }

    @Override // com.facebook.drawee.view.c, com.lynx.tasm.ui.image.FrescoImageView
    public void onDetachedFromWindow() {
        com_lynx_tasm_ui_image_FrescoFilterImageView_com_ss_android_ugc_aweme_lancet_ImageStopLossLanect_imageViewOnDetachedFromWindow(this);
    }

    public boolean isShadowDirty() {
        return this.mIsDirty;
    }

    @Override // com.lynx.tasm.ui.image.FrescoImageView
    public void maybeUpdateView() {
        if (isShadowDirty() && getSrc() != null) {
            this.mShadowCacheKey = new j(generateShadowCacheKey());
        }
        super.maybeUpdateView();
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.ui.image.FrescoImageView
    public void onImageRequestLoaded() {
        if (this.mShadowCacheKey != null) {
            this.mShadowBitmapRef = com.facebook.common.h.a.b(k.a().c().a(this.mShadowCacheKey));
            invalidate();
        }
    }

    static class a extends com.facebook.imagepipeline.o.a {

        /* renamed from: a  reason: collision with root package name */
        private int f56855a;

        /* renamed from: b  reason: collision with root package name */
        private int f56856b;

        /* renamed from: c  reason: collision with root package name */
        private int f56857c;

        /* renamed from: d  reason: collision with root package name */
        private int f56858d;

        /* renamed from: e  reason: collision with root package name */
        private int f56859e;

        /* renamed from: f  reason: collision with root package name */
        private int f56860f;

        /* renamed from: g  reason: collision with root package name */
        private int f56861g;

        /* renamed from: h  reason: collision with root package name */
        private int f56862h;

        /* renamed from: i  reason: collision with root package name */
        private int f56863i;

        /* renamed from: j  reason: collision with root package name */
        private int f56864j;

        /* renamed from: k  reason: collision with root package name */
        private int f56865k;

        /* renamed from: l  reason: collision with root package name */
        private e f56866l;

        /* renamed from: m  reason: collision with root package name */
        private q.b f56867m;

        static {
            Covode.recordClassIndex(35401);
        }

        @Override // com.facebook.imagepipeline.o.a, com.facebook.imagepipeline.o.d
        public final String getName() {
            return "ShadowPostProcessor";
        }

        @Override // com.facebook.imagepipeline.o.a, com.facebook.imagepipeline.o.d
        public final e getPostprocessorCacheKey() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f56855a);
            sb.append(this.f56856b);
            sb.append(this.f56859e);
            sb.append(this.f56860f);
            sb.append(this.f56857c);
            sb.append(this.f56858d);
            sb.append(this.f56867m);
            sb.append(this.f56861g);
            sb.append(this.f56862h);
            sb.append(this.f56863i);
            sb.append(this.f56864j);
            sb.append(this.f56865k);
            return new j(sb.toString());
        }

        @Override // com.facebook.imagepipeline.o.a
        public final void process(Bitmap bitmap, Bitmap bitmap2) {
            int i2;
            Throwable th;
            RectF rectF;
            MethodCollector.i(614);
            super.process(bitmap, bitmap2);
            int i3 = this.f56855a;
            if (i3 == 0 || (i2 = this.f56856b) == 0 || (this.f56864j == 0 && this.f56863i == 0 && this.f56865k == 0)) {
                MethodCollector.o(614);
                return;
            }
            try {
                Bitmap createBitmap = Bitmap.createBitmap(i3, i2, bitmap2.getConfig());
                Matrix matrix = new Matrix();
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate((float) this.f56857c, (float) this.f56860f);
                canvas.clipRect(0, 0, i3 - this.f56858d, i2 - this.f56859e);
                canvas.drawARGB(0, 0, 0, 0);
                Paint paint = new Paint(1);
                float f2 = (float) ((i3 - this.f56857c) - this.f56858d);
                float f3 = (float) ((i2 - this.f56860f) - this.f56859e);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                float width = (float) bitmap2.getWidth();
                float height = (float) bitmap2.getHeight();
                if (this.f56867m == q.b.f47436b) {
                    matrix.setScale(f2 / width, f3 / height);
                    matrix.postTranslate(0.0f, 0.0f);
                    rectF = new RectF(0.0f, 0.0f, f2 + 0.0f, f3 + 0.0f);
                } else if (this.f56867m == q.b.f47438d) {
                    float f4 = f2 / width;
                    float f5 = f3 / height;
                    if (f4 > f5) {
                        float f6 = width * f5;
                        float f7 = ((f2 - f6) / 2.0f) + 0.0f;
                        rectF = new RectF(f7, 0.0f, f6 + f7, f3 + 0.0f);
                        matrix.setScale(f5, f5);
                        matrix.postTranslate(f7, 0.0f);
                    } else {
                        float f8 = height * f4;
                        float f9 = ((f3 - f8) / 2.0f) + 0.0f;
                        rectF = new RectF(0.0f, f9, f2 + 0.0f, f8 + f9);
                        matrix.setScale(f4, f4);
                        matrix.postTranslate(0.0f, f9);
                    }
                } else if (this.f56867m == q.b.f47442h) {
                    float f10 = f2 / width;
                    float f11 = f3 / height;
                    if (f10 > f11) {
                        rectF = new RectF(0.0f, 0.0f, f2 + 0.0f, f3 + 0.0f);
                        matrix.setScale(f10, f10);
                        matrix.postTranslate(0.0f, ((f3 - (height * f10)) / 2.0f) + 0.0f);
                    } else {
                        rectF = new RectF(0.0f, 0.0f, f2 + 0.0f, f3 + 0.0f);
                        matrix.setScale(f11, f11);
                        matrix.postTranslate(((f2 - (width * f11)) / 2.0f) + 0.0f, 0.0f);
                    }
                } else {
                    rectF = new RectF(0.0f, 0.0f, f2, f3);
                    matrix.setTranslate((float) Math.round((f2 - width) * 0.5f), (float) Math.round((f3 - height) * 0.5f));
                }
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                paint.setFilterBitmap(true);
                canvas.drawRect(rectF, paint);
                com.facebook.common.h.a<Bitmap> a2 = k.a().f().a(this.f56855a, this.f56856b, bitmap2.getConfig());
                try {
                    Canvas canvas2 = new Canvas(a2.a());
                    if (this.f56863i != 0) {
                        Paint paint2 = new Paint();
                        paint2.setFlags(3);
                        paint2.setColorFilter(new PorterDuffColorFilter(this.f56863i, PorterDuff.Mode.SRC_IN));
                        canvas2.drawBitmap(createBitmap, (float) this.f56861g, (float) this.f56862h, paint2);
                    }
                    if (this.f56864j != 0) {
                        NativeBlurFilter.iterativeBoxBlur(a2.a(), 3, this.f56864j);
                    }
                    canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                    if (this.f56865k != 0) {
                        NativeBlurFilter.iterativeBoxBlur(a2.a(), 3, this.f56865k);
                    }
                    com.facebook.common.h.a<c> a3 = com.facebook.common.h.a.a(new d(a2, g.f48000a));
                    k.a().c().a(this.f56866l, a3);
                    com.facebook.common.h.a.c(a2);
                    if (a3 != null) {
                        com.facebook.common.h.a.c(a3);
                        MethodCollector.o(614);
                        return;
                    }
                    MethodCollector.o(614);
                } catch (Throwable th2) {
                    th = th2;
                    if (a2 != null) {
                        com.facebook.common.h.a.c(a2);
                    }
                    if (0 != 0) {
                        com.facebook.common.h.a.c(null);
                    }
                    MethodCollector.o(614);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.o(614);
                throw th;
            }
        }

        a(int i2, int i3, int i4, int i5, int i6, int i7, q.b bVar, int i8, int i9, int i10, int i11, int i12, e eVar) {
            this.f56855a = i2;
            this.f56856b = i3;
            this.f56857c = i4;
            this.f56860f = i5;
            this.f56858d = i6;
            this.f56859e = i7;
            this.f56867m = bVar;
            this.f56861g = i8;
            this.f56862h = i9;
            this.f56863i = i10;
            this.f56864j = i11;
            this.f56865k = i12;
            this.f56866l = eVar;
        }
    }

    /* access modifiers changed from: package-private */
    public String generateShadowCacheKey() {
        return getSrc() + getWidth() + getHeight() + getPaddingBottom() + getPaddingTop() + getPaddingLeft() + getPaddingRight() + getFrescoScaleType() + this.mShadowOffsetX + this.mShadowOffsetY + this.mShadowColor + this.mShadowRadius;
    }

    @Override // com.lynx.tasm.ui.image.FrescoImageView
    public void setBorderRadius(b bVar) {
        super.setBorderRadius(bVar);
    }

    public static void com_lynx_tasm_ui_image_FrescoFilterImageView_com_ss_android_ugc_aweme_lancet_ImageStopLossLanect_imageViewOnDetachedFromWindow(FrescoFilterImageView frescoFilterImageView) {
        frescoFilterImageView.FrescoFilterImageView__onDetachedFromWindow$___twin___();
        com.ss.android.ugc.aweme.lancet.k.a(frescoFilterImageView);
    }

    @Override // com.lynx.tasm.ui.image.FrescoImageView
    public void setBlurRadius(int i2) {
        if (this.mBlurRadius != i2) {
            this.mBlurRadius = i2;
            markShadowDirty();
        }
    }

    public void setShadowColor(int i2) {
        if (this.mShadowColor != i2) {
            this.mShadowColor = i2;
            markShadowDirty();
        }
    }

    public void setShadowOffsetX(int i2) {
        if (this.mShadowOffsetX != i2) {
            this.mShadowOffsetX = i2;
            markShadowDirty();
        }
    }

    public void setShadowOffsetY(int i2) {
        if (this.mShadowOffsetY != i2) {
            this.mShadowOffsetY = i2;
            markShadowDirty();
        }
    }

    public void setShadowRadius(int i2) {
        if (this.mShadowRadius != i2) {
            this.mShadowRadius = i2;
            markShadowDirty();
        }
    }

    @Override // com.facebook.drawee.view.c, com.lynx.tasm.ui.image.FrescoImageView
    public void onDraw(Canvas canvas) {
        com.facebook.common.h.a<c> aVar = this.mShadowBitmapRef;
        if (aVar != null && aVar.d() && this.mShadowBitmapRef.a() != null && getWidth() != 0 && getHeight() != 0) {
            canvas.drawBitmap(((d) this.mShadowBitmapRef.a()).f47984a, 0.0f, 0.0f, (Paint) null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.ui.image.FrescoImageView
    public void onPostprocessorPreparing(List<com.facebook.imagepipeline.o.d> list) {
        if (getWidth() != 0 && getHeight() != 0) {
            if (this.mShadowRadius != 0 || this.mShadowColor != 0 || this.mBlurRadius != 0) {
                com.facebook.common.h.a<c> aVar = this.mShadowBitmapRef;
                if (aVar != null) {
                    com.facebook.common.h.a.c(aVar);
                    this.mShadowBitmapRef = null;
                }
                list.add(new a(getWidth(), getHeight(), getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), getFrescoScaleType(), this.mShadowOffsetX, this.mShadowOffsetY, this.mShadowColor, this.mShadowRadius, this.mBlurRadius, this.mShadowCacheKey));
            }
        }
    }

    public FrescoFilterImageView(Context context, com.facebook.drawee.c.b bVar, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        super(context, bVar, globalImageLoadListener, obj);
    }
}
