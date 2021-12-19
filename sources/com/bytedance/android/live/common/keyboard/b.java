package com.bytedance.android.live.common.keyboard;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.core.f.aa;
import com.bytedance.android.live.core.f.ac;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f8830d = new a((byte) 0);

    static {
        Covode.recordClassIndex(4516);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4517);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.common.keyboard.a
    public final void a(Context context, int i2) {
        int b2;
        l.d(context, "");
        int size = View.MeasureSpec.getSize(i2);
        if (!b(context, size)) {
            int b3 = n.b(context);
            if (aa.a(context) != 0) {
                b2 = aa.a(context);
                com.bytedance.android.live.core.c.a.a(4, "KeyBoardObservable", "ScreenUtils.getNavigationBarHeight");
            } else {
                b2 = (int) n.b(context, 48.0f);
                com.bytedance.android.live.core.c.a.a(4, "KeyBoardObservable", "UIUtils.dip2Px(context, NAVIGATION_BAR_DEFAULT_HEIGHT.toFloat()).toInt()");
            }
            int a2 = ac.a(context);
            com.bytedance.android.live.core.c.a.a(4, "KeyBoardObservable", "sH: " + b3 + ", mH: " + size + ", nH: " + b2 + ", bH: " + a2 + ", kv: " + this.f8828c + ", last height:" + this.f8826a);
            if (Math.abs(b3 - size) > b2 + a2 + 1) {
                this.f8826a = size;
                if (!this.f8828c) {
                    this.f8828c = true;
                    a(this.f8828c, Math.abs(b3 - this.f8826a));
                }
            } else if (this.f8828c) {
                this.f8828c = false;
                a(this.f8828c, Math.abs(b3 - this.f8826a));
            }
        }
    }
}
