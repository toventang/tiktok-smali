package com.ss.android.ugc.aweme.qrcode.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends View {

    /* renamed from: a  reason: collision with root package name */
    float f119856a;

    /* renamed from: b  reason: collision with root package name */
    float f119857b;

    /* renamed from: c  reason: collision with root package name */
    float f119858c;

    /* renamed from: d  reason: collision with root package name */
    float f119859d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f119860e = new Paint();

    /* renamed from: f  reason: collision with root package name */
    private float f119861f;

    static {
        Covode.recordClassIndex(77872);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        l.d(canvas, "");
        this.f119860e.setColor(b.c(getContext(), R.color.bk));
        this.f119860e.setAntiAlias(true);
        int c2 = i.c(getContext());
        int a2 = i.a(getContext());
        float f2 = this.f119856a;
        float f3 = this.f119861f;
        float f4 = f2 - f3;
        float f5 = this.f119857b + f3;
        float f6 = this.f119858c - f3;
        float f7 = (float) c2;
        canvas.drawRect(0.0f, 0.0f, f7, f4, this.f119860e);
        float f8 = f5 + 1.0f;
        canvas.drawRect(0.0f, f4, f6, f8, this.f119860e);
        canvas.drawRect(f3 + this.f119859d + 1.0f, f4, f7, f8, this.f119860e);
        canvas.drawRect(0.0f, f8, f7, (float) a2, this.f119860e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, float f2, float f3, float f4, float f5) {
        super(context);
        l.d(context, "");
        MethodCollector.i(7394);
        this.f119856a = f3;
        this.f119857b = f5;
        this.f119858c = f2;
        this.f119859d = f4;
        MethodCollector.o(7394);
    }
}
