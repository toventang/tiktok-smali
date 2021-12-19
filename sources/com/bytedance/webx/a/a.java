package com.bytedance.webx.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    Map<String, C1135a> f45907a = new HashMap();

    static {
        Covode.recordClassIndex(28067);
    }

    public static class b implements h.a.AbstractC1142a {

        /* renamed from: a  reason: collision with root package name */
        private h.a.AbstractC1142a f45910a;

        /* renamed from: b  reason: collision with root package name */
        private volatile List<C1136a> f45911b;

        static {
            Covode.recordClassIndex(28069);
        }

        @Override // com.bytedance.webx.h.a.AbstractC1142a
        public final String a() {
            return this.f45910a.a();
        }

        public final String a(Uri uri) {
            MethodCollector.i(9721);
            if (this.f45911b == null) {
                synchronized (this) {
                    try {
                        if (this.f45911b == null) {
                            this.f45911b = new ArrayList();
                            String a2 = a();
                            if (a2 != null) {
                                try {
                                    JSONArray optJSONArray = new JSONObject(a2).optJSONArray("bdwk_extension");
                                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                        JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                                        this.f45911b.add(new C1136a(optJSONObject.optString("pattern"), optJSONObject.optString("content")));
                                    }
                                } catch (Exception unused) {
                                    com.bytedance.webx.b.a.a.a("AddressParam");
                                }
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(9721);
                        throw th;
                    }
                }
            }
            Iterator<C1136a> it = this.f45911b.iterator();
            while (true) {
                try {
                    if (it.hasNext()) {
                        C1136a next = it.next();
                        if (next.f45914c == null) {
                            next.f45914c = Pattern.compile(next.f45912a);
                        }
                        Matcher matcher = next.f45914c.matcher(uri.toString());
                        while (matcher.find()) {
                            matcher.group();
                            matcher.start();
                            com.bytedance.webx.b.a.a.a("AddressParam");
                            if (matcher.start() == 0) {
                                String str = next.f45913b;
                                MethodCollector.o(9721);
                                return str;
                            }
                        }
                        continue;
                    }
                } catch (Exception unused2) {
                    com.bytedance.webx.b.a.a.a("AddressParam");
                }
                if (!it.hasNext()) {
                    MethodCollector.o(9721);
                    return null;
                }
            }
        }

        /* renamed from: com.bytedance.webx.a.a$b$a  reason: collision with other inner class name */
        public static class C1136a {

            /* renamed from: a  reason: collision with root package name */
            public String f45912a;

            /* renamed from: b  reason: collision with root package name */
            public String f45913b;

            /* renamed from: c  reason: collision with root package name */
            Pattern f45914c;

            static {
                Covode.recordClassIndex(28070);
            }

            public C1136a(String str, String str2) {
                this.f45912a = str;
                this.f45913b = str2;
            }
        }
    }

    public final void a(C1135a aVar) {
        this.f45907a.put(aVar.f45908a, aVar);
    }

    /* renamed from: com.bytedance.webx.a.a$a  reason: collision with other inner class name */
    public static class C1135a {

        /* renamed from: a  reason: collision with root package name */
        public String f45908a;

        /* renamed from: b  reason: collision with root package name */
        public String f45909b;

        static {
            Covode.recordClassIndex(28068);
        }

        public C1135a(String str, String str2) {
            this.f45908a = str;
            this.f45909b = str2;
        }
    }

    public static String a(HashSet<b> hashSet, Uri uri) {
        if (hashSet == null) {
            return null;
        }
        try {
            Iterator<b> it = hashSet.iterator();
            while (it.hasNext()) {
                String a2 = it.next().a(uri);
                if (a2 != null) {
                    return a2;
                }
            }
        } catch (Exception unused) {
            com.bytedance.webx.b.a.a.a("AddressParam");
        }
        return null;
    }

    public static List<C1135a> a(int i2, String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (i2 == 0) {
                JSONObject optJSONObject = jSONObject.optJSONObject("bdwk_create");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        arrayList.add(new C1135a(next, optJSONObject.optString(next)));
                    }
                }
            } else if (i2 == 1) {
                Iterator<String> keys2 = jSONObject.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!next2.equals("bdwk_create")) {
                        arrayList.add(new C1135a(next2, jSONObject.optString(next2)));
                    }
                }
            }
        } catch (Exception unused) {
            com.bytedance.webx.b.a.a.a("AddressParam");
        }
        return arrayList;
    }
}
