package com.bytedance.android.live.design.widget.b;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.a;
import com.zhiliaoapp.musically.R;

public final class d extends c<TextView> {
    static {
        Covode.recordClassIndex(4862);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.design.widget.b.c
    public final int[] a() {
        return new int[]{16842901, R.attr.uq};
    }

    public d(TextView textView) {
        super(textView);
    }

    public final void a(int i2) {
        f(i2);
    }

    @Override // com.bytedance.android.live.design.widget.b.c
    public final void a(TypedArray typedArray) {
        int dimensionPixelSize;
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index == 1) {
                Typeface a2 = a.a().a(typedArray.getInt(1, 1));
                if (a2 != null) {
                    ((TextView) this.f9590h).setTypeface(a2);
                }
            } else if (index == 0 && (dimensionPixelSize = typedArray.getDimensionPixelSize(0, 0)) > 0) {
                ((TextView) this.f9590h).setTextSize(0, (float) dimensionPixelSize);
            }
        }
    }
}
