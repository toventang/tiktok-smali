package com.ss.android.ugc.aweme.video.preload.enginepreloader;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.j.p;
import com.ss.ttvideoengine.j.q;
import com.ss.ttvideoengine.n.b.h;
import com.ss.ttvideoengine.w;
import h.f.b.l;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final w f143686a = w.H_High;

    /* renamed from: b  reason: collision with root package name */
    public static final a f143687b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final C3826a f143688c = new C3826a();

    /* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.a$a  reason: collision with other inner class name */
    public static final class C3826a extends LinkedHashMap<String, p> {
        static {
            Covode.recordClassIndex(94009);
        }

        C3826a() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, p>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<String> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<p> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(p pVar) {
            return super.containsValue((Object) pVar);
        }

        public final /* bridge */ p get(String str) {
            return (p) super.get((Object) str);
        }

        public final /* bridge */ p remove(String str) {
            return (p) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof p)) {
                return false;
            }
            return containsValue((p) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ p get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, p> entry) {
            if (size() > 50) {
                return true;
            }
            return false;
        }

        public final /* bridge */ p getOrDefault(String str, p pVar) {
            return (p) super.getOrDefault((Object) str, (Object) pVar);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ p getOrDefault(Object obj, p pVar) {
            if (!(obj instanceof String)) {
                return pVar;
            }
            return getOrDefault((String) obj, pVar);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof p)) {
                return remove((String) obj, (p) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, p pVar) {
            return super.remove((Object) str, (Object) pVar);
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(94008);
    }

    public static p b(String str) {
        l.c(str, "");
        return (p) f143688c.get((Object) str);
    }

    public static long a(p pVar) {
        if (pVar == null || pVar.f152968d == null) {
            return 0;
        }
        return aj.a(pVar, aj.a(pVar, f143686a, 1, (h) null));
    }

    public static p a(String str) {
        l.c(str, "");
        if (!TextUtils.isEmpty(str)) {
            try {
                q qVar = new q();
                qVar.a(new JSONObject(str));
                p pVar = new p();
                pVar.a(qVar);
                return pVar;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static void a(String str, p pVar) {
        l.c(str, "");
        l.c(pVar, "");
        f143688c.put(str, pVar);
    }
}
