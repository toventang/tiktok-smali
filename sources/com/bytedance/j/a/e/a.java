package com.bytedance.j.a.e;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.TemplateData;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0927a f39024b = new C0927a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TemplateData f39025a;

    static {
        Covode.recordClassIndex(23887);
    }

    /* renamed from: com.bytedance.j.a.e.a$a  reason: collision with other inner class name */
    public static final class C0927a {
        static {
            Covode.recordClassIndex(23888);
        }

        private C0927a() {
        }

        public /* synthetic */ C0927a(byte b2) {
            this();
        }

        public static a a(String str) {
            a aVar = new a();
            TemplateData a2 = TemplateData.a(str);
            l.a((Object) a2, "");
            aVar.f39025a = a2;
            return aVar;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0106 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.LinkedHashMap, java.util.Map] */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.util.LinkedHashMap, java.util.Map] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.util.LinkedHashMap, java.util.Map] */
        /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List, java.util.ArrayList] */
        public static Object a(Object obj) {
            Object obj2;
            if (obj == null) {
                return null;
            }
            new StringBuilder("dealing with ").append(obj).append('[').append(obj.getClass()).append(']');
            if (obj instanceof List) {
                obj2 = new ArrayList();
                for (Object obj3 : (Iterable) obj) {
                    obj2.add(a(obj3));
                }
            } else if (obj instanceof Map) {
                obj2 = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() instanceof String) {
                        Object key = entry.getKey();
                        if (key != null) {
                            obj2.put(key, a(entry.getValue()));
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    }
                }
            } else if (obj instanceof Bundle) {
                obj2 = new LinkedHashMap();
                Bundle bundle = (Bundle) obj;
                Set<String> keySet = bundle.keySet();
                l.a((Object) keySet, "");
                for (T t : keySet) {
                    l.a((Object) t, "");
                    obj2.put(t, a(a(bundle, t)));
                }
            } else if (obj instanceof JSONObject) {
                obj2 = new LinkedHashMap();
                JSONObject jSONObject = (JSONObject) obj;
                Iterator<String> keys = jSONObject.keys();
                l.a((Object) keys, "");
                while (keys.hasNext()) {
                    String next = keys.next();
                    l.a((Object) next, "");
                    obj2.put(next, a(jSONObject.get(next)));
                }
            } else if (!(obj instanceof JSONArray)) {
                return obj;
            } else {
                obj2 = new ArrayList();
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    obj2.add(a(jSONArray.get(i2)));
                }
            }
            return obj2;
        }

        private static Object a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }
    }

    public a() {
        TemplateData a2 = TemplateData.a();
        l.a((Object) a2, "");
        this.f39025a = a2;
    }

    public final void a(String str, Object obj) {
        l.c(str, "");
        this.f39025a.a(str, C0927a.a(obj));
    }
}
