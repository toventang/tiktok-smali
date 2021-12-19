package com.bytedance.ies.bullet.service.popup.round;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.popup.b.b;

public class RoundFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private b f33011a;

    static {
        Covode.recordClassIndex(19701);
    }

    public void setRadius(int i2) {
        this.f33011a.a((float) i2);
    }

    public void draw(Canvas canvas) {
        this.f33011a.a(canvas);
        super.draw(canvas);
        this.f33011a.b(canvas);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private RoundFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, -1);
        MethodCollector.i(9309);
        b bVar = new b();
        this.f33011a = bVar;
        bVar.a(this);
        MethodCollector.o(9309);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f33011a.a(i2, i3);
    }
}
