package com.bytedance.ies.xbridge.j.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class c extends com.bytedance.ies.xbridge.model.c.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f36198f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Integer f36199a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, ? extends Object> f36200b;

    /* renamed from: c  reason: collision with root package name */
    public Object f36201c;

    /* renamed from: d  reason: collision with root package name */
    public String f36202d;

    /* renamed from: e  reason: collision with root package name */
    public String f36203e;

    static {
        Covode.recordClassIndex(21633);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21634);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static Map<String, Object> a(c cVar) {
            l.c(cVar, "");
            Integer num = cVar.f36199a;
            if (num == null) {
                return null;
            }
            num.intValue();
            if (cVar.f36201c == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Integer num2 = cVar.f36199a;
            if (num2 == null) {
                l.a();
            }
            linkedHashMap.put("httpCode", num2);
            Object obj = cVar.f36201c;
            if (obj == null) {
                l.a();
            }
            linkedHashMap.put("response", obj);
            Map<String, ? extends Object> map = cVar.f36200b;
            if (map != null) {
                linkedHashMap.put("header", map);
            }
            String str = cVar.f36202d;
            if (str != null) {
                linkedHashMap.put("rawResponse", str);
            }
            String str2 = cVar.f36203e;
            if (str2 != null) {
                linkedHashMap.put("responseType", str2);
            }
            return linkedHashMap;
        }
    }

    @Override // com.bytedance.ies.xbridge.model.c.a
    public final List<String> a() {
        return n.b("httpCode", "header", "response", "rawResponse", "responseType");
    }
}
