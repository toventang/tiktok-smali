package com.bytedance.hox;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.a.b;
import com.bytedance.hox.a.c;
import com.bytedance.hox.c;
import h.f.b.l;
import java.util.List;

public abstract class HoxFragmentNode extends d implements c {

    /* renamed from: a  reason: collision with root package name */
    public Fragment f31036a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f31037b;

    static {
        Covode.recordClassIndex(18022);
    }

    @Override // com.bytedance.hox.c
    public final List<b> T_() {
        return this.f31047i;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.hox.d
    public final void a(c cVar) {
        Fragment fragment;
        i lifecycle;
        l.c(cVar, "");
        super.a(cVar);
        if (!this.f31037b && (fragment = this.f31036a) != null && (lifecycle = fragment.getLifecycle()) != null) {
            lifecycle.a(this);
            this.f31037b = true;
        }
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        c.a.a(this, mVar, aVar);
    }
}
