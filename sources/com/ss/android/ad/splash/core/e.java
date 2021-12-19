package com.ss.android.ad.splash.core;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final List<WeakReference<i>> f58433a = new ArrayList();

    static {
        Covode.recordClassIndex(36280);
    }

    static List<WeakReference<i>> a() {
        ArrayList arrayList = new ArrayList();
        List<WeakReference<i>> list = f58433a;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    static void a(i iVar) {
        if (iVar != null) {
            f58433a.add(new WeakReference<>(iVar));
        }
    }
}
