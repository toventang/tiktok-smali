package com.ss.android.ugc.aweme.feed.h;

import android.content.SharedPreferences;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.f.c;
import com.ss.android.ugc.aweme.bf.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f93302b = a.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static final Comparator<C2264a> f93303c = new Comparator<C2264a>() {
        /* class com.ss.android.ugc.aweme.feed.h.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(59151);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C2264a aVar, C2264a aVar2) {
            C2264a aVar3 = aVar;
            C2264a aVar4 = aVar2;
            if (aVar3.f93310b == aVar4.f93310b) {
                return 0;
            }
            if (aVar3.f93310b > aVar4.f93310b) {
                return -1;
            }
            return 1;
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static c<a> f93304d = new c<a>() {
        /* class com.ss.android.ugc.aweme.feed.h.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(59152);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.f.c
        public final /* synthetic */ a a() {
            return new a((byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public List<C2264a> f93305a;

    /* renamed from: e  reason: collision with root package name */
    private final SharedPreferences f93306e;

    /* renamed from: f  reason: collision with root package name */
    private long f93307f;

    /* renamed from: g  reason: collision with root package name */
    private long f93308g;

    /* renamed from: com.ss.android.ugc.aweme.feed.h.a$a  reason: collision with other inner class name */
    public static class C2264a {

        /* renamed from: a  reason: collision with root package name */
        public String f93309a;

        /* renamed from: b  reason: collision with root package name */
        long f93310b;

        static {
            Covode.recordClassIndex(59153);
        }

        C2264a() {
        }

        public final int hashCode() {
            return super.hashCode();
        }

        /* access modifiers changed from: package-private */
        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("aid", this.f93309a);
                jSONObject.put("time", this.f93310b);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }

        /* synthetic */ C2264a(byte b2) {
            this();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C2264a) || !m.a(((C2264a) obj).f93309a, this.f93309a)) {
                return false;
            }
            return true;
        }
    }

    public static a a() {
        return f93304d.b();
    }

    static {
        Covode.recordClassIndex(59150);
    }

    private void c() {
        JSONArray jSONArray = new JSONArray();
        for (C2264a aVar : this.f93305a) {
            jSONArray.put(aVar.a());
        }
        this.f93306e.edit().putString("push_list", jSONArray.toString()).apply();
    }

    private a() {
        this.f93305a = new ArrayList();
        this.f93307f = 604800000;
        SharedPreferences a2 = d.a(com.ss.android.ugc.aweme.framework.d.a.f96678a, "app_push_info", 0);
        this.f93306e = a2;
        String string = a2.getString("push_list", "[]");
        this.f93305a.clear();
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        C2264a aVar = new C2264a();
                        aVar.f93309a = optJSONObject.optString("aid", "");
                        aVar.f93310b = optJSONObject.optLong("time", 0);
                        if (!this.f93305a.contains(aVar)) {
                            this.f93305a.add(aVar);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public final boolean b() {
        C2264a aVar;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        if (currentTimeMillis - this.f93308g <= 5000) {
            return false;
        }
        this.f93308g = currentTimeMillis;
        Collections.sort(this.f93305a, f93303c);
        int size = this.f93305a.size() - 1;
        while (size >= 0) {
            do {
                aVar = this.f93305a.get(size);
            } while (aVar == null);
            if (currentTimeMillis <= this.f93307f + aVar.f93310b) {
                break;
            }
            this.f93305a.remove(size);
            size--;
            z = true;
        }
        if (z) {
            c();
        }
        return z;
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(String str, long j2) {
        MethodCollector.i(7345);
        if (m.a(str)) {
            MethodCollector.o(7345);
            return;
        }
        C2264a aVar = new C2264a((byte) 0);
        aVar.f93310b = j2;
        aVar.f93309a = str;
        synchronized (this) {
            try {
                if (!this.f93305a.contains(aVar)) {
                    this.f93305a.add(aVar);
                }
                if (!b()) {
                    c();
                }
            } finally {
                MethodCollector.o(7345);
            }
        }
    }
}
