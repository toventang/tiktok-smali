package com.ss.android.ugc.aweme.commercialize.track;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.l.k;
import h.p;
import h.v;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class i extends com.bytedance.android.a.b.b.a.b {
    static {
        Covode.recordClassIndex(46518);
    }

    static final class a extends m implements h.f.a.b<Map.Entry<? extends String, ? extends List<? extends String>>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f75376a = new a();

        static {
            Covode.recordClassIndex(46519);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Map.Entry<? extends String, ? extends List<? extends String>> entry) {
            boolean z;
            Map.Entry<? extends String, ? extends List<? extends String>> entry2 = entry;
            l.d(entry2, "");
            CharSequence charSequence = (CharSequence) entry2.getKey();
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.b<Map.Entry<? extends String, ? extends List<? extends String>>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f75377a = new b();

        static {
            Covode.recordClassIndex(46520);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Map.Entry<? extends String, ? extends List<? extends String>> entry) {
            boolean z;
            Map.Entry<? extends String, ? extends List<? extends String>> entry2 = entry;
            l.d(entry2, "");
            Collection collection = (Collection) entry2.getValue();
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.b<Map.Entry<? extends String, ? extends String>, p<? extends String, ? extends List<? extends String>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f75379a = new d();

        static {
            Covode.recordClassIndex(46522);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ p<? extends String, ? extends List<? extends String>> invoke(Map.Entry<? extends String, ? extends String> entry) {
            Map.Entry<? extends String, ? extends String> entry2 = entry;
            l.d(entry2, "");
            return v.a(entry2.getKey(), n.a(entry2.getValue()));
        }
    }

    static final class c extends m implements h.f.a.b<Map.Entry<? extends String, ? extends List<? extends String>>, p<? extends String, ? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f75378a = new c();

        static {
            Covode.recordClassIndex(46521);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ p<? extends String, ? extends String> invoke(Map.Entry<? extends String, ? extends List<? extends String>> entry) {
            Object h2;
            Map.Entry<? extends String, ? extends List<? extends String>> entry2 = entry;
            String str = "";
            l.d(entry2, str);
            Object key = entry2.getKey();
            if (key == null) {
                key = str;
            }
            List list = (List) entry2.getValue();
            if (!(list == null || (h2 = n.h(list)) == 0)) {
                str = h2;
            }
            return v.a(key, str);
        }
    }

    @Override // com.bytedance.android.a.b.b.a.b
    public final com.bytedance.android.a.b.b.c a(com.bytedance.android.a.b.b.b bVar, int i2, boolean z) {
        int i3;
        LinkedHashMap<String, String> linkedHashMap = null;
        if (bVar == null) {
            try {
                com.bytedance.android.a.b.b.c a2 = com.bytedance.android.a.b.b.c.a(com.bytedance.android.a.a.h.c.a("request is null"), null);
                l.b(a2, "");
                return a2;
            } catch (Throwable th) {
                com.bytedance.android.a.b.b.c a3 = com.bytedance.android.a.b.b.c.a(th, bVar);
                l.b(a3, "");
                return a3;
            }
        } else {
            String str = bVar.f6696b;
            if (str == null || str.length() == 0) {
                com.bytedance.android.a.b.b.c a4 = com.bytedance.android.a.b.b.c.a(com.bytedance.android.a.a.h.c.a("empty url"), null);
                l.b(a4, "");
                return a4;
            }
            Map<String, List<String>> map = bVar.f6698d;
            if (!(map == null || map.isEmpty() || (linkedHashMap = (LinkedHashMap) ag.a(k.e(k.b(k.b(ag.f(map), a.f75376a), b.f75377a), c.f75378a), new LinkedHashMap())) == null)) {
                linkedHashMap.put("x-metasec-bypass-ttnet-features", "1");
            }
            String str2 = bVar.f6696b;
            l.b(str2, "");
            com.bytedance.ies.android.base.runtime.a.c cVar = new com.bytedance.ies.android.base.runtime.a.c(str2);
            cVar.f31887b = false;
            long j2 = (long) i2;
            cVar.f31892g = j2;
            cVar.f31893h = j2;
            if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                l.c(linkedHashMap, "");
                cVar.f31886a = linkedHashMap;
            }
            com.bytedance.ies.android.base.runtime.a.b a5 = cVar.a();
            if (a5 == null) {
                com.bytedance.android.a.b.b.c a6 = com.bytedance.android.a.b.b.c.a(com.bytedance.android.a.a.h.c.a("Response is null"), bVar);
                l.b(a6, "");
                return a6;
            }
            Integer b2 = a5.b();
            if (b2 != null) {
                i3 = b2.intValue();
            } else {
                i3 = -1;
            }
            return new com.bytedance.android.a.b.b.c(i3, a5.c(), ag.a(k.e(ag.f(a5.a()), d.f75379a), new LinkedHashMap()), bVar, a5.d());
        }
    }
}
