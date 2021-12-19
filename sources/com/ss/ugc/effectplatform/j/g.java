package com.ss.ugc.effectplatform.j;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.h.i;
import com.ss.ugc.effectplatform.task.al;
import com.ss.ugc.effectplatform.task.am;
import com.ss.ugc.effectplatform.task.z;
import com.ss.ugc.effectplatform.util.t;
import com.ss.ugc.effectplatform.util.w;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public d.a.b.a<d.a.a.b<String, String>> f153627a = new d.a.b.a<>(null);

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.ugc.effectplatform.a f153628b;

    public static abstract class a implements e<String> {
        static {
            Covode.recordClassIndex(102433);
        }
    }

    static {
        Covode.recordClassIndex(102432);
    }

    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f153633a;

        static {
            Covode.recordClassIndex(102435);
        }

        c(i iVar) {
            this.f153633a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onSuccess(String str) {
            l.c(str, "");
            i iVar = this.f153633a;
            if (iVar != null) {
                iVar.onFinally();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onFail(String str, com.ss.ugc.effectplatform.model.e eVar) {
            l.c(eVar, "");
        }
    }

    public g(com.ss.ugc.effectplatform.a aVar) {
        l.c(aVar, "");
        this.f153628b = aVar;
    }

    public static final class b implements e<HashMap<String, String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f153629a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f153630b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f153631c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f153632d;

        static {
            Covode.recordClassIndex(102434);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onSuccess(HashMap<String, String> hashMap) {
            HashMap<String, String> hashMap2 = hashMap;
            l.c(hashMap2, "");
            if (this.f153629a.f153627a.f156544a == null) {
                d.a.b.b.a(this.f153629a.f153627a, new d.a.a.b(true));
            }
            V v = this.f153629a.f153627a.f156544a;
            if (v != null) {
                v.putAll(hashMap2);
            }
            this.f153629a.a(this.f153630b, this.f153631c, this.f153632d);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onFail(HashMap<String, String> hashMap, com.ss.ugc.effectplatform.model.e eVar) {
            l.c(eVar, "");
            if (this.f153629a.f153627a.f156544a == null) {
                d.a.b.b.a(this.f153629a.f153627a, new d.a.a.b(true));
            }
            e eVar2 = this.f153632d;
            if (eVar2 != null) {
                eVar2.onSuccess(true);
            }
        }

        public b(g gVar, String str, String str2, e eVar) {
            this.f153629a = gVar;
            this.f153630b = str;
            this.f153631c = str2;
            this.f153632d = eVar;
        }
    }

    public static final class d implements e<HashMap<String, String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f153634a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f153635b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f153636c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f153637d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f153638e;

        static {
            Covode.recordClassIndex(102436);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onSuccess(HashMap<String, String> hashMap) {
            HashMap<String, String> hashMap2 = hashMap;
            l.c(hashMap2, "");
            if (this.f153634a.f153627a.f156544a == null) {
                d.a.b.b.a(this.f153634a.f153627a, new d.a.a.b(true));
            }
            V v = this.f153634a.f153627a.f156544a;
            if (v != null) {
                v.putAll(hashMap2);
            }
            this.f153634a.a(this.f153635b, this.f153636c, this.f153637d, this.f153638e);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.ss.ugc.effectplatform.h.e
        public final /* synthetic */ void onFail(HashMap<String, String> hashMap, com.ss.ugc.effectplatform.model.e eVar) {
            l.c(eVar, "");
            if (this.f153634a.f153627a.f156544a == null) {
                d.a.b.b.a(this.f153634a.f153627a, new d.a.a.b(true));
            }
        }

        public d(g gVar, String str, String str2, String str3, i iVar) {
            this.f153634a = gVar;
            this.f153635b = str;
            this.f153636c = str2;
            this.f153637d = str3;
            this.f153638e = iVar;
        }
    }

    public final void a(String str, String str2, e<Boolean> eVar) {
        if (this.f153627a.f156544a == null && eVar != null) {
            eVar.onSuccess(true);
        }
        V v = this.f153627a.f156544a;
        if (v != null) {
            if (v.containsKey(str)) {
                if (w.a(str2) > w.a((String) v.get(str))) {
                    if (eVar != null) {
                        eVar.onSuccess(true);
                    }
                } else if (eVar != null) {
                    eVar.onSuccess(false);
                }
            } else if (eVar != null) {
                eVar.onSuccess(true);
            }
        }
    }

    public final String a(String str, List<String> list, boolean z, e<List<String>> eVar) {
        l.c(list, "");
        String a2 = t.a();
        if (eVar != null) {
            this.f153628b.K.a(a2, eVar);
        }
        z zVar = new z(this.f153628b, str, a2, list, z, null);
        al alVar = this.f153628b.z;
        if (alVar != null) {
            alVar.a(zVar);
        }
        return a2;
    }

    public final void a(String str, String str2, String str3, i iVar) {
        if (this.f153627a.f156544a == null && iVar != null) {
            iVar.onFinally();
        }
        V v = this.f153627a.f156544a;
        if (v != null) {
            v.put(str2, str3);
            this.f153628b.K.a(str, new c(iVar));
            am amVar = new am(this.f153628b, str, v);
            al alVar = this.f153628b.z;
            if (alVar != null) {
                alVar.a(amVar);
            }
        }
    }
}
