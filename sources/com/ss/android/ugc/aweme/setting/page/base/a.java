package com.ss.android.ugc.aweme.setting.page.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public List<com.bytedance.ies.powerlist.b.a> f122439a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<Class<? extends PowerCell<?>>, Object> f122440b = new HashMap<>();

    static {
        Covode.recordClassIndex(80296);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<T, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f122442a = new b();

        static {
            Covode.recordClassIndex(80298);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            l.d(obj, "");
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.page.base.a$a  reason: collision with other inner class name */
    public static final class C3168a extends m implements h.f.a.b<T, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3168a f122441a = new C3168a();

        static {
            Covode.recordClassIndex(80297);
        }

        C3168a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Object obj) {
            l.d(obj, "");
            return true;
        }
    }

    public final <T extends com.bytedance.ies.powerlist.b.a> void a(T t, h.f.a.b<? super T, Boolean> bVar) {
        l.d(t, "");
        l.d(bVar, "");
        if (bVar.invoke(t).booleanValue() && t != null) {
            this.f122439a.add(t);
        }
    }

    public static /* synthetic */ void a(a aVar, com.bytedance.ies.powerlist.b.a aVar2, Class cls, h.f.a.b bVar, h.f.a.b bVar2, int i2) {
        if ((i2 & 4) != 0) {
            bVar = C3168a.f122441a;
        }
        if ((i2 & 8) != 0) {
            bVar2 = b.f122442a;
        }
        l.d(aVar2, "");
        l.d(cls, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        if (((Boolean) bVar.invoke(aVar2)).booleanValue() && aVar2 != null) {
            bVar2.invoke(aVar2);
            aVar.f122439a.add(aVar2);
            aVar.f122440b.put(cls, aVar2);
        }
    }
}
