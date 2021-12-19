package com.ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import h.f.b.l;

public final class HollowTextView extends TuxTextView {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f71721a;

    /* renamed from: b  reason: collision with root package name */
    private final PorterDuffXfermode f71722b;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f71723e;

    static {
        Covode.recordClassIndex(44112);
    }

    public HollowTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        l.d(canvas, "");
        RectF rectF = this.f71723e;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = (float) getWidth();
        rectF.bottom = (float) getHeight();
        canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31);
        RectF rectF2 = this.f71723e;
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        float applyDimension = TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics());
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        canvas.drawRoundRect(rectF2, applyDimension, TypedValue.applyDimension(1, 2.0f, system2.getDisplayMetrics()), this.f71721a);
        TextPaint paint = getPaint();
        l.b(paint, "");
        paint.setXfermode(this.f71722b);
        super.onDraw(canvas);
        canvas.restore();
    }

    private /* synthetic */ HollowTextView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private HollowTextView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        Paint paint = new Paint(1);
        this.f71721a = paint;
        this.f71723e = new RectF();
        paint.setColor(-1);
        this.f71722b = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    }
}
