package com.ss.android.ugc.aweme.v.a;

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

public final class e extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public int f143214a;

    /* renamed from: b  reason: collision with root package name */
    public d f143215b;

    /* renamed from: c  reason: collision with root package name */
    private final h f143216c;

    /* renamed from: d  reason: collision with root package name */
    private final h f143217d = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(93738);
    }

    private Paint a() {
        return (Paint) this.f143216c.getValue();
    }

    static final class a extends m implements h.f.a.a<Paint> {
        final /* synthetic */ int $color;

        static {
            Covode.recordClassIndex(93739);
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

    public final int getOpacity() {
        return a().getAlpha();
    }

    static final class b extends m implements h.f.a.a<Paint> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(93740);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint(1);
            d dVar = this.this$0.f143215b;
            if (dVar != null) {
                paint.setColor(dVar.f143213e);
                paint.setMaskFilter(new BlurMaskFilter(dVar.f143209a, dVar.f143210b));
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
            float f2 = (float) width;
            float f3 = (float) height;
            float min = Math.min(f2, f3) / 2.0f;
            RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
            d dVar = this.f143215b;
            if (dVar != null) {
                float abs = Math.abs(dVar.f143212d) + dVar.f143209a;
                rectF.top += abs;
                rectF.bottom -= abs;
                rectF.left += abs;
                rectF.right -= abs;
                canvas.save();
                canvas.translate(dVar.f143211c, dVar.f143212d);
                canvas.drawRoundRect(rectF, min, min, (Paint) this.f143217d.getValue());
                canvas.restore();
            }
            canvas.drawRoundRect(rectF, min, min, a());
        }
    }

    public e(int i2, d dVar) {
        this.f143214a = i2;
        this.f143215b = dVar;
        this.f143216c = i.a((h.f.a.a) new a(i2));
    }
}
