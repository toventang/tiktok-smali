package com.ss.android.ugc.aweme.shortvideo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.lancet.k;
import h.f.b.l;

public final class OmnipotentRoundCornerImgView extends SimpleDraweeView {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f132614a;

    /* renamed from: b  reason: collision with root package name */
    private float f132615b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f132616c;

    /* renamed from: d  reason: collision with root package name */
    private int f132617d;

    static {
        Covode.recordClassIndex(86774);
    }

    public OmnipotentRoundCornerImgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.facebook.drawee.view.c
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    @Override // com.facebook.drawee.view.c
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f132616c && canvas != null) {
            float f2 = this.f132615b;
            int intValue = Integer.valueOf(canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31)).intValue();
            this.f132614a.setAntiAlias(true);
            this.f132614a.setColor(this.f132617d);
            RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
            RectF rectF2 = new RectF(0.0f, ((float) getHeight()) - f2, f2, (float) getHeight());
            RectF rectF3 = new RectF(((float) getWidth()) - f2, 0.0f, (float) getWidth(), f2);
            RectF rectF4 = new RectF(((float) getWidth()) - f2, ((float) getHeight()) - f2, (float) getWidth(), (float) getHeight());
            canvas.drawRect(rectF, this.f132614a);
            canvas.drawRect(rectF2, this.f132614a);
            canvas.drawRect(rectF3, this.f132614a);
            canvas.drawRect(rectF4, this.f132614a);
            this.f132614a.setColor(0);
            this.f132614a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawCircle(f2, f2, f2, this.f132614a);
            canvas.drawCircle(f2, ((float) getHeight()) - f2, f2, this.f132614a);
            canvas.drawCircle(((float) getWidth()) - f2, f2, f2, this.f132614a);
            canvas.drawCircle(((float) getWidth()) - f2, ((float) getHeight()) - f2, f2, this.f132614a);
            this.f132614a.setXfermode(null);
            canvas.restoreToCount(intValue);
        }
    }

    private /* synthetic */ OmnipotentRoundCornerImgView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private OmnipotentRoundCornerImgView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f132614a = new Paint();
        this.f132617d = -1;
    }
}
