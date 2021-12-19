package com.bytedance.android.live.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.n;
import com.bytedance.android.live.design.widget.b.a;
import com.bytedance.android.live.design.widget.b.b;
import com.bytedance.android.live.design.widget.b.e;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class LiveRadioButton extends n {

    /* renamed from: a  reason: collision with root package name */
    private e f9574a;

    /* renamed from: b  reason: collision with root package name */
    private b f9575b;

    /* renamed from: c  reason: collision with root package name */
    private a f9576c;

    static {
        Covode.recordClassIndex(4853);
    }

    public void draw(Canvas canvas) {
        boolean a2 = this.f9575b.a(canvas);
        super.draw(canvas);
        b.a(canvas, a2);
    }

    public LiveRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        this.f9574a.a(i2);
    }

    private LiveRadioButton(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, R.attr.a8o);
        b bVar = new b(this);
        this.f9575b = bVar;
        bVar.a(attributeSet, R.attr.a8o, 0);
        e eVar = new e(this);
        this.f9574a = eVar;
        eVar.a(attributeSet, R.attr.a8o, 0);
        a aVar = new a(this);
        this.f9576c = aVar;
        aVar.a(attributeSet, R.attr.a8o, 0);
    }
}
