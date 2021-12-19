package com.ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.y;
import com.ss.android.ugc.aweme.model.d;
import com.ss.android.ugc.aweme.model.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedList<n> f76618a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    public static aa f76619b;

    /* renamed from: c  reason: collision with root package name */
    public static final z f76620c = new z();

    private z() {
    }

    public static void a() {
        f76618a.clear();
        f76619b = null;
    }

    static {
        Covode.recordClassIndex(47302);
    }

    public static void b() {
        aa aaVar;
        LinkedList<n> linkedList = f76618a;
        if ((!linkedList.isEmpty()) && (aaVar = f76619b) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(y.a.a(linkedList.getFirst().d(), true));
            aaVar.a(arrayList, !linkedList.isEmpty());
        }
    }

    public static void a(aa aaVar) {
        l.d(aaVar, "");
        f76619b = aaVar;
    }

    public static void a(n nVar) {
        l.d(nVar, "");
        LinkedList<n> linkedList = f76618a;
        linkedList.add(nVar);
        if (linkedList.size() == 1) {
            b();
        }
    }

    public static List<y> a(d dVar) {
        l.d(dVar, "");
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.ugc.aweme.model.l lVar : dVar.f().values()) {
            arrayList.add(y.a.a(lVar.f110789b, lVar.f110788a));
        }
        return arrayList;
    }

    public static boolean a(String str) {
        l.d(str, "");
        Iterator<n> it = f76618a.iterator();
        while (it.hasNext()) {
            if (l.a((Object) str, (Object) it.next().d())) {
                return true;
            }
        }
        return false;
    }
}
