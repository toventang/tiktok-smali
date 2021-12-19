package com.bytedance.ies.d.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;
import h.q;
import h.r;
import h.z;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f33222a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<String, u> f33223b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public boolean f33224c;

    /* renamed from: d  reason: collision with root package name */
    public String f33225d = "";

    /* renamed from: e  reason: collision with root package name */
    final Executor f33226e;

    /* renamed from: f  reason: collision with root package name */
    public final f f33227f;

    /* renamed from: g  reason: collision with root package name */
    public final h f33228g;

    static {
        Covode.recordClassIndex(19842);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f33229a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f33230b;

        static {
            Covode.recordClassIndex(19843);
        }

        a(c cVar, h.f.a.a aVar) {
            this.f33229a = cVar;
            this.f33230b = aVar;
        }

        public final void run() {
            this.f33229a.f33223b.clear();
            c cVar = this.f33229a;
            cVar.f33226e.execute(new b(cVar, cVar.f33227f.a()));
            this.f33229a.f33222a = true;
            q.a("ConfigManager initialized successfully.");
            this.f33230b.invoke();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f33231a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f33232b;

        static {
            Covode.recordClassIndex(19844);
        }

        b(c cVar, List list) {
            this.f33231a = cVar;
            this.f33232b = list;
        }

        public final void run() {
            Object obj;
            for (String str : this.f33232b) {
                try {
                    u uVar = new u(new JSONObject(str));
                    this.f33231a.f33223b.put(uVar.f33247a, uVar);
                    TextUtils.isEmpty(uVar.f33247a);
                    if (this.f33231a.f33224c) {
                        String str2 = this.f33231a.f33225d;
                        String str3 = uVar.f33247a;
                        l.c(str2, "");
                        l.c(str3, "");
                        l.c(str, "");
                        if (!v.a().containsKey(str2)) {
                            v.a().put(str2, new ArrayList<>());
                        }
                        ArrayList<ac> arrayList = v.a().get(str2);
                        if (arrayList != null) {
                            arrayList.add(new ac(str3, str));
                        }
                    }
                    obj = q.m223constructorimpl(z.f158842a);
                } catch (Throwable th) {
                    obj = q.m223constructorimpl(r.a(th));
                }
                Throwable r2 = q.m226exceptionOrNullimpl(obj);
                if (r2 != null) {
                    q.b("Failed to parse config json.", r2);
                    if (this.f33231a.f33228g != null) {
                        l.c(r2, "");
                        StringWriter stringWriter = new StringWriter();
                        r2.printStackTrace(new PrintWriter(stringWriter));
                        l.a((Object) stringWriter.toString(), "");
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.d.a.e
    public final void a(h.f.a.a<z> aVar) {
        l.c(aVar, "");
        if (this.f33222a) {
            aVar.invoke();
        } else {
            this.f33226e.execute(new a(this, aVar));
        }
    }

    @Override // com.bytedance.ies.d.a.e
    public final p<Collection<ad>, SortedMap<String, String>> a(aj ajVar) {
        p<Collection<ad>, SortedMap<String, String>> pVar;
        p<Collection<ad>, SortedMap<String, String>> pVar2;
        ae aeVar;
        List<String> first;
        p<List<String>, SortedMap<String, String>> a2;
        List<String> first2;
        l.c(ajVar, "");
        Iterator<Map.Entry<String, u>> it = this.f33223b.entrySet().iterator();
        while (true) {
            pVar = null;
            SortedMap<String, String> sortedMap = null;
            if (!it.hasNext()) {
                break;
            }
            u value = it.next().getValue();
            l.c(ajVar, "");
            if (!value.f33251e.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                r rVar = value.f33249c;
                if (!(rVar == null || (a2 = rVar.a(ajVar)) == null || (first2 = a2.getFirst()) == null)) {
                    Iterator<T> it2 = first2.iterator();
                    while (it2.hasNext()) {
                        ad adVar = value.f33251e.get(it2.next());
                        if (adVar != null) {
                            arrayList.add(adVar);
                        }
                    }
                }
                if (!arrayList.isEmpty() || (aeVar = value.f33250d) == null) {
                    pVar2 = new p<>(arrayList, null);
                } else {
                    p<List<String>, SortedMap<String, String>> a3 = aeVar.a(ajVar);
                    if (!(a3 == null || (first = a3.getFirst()) == null)) {
                        Iterator<T> it3 = first.iterator();
                        while (it3.hasNext()) {
                            ad adVar2 = value.f33251e.get(it3.next());
                            if (adVar2 != null) {
                                arrayList.add(adVar2);
                            }
                        }
                    }
                    if (a3 != null) {
                        sortedMap = a3.getSecond();
                    }
                    pVar2 = new p<>(arrayList, sortedMap);
                }
                pVar = pVar2;
                if (!pVar.getFirst().isEmpty()) {
                    break;
                }
            }
        }
        return pVar;
    }

    public c(Executor executor, f fVar, h hVar) {
        l.c(executor, "");
        l.c(fVar, "");
        this.f33226e = executor;
        this.f33227f = fVar;
        this.f33228g = hVar;
    }
}
