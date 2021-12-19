package com.bytedance.assem.arch.d;

import android.view.View;
import com.bytedance.assem.arch.core.p;
import com.bytedance.covode.number.Covode;

public abstract class a extends p {

    /* renamed from: i  reason: collision with root package name */
    public int f25607i;

    static {
        Covode.recordClassIndex(14899);
    }

    @Override // com.bytedance.assem.arch.core.p
    public void t() {
        View view;
        if (((p) this).f25593g != null) {
            b(s());
        } else if (this.f25607i != 0 && (view = bx_().f25530c) != null) {
            View findViewById = view.findViewById(this.f25607i);
            if (findViewById != null) {
                a(findViewById);
                b(findViewById);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }
}
