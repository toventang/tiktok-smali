package com.bytedance.android.live.design.app.b;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.core.widget.h;
import com.bytedance.android.live.design.widget.b.c;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a extends c<g> {
    static {
        Covode.recordClassIndex(4784);
    }

    @Override // com.bytedance.android.live.design.widget.b.c
    public final int[] a() {
        return new int[]{16842804, 16842904, 16842964, 16842966, 16842968, R.attr.is, R.attr.it, R.attr.iv};
    }

    public a(g gVar) {
        super(gVar);
    }

    public final void a(int i2) {
        f(i2);
    }

    @Override // com.bytedance.android.live.design.widget.b.c
    public final void a(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArray.getIndex(i5);
            if (index == 0) {
                int resourceId = typedArray.getResourceId(index, 0);
                if (resourceId != 0) {
                    h.a((TextView) this.f9590h, resourceId);
                }
            } else if (index == 1) {
                ColorStateList a2 = com.bytedance.android.live.design.c.a(((g) this.f9590h).getContext(), typedArray, index);
                if (a2 != null) {
                    ((g) this.f9590h).setTextColor(a2);
                }
            } else if (index == 3) {
                ((g) this.f9590h).setPadding(typedArray.getDimensionPixelSize(index, 0), 0, ((g) this.f9590h).getPaddingRight(), 0);
            } else if (index == 4) {
                ((g) this.f9590h).setPadding(((g) this.f9590h).getPaddingLeft(), 0, typedArray.getDimensionPixelSize(index, 0), 0);
            } else if (index == 2) {
                v.a(this.f9590h, typedArray.getDrawable(index));
            } else if (index == 6) {
                i2 = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 5) {
                i3 = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 7) {
                i4 = typedArray.getDimensionPixelSize(index, 0);
            }
        }
        if (i2 > 0 && i3 > 0 && i4 > 0) {
            h.a((TextView) this.f9590h, i2, i3, i4, 0);
        }
    }
}
