package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class hf extends hd {

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f50976c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private hf() {
        super((byte) 0);
    }

    static {
        Covode.recordClassIndex(31845);
    }

    /* synthetic */ hf(byte b2) {
        this();
    }

    private static <E> List<E> c(Object obj, long j2) {
        return (List) jk.f(obj, j2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.hd
    public final <L> List<L> a(Object obj, long j2) {
        return a(obj, j2, 10);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.hd
    public final void b(Object obj, long j2) {
        Object unmodifiableList;
        List list = (List) jk.f(obj, j2);
        if (list instanceof he) {
            unmodifiableList = ((he) list).e();
        } else if (!f50976c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof Cif) || !(list instanceof gv)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                gv gvVar = (gv) list;
                if (gvVar.a()) {
                    gvVar.b();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        jk.a(obj, j2, unmodifiableList);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.hd
    public final <E> void a(Object obj, Object obj2, long j2) {
        List c2 = c(obj2, j2);
        List a2 = a(obj, j2, c2.size());
        int size = a2.size();
        int size2 = c2.size();
        if (size > 0) {
            if (size2 > 0) {
                a2.addAll(c2);
            }
            c2 = a2;
        }
        jk.a(obj, j2, c2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> a(Object obj, long j2, int i2) {
        hb hbVar;
        List<L> arrayList;
        List<L> c2 = c(obj, j2);
        if (c2.isEmpty()) {
            if (c2 instanceof he) {
                arrayList = new hb(i2);
            } else if (!(c2 instanceof Cif) || !(c2 instanceof gv)) {
                arrayList = new ArrayList<>(i2);
            } else {
                arrayList = ((gv) c2).a(i2);
            }
            jk.a(obj, j2, arrayList);
            return arrayList;
        }
        if (f50976c.isAssignableFrom(c2.getClass())) {
            ArrayList arrayList2 = new ArrayList(c2.size() + i2);
            arrayList2.addAll(c2);
            jk.a(obj, j2, arrayList2);
            hbVar = arrayList2;
        } else if (c2 instanceof jf) {
            hb hbVar2 = new hb(c2.size() + i2);
            hbVar2.addAll(c2);
            jk.a(obj, j2, hbVar2);
            hbVar = hbVar2;
        } else if (!(c2 instanceof Cif) || !(c2 instanceof gv)) {
            return c2;
        } else {
            gv gvVar = (gv) c2;
            if (gvVar.a()) {
                return c2;
            }
            gv a2 = gvVar.a(c2.size() + i2);
            jk.a(obj, j2, a2);
            return a2;
        }
        return hbVar;
    }
}
