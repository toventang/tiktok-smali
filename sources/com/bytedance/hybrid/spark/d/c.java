package com.bytedance.hybrid.spark.d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.f;
import com.bytedance.lynx.a.a.b.b;
import h.f.b.l;
import h.w;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f31134a;

    /* renamed from: b  reason: collision with root package name */
    private final View f31135b;

    static {
        Covode.recordClassIndex(18083);
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        String gravity = this.f31134a.getGravity();
        int hashCode = gravity.hashCode();
        if (hashCode != -1383228885) {
            if (hashCode == -1364013995 && gravity.equals("center")) {
                ViewGroup.LayoutParams layoutParams = this.f31135b.getLayoutParams();
                if (layoutParams != null) {
                    ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
                    return;
                }
                throw new w("null cannot be cast to non-null type");
            }
        } else if (gravity.equals("bottom")) {
            ViewGroup.LayoutParams layoutParams2 = this.f31135b.getLayoutParams();
            if (layoutParams2 != null) {
                ((FrameLayout.LayoutParams) layoutParams2).gravity = 81;
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
        ViewGroup.LayoutParams layoutParams3 = this.f31135b.getLayoutParams();
        if (layoutParams3 != null) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 81;
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public c(b bVar, View view) {
        l.c(bVar, "");
        l.c(view, "");
        this.f31134a = bVar;
        this.f31135b = view;
    }
}
