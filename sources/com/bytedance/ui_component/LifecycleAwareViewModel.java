package com.bytedance.ui_component;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.af;
import h.f.b.l;

public abstract class LifecycleAwareViewModel<T extends af> extends JediViewModel<T> implements m {

    /* renamed from: k  reason: collision with root package name */
    public i f45850k;

    static {
        Covode.recordClassIndex(27971);
    }

    @Override // androidx.lifecycle.m
    public i getLifecycle() {
        i iVar = this.f45850k;
        if (iVar == null) {
            l.a("_lifecycle");
        }
        return iVar;
    }
}
