package com.ss.android.ugc.aweme.cs;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.cs.d.b;
import com.ss.android.ugc.aweme.draft.model.j;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import com.ss.android.ugc.aweme.tools.policysecurity.a;
import h.a.i;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class d implements com.ss.android.ugc.aweme.cs.h.d {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, com.ss.android.ugc.aweme.cs.a.a.a> f79003a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(49035);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v35, resolved type: java.util.LinkedHashSet<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.cs.h.d
    public final Set<String> a() {
        j jVar = new j(a.f79004a);
        Collection<com.ss.android.ugc.aweme.cs.a.a.a> values = this.f79003a.values();
        l.b(values, "");
        for (T t : values) {
            if (!t.f78985a.get()) {
                com.ss.android.ugc.aweme.cs.h.d d2 = g.a().g().d();
                String name = t.getClass().getName();
                l.b(name, "");
                if (!d2.a(name)) {
                    b.b();
                }
                t.f78987c.clear();
                String[] stringArray = ((Keva) t.f78986b.getValue()).getStringArray(String.valueOf(t.getClass().getName().hashCode()), new String[0]);
                l.b(stringArray, "");
                for (Object obj : i.h(stringArray)) {
                    t.f78987c.add(obj);
                }
                t.f78985a.set(true);
            }
            jVar.addAll(t.f78987c);
        }
        Application application = c.f115622a;
        l.b(application, "");
        l.d(application, "");
        ArrayList<OriginalSoundUploadTask> a2 = a.C3732a.a(application).a();
        ArrayList arrayList = new ArrayList(n.a((Iterable) a2, 10));
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f140994c);
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr = (String[]) array;
        jVar.addAll(n.b(Arrays.copyOf(strArr, strArr.length)));
        return jVar;
    }

    @Override // com.ss.android.ugc.aweme.cs.h.d
    public final boolean a(String str) {
        l.d(str, "");
        return this.f79003a.containsKey(str);
    }

    static final class a extends m implements h.f.a.b<String, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f79004a = new a();

        static {
            Covode.recordClassIndex(49036);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            return Boolean.valueOf(!p.a((CharSequence) str2));
        }
    }

    @Override // com.ss.android.ugc.aweme.cs.h.d
    public final void a(com.ss.android.ugc.aweme.cs.a.a.a aVar) {
        l.d(aVar, "");
        ConcurrentHashMap<String, com.ss.android.ugc.aweme.cs.a.a.a> concurrentHashMap = this.f79003a;
        String name = aVar.getClass().getName();
        l.b(name, "");
        concurrentHashMap.put(name, aVar);
    }
}
