package com.bytedance.jedi.arch;

import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.vm.ScopeViewModel;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final ad f39548a;

    static {
        Covode.recordClassIndex(24336);
    }

    public final <T extends JediViewModel> T a(Class<T> cls) {
        ac a2;
        if (cls.getCanonicalName() != null) {
            String name = cls.getName();
            ad adVar = this.f39548a;
            if (cls.equals(ScopeViewModel.class)) {
                a2 = adVar.a(name, cls);
            } else {
                a2 = adVar.a(name, cls);
                ab.a(a2, adVar);
            }
            return (T) ((JediViewModel) a2);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public s(af afVar, ad.b bVar) {
        this.f39548a = new ad(afVar, bVar);
    }
}
