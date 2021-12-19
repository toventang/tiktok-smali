package com.ss.android.ugc.aweme.editSticker.f;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.tools.view.b;
import h.f.b.l;

public final class g {
    static {
        Covode.recordClassIndex(55417);
    }

    public static final int[] a(View view, int i2, int i3) {
        int i4;
        int i5;
        l.d(view, "");
        b bVar = com.ss.android.ugc.aweme.editSticker.g.f88154a;
        if (bVar != null) {
            bVar.a(view, i2, i3);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        b bVar2 = com.ss.android.ugc.aweme.editSticker.g.f88154a;
        if (bVar2 != null) {
            i4 = bVar2.f();
        } else {
            i4 = 0;
        }
        b bVar3 = com.ss.android.ugc.aweme.editSticker.g.f88154a;
        if (bVar3 != null) {
            i5 = bVar3.d();
        } else {
            i5 = 0;
        }
        double d2 = (double) i3;
        Double.isNaN(d2);
        if (((double) (i2 * 16)) > d2 * 9.01d) {
            return new int[]{0, (((dh.e(view.getContext()) - i4) - layoutParams.height) / 2) + i5};
        }
        return new int[]{(dh.b(view.getContext()) - layoutParams.width) >> 1, i5};
    }
}
