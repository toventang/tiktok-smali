package com.bytedance.android.livesdk.chatroom.interaction;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15664a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f15665b;

    /* renamed from: c  reason: collision with root package name */
    private final View f15666c;

    static {
        Covode.recordClassIndex(8648);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(8649);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        if (!this.f15665b) {
            this.f15665b = true;
            ViewGroup.LayoutParams layoutParams = this.f15666c.getLayoutParams();
            if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                layoutParams = null;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                View view = this.f15666c;
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                layoutParams3.addRule(11);
                layoutParams3.addRule(12);
                layoutParams3.bottomMargin = y.a(150.0f);
                layoutParams3.rightMargin = y.a(8.0f);
                view.setLayoutParams(layoutParams3);
            }
        }
    }

    public e(View view) {
        l.d(view, "");
        this.f15666c = view;
    }
}
