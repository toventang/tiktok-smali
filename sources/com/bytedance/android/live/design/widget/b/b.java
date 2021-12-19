package com.bytedance.android.live.design.widget.b;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class b extends c<View> {

    /* renamed from: a  reason: collision with root package name */
    private float f9588a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    private float f9589b = 1.0f;

    static {
        Covode.recordClassIndex(4860);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.design.widget.b.c
    public final int[] a() {
        return new int[]{R.attr.rf, R.attr.a7p};
    }

    public final void a(int i2) {
        f(i2);
    }

    public b(View view) {
        super(view);
    }

    @Override // com.bytedance.android.live.design.widget.b.c
    public final void a(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index == 1) {
                TypedValue typedValue = new TypedValue();
                typedArray.getValue(1, typedValue);
                this.f9588a = typedValue.getFloat();
            } else if (index == 0) {
                TypedValue typedValue2 = new TypedValue();
                typedArray.getValue(0, typedValue2);
                this.f9589b = typedValue2.getFloat();
            }
        }
    }

    public final boolean a(Canvas canvas) {
        float f2;
        if (!this.f9590h.isEnabled()) {
            f2 = this.f9589b;
        } else if (!this.f9590h.isPressed()) {
            return false;
        } else {
            f2 = this.f9588a;
        }
        int i2 = (int) (f2 * 255.0f);
        if (i2 >= 255) {
            return false;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, (float) this.f9590h.getWidth(), (float) this.f9590h.getHeight(), i2, 31);
        return true;
    }

    public static void a(Canvas canvas, boolean z) {
        if (z) {
            canvas.restore();
        }
    }
}
