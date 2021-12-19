package com.bytedance.android.livesdk.chatroom.ui.a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.view.d;
import com.bytedance.android.livesdkapi.view.e;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public View f15846a;

    static {
        Covode.recordClassIndex(8738);
    }

    public final d a() {
        View view = this.f15846a;
        if (!(view instanceof d)) {
            return null;
        }
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.view.IRender");
        return (d) view;
    }

    public final ViewGroup.LayoutParams b() {
        ViewGroup.LayoutParams layoutParams = this.f15846a.getLayoutParams();
        l.b(layoutParams, "");
        return layoutParams;
    }

    public a(View view) {
        l.d(view, "");
        this.f15846a = view;
    }

    public final void a(int i2) {
        if (this.f15846a.getContext() != null) {
            n.a(this.f15846a, i2);
        }
    }

    public final z b(int i2) {
        View view = this.f15846a;
        if (!(view instanceof e) || view == null) {
            return null;
        }
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.view.IRenderView");
        ((e) view).setScaleType(i2);
        return z.f158842a;
    }

    public final void a(ViewGroup.LayoutParams layoutParams) {
        l.d(layoutParams, "");
        if (this.f15846a.getContext() != null) {
            this.f15846a.setLayoutParams(layoutParams);
        }
    }
}
