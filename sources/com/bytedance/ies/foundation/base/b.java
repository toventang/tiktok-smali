package com.bytedance.ies.foundation.base;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final h f33889a = i.a((h.f.a.a) C0740b.f33892a);

    /* renamed from: b  reason: collision with root package name */
    private final h f33890b = i.a((h.f.a.a) a.f33891a);

    static {
        Covode.recordClassIndex(20128);
    }

    public final List<c> a() {
        return (List) this.f33889a.getValue();
    }

    public final List<a> b() {
        return (List) this.f33890b.getValue();
    }

    static final class a extends m implements h.f.a.a<List<a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f33891a = new a();

        static {
            Covode.recordClassIndex(20129);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<a> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.bytedance.ies.foundation.base.b$b  reason: collision with other inner class name */
    static final class C0740b extends m implements h.f.a.a<List<c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0740b f33892a = new C0740b();

        static {
            Covode.recordClassIndex(20130);
        }

        C0740b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<c> invoke() {
            return new ArrayList();
        }
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        if (aVar instanceof f) {
            b().add(aVar);
            return;
        }
        List<a> b2 = b();
        ArrayList arrayList = new ArrayList();
        for (T t : b2) {
            if (l.a(t.getClass(), aVar.getClass())) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if ((!arrayList2.isEmpty()) && arrayList2 != null) {
            b().removeAll(n.k(arrayList2));
        }
        b().add(aVar);
    }
}
