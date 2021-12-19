package com.bytedance.ies.sdk.datachannel;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;
import java.util.List;

public final class f {
    static {
        Covode.recordClassIndex(20691);
    }

    private static final e b(Fragment fragment) {
        if (fragment != null) {
            try {
                if (!fragment.isDetached()) {
                    if (fragment instanceof e) {
                        return (e) fragment;
                    }
                    return b(fragment.getParentFragment());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static final DataChannel a(Fragment fragment) {
        e eVar;
        e eVar2;
        if (fragment != null) {
            eVar = fragment.getActivity();
        } else {
            eVar = null;
        }
        if (eVar instanceof e) {
            e activity = fragment.getActivity();
            if (activity != null) {
                return ((e) activity).h();
            }
            throw new w("null cannot be cast to non-null type");
        }
        e b2 = b(fragment);
        if (b2 == null) {
            if (fragment != null) {
                eVar2 = fragment.getActivity();
            } else {
                eVar2 = null;
            }
            b2 = a(eVar2);
            if (b2 == null) {
                return null;
            }
        }
        return b2.h();
    }

    private static final e c(Fragment fragment) {
        if (fragment != null) {
            try {
                if (!fragment.isDetached()) {
                    i childFragmentManager = fragment.getChildFragmentManager();
                    l.a((Object) childFragmentManager, "");
                    List<Fragment> f2 = childFragmentManager.f();
                    l.a((Object) f2, "");
                    for (T t : f2) {
                        if (t instanceof e) {
                            return t;
                        }
                        e c2 = c(t);
                        if (c2 != null) {
                            return c2;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static final e a(e eVar) {
        if (eVar == null) {
            return null;
        }
        i supportFragmentManager = eVar.getSupportFragmentManager();
        l.a((Object) supportFragmentManager, "");
        List<Fragment> f2 = supportFragmentManager.f();
        l.a((Object) f2, "");
        for (T t : f2) {
            if (t instanceof e) {
                return t;
            }
            e c2 = c(t);
            if (c2 != null) {
                return c2;
            }
        }
        return null;
    }
}
