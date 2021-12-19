package com.bytedance.android.live.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.android.live.design.widget.b.b;
import com.bytedance.android.live.design.widget.b.e;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class LiveSwitch extends SwitchCompat {

    /* renamed from: a  reason: collision with root package name */
    private b f9577a;

    /* renamed from: b  reason: collision with root package name */
    private e f9578b;

    static {
        Covode.recordClassIndex(4854);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void draw(Canvas canvas) {
        boolean a2 = this.f9577a.a(canvas);
        super.draw(canvas);
        b.a(canvas, a2);
    }

    public LiveSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        this.f9578b.a(i2);
    }

    private LiveSwitch(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, R.attr.ag7);
        b bVar = new b(this);
        this.f9577a = bVar;
        bVar.a(attributeSet, R.attr.ag7, 0);
        e eVar = new e(this);
        this.f9578b = eVar;
        eVar.a(attributeSet, R.attr.ag7, 0);
    }
}
