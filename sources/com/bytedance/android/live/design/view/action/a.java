package com.bytedance.android.live.design.view.action;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.h.v;
import androidx.core.widget.e;
import androidx.core.widget.h;
import com.bytedance.android.live.design.widget.b.c;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final class a extends c<LiveActionButton> {
    static {
        Covode.recordClassIndex(4805);
    }

    @Override // com.bytedance.android.live.design.widget.b.c
    public final int[] a() {
        return new int[]{16842804, 16842948, 16842964, 16842965, 16843087, R.attr.vw, R.attr.a2g, R.attr.a2z};
    }

    public a(LiveActionButton liveActionButton) {
        super(liveActionButton);
    }

    public final void a(int i2) {
        f(i2);
    }

    @Override // com.bytedance.android.live.design.widget.b.c
    public final void a(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index == 0) {
                int resourceId = typedArray.getResourceId(index, 0);
                if (resourceId != 0) {
                    h.a(((LiveActionButton) this.f9590h).f9425b, resourceId);
                }
            } else if (index == 6) {
                h.e(((LiveActionButton) this.f9590h).f9425b, typedArray.getDimensionPixelSize(index, 0));
            } else if (index == 7) {
                ColorStateList a2 = com.bytedance.android.live.design.c.a(((LiveActionButton) this.f9590h).getContext(), typedArray, index);
                if (a2 != null) {
                    e.a(((LiveActionButton) this.f9590h).f9424a, a2);
                    ((LiveActionButton) this.f9590h).f9425b.setTextColor(a2);
                }
            } else if (index == 3) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(index, 0);
                ((LiveActionButton) this.f9590h).setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            } else if (index == 1) {
                ((LiveActionButton) this.f9590h).setOrientation(typedArray.getInt(index, -1));
            } else if (index == 2) {
                v.a(this.f9590h, typedArray.getDrawable(index));
            } else if (index == 5) {
                int resourceId2 = typedArray.getResourceId(index, 0);
                if (resourceId2 != 0) {
                    ((LiveActionButton) this.f9590h).setIcon(androidx.appcompat.a.a.a.b(((LiveActionButton) this.f9590h).getContext(), resourceId2));
                } else {
                    ((LiveActionButton) this.f9590h).setIcon((Drawable) null);
                }
            } else if (index == 4) {
                ((LiveActionButton) this.f9590h).setText(typedArray.getText(index));
            }
        }
    }

    @Override // com.bytedance.android.live.design.widget.b.c
    public final void a(AttributeSet attributeSet, int i2, int i3) {
        super.a(attributeSet, i2, i3);
    }
}
