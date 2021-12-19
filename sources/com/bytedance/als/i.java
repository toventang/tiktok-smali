package com.bytedance.als;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements u {

    /* renamed from: a  reason: collision with root package name */
    private final m f6469a;

    static {
        Covode.recordClassIndex(3118);
    }

    i(m mVar) {
        this.f6469a = mVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        m mVar = this.f6469a;
        if (obj != null) {
            mVar.onChanged(obj);
        }
    }
}
