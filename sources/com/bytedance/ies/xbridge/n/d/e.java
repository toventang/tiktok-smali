package com.bytedance.ies.xbridge.n.d;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import h.w;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class e extends com.bytedance.ies.xbridge.model.c.a {

    /* renamed from: b  reason: collision with root package name */
    public static final b f36351b = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36352a;

    public enum a {
        CONFIRM,
        CANCEL,
        MASK;

        static {
            Covode.recordClassIndex(21779);
        }
    }

    static {
        Covode.recordClassIndex(21778);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(21780);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static Map<String, Object> a(e eVar) {
            l.c(eVar, "");
            if (eVar.f36352a == null) {
                return null;
            }
            try {
                String str = eVar.f36352a;
                if (str == null) {
                    l.a();
                }
                if (str != null) {
                    String upperCase = str.toUpperCase();
                    l.a((Object) upperCase, "");
                    a.valueOf(upperCase);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String str2 = eVar.f36352a;
                    if (str2 == null) {
                        l.a();
                    }
                    linkedHashMap.put("action", str2);
                    return linkedHashMap;
                }
                throw new w("null cannot be cast to non-null type");
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Override // com.bytedance.ies.xbridge.model.c.a
    public final List<String> a() {
        return n.a("action");
    }
}
