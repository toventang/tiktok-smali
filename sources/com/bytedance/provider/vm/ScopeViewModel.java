package com.bytedance.provider.vm;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.d;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ScopeViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    private CopyOnWriteArrayList<d> f42023a = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(25696);
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f42023a.clear();
    }
}
