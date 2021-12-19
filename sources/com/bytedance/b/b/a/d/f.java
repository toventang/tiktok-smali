package com.bytedance.b.b.a.d;

import com.bytedance.b.b.a.b.d;
import com.bytedance.b.b.a.d.b;
import com.bytedance.b.b.a.d.c;
import com.bytedance.b.k.i;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public interface f {
    static {
        Covode.recordClassIndex(15129);
    }

    String a();

    byte[] a(HashMap<Long, JSONArray> hashMap);

    List<String> b();

    public static class a implements f {
        static {
            Covode.recordClassIndex(15130);
        }

        @Override // com.bytedance.b.b.a.d.f
        public final String a() {
            return "exception";
        }

        @Override // com.bytedance.b.b.a.d.f
        public final List<String> b() {
            c cVar = c.a.f25941a;
            if (cVar.f25939l == null || com.bytedance.b.k.f.a(cVar.f25939l.f25851c)) {
                return cVar.f25935h;
            }
            return cVar.f25939l.f25851c;
        }

        @Override // com.bytedance.b.b.a.d.f
        public final byte[] a(HashMap<Long, JSONArray> hashMap) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                for (Long l2 : hashMap.keySet()) {
                    JSONArray jSONArray2 = hashMap.get(l2);
                    if (jSONArray2 != null) {
                        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                            jSONArray.put(jSONArray2.get(i2));
                        }
                    }
                }
                jSONObject.put("header", d.a(com.bytedance.b.b.a.b.b.a().a(String.valueOf(d.a()))));
                jSONObject.put("data", jSONArray);
                return i.a(jSONObject.toString());
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static class b implements f {
        static {
            Covode.recordClassIndex(15131);
        }

        @Override // com.bytedance.b.b.a.d.f
        public final String a() {
            return "log";
        }

        @Override // com.bytedance.b.b.a.d.f
        public final List<String> b() {
            c cVar = c.a.f25941a;
            if (cVar.f25939l == null || com.bytedance.b.k.f.a(cVar.f25939l.f25850b)) {
                return cVar.f25933f;
            }
            return cVar.f25939l.f25850b;
        }

        @Override // com.bytedance.b.b.a.d.f
        public final byte[] a(HashMap<Long, JSONArray> hashMap) {
            com.bytedance.b.b.a.b.a a2;
            try {
                JSONArray jSONArray = new JSONArray();
                for (Long l2 : hashMap.keySet()) {
                    com.bytedance.b.b.a.b.a a3 = com.bytedance.b.b.a.b.b.a().a(String.valueOf(l2));
                    if (a3 == null) {
                        com.bytedance.b.e.a.a.r();
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("data", hashMap.get(l2));
                        jSONObject.put("header", d.a(a3));
                        jSONArray.put(jSONObject);
                    }
                }
                JSONArray a4 = b.a.f25924a.a();
                if (a4.length() > 0 && (a2 = com.bytedance.b.b.a.b.b.a().a(String.valueOf(d.a()))) != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("data", a4);
                    jSONObject2.put("header", d.a(a2));
                    jSONArray.put(jSONObject2);
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("list", jSONArray);
                com.bytedance.b.j.f.a aVar = (com.bytedance.b.j.f.a) com.bytedance.b.j.c.a(com.bytedance.b.j.f.a.class);
                if (aVar != null) {
                    jSONObject3 = aVar.a();
                }
                return i.a(jSONObject3.toString());
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static class c implements f {
        static {
            Covode.recordClassIndex(15132);
        }

        @Override // com.bytedance.b.b.a.d.f
        public final String a() {
            return "trace";
        }

        @Override // com.bytedance.b.b.a.d.f
        public final List<String> b() {
            c cVar = c.a.f25941a;
            if (cVar.f25939l == null || com.bytedance.b.k.f.a(cVar.f25939l.f25852d)) {
                return cVar.f25934g;
            }
            return cVar.f25939l.f25852d;
        }

        @Override // com.bytedance.b.b.a.d.f
        public final byte[] a(HashMap<Long, JSONArray> hashMap) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                for (Long l2 : hashMap.keySet()) {
                    JSONArray jSONArray2 = hashMap.get(l2);
                    if (jSONArray2 != null) {
                        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                            try {
                                List<Object> a2 = com.bytedance.b.k.b.a(jSONArray2.getJSONObject(i2));
                                if (!com.bytedance.b.k.f.a(a2)) {
                                    for (Object obj : a2) {
                                        jSONArray.put(obj);
                                    }
                                }
                            } catch (Exception e2) {
                                com.bytedance.b.k.b.b.a(com.bytedance.b.b.a.a.f25847a, "serialize", e2);
                            }
                        }
                    }
                }
                jSONObject.put("header", d.a(com.bytedance.b.b.a.b.b.a().a(String.valueOf(d.a()))));
                jSONObject.put("data", jSONArray);
                return i.a(jSONObject.toString());
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
