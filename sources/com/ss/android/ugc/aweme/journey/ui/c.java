package com.ss.android.ugc.aweme.journey.ui;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class c extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public int f105200a;

    /* renamed from: b  reason: collision with root package name */
    public int f105201b = -1;

    /* renamed from: c  reason: collision with root package name */
    public a f105202c;

    /* renamed from: d  reason: collision with root package name */
    private final h f105203d;

    /* renamed from: e  reason: collision with root package name */
    private final h f105204e;

    /* renamed from: f  reason: collision with root package name */
    private final h f105205f;

    static {
        Covode.recordClassIndex(67439);
    }

    private Paint a() {
        return (Paint) this.f105203d.getValue();
    }

    private Paint b() {
        return (Paint) this.f105205f.getValue();
    }

    static final class a extends m implements h.f.a.a<Paint> {
        final /* synthetic */ int $color;

        static {
            Covode.recordClassIndex(67440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2) {
            super(0);
            this.$color = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint(1);
            paint.setColor(this.$color);
            return paint;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.ui.c$c  reason: collision with other inner class name */
    static final class C2688c extends m implements h.f.a.a<Paint> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2688c f105206a = new C2688c();

        static {
            Covode.recordClassIndex(67442);
        }

        C2688c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            return paint;
        }
    }

    public final int getOpacity() {
        return a().getAlpha();
    }

    static final class b extends m implements h.f.a.a<Paint> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(67441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint(1);
            a aVar = this.this$0.f105202c;
            if (aVar != null) {
                paint.setColor(aVar.f105197e);
                paint.setMaskFilter(new BlurMaskFilter(aVar.f105193a, aVar.f105194b));
            }
            return paint;
        }
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        a().setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void a(int i2) {
        if (this.f105201b != i2) {
            this.f105201b = i2;
            b().setColor(i2);
            invalidateSelf();
        }
    }

    public final void setAlpha(int i2) {
        if (a().getAlpha() != i2) {
            a().setAlpha(i2);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        l.d(canvas, "");
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0) {
            a aVar = this.f105202c;
            if (aVar == null) {
                l.b();
            }
            float f2 = aVar.f105198f;
            RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
            a aVar2 = this.f105202c;
            if (aVar2 != null) {
                float f3 = aVar2.f105193a;
                float f4 = aVar2.f105193a;
                rectF.top += aVar2.f105193a;
                rectF.bottom -= f4;
                float f5 = f3 / 2.0f;
                rectF.left += f5;
                rectF.right -= f5;
                canvas.save();
                canvas.translate(aVar2.f105195c, aVar2.f105196d);
                canvas.drawRoundRect(rectF, f2, f2, (Paint) this.f105204e.getValue());
                canvas.restore();
            }
            if (this.f105200a != 0) {
                canvas.drawRoundRect(rectF, f2, f2, a());
            }
            if (this.f105201b != -1) {
                canvas.drawRoundRect(rectF, f2, f2, b());
            }
        }
    }

    public c(int i2, a aVar) {
        this.f105200a = i2;
        this.f105202c = aVar;
        this.f105203d = i.a((h.f.a.a) new a(i2));
        this.f105204e = i.a((h.f.a.a) new b(this));
        this.f105205f = i.a((h.f.a.a) C2688c.f105206a);
    }
}
