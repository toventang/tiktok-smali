package com.ss.android.ugc.aweme.common;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class i<DATA> {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<j<DATA>> f76446a = new a(this);

    /* renamed from: b  reason: collision with root package name */
    private final h f76447b = h.i.a((h.f.a.a) c.f76450a);

    static {
        Covode.recordClassIndex(47199);
    }

    public final Map<k<DATA>, u<j<DATA>>> a() {
        return (Map) this.f76447b.getValue();
    }

    static final class c extends m implements h.f.a.a<Map<k<DATA>, u<j<DATA>>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f76450a = new c();

        static {
            Covode.recordClassIndex(47202);
        }

        c() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            return new LinkedHashMap();
        }
    }

    public final void b() {
        for (u<j<DATA>> uVar : a().values()) {
            this.f76446a.removeObserver(uVar);
        }
        a().clear();
    }

    public static final class a extends com.ss.android.ugc.aweme.arch.widgets.base.c<j<DATA>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f76448b;

        static {
            Covode.recordClassIndex(47200);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(i iVar) {
            this.f76448b = iVar;
        }

        @Override // com.ss.android.ugc.aweme.arch.widgets.base.c, androidx.lifecycle.LiveData
        public final void removeObserver(u<? super j<DATA>> uVar) {
            l.d(uVar, "");
            Iterator<Map.Entry<k<DATA>, u<j<DATA>>>> it = this.f76448b.a().entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == uVar) {
                    it.remove();
                }
            }
            super.removeObserver(uVar);
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f76449a;

        static {
            Covode.recordClassIndex(47201);
        }

        b(k kVar) {
            this.f76449a = kVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            j jVar = (j) obj;
            if (jVar.f76451a != null) {
                this.f76449a.f76454b.invoke(jVar.f76451a);
                return;
            }
            h.f.a.b<Throwable, z> bVar = this.f76449a.f76455c;
            if (bVar != null) {
                bVar.invoke(jVar.f76452b);
            }
        }
    }
}
