package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.style.StyleTextView;
import h.f.b.l;

public final class m extends StyleTextView {

    /* renamed from: a  reason: collision with root package name */
    public boolean f150453a;

    static {
        Covode.recordClassIndex(98934);
    }

    public final boolean isFocused() {
        return this.f150453a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private m(Context context) {
        super(context, null, 0);
        l.d(context, "");
    }

    public final void setMarqueeEnable(boolean z) {
        if (this.f150453a != z) {
            this.f150453a = z;
            onWindowFocusChanged(z);
        }
    }

    public /* synthetic */ m(Context context, byte b2) {
        this(context);
    }
}
