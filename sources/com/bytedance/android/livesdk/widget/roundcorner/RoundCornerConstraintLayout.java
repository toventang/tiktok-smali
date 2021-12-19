package com.bytedance.android.livesdk.widget.roundcorner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class RoundCornerConstraintLayout extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    private int f22635g;

    /* renamed from: h  reason: collision with root package name */
    private int f22636h;

    /* renamed from: i  reason: collision with root package name */
    private int f22637i;

    /* renamed from: j  reason: collision with root package name */
    private int f22638j;

    /* renamed from: k  reason: collision with root package name */
    private final RectF f22639k;

    /* renamed from: l  reason: collision with root package name */
    private final float[] f22640l;

    /* renamed from: m  reason: collision with root package name */
    private final Path f22641m;
    private final Paint n;

    static {
        Covode.recordClassIndex(13365);
    }

    public RoundCornerConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final void b() {
        float[] fArr = this.f22640l;
        fArr[0] = (float) this.f22635g;
        fArr[1] = fArr[0];
        fArr[2] = (float) this.f22637i;
        fArr[3] = fArr[2];
        fArr[4] = (float) this.f22638j;
        fArr[5] = fArr[4];
        fArr[6] = (float) this.f22636h;
        fArr[7] = fArr[6];
    }

    public final void draw(Canvas canvas) {
        if (canvas != null) {
            super.draw(canvas);
            if (this.f22635g != 0 || this.f22637i != 0 || this.f22636h != 0 || this.f22638j != 0) {
                this.f22641m.reset();
                this.f22641m.setFillType(Path.FillType.INVERSE_WINDING);
                this.f22641m.addRoundRect(this.f22639k, this.f22640l, Path.Direction.CW);
                canvas.drawPath(this.f22641m, this.n);
            }
        }
    }

    private /* synthetic */ RoundCornerConstraintLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RoundCornerConstraintLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f22639k = new RectF();
        this.f22640l = new float[8];
        this.f22641m = new Path();
        Paint paint = new Paint(1);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.n = paint;
    }

    public final void a(int i2, int i3, int i4, int i5) {
        this.f22635g = i2;
        this.f22636h = i3;
        this.f22637i = i4;
        this.f22638j = i5;
        b();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f22639k.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
    }
}
