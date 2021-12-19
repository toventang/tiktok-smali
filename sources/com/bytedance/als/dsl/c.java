package com.bytedance.als.dsl;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.scene.group.b;
import com.bytedance.scene.s;
import h.f.b.l;
import java.util.Objects;

public final class c {
    static {
        Covode.recordClassIndex(3109);
    }

    public static final f b(e eVar) {
        l.d(eVar, "");
        return a(eVar).f6438e;
    }

    public static final f b(b bVar) {
        l.d(bVar, "");
        return a(bVar).f6438e;
    }

    public static final AlsLogicContainer a(e eVar) {
        l.d(eVar, "");
        ac a2 = ae.a(eVar).a(AlsVMContainer.class);
        l.b(a2, "");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a2;
        alsVMContainer.a(eVar);
        if (alsVMContainer.f6454b == null) {
            ApiCenter a3 = ApiCenter.a.a(eVar);
            f b2 = g.a(eVar).b();
            FragmentManager fragmentManager = eVar.getFragmentManager();
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag("ALS.ActivityLifecycleFragment");
            if (!(findFragmentByTag instanceof a)) {
                findFragmentByTag = null;
            }
            a aVar = (a) findFragmentByTag;
            if (aVar == null) {
                aVar = new a();
                fragmentManager.beginTransaction().add(aVar, "ALS.ActivityLifecycleFragment").commitAllowingStateLoss();
                fragmentManager.executePendingTransactions();
            }
            alsVMContainer.f6454b = new AlsLogicContainer(aVar.getLifecycle(), a3, b2, alsVMContainer.f6453a);
        }
        AlsLogicContainer alsLogicContainer = alsVMContainer.f6454b;
        if (alsLogicContainer == null) {
            l.b();
        }
        return alsLogicContainer;
    }

    public static final AlsLogicContainer a(com.bytedance.als.e<?> eVar) {
        l.d(eVar, "");
        ac a2 = com.bytedance.als.c.a(eVar).a(AlsVMContainer.class);
        l.b(a2, "");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a2;
        if (alsVMContainer.f6454b == null) {
            e eVar2 = null;
            Object a3 = eVar.f6464b.a(Activity.class, (String) null);
            if (a3 instanceof e) {
                eVar2 = a3;
            }
            e eVar3 = eVar2;
            if (eVar3 != null) {
                alsVMContainer.f6454b = new AlsLogicContainer(eVar.getLifecycle(), ApiCenter.a.a(eVar3), g.a(eVar).b(), alsVMContainer.f6453a);
            } else {
                throw new IllegalStateException("a fragmentActivity instance is required in component.");
            }
        }
        AlsLogicContainer alsLogicContainer = alsVMContainer.f6454b;
        if (alsLogicContainer == null) {
            l.b();
        }
        return alsLogicContainer;
    }

    public static final AlsLogicContainer a(b bVar) {
        l.d(bVar, "");
        ac a2 = s.a(bVar).a(AlsVMContainer.class);
        l.b(a2, "");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a2;
        if (alsVMContainer.f6454b == null) {
            Activity t = bVar.t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ApiCenter a3 = ApiCenter.a.a((e) t);
            f b2 = g.a(bVar).b();
            i lifecycle = bVar.getLifecycle();
            l.b(lifecycle, "");
            alsVMContainer.f6454b = new AlsLogicContainer(lifecycle, a3, b2, alsVMContainer.f6453a);
        }
        AlsLogicContainer alsLogicContainer = alsVMContainer.f6454b;
        if (alsLogicContainer == null) {
            l.b();
        }
        return alsLogicContainer;
    }
}
