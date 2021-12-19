package com.bytedance.ies.bullet.service.popup.round;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.popup.b.b;

public class RoundLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private b f33012a;

    static {
        Covode.recordClassIndex(19702);
    }

    public void setRadius(int i2) {
        this.f33012a.a((float) i2);
    }

    public void draw(Canvas canvas) {
        this.f33012a.a(canvas);
        super.draw(canvas);
        this.f33012a.b(canvas);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(6948);
        super.onDraw(canvas);
        MethodCollector.o(6948);
    }

    public RoundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private RoundLinearLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, -1);
        MethodCollector.i(6853);
        b bVar = new b();
        this.f33012a = bVar;
        bVar.a(this);
        MethodCollector.o(6853);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f33012a.a(i2, i3);
    }
}
