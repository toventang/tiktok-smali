package com.bytedance.ies.im.core.api.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.d.u;
import h.a.n;
import h.a.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(20217);
    }

    /* renamed from: com.bytedance.ies.im.core.api.e.a$a  reason: collision with other inner class name */
    public static final class C0748a implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f33960a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f33961b;

        static {
            Covode.recordClassIndex(20218);
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
            h.f.a.b bVar = this.f33961b;
            if (bVar != null) {
                bVar.invoke(uVar);
            }
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(T t) {
            h.f.a.b bVar = this.f33960a;
            if (bVar != null) {
                bVar.invoke(t);
            }
        }

        C0748a(h.f.a.b bVar, h.f.a.b bVar2) {
            this.f33960a = bVar;
            this.f33961b = bVar2;
        }
    }

    public static final boolean a(Collection<? extends Object> collection) {
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        return true;
    }

    public static final boolean b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static final long a(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        long j2 = -1;
        if (z) {
            return -1;
        }
        try {
            j2 = Long.parseLong(str);
            return j2;
        } catch (Throwable th) {
            com.bytedance.ies.im.core.api.a.b().a(th);
            return j2;
        }
    }

    public static final List<Long> a(List<String> list) {
        if (list == null) {
            return z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(a((String) it.next())));
        }
        return arrayList;
    }

    public static final <T> b<T> a(h.f.a.b<? super T, h.z> bVar, h.f.a.b<? super u, h.z> bVar2) {
        return new C0748a(bVar, bVar2);
    }

    public static final <T> long a(String str, b<T> bVar) {
        long a2 = a(str);
        if (a2 <= 0 && bVar != null) {
            bVar.a(u.a().a(-100000).a("uid invalid: ".concat(String.valueOf(str))).f38031a);
        }
        return a2;
    }
}
