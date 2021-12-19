package com.ss.android.ugc.aweme.common.keyboard;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.framework.a.a;

public final class b extends a {
    static {
        Covode.recordClassIndex(47207);
    }

    @Override // com.ss.android.ugc.aweme.common.keyboard.a
    public final void a(Context context, int i2) {
        int i3;
        int b2;
        int size = View.MeasureSpec.getSize(i2);
        if (!b(context, size)) {
            WindowManager windowManager = (WindowManager) i.a(d.a(), "window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                if (defaultDisplay == null) {
                    i3 = 0;
                } else {
                    defaultDisplay.getSize(point);
                    i3 = point.y;
                }
            } else {
                i3 = d.a().getResources().getDisplayMetrics().heightPixels;
            }
            if (i.e(context) != 0) {
                b2 = i.e(context);
            } else {
                b2 = (int) n.b(context, 48.0f);
            }
            int b3 = i.b();
            a.b(3, "KeyBoardObservable", "sH: " + i3 + ", mH: " + size + ", nH: " + b2 + ", bH: " + b3 + ", kv: " + this.f76461b);
            if (Math.abs(i3 - size) > b2 + b3) {
                this.f76460a = size;
                if (!this.f76461b) {
                    this.f76461b = true;
                    a(this.f76461b, Math.abs(i3 - this.f76460a));
                }
            } else if (this.f76461b) {
                this.f76461b = false;
                a(this.f76461b, Math.abs(i3 - this.f76460a));
            }
        }
    }
}
