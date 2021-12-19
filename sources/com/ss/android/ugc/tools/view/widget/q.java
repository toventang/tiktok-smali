package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;
import java.util.List;

public final class q {
    static {
        Covode.recordClassIndex(98943);
    }

    public static final void a(TabLayout tabLayout, int i2) {
        l.d(tabLayout, "");
        int i3 = 0;
        if (i2 <= 1) {
            tabLayout.setHideIndicatorView(true);
        } else {
            tabLayout.setHideIndicatorView(false);
        }
        if (i2 <= 4 && i2 > 1) {
            i3 = 1;
        }
        tabLayout.setTabMode(i3);
    }

    public static final void a(TabLayout tabLayout, int i2, List<String> list) {
        float f2;
        l.d(tabLayout, "");
        a(tabLayout, i2);
        if (!k.a(list)) {
            Paint paint = new Paint();
            Context context = tabLayout.getContext();
            l.b(context, "");
            paint.setTextSize(r.a(context, 15.0f));
            int i3 = 0;
            for (String str : list) {
                if (str != null) {
                    f2 = paint.measureText(str);
                } else {
                    f2 = 0.0f;
                }
                if (f2 > ((float) i3)) {
                    i3 = (int) f2;
                }
            }
            Context context2 = tabLayout.getContext();
            l.b(context2, "");
            if (((float) i3) > r.a(context2, 50.0f) && i2 > 2) {
                tabLayout.setTabMode(0);
            }
        }
    }
}
