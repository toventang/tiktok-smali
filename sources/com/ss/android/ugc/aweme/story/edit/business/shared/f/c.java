package com.ss.android.ugc.aweme.story.edit.business.shared.f;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;
import h.f.b.l;

public final class c extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    final float[] f137436a = {0.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: b  reason: collision with root package name */
    private final RectF f137437b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    private float f137438c;

    /* renamed from: d  reason: collision with root package name */
    private final Path f137439d = new Path();

    static {
        Covode.recordClassIndex(89880);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public final void setRenderRadius(float f2) {
        this.f137438c = f2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        l.d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (canvas != null) {
            this.f137439d.reset();
            RectF rectF = this.f137437b;
            float[] fArr = this.f137436a;
            rectF.set(fArr[0], fArr[1], ((float) getWidth()) - this.f137436a[2], ((float) getHeight()) - this.f137436a[3]);
            Path path = this.f137439d;
            RectF rectF2 = this.f137437b;
            float f2 = this.f137438c;
            path.addRoundRect(rectF2, f2, f2, Path.Direction.CW);
            canvas.clipPath(this.f137439d);
        }
        super.onDraw(canvas);
    }
}
