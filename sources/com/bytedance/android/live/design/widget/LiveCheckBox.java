package com.bytedance.android.live.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.bytedance.android.live.design.widget.b.a;
import com.bytedance.android.live.design.widget.b.b;
import com.bytedance.android.live.design.widget.b.e;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class LiveCheckBox extends AppCompatCheckBox {

    /* renamed from: a  reason: collision with root package name */
    private e f9567a;

    /* renamed from: b  reason: collision with root package name */
    private b f9568b;

    /* renamed from: c  reason: collision with root package name */
    private a f9569c;

    static {
        Covode.recordClassIndex(4851);
    }

    public void draw(Canvas canvas) {
        boolean a2 = this.f9568b.a(canvas);
        super.draw(canvas);
        b.a(canvas, a2);
    }

    public LiveCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        this.f9567a.a(i2);
    }

    private LiveCheckBox(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, R.attr.mp);
        b bVar = new b(this);
        this.f9568b = bVar;
        bVar.a(attributeSet, R.attr.mp, 0);
        e eVar = new e(this);
        this.f9567a = eVar;
        eVar.a(attributeSet, R.attr.mp, 0);
        a aVar = new a(this);
        this.f9569c = aVar;
        aVar.a(attributeSet, R.attr.mp, 0);
    }
}
